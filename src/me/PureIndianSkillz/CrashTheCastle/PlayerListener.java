package me.PureIndianSkillz.CrashTheCastle;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.block.Sign;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener implements Listener{

	public PlayerListener (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
	
	@EventHandler (priority = EventPriority.HIGHEST)
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
        if (e.getClickedBlock().getState() instanceof Sign) {
        Sign s = (Sign) e.getClickedBlock().getState();
        Player player = (Player) e.getPlayer();   
        if (s.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"knight"))
        if (s.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){    
        	e.getPlayer().sendMessage("You have chosen the Knight Class");
                ItemStack stonesword = new ItemStack(Material.STONE_SWORD, 1);
                ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
                PlayerInventory pi = player.getInventory();
                pi.addItem(stonesword);
                pi.setHelmet(ironhelmet);
                
                
        }
        
        
        if (s.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"archer"))
            if (s.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){
                    e.getPlayer().sendMessage("You have chosen the Archer Class");} 
        
        
        if (s.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"wizard"))
            if (s.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){
                    e.getPlayer().sendMessage("You have chosen the Wizard Class");}
        
        
        if (s.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"farmer"))
            if (s.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){
                    e.getPlayer().sendMessage("You have chosen the Farmer Class");}
        
        
        if (s.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"bowman"))
            if (s.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){
                    e.getPlayer().sendMessage("You have chosen the Bowman Class");}
        
        
        if (s.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"alchemist"))
            if (s.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){
                    e.getPlayer().sendMessage("You have chosen the Alchemist Class");}
        
        }
    }
}