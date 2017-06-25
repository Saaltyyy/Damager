package de.damager.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.damager.main.main;

public class InvListener implements Listener {

		@EventHandler
		public void onInvClick(InventoryClickEvent e) {
			Player p = (Player) e.getWhoClicked();

			
			if(e.getInventory().getName().equalsIgnoreCase(ChatColor.WHITE + "Choose your Damage")){
				e.setCancelled(true);
				if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + " EASY")){
					Bukkit.dispatchCommand(p, "damager easy");
					p.closeInventory();
						
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + " MEDIUM")) {
					Bukkit.dispatchCommand(p, "damager medium");
					p.closeInventory();
					
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + " HARD")) {
					Bukkit.dispatchCommand(p, "damager hard");
					p.closeInventory();
					
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(" CUSTOM")) {
					Bukkit.dispatchCommand(p, "inv2");
				}
			} else if(e.getInventory().getName().equalsIgnoreCase(ChatColor.WHITE + "Create your own Damager")){
					e.setCancelled(true);
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + " TIME +1")){
						Bukkit.dispatchCommand(p, "damager custom time +1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + " TIME -1")){
						Bukkit.dispatchCommand(p, "damager custom time -1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_BLUE + " DAMAGE +1")){
						Bukkit.dispatchCommand(p, "damager custom damage +1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_BLUE + " DAMAGE -1")){
						Bukkit.dispatchCommand(p, "damager custom damage -1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + " START")){
						Bukkit.dispatchCommand(p, "damager custom start");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + " RESET")){
						Bukkit.dispatchCommand(p, "damager custom reset");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE + " BACK")){
						p.openInventory(main.inv);
						main.lore.remove("Test");
					}
			}

		}
}
