package dev.trucanh.command;

import dev.trucanh.StainCrates;
import dev.trucanh.crate.Crate;
import dev.trucanh.utils.ColorUtils;
import dev.trucanh.utils.DogAdonisHook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class StainCratesCommand implements CommandExecutor, TabCompleter {
   private final StainCrates plugin;

   public StainCratesCommand(StainCrates plugin) {
      this.plugin = plugin;
   }

   public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
      Player player = sender instanceof Player ? (Player)sender : null;
      if (args.length == 0) {
         this.sendUsage(player);
         return true;
      } else {
         String var6 = args[0].toLowerCase();
         byte var7 = -1;
         switch(var6.hashCode()) {
         case -1352395504:
            if (var6.equals("crates")) {
               var7 = 0;
            }
            break;
         case -1335458389:
            if (var6.equals("delete")) {
               var7 = 6;
            }
            break;
         case -1147946188:
            if (var6.equals("additem")) {
               var7 = 1;
            }
            break;
         case -1134671134:
            if (var6.equals("keyall")) {
               var7 = 3;
            }
            break;
         case 3173137:
            if (var6.equals("give")) {
               var7 = 2;
            }
            break;
         case 3552391:
            if (var6.equals("take")) {
               var7 = 4;
            }
            break;
         case 817802904:
            if (var6.equals("delcrate")) {
               var7 = 5;
            }
         }

         switch(var7) {
         case 0:
            if (player == null) {
               sender.sendMessage("This command can only be used by players.");
               return true;
            }

            this.handleCreateCrate(player, args);
            break;
         case 1:
            if (player == null) {
               sender.sendMessage("This command can only be used by players.");
               return true;
            }

            this.handleAddItem(player, args);
            break;
         case 2:
            this.handleGiveKey(sender, args);
            break;
         case 3:
            this.handleKeyAll(sender, args);
            break;
         case 4:
            this.handleTakeKey(sender, args);
            break;
         case 5:
         case 6:
            this.handleDeleteCrate(player, args);
            break;
         default:
            this.sendUsage(player);
         }

         return true;
      }
   }

   private void sendUsage(Player player) {
      player.sendMessage(ColorUtils.color("&cUsage: /vnecocrates <crates|delcrate|additem|give|take|keyall> ..."));
   }

   private void handleCreateCrate(Player player, String[] args) {
      if (args.length < 2) {
         player.sendMessage(ColorUtils.color("&cUsage: /vnecocrates crates <name>"));
      } else {
         String name = args[1];
         Block target = player.getTargetBlockExact(5);
         Location loc;
         if (target != null) {
            loc = target.getLocation();
         } else {
            loc = player.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getLocation();
         }

         if (this.plugin.getCrateManager().crateExists(name)) {
            player.sendMessage(ColorUtils.color("&cCrate &e" + name + " &calready exists!"));
         } else {
            this.plugin.getCrateManager().createCrate(name, loc);
            player.sendMessage(ColorUtils.color("&aCreated crate &e" + name + " &aat " + loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ()));
         }
      }
   }

   private void handleAddItem(Player player, String[] args) {
      if (args.length < 3) {
         player.sendMessage(ColorUtils.color("&cUsage: /vnecocrates additem <crate> <slot>"));
      } else {
         String crateName = args[1];

         int slot;
         try {
            slot = Integer.parseInt(args[2]);
         } catch (NumberFormatException var8) {
            player.sendMessage(ColorUtils.color("&cSlot must be a number"));
            return;
         }

         Crate crate = this.plugin.getCrateManager().getCrate(crateName);
         if (crate == null) {
            player.sendMessage(ColorUtils.color("&cCrate &e" + crateName + " &cdoes not exist."));
         } else {
            ItemStack inHand = player.getInventory().getItemInMainHand();
            if (inHand != null && !inHand.getType().isAir()) {
               ItemStack store = DogAdonisHook.freeze(inHand.clone());
               crate.setItem(slot, store);
               this.plugin.getCrateManager().saveCrates();
               player.sendMessage(ColorUtils.color("&aAdded item to crate &e" + crateName + "&a at slot &e" + slot));
            } else {
               player.sendMessage(ColorUtils.color("&cYou must hold an item in your hand."));
            }
         }
      }
   }

   private void handleGiveKey(CommandSender sender, String[] args) {
      if (args.length < 3) {
         sender.sendMessage(ColorUtils.color("&cUsage: /vnecocrates give <key> <amount> | /vnecocrates give <key> <player> <amount>"));
      } else {
         String key = args[1];
         String possibleNumber = args[2];
         int amount;
         Player target;
         if (this.isInteger(possibleNumber)) {
            if (!(sender instanceof Player)) {
               sender.sendMessage(ColorUtils.color("&cConsole must specify player."));
               return;
            }

            amount = Integer.parseInt(possibleNumber);
            target = (Player)sender;
         } else {
            target = Bukkit.getPlayerExact(possibleNumber);
            if (target == null) {
               sender.sendMessage(ColorUtils.color("&cPlayer not found"));
               return;
            }

            if (args.length < 4 || !this.isInteger(args[3])) {
               sender.sendMessage(ColorUtils.color("&cUsage: /vnecocrates give <key> <player> <amount>"));
               return;
            }

            amount = Integer.parseInt(args[3]);
         }

         this.plugin.getKeyManager().addKeys(target.getUniqueId(), key, amount);
         sender.sendMessage(ColorUtils.color("&aGave &e" + amount + " &akey(s) " + key + " to &e" + target.getName()));
      }
   }

   private boolean isInteger(String s) {
      try {
         Integer.parseInt(s);
         return true;
      } catch (NumberFormatException var3) {
         return false;
      }
   }

   private void handleKeyAll(CommandSender sender, String[] args) {
      if (args.length < 3) {
         sender.sendMessage(ColorUtils.color("&cUsage: /vnecocrates keyall <crate> <amount>"));
      } else {
         String crate = args[1];

         int amount;
         try {
            amount = Integer.parseInt(args[2]);
         } catch (NumberFormatException var6) {
            sender.sendMessage(ColorUtils.color("&cAmount must be a number"));
            return;
         }

         Bukkit.getOnlinePlayers().forEach((p) -> {
            this.plugin.getKeyManager().addKeys(p.getUniqueId(), crate, amount);
            String var10000 = crate.substring(0, 1).toUpperCase();
            String niceName = var10000 + crate.substring(1).toLowerCase() + " Key";
            p.sendMessage(ColorUtils.color("&8&m--------------------------------------------------"));
            p.sendMessage(ColorUtils.color(" &a&lKEYALL &7» You received &e" + amount + " &f" + niceName + (amount > 1 ? "s" : "") + "!"));
            p.sendMessage(ColorUtils.color("&8&m--------------------------------------------------"));
            String title = ColorUtils.color("#00FB4B&lKEYALL");
            String sub = ColorUtils.color("&f+" + amount + " &e" + niceName);
            p.sendTitle(title, sub, 10, 60, 20);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ColorUtils.color("#00FB4B✔ &7Added &e" + amount + " &f" + niceName)));
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
            p.playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0F, 1.0F);
         });
         sender.sendMessage(ColorUtils.color("&aGave everyone &e" + amount + " &akey(s) for &e" + crate));
      }
   }

   private void handleTakeKey(CommandSender sender, String[] args) {
      if (args.length < 4) {
         sender.sendMessage(ColorUtils.color("&cUsage: /vnecocrates take <key> <player> <amount>"));
      } else {
         String key = args[1];
         Player target = Bukkit.getPlayerExact(args[2]);
         if (target == null) {
            sender.sendMessage(ColorUtils.color("&cPlayer not found"));
         } else if (!this.isInteger(args[3])) {
            sender.sendMessage(ColorUtils.color("&cAmount must be a number"));
         } else {
            int amount = Integer.parseInt(args[3]);
            boolean success = this.plugin.getKeyManager().takeKeys(target.getUniqueId(), key, amount);
            if (success) {
               sender.sendMessage(ColorUtils.color("&aTook &e" + amount + " &akey(s) " + key + " from &e" + target.getName()));
            } else {
               sender.sendMessage(ColorUtils.color("&cPlayer does not have enough keys."));
            }

         }
      }
   }

   private void handleDeleteCrate(Player player, String[] args) {
      if (args.length < 2) {
         player.sendMessage(ColorUtils.color("&cUsage: /vnecocrates delcrate <name>"));
      } else {
         String name = args[1];
         boolean success = this.plugin.getCrateManager().deleteCrate(name);
         if (success) {
            player.sendMessage(ColorUtils.color("&aDeleted crate &e" + name));
         } else {
            player.sendMessage(ColorUtils.color("&cCrate &e" + name + " &cdoes not exist."));
         }

      }
   }

   public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
      if (args.length == 1) {
         return (List)List.of("crates", "delcrate", "additem", "give", "take", "keyall").stream().filter((s) -> {
            return s.toLowerCase().startsWith(args[0].toLowerCase());
         }).collect(Collectors.toList());
      } else {
         String var5;
         byte var6;
         if (args.length == 2) {
            var5 = args[0].toLowerCase();
            var6 = -1;
            switch(var5.hashCode()) {
            case -1352395504:
               if (var5.equals("crates")) {
                  var6 = 0;
               }
               break;
            case -1147946188:
               if (var5.equals("additem")) {
                  var6 = 1;
               }
               break;
            case -1134671134:
               if (var5.equals("keyall")) {
                  var6 = 4;
               }
               break;
            case 3173137:
               if (var5.equals("give")) {
                  var6 = 2;
               }
               break;
            case 3552391:
               if (var5.equals("take")) {
                  var6 = 3;
               }
               break;
            case 817802904:
               if (var5.equals("delcrate")) {
                  var6 = 5;
               }
            }

            switch(var6) {
            case 0:
               return Collections.emptyList();
            case 1:
            case 2:
            case 3:
            case 4:
               return new ArrayList(this.plugin.getCrateManager().getCrateNames());
            case 5:
               return new ArrayList(this.plugin.getCrateManager().getCrateNames());
            }
         }

         if (args.length == 3) {
            var5 = args[0].toLowerCase();
            var6 = -1;
            switch(var5.hashCode()) {
            case -1147946188:
               if (var5.equals("additem")) {
                  var6 = 0;
               }
               break;
            case -1134671134:
               if (var5.equals("keyall")) {
                  var6 = 3;
               }
               break;
            case 3173137:
               if (var5.equals("give")) {
                  var6 = 1;
               }
               break;
            case 3552391:
               if (var5.equals("take")) {
                  var6 = 2;
               }
            }

            switch(var6) {
            case 0:
               List<String> slots = new ArrayList();

               for(int i = 0; i < 27; ++i) {
                  slots.add(String.valueOf(i));
               }

               return slots;
            case 1:
               List<String> players = (List)Bukkit.getOnlinePlayers().stream().map(Player::getName).collect(Collectors.toList());
               players.addAll(List.of("1", "5", "10", "64"));
               return players;
            case 2:
               return (List)Bukkit.getOnlinePlayers().stream().map(Player::getName).collect(Collectors.toList());
            case 3:
               return List.of("1", "5", "10", "64");
            }
         }

         if (args.length == 4 && args[0].equalsIgnoreCase("give")) {
            return List.of("1", "5", "10", "64");
         } else {
            return args.length == 4 && args[0].equalsIgnoreCase("take") ? List.of("1", "5", "10", "64") : Collections.emptyList();
         }
      }
   }
}
