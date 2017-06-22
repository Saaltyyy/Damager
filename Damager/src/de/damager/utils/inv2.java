package de.damager.utils;

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
		
		main.inv = p.getServer().createInventory(null, 9, "§c Create your own Damager");
		
		
		ItemStack timep1 = new ItemStack(Material.WOOL,1,(short)10);
		ItemMeta timep1m = timep1.getItemMeta();
		timep1m.setDisplayName("§5 TIME +1");
		timep1.setItemMeta(timep1m);
		
		ItemStack timem1 = new ItemStack(Material.WOOL,1,(short)10);
		ItemMeta timepmm = timem1.getItemMeta();
		timepmm.setDisplayName("§5 TIME -1");
		timem1.setItemMeta(timepmm);
		
		ItemStack schadenp1 = new ItemStack(Material.WOOL,1,(short)11);
		ItemMeta schadenp1m = schadenp1.getItemMeta();
		schadenp1m.setDisplayName("§9 DAMAGE +1");
		schadenp1.setItemMeta(schadenp1m);
		
		ItemStack schadenm1 = new ItemStack(Material.WOOL,1,(short)11);
		ItemMeta schadenm1m = schadenm1.getItemMeta();
		schadenm1m.setDisplayName("§9 DAMAGE -1");
		schadenm1.setItemMeta(schadenm1m);
		
		ItemStack start = new ItemStack(Material.WOOL,1,(short)5);
		ItemMeta startm = start.getItemMeta();
		startm.setDisplayName("§a START");
		start.setItemMeta(startm);
		
		main.inv.setItem(2, schadenm1);
		main.inv.setItem(3, timem1);
		main.inv.setItem(4, start);
		main.inv.setItem(5, timep1);
		main.inv.setItem(6, schadenp1);
			
		p.openInventory(main.inv);
		
		
		
		
		
		return true;
	}

}