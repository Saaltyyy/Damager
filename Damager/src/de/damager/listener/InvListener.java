package de.damager.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.damager.commands.DamagerCMD;
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
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + " TIME + 0,1 sec")){
						Bukkit.dispatchCommand(p, "damager custom time +1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + " TIME - 0,1 sec")){
						Bukkit.dispatchCommand(p, "damager custom time -1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_BLUE + " DAMAGE + 0.5 <3")){
						Bukkit.dispatchCommand(p, "damager custom damage +1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_BLUE + " DAMAGE - 0.5 <3")){
						Bukkit.dispatchCommand(p, "damager custom damage -1");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + " START")){
						Bukkit.dispatchCommand(p, "damager custom start");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + " RESET")){
						Bukkit.dispatchCommand(p, "damager custom reset");
						
					} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE + " BACK")){
						p.openInventory(main.inv);
						Bukkit.dispatchCommand(p, "damager custom reset");
						
					}
					
					double times = DamagerCMD.time;
					double damages = DamagerCMD.damage;
					
					ItemStack time = new ItemStack(Material.WOOL);
					ItemMeta timem = time.getItemMeta();
					timem.setDisplayName("Time : " + times/20 + " sec's");
					time.setItemMeta(timem);
					
					ItemStack damage = new ItemStack(Material.WOOL);
					ItemMeta damagem = damage.getItemMeta();
					damagem.setDisplayName("Damage : " + damages/2 + " <3");
					damage.setItemMeta(damagem);
					
					main.inv2.setItem(4, time);
					main.inv2.setItem(22, damage);
			}

		}
}
