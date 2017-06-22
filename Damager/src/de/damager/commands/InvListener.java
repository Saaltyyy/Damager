package de.damager.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvListener implements Listener {

		@EventHandler
		public void onInvClick(InventoryClickEvent e) {
			Player p = (Player) e.getWhoClicked();

			
			if(e.getInventory().getName().equalsIgnoreCase(ChatColor.RED + "Choose your Damage")){
				e.setCancelled(true);
				if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + " EASY")){
					Bukkit.dispatchCommand(p, "damager easy");
					p.closeInventory();
						
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + " MEDIUM")) {
					Bukkit.dispatchCommand(p, "damager medium");
					p.closeInventory();
					
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + " HARD")) {
					Bukkit.dispatchCommand(p, "damager hard");
					p.closeInventory();
					
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(" CUSTOM")) {
					Bukkit.dispatchCommand(p, "inv2");
				}
			} else if(e.getInventory().getName().equalsIgnoreCase(ChatColor.RED + " Create your own Damager")){
					e.setCancelled(true);
			}

		}
}
