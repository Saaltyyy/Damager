package de.damager.utils;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.damager.commands.DamagerCMD;
import de.damager.main.main;

public class Damager implements Listener{

	public static HashMap<Player, Integer> inDamager = new HashMap<>();
	
	public static void damage(final double damage, final Player p, int time) {
		
		if(!inDamager.containsKey(p)) {
			final int x = 0;
			inDamager.put(p, x);
			Bukkit.getScheduler().scheduleSyncRepeatingTask(main.getInstance(), new Runnable() {
				   
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
		
		if (inDamager.containsKey(p)) {
			Bukkit.dispatchCommand(p, "damager custom reset");
			inDamager.remove(p);
		}
		
		
		
	}
	
}
