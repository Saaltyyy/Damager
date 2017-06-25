package de.damager.utils;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.damager.commands.DamagerCMD;
import de.damager.main.main;

public class Damager implements Listener{

	public static HashMap<Player, Integer> inDamager = new HashMap<>();
	private static int x;
	
	public static void damage(final double damage, final Player p, int time) {
		
		if(!inDamager.containsKey(p)) {
			inDamager.put(p, x);
			x = Bukkit.getScheduler().scheduleSyncRepeatingTask(main.getInstance(), new Runnable() {
				   
				   @Override
				   public void run() {
					   if(inDamager.containsKey(p)) {
						     p.damage(damage);
					   }else {
						   
						   Bukkit.getScheduler().cancelTask(x);
					   }
				    
					 
				    
				   }
				  }, 0, time);
				 }
			
		} 
	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player p = e.getEntity().getPlayer();
		
		ItemStack item = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta itemm = item.getItemMeta();
		itemm.setDisplayName(ChatColor.GRAY + "Damager");
		item.setItemMeta(itemm);
		
		p.getInventory().clear();
		p.getInventory().setItem(4, item);
		if (inDamager.containsKey(p)) {
			Bukkit.dispatchCommand(p, "damager custom reset");
			inDamager.remove(p);
			
			
		}
		
		
		
	}
	
}
