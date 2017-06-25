package de.damager.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.damager.main.main;

public class inv2 implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		
		main.inv2 = p.getServer().createInventory(null, 9,ChatColor.WHITE + "Create your own Damager");
		
		
		ItemStack timep1 = new ItemStack(Material.WOOL,1,(short)10);
		ItemMeta timep1m = timep1.getItemMeta();
		timep1m.setDisplayName(ChatColor.DARK_PURPLE + " TIME +1");
		timep1.setItemMeta(timep1m);
		
		ItemStack timem1 = new ItemStack(Material.WOOL,1,(short)10);
		ItemMeta timepmm = timem1.getItemMeta();
		timepmm.setDisplayName(ChatColor.DARK_PURPLE + " TIME -1");
		timem1.setItemMeta(timepmm);
		
		ItemStack schadenp1 = new ItemStack(Material.WOOL,1,(short)11);
		ItemMeta schadenp1m = schadenp1.getItemMeta();
		schadenp1m.setDisplayName(ChatColor.DARK_BLUE + " DAMAGE +1");
		schadenp1.setItemMeta(schadenp1m);
		
		ItemStack schadenm1 = new ItemStack(Material.WOOL,1,(short)11);
		ItemMeta schadenm1m = schadenm1.getItemMeta();
		schadenm1m.setDisplayName(ChatColor.DARK_BLUE + " DAMAGE -1");
		schadenm1.setItemMeta(schadenm1m);
		
		ItemStack start = new ItemStack(Material.WOOL,1,(short)5);
		ItemMeta startm = start.getItemMeta();
		startm.setDisplayName(ChatColor.GREEN + " START");
		startm.setLore(main.lore);
		start.setItemMeta(startm);
		
		ItemStack reset = new ItemStack(Material.WOOL,1,(short) 14);
		ItemMeta resetm = reset.getItemMeta();
		resetm.setDisplayName(ChatColor.RED + " RESET");
		reset.setItemMeta(resetm);
		
		ItemStack back = new ItemStack(Material.WOOL,1,(short) 15);
		ItemMeta backm = back.getItemMeta();
		backm.setDisplayName(ChatColor.WHITE + " BACK");
		back.setItemMeta(backm);
		
		main.inv2.setItem(0, back);
		main.inv2.setItem(2, schadenm1);
		main.inv2.setItem(3, timem1);
		main.inv2.setItem(4, start);
		main.inv2.setItem(5, timep1);
		main.inv2.setItem(6, schadenp1);
		main.inv2.setItem(8, reset);
			
		p.openInventory(main.inv2);
		
		
		
		
		return true;
	}

}