package de.damager.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.damager.utils.Damager;
import de.damager.utils.DamagerObject;

public class DamagerPlayerDeath implements Listener {
	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player p = e.getEntity().getPlayer();
		
		if (Damager.getDamagerPlayer(p) != null) {
			Damager.damager.remove(p);
		}
	}
}
