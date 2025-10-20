package dev.trucanh.crate;

import dev.trucanh.StainCrates;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

public class CrateManager {
   private final StainCrates plugin;
   private final Map<String, Crate> crates = new HashMap();

   public CrateManager(StainCrates plugin) {
      this.plugin = plugin;
   }

   public void loadCrates() {
      this.crates.clear();
      FileConfiguration cfg = this.plugin.getConfig();
      ConfigurationSection section = cfg.getConfigurationSection("crates");
      if (section != null) {
         Iterator var3 = section.getKeys(false).iterator();

         while(true) {
            String name;
            ConfigurationSection cSec;
            do {
               if (!var3.hasNext()) {
                  return;
               }

               name = (String)var3.next();
               cSec = section.getConfigurationSection(name);
            } while(cSec == null);

            String world = cSec.getString("world");
            double x = cSec.getDouble("x");
            double y = cSec.getDouble("y");
            double z = cSec.getDouble("z");
            Location loc = new Location(Bukkit.getWorld(world), x, y, z);
            Crate crate = new Crate(name, loc);
            ConfigurationSection itemsSec = cSec.getConfigurationSection("items");
            if (itemsSec != null) {
               Iterator var16 = itemsSec.getKeys(false).iterator();

               while(var16.hasNext()) {
                  String slotStr = (String)var16.next();
                  int slot = Integer.parseInt(slotStr);
                  crate.setItem(slot, itemsSec.getItemStack(slotStr));
               }
            }

            this.crates.put(name.toLowerCase(), crate);
         }
      }
   }

   public void saveCrates() {
      FileConfiguration cfg = this.plugin.getConfig();
      cfg.set("crates", (Object)null);
      Iterator var2 = this.crates.values().iterator();

      while(var2.hasNext()) {
         Crate crate = (Crate)var2.next();
         String path = "crates." + crate.getName() + ".";
         Location loc = crate.getLocation();
         cfg.set(path + "world", loc.getWorld().getName());
         cfg.set(path + "x", loc.getX());
         cfg.set(path + "y", loc.getY());
         cfg.set(path + "z", loc.getZ());
         Iterator var6 = crate.getItems().entrySet().iterator();

         while(var6.hasNext()) {
            Entry<Integer, ItemStack> entry = (Entry)var6.next();
            cfg.set(path + "items." + String.valueOf(entry.getKey()), entry.getValue());
         }
      }

      this.plugin.saveConfig();
   }

   public void createCrate(String name, Location loc) {
      Crate crate = new Crate(name, loc);
      this.crates.put(name.toLowerCase(), crate);
      this.saveCrates();
   }

   public boolean deleteCrate(String name) {
      Crate removed = (Crate)this.crates.remove(name.toLowerCase());
      if (removed != null) {
         this.saveCrates();
         return true;
      } else {
         return false;
      }
   }

   public boolean crateExists(String name) {
      return this.crates.containsKey(name.toLowerCase());
   }

   public Crate getCrate(String name) {
      return (Crate)this.crates.get(name.toLowerCase());
   }

   public Set<String> getCrateNames() {
      return this.crates.keySet();
   }

   public Collection<Crate> getAllCrates() {
      return this.crates.values();
   }
}
