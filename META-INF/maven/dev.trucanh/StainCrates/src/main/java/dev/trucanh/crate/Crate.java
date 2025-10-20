package dev.trucanh.crate;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Crate {
   private final String name;
   private Location location;
   private final Map<Integer, ItemStack> items = new HashMap();

   public Crate(String name, Location location) {
      this.name = name;
      this.location = location;
   }

   public String getName() {
      return this.name;
   }

   public Location getLocation() {
      return this.location;
   }

   public void setLocation(Location location) {
      this.location = location;
   }

   public Map<Integer, ItemStack> getItems() {
      return this.items;
   }

   public void setItem(int slot, ItemStack item) {
      this.items.put(slot, item);
   }
}
