package de.damager.utils;

import org.bukkit.entity.Player;

public class DamagerObject {

	Player p;
	int time;
	double damage;
	boolean started;
	
	public DamagerObject(Player p, int time, double damage, boolean started) {
		super();
		this.p = p;
		this.time = time;
		this.damage = damage;
		this.started = started;
	}
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		this.p = p;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public boolean isStarted() {
		return started;
	}
	public void setStarted(boolean started) {
		this.started = started;
	}
	
	
}
