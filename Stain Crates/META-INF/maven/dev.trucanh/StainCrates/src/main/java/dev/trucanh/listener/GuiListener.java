package dev.trucanh.listener;

import dev.trucanh.StainCrates;
import dev.trucanh.crate.Crate;
import dev.trucanh.utils.ColorUtils;
import dev.trucanh.utils.DogAdonisHook;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiListener implements Listener {
   private final StainCrates plugin;

   public GuiListener(StainCrates plugin) {
      this.plugin = plugin;
   }

   @EventHandler
   public void onClick(InventoryClickEvent event) {
      if (event.getWhoClicked() instanceof Player) {
         Player player = (Player)event.getWhoClicked();
         String title = event.getView().getTitle();
         if (title.equals(ColorUtils.color("&8ᴄʜᴏᴏsᴇ 1 ɪᴛᴇᴍ"))) {
            this.handleChoose(event, player);
         } else if (title.equals(ColorUtils.color("&8ᴄᴏɴғɪʀᴍ"))) {
            this.handleConfirm(event, player);
         }

      }
   }

   private void handleChoose(InventoryClickEvent event, Player player) {
      if (event.getClickedInventory() != null && event.getClickedInventory() == event.getView().getTopInventory()) {
         event.setCancelled(true);
         if (event.getCurrentItem() != null && !event.getCurrentItem().getType().isAir()) {
            if (event.getCurrentItem().getType() != Material.GRAY_STAINED_GLASS_PANE) {
               String crateName = (String)this.plugin.getSelectingCrate().get(player.getUniqueId());
               if (crateName != null) {
                  int keys = this.plugin.getKeyManager().getKeys(player.getUniqueId(), crateName);
                  if (keys <= 0) {
                     player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                     player.sendMessage(ColorUtils.color("&cYou don't have a key for this crate!"));
                  } else {
                     player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0F, 1.0F);
                     ItemStack selected = event.getCurrentItem().clone();
                     Inventory confirm = this.plugin.getServer().createInventory((InventoryHolder)null, 27, ColorUtils.color("&8ᴄᴏɴғɪʀᴍ"));
                     ItemStack cancel = new ItemStack(Material.RED_STAINED_GLASS_PANE);
                     ItemMeta cancelMeta = cancel.getItemMeta();
                     cancelMeta.setDisplayName(ColorUtils.color("#FB0000ᴄᴀɴᴄᴇʟ"));
                     cancel.setItemMeta(cancelMeta);
                     confirm.setItem(11, cancel);
                     confirm.setItem(13, selected);
                     ItemStack ok = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
                     ItemMeta okMeta = ok.getItemMeta();
                     okMeta.setDisplayName(ColorUtils.color("#00FB4Bᴄᴏɴғɪʀᴍ"));
                     ok.setItemMeta(okMeta);
                     confirm.setItem(15, ok);
                     player.openInventory(confirm);
                  }
               }
            }
         }
      } else {
         event.setCancelled(true);
      }
   }

   private void handleConfirm(InventoryClickEvent event, Player player) {
      if (event.getClickedInventory() != null && event.getClickedInventory() == event.getView().getTopInventory()) {
         event.setCancelled(true);
         int slot = event.getRawSlot();
         if (slot == 11) {
            player.closeInventory();
            this.plugin.getSelectingCrate().remove(player.getUniqueId());
         } else if (slot == 15) {
            ItemStack reward = event.getInventory().getItem(13);
            if (reward != null && !reward.getType().isAir()) {
               String crateName = (String)this.plugin.getSelectingCrate().get(player.getUniqueId());
               Crate crate = this.plugin.getCrateManager().getCrate(crateName);
               if (crate == null) {
                  player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                  player.sendMessage(ColorUtils.color("&cNo key found."));
                  player.closeInventory();
               } else {
                  boolean removed = this.plugin.getKeyManager().removeKey(player.getUniqueId(), crate.getName());
                  if (!removed) {
                     player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                     player.sendMessage(ColorUtils.color("&cYou don't have a key."));
                     player.closeInventory();
                  } else {
                     ItemStack give = DogAdonisHook.unfreeze(reward.clone());
                     player.getInventory().addItem(new ItemStack[]{give});
                     player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 2.0F);
                     String itemName;
                     if (reward.hasItemMeta() && reward.getItemMeta().hasDisplayName()) {
                        itemName = reward.getItemMeta().getDisplayName();
                     } else {
                        itemName = reward.getType().toString().toLowerCase().replace('_', ' ');
                     }

                     String var10000 = player.getName();
                     String msg = ColorUtils.color("&7Player #0EFF90" + var10000 + " &7received item &7[" + itemName + "&7]!");
                     Bukkit.getServer().broadcastMessage(msg);
                     player.closeInventory();
                     this.plugin.getSelectingCrate().remove(player.getUniqueId());
                  }
               }
            }
         }
      } else {
         event.setCancelled(true);
      }
   }
}
