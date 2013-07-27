package me.PureIndianSkillz.CrashTheCastle;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreateAClass {

	
	
		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		    Player player = (Player) sender;
		    //start a game//
			if(commandLabel.equalsIgnoreCase("class")){
				//send message
				player.sendMessage(ChatColor.RED + "The Plugin is still in devolpment!!!!");
			}return true;
				}
		
	}
			
