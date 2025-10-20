package dev.trucanh.key;

import dev.trucanh.StainCrates;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class KeyManager {
   private final StainCrates plugin;
   private final Map<UUID, Map<String, Integer>> playerKeys = new HashMap();
   private File file;
   private FileConfiguration data;

   public KeyManager(StainCrates plugin) {
      this.plugin = plugin;
      this.file = new File(plugin.getDataFolder(), "keys.yml");
      if (!this.file.exists()) {
         try {
            this.file.getParentFile().mkdirs();
            this.file.createNewFile();
         } catch (IOException var3) {
         }
      }

      this.data = YamlConfiguration.loadConfiguration(this.file);
   }

   public void loadKeys() {
      this.playerKeys.clear();
      Iterator var1 = this.data.getKeys(false).iterator();

      while(var1.hasNext()) {
         String uuidStr = (String)var1.next();
         UUID uuid = UUID.fromString(uuidStr);
         Map<String, Integer> map = new HashMap();
         Iterator var5 = this.data.getConfigurationSection(uuidStr).getKeys(false).iterator();

         while(var5.hasNext()) {
            String key = (String)var5.next();
            int amount = this.data.getInt(uuidStr + "." + key);
            map.put(key.toLowerCase(), amount);
         }

         this.playerKeys.put(uuid, map);
      }

   }

   public void saveKeys() {
      Iterator var1 = this.playerKeys.entrySet().iterator();

      while(var1.hasNext()) {
         Entry<UUID, Map<String, Integer>> entry = (Entry)var1.next();
         String uuidStr = ((UUID)entry.getKey()).toString();
         Iterator var4 = ((Map)entry.getValue()).entrySet().iterator();

         while(var4.hasNext()) {
            Entry<String, Integer> keys = (Entry)var4.next();
            this.data.set(uuidStr + "." + ((String)keys.getKey()).toLowerCase(), keys.getValue());
         }
      }

      try {
         this.data.save(this.file);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public int getKeys(UUID uuid, String key) {
      return (Integer)((Map)this.playerKeys.getOrDefault(uuid, new HashMap())).getOrDefault(key.toLowerCase(), 0);
   }

   public void addKeys(UUID uuid, String key, int amount) {
      Map<String, Integer> map = (Map)this.playerKeys.computeIfAbsent(uuid, (u) -> {
         return new HashMap();
      });
      map.put(key.toLowerCase(), this.getKeys(uuid, key) + amount);
      this.saveKeys();
   }

   public boolean removeKey(UUID uuid, String key) {
      int current = this.getKeys(uuid, key);
      if (current <= 0) {
         return false;
      } else {
         Map<String, Integer> map = (Map)this.playerKeys.get(uuid);
         map.put(key.toLowerCase(), current - 1);
         this.saveKeys();
         return true;
      }
   }

   public boolean takeKeys(UUID uuid, String key, int amount) {
      int current = this.getKeys(uuid, key);
      if (current < amount) {
         return false;
      } else {
         Map<String, Integer> map = (Map)this.playerKeys.get(uuid);
         map.put(key.toLowerCase(), current - amount);
         this.saveKeys();
         return true;
      }
   }
}
