package uk.co.lukeparker.listeners;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import uk.co.lukeparker.PlayerClasses;

public class PlayerListener implements Listener {
	private PlayerClasses plugin;
	
	public HashMap<String, Integer> playerJoins = new HashMap<String, Integer>();
	
	public PlayerListener(PlayerClasses plugin){
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		if(!plugin.archers.contains(player.getName()) && !plugin.alchemists.contains(player.getName()) && !plugin.blacksmiths.contains(player.getName()) && !plugin.crusaders.contains(player.getName()) && !plugin.enchanters.contains(player.getName()) && !plugin.farmers.contains(player.getName())){
			if(plugin.getConfig().getInt("First Spawn.z") != 0){
				player.teleport(plugin.firstSpawn);
			}
			event.setJoinMessage(ChatColor.AQUA + "Welcome, " + player.getName() + " to the server!");
			player.sendMessage(plugin.message("You must pick a class before continuing!", ChatColor.BLUE));
		}
	}
}
