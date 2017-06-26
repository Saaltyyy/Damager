package de.damager.utils;

import java.util.ArrayList;
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
import org.bukkit.scheduler.BukkitRunnable;

import de.damager.commands.DamagerCMD;
import de.damager.main.main;

public class Damager {

	public static ArrayList<DamagerObject> damager = new ArrayList<>();
	enum difficulty {EASY, MEDIUM, HARD};
	@SuppressWarnings("deprecation")
	public void startDamaging(final DamagerObject damager) {
		 Bukkit.getScheduler().scheduleAsyncRepeatingTask(main.getInstance(), new BukkitRunnable() {
			
			@Override
			public void run() {
				if (damager.started) {
					damager.getP().damage(damager.getDamage());
				} else {
					this.cancel();
				}
				
			}
		}, 0, damager.getTime());
	}
		
	public static boolean updateTime(int time, DamagerObject damager, boolean add) {
		if (!damager.isStarted()) {
			if (add) {
				damager.setTime(damager.getTime() + time);
			} else {
				damager.setTime(damager.getTime() - time);
			}
			return true;
		}
		return false;
	}
	public static boolean updateDamage(int damage, DamagerObject damager, boolean add) {
		if (!damager.isStarted()) {
			if (add) {
				damager.setDamage(damager.getDamage() + damage);
			} else {
				damager.setDamage(damager.getDamage() - damage);
			}
			return true;
		}
		return false;
	}
	public static void startDamager(DamagerObject damager) {
		if (!damager.isStarted()) {
			damager.setStarted(true);
			startDamager(damager);
		}
	}
	public static DamagerObject getDamagerPlayer(Player p) {
		for (DamagerObject d : damager) {
			if (d.getP().getName().equals(p.getName())) {
				return d;
			}
		}
		return null;
	}
	public static void startBasicDamager(Player p, difficulty d) {
		if (d == difficulty.EASY) {
			DamagerObject object = new DamagerObject(p, 14, 4, false);
			damager.add(object);
			startDamager(object);
		} else if (d == difficulty.MEDIUM) {
			DamagerObject object = new DamagerObject(p, 14, 6, false);
			damager.add(object);
			startDamager(object);
		} else if (d == difficulty.HARD) {
			DamagerObject object = new DamagerObject(p, 10, 6, false);
			damager.add(object);
			startDamager(object);
		}
	}
	public static void createCustomDamager(Player p) {
		damager.add(new DamagerObject(p, 0, 0, false));
	}
}
