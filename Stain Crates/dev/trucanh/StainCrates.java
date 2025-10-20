package dev.trucanh;

import dev.trucanh.command.StainCratesCommand;
import dev.trucanh.crate.CrateManager;
import dev.trucanh.key.KeyManager;
import dev.trucanh.listener.BlockInteractListener;
import dev.trucanh.listener.GuiListener;
import dev.trucanh.placeholder.KeyPlaceholderExpansion;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import l.M.x.__v3_;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class StainCrates extends JavaPlugin {
   private static StainCrates instance;
   private CrateManager crateManager;
   private KeyManager keyManager;
   private final Map<UUID, String> selectingCrate;

   public StainCrates() {
      __v3_.v();
      super();
      this.selectingCrate = new HashMap();
   }

   public void onEnable() {
      instance = this;
      this.saveDefaultConfig();
      this.crateManager = new CrateManager(this);
      this.keyManager = new KeyManager(this);
      if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
         (new KeyPlaceholderExpansion(this)).register();
      }

   StainCratesCommand command = new StainCratesCommand(this);
   this.getCommand("staincrates").setExecutor(command);
   this.getCommand("staincrates").setTabCompleter(command);
      Bukkit.getPluginManager().registerEvents(new BlockInteractListener(this), this);
      Bukkit.getPluginManager().registerEvents(new GuiListener(this), this);
      this.crateManager.loadCrates();
      this.keyManager.loadKeys();
   }

   public void onDisable() {
      if (this.crateManager != null) {
         this.crateManager.saveCrates();
      }

      if (this.keyManager != null) {
         this.keyManager.saveKeys();
      }

   }

   public CrateManager getCrateManager() {
      return this.crateManager;
   }

   public KeyManager getKeyManager() {
      return this.keyManager;
   }

   public Map<UUID, String> getSelectingCrate() {
      return this.selectingCrate;
   }

   public static VnecoCrates getInstance() {
      return instance;
   }
}
