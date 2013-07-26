package me.PureIndianSkillz.CrashTheCastle;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class CrashTheCastle extends JavaPlugin {
	public static  Logger logger = Logger.getLogger("Minecraft");
	public static CrashTheCastle plugin;	 
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		CrashTheCastle.logger.info(pdfFile.getName() + "CrashTheCastle Has been Disabled");
	}
	
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		CrashTheCastle.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " CrashTheCastle Has been Enabled");
		
	}public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	    Player player = (Player) sender;
	    //start a game//
		if(commandLabel.equalsIgnoreCase("start")){
			player.sendMessage(ChatColor.RED + "The Plugin is still in devolpment!!!!");
			player.setMaxHealth(100);
			return true;
			}
			
		if (cmd.getName().equalsIgnoreCase("resethealth"))
		{
			player.setMaxHealth(20);
		}	
			
			
	    
			

 return true;
	}

}
