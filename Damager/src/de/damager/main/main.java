package de.damager.main;


import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.damager.commands.DamagerCMD;
import de.damager.commands.InvListener;
import de.damager.utils.Damager;
import de.damager.utils.openInv;
import de.damager.utils.inv2;

public class main extends JavaPlugin {
		public static Inventory inv = null;
		public static Inventory inv2 = null;
		private static main instance;
		public void onEnable(){
			instance = this;
			
			registerCommand();
			
			registerEvents();
			
		
		}
		
		private void registerEvents() {
			PluginManager pm = Bukkit.getServer().getPluginManager();
			pm.registerEvents(new Damager(), this);
			pm.registerEvents(new openInv(), this);
			pm.registerEvents(new InvListener(), this);
			
		}
		
		private void registerCommand() {
			
			this.getCommand("Damager").setExecutor(new DamagerCMD());
			this.getCommand("inv2").setExecutor(new inv2());
		}
		
		@Override
		public void onDisable(){
			System.out.println("Das Plugin wurde gestoppt");
			
		}
		
		public static main getInstance() {
			return instance;
		
		}
			
}
