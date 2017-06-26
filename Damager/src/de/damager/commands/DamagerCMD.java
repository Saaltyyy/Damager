package de.damager.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import de.damager.utils.Damager;

public class DamagerCMD implements CommandExecutor {
		
		public static int damage = 0;
		public static int time = 10;
		
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
				//TODO: CUSTOM DAMAGER, EASY, MEDIUM, HARD
			
		} else {
			sender.sendMessage("Only a Player can execute this command!");
		}
		return true;
	}

}
