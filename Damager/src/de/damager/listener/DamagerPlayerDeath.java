package de.damager.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.damager.utils.Damager;

public class DamagerPlayerDeath implements Listener {
	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player p = e.getEntity().getPlayer();
		
		if (Damager.getDamagerPlayer(p) != null) {
			Damager.damager.remove(p);
		}
	}
}
