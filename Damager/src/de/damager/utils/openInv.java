package de.damager.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.damager.commands.DamagerCMD;
import de.damager.main.main;

public class openInv implements Listener {		
		
		@EventHandler
		public void onPlayerInteract(PlayerInteractEvent e){
			Player p = e.getPlayer();
			
			if(e.getMaterial().equals(Material.MAGMA_CREAM)) {
				
				main.inv = p.getServer().createInventory(null, 9, "§c Choose your Damage");
				
				ItemStack easy = new ItemStack(Material.WOOL, 1,(short) 5);
				ItemMeta easymeta = easy.getItemMeta();
				easymeta.setDisplayName("§a EASY");
				easy.setItemMeta(easymeta);
				
				ItemStack medium = new ItemStack(Material.WOOL, 1,(short) 4);
				ItemMeta mediummeta = easy.getItemMeta();
				mediummeta.setDisplayName("§e MEDIUM");
				medium.setItemMeta(mediummeta);
				
				ItemStack hard = new ItemStack(Material.WOOL, 1,(short) 14);
				ItemMeta hardmeta = easy.getItemMeta();
				hardmeta.setDisplayName("§c HARD");
				hard.setItemMeta(hardmeta);
				
				ItemStack custom = new ItemStack(Material.WOOL);
				ItemMeta custommeta = custom.getItemMeta();
				custommeta.setDisplayName("§f CUSTOM");
				custom.setItemMeta(custommeta);
				
				main.inv.setItem(0, easy);
				main.inv.setItem(3, medium);
				main.inv.setItem(5, hard);
				main.inv.setItem(8, custom);
				p.openInventory(main.inv);
			}
		
	}
	
}
