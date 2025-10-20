package dev.trucanh.utils;

import java.lang.reflect.Method;
import java.time.Instant;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class DogAdonisHook {
   private static final String FROZEN_KEY = "frozen_remaining";
   private static Class<?> pickaxeClass;
   private static Method isPickaxe;
   private static Method getExpiry;
   private static Method setExpiry;

   public static boolean available() {
      return pickaxeClass != null && Bukkit.getPluginManager().getPlugin("DogAdonis") != null;
   }

   public static ItemStack freeze(ItemStack item) {
      if (!available()) {
         return item;
      } else {
         try {
            Object plugin = Bukkit.getPluginManager().getPlugin("DogAdonis");
            boolean ok = (Boolean)isPickaxe.invoke((Object)null, item, plugin);
            if (!ok) {
               return item;
            }

            long expiry = (Long)getExpiry.invoke((Object)null, item, plugin);
            long remaining = expiry - Instant.now().toEpochMilli();
            ItemMeta meta = item.getItemMeta();
            meta.getPersistentDataContainer().set(new NamespacedKey(Bukkit.getPluginManager().getPlugin("VnecoCrates"), "frozen_remaining"), PersistentDataType.LONG, remaining);
            item.setItemMeta(meta);
         } catch (Exception var8) {
         }

         return item;
      }
   }

   public static ItemStack unfreeze(ItemStack item) {
      if (!available()) {
         return item;
      } else {
         NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("VnecoCrates"), "frozen_remaining");
         ItemMeta meta = item.getItemMeta();
         PersistentDataContainer c = meta.getPersistentDataContainer();
         if (!c.has(key, PersistentDataType.LONG)) {
            return item;
         } else {
            long remaining = (Long)c.get(key, PersistentDataType.LONG);
            c.remove(key);
            item.setItemMeta(meta);

            try {
               Object plugin = Bukkit.getPluginManager().getPlugin("DogAdonis");
               setExpiry.invoke((Object)null, item, Instant.now().toEpochMilli() + remaining, plugin);
            } catch (Exception var7) {
            }

            return item;
         }
      }
   }

   static {
      try {
         pickaxeClass = Class.forName("com.devtrucanh.dogadonis.util.PickaxeItem");
         isPickaxe = pickaxeClass.getMethod("isAmethystPickaxe", ItemStack.class, Class.forName("com.devtrucanh.dogadonis.DogAdonis"));
         getExpiry = pickaxeClass.getMethod("getExpiry", ItemStack.class, Class.forName("com.devtrucanh.dogadonis.DogAdonis"));
         setExpiry = pickaxeClass.getMethod("setExpiry", ItemStack.class, Long.TYPE, Class.forName("com.devtrucanh.dogadonis.DogAdonis"));
      } catch (Exception var1) {
      }

   }
}
