package de.damager.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.damager.main.main;
import de.damager.utils.Damager;

public class DamagerCMD implements CommandExecutor {
		
		public static int damage = 0;
		public static int time = 10;
		
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			if (args.length == 1) {
				
				if(args[0].equalsIgnoreCase("easy")){
					
					Damager.damage(4, p, 10);
					Bukkit.dispatchCommand(sender, "kit stone");
				} else if(args[0].equalsIgnoreCase("medium")){
					
					Damager.damage(6, p, 10);
					Bukkit.dispatchCommand(sender, "kit stone");
				} else if(args[0].equalsIgnoreCase("hard")){
					
					Damager.damage(8, p, 10);
					Bukkit.dispatchCommand(sender, "kit stone");
				} else if(args[0].equalsIgnoreCase("stop") || args[0].equalsIgnoreCase("s")){
					
					Damager.inDamager.remove(p);
					
				}
				
			} else if(args[0].equalsIgnoreCase("custom")){
				
					if(args[1].equalsIgnoreCase("damage")){
						if(args[2].equalsIgnoreCase("+1")){
							damage = damage +1;
							p.sendMessage("Damage : " + damage);
						}else if(args[2].equalsIgnoreCase("-1")){
							damage = damage -1;
							p.sendMessage("Damage : " + damage);
							
						}
						
					}else if(args[1].equalsIgnoreCase("time")){
						if(args[2].equalsIgnoreCase("+1")){
							time = time +5;
							p.sendMessage("Time : " + time);
						}else if(args[2].equalsIgnoreCase("-1")){
							time = time -5;
							p.sendMessage("Time : " + time);
						}
						
					}else if(args[1].equalsIgnoreCase("start")){
							
							Damager.damage(damage, p, time);
							Bukkit.dispatchCommand(sender, "kit stone");
						
					}else if(args[1].equalsIgnoreCase("reset")){
						damage = 0;
						time = 10;
						p.sendMessage(damage + "");
						p.sendMessage(time + "");
						p.sendMessage("reset");
					}else if(args[1].equalsIgnoreCase("info")){
							p.sendMessage("Daten :");
							p.sendMessage("Damage : " + damage);
							p.sendMessage("Time : " + time);
							
							
					}
			}
			
		}
		return true;
	}

}
