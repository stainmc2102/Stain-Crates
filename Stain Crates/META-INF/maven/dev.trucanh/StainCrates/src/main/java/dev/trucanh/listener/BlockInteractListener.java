package dev.trucanh.listener;

import dev.trucanh.StainCrates;
import dev.trucanh.crate.Crate;
import dev.trucanh.utils.ColorUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BlockInteractListener implements Listener {
   private final StainCrates plugin;

   public BlockInteractListener(StainCrates plugin) {
      this.plugin = plugin;
   }

   @EventHandler(
      priority = EventPriority.HIGHEST
   )
   public void onInteract(PlayerInteractEvent event) {
      if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_BLOCK) {
         if (event.getClickedBlock() != null) {
            Crate crate = this.plugin.getCrateManager().getAllCrates().stream()
               .filter((c) -> this.isSameOrAdjacentBlock(c.getLocation(), event.getClickedBlock().getLocation()))
               .findFirst().orElse(null);
            if (crate != null) {
               Player player = event.getPlayer();
               event.setCancelled(true);
               this.plugin.getSelectingCrate().put(player.getUniqueId(), crate.getName());
               this.openChooseGui(player, crate);
            }
         }
      }
   }

   private void openChooseGui(Player player, Crate crate) {
      Inventory inv = this.plugin.getServer().createInventory((InventoryHolder)null, 27, ColorUtils.color("&8ᴄʜᴏᴏsᴇ 1 ɪᴛᴇᴍ"));
      ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
      ItemMeta meta = glass.getItemMeta();
      if (crate.getName().equalsIgnoreCase("amethyst")) {
         meta.setDisplayName(ColorUtils.color("#A300FFᴀᴍᴇᴛʜʏsᴛ ᴄʀᴀᴛᴇs"));
      } else {
         meta.setDisplayName((String)null);
      }

      String line1 = this.plugin.getConfig().getString("crates." + crate.getName() + ".choose-line1", "&7With a {key} ᴋᴇʏ you can choose");
      String line2 = this.plugin.getConfig().getString("crates." + crate.getName() + ".choose-line2", "&7which of the {items} you want");
      line1 = line1.replace("{key}", crate.getName()).replace("{items}", String.valueOf(crate.getItems().size()));
      line2 = line2.replace("{key}", crate.getName()).replace("{items}", String.valueOf(crate.getItems().size()));
      List<String> lore = Arrays.asList(ColorUtils.color(line1), ColorUtils.color(line2));
      meta.setLore(lore);
      glass.setItemMeta(meta);

      for(int i = 0; i < inv.getSize(); ++i) {
         inv.setItem(i, glass);
      }

      Map var10000 = crate.getItems();
   Objects.requireNonNull(inv);
   crate.getItems().forEach((slot, item) -> inv.setItem(slot, item));
      player.openInventory(inv);
   }

   private boolean isSameOrAdjacentBlock(Location a, Location b) {
      if (!a.getWorld().equals(b.getWorld())) {
         return false;
      } else if (a.getBlockY() != b.getBlockY()) {
         return false;
      } else {
         int dx = Math.abs(a.getBlockX() - b.getBlockX());
         int dz = Math.abs(a.getBlockZ() - b.getBlockZ());
         return dx + dz == 0 || dx + dz == 1;
      }
   }
}
