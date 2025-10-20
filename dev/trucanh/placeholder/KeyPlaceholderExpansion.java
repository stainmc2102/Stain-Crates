package dev.trucanh.placeholder;

import dev.trucanh.VnecoCrates;
import dev.trucanh.key.KeyManager;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class KeyPlaceholderExpansion extends PlaceholderExpansion {
   private final VnecoCrates plugin;

   public KeyPlaceholderExpansion(VnecoCrates plugin) {
      this.plugin = plugin;
   }

   @NotNull
   public String getIdentifier() {
      return "vnecocrate";
   }

   @NotNull
   public String getAuthor() {
      return "DevTrucAnh";
   }

   @NotNull
   public String getVersion() {
      return this.plugin.getDescription().getVersion();
   }

   public boolean persist() {
      return true;
   }

   public String onRequest(OfflinePlayer player, String params) {
      if (player == null) {
         return "0";
      } else {
         KeyManager km = this.plugin.getKeyManager();
         return String.valueOf(km.getKeys(player.getUniqueId(), params));
      }
   }
}
