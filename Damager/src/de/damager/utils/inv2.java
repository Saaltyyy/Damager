package de.damager.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.damager.commands.DamagerCMD;
import de.damager.main.main;

public class inv2 implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		
		
		p.openInventory(main.inv2);
		
		
		
		
		return true;
	}
	public void fillInventory() {
		main.inv2 = Bukkit.getServer().createInventory(null, 9*3,ChatColor.WHITE + "Create your own Damager");
		
		
		ItemStack timep1 = new ItemStack(Material.WOOL,1,(short)10);
		ItemMeta timep1m = timep1.getItemMeta();
		timep1m.setDisplayName(ChatColor.DARK_PURPLE + " TIME + 0,1 sec");
		timep1.setItemMeta(timep1m);
		
		ItemStack timem1 = new ItemStack(Material.WOOL,1,(short)10);
		ItemMeta timepmm = timem1.getItemMeta();
		timepmm.setDisplayName(ChatColor.DARK_PURPLE + " TIME - 0,1 sec");
		timem1.setItemMeta(timepmm);
		
		ItemStack schadenp1 = new ItemStack(Material.WOOL,1,(short)11);
		ItemMeta schadenp1m = schadenp1.getItemMeta();
		schadenp1m.setDisplayName(ChatColor.DARK_BLUE + " DAMAGE + 0.5 <3");
		schadenp1.setItemMeta(schadenp1m);
		
		ItemStack schadenm1 = new ItemStack(Material.WOOL,1,(short)11);
		ItemMeta schadenm1m = schadenm1.getItemMeta();
		schadenm1m.setDisplayName(ChatColor.DARK_BLUE + " DAMAGE - 0.5 <3");
		schadenm1.setItemMeta(schadenm1m);
		
		ItemStack start = new ItemStack(Material.WOOL,1,(short)5);
		ItemMeta startm = start.getItemMeta();
		startm.setDisplayName(ChatColor.GREEN + " START");
		start.setItemMeta(startm);
		
		ItemStack reset = new ItemStack(Material.WOOL,1,(short) 14);
		ItemMeta resetm = reset.getItemMeta();
		resetm.setDisplayName(ChatColor.RED + " RESET");
		reset.setItemMeta(resetm);
		
		ItemStack back = new ItemStack(Material.WOOL,1,(short) 15);
		ItemMeta backm = back.getItemMeta();
		backm.setDisplayName(ChatColor.WHITE + " BACK");
		back.setItemMeta(backm);
		
		ItemStack time = new ItemStack(Material.WOOL);
		ItemMeta timem = time.getItemMeta();
		timem.setDisplayName("Time : 0.5 sec's" );
		time.setItemMeta(timem);
		
		ItemStack damage = new ItemStack(Material.WOOL);
		ItemMeta damagem = damage.getItemMeta();
		damagem.setDisplayName("Damage : 0.0 <3");
		damage.setItemMeta(damagem);
		
		main.inv2.setItem(18, back);
		main.inv2.setItem(11, schadenm1);
		main.inv2.setItem(14, timem1);
		main.inv2.setItem(13, start);
		main.inv2.setItem(15, timep1);
		main.inv2.setItem(12, schadenp1);
		main.inv2.setItem(26, reset);
		main.inv2.setItem(4, time);
		main.inv2.setItem(22, damage);
	}
}