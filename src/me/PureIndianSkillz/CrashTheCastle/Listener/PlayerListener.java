package me.PureIndianSkillz.CrashTheCastle.Listener;

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
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.block.Sign;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener implements Listener{

	public PlayerListener (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
	Player player = event.getPlayer();
	int blockId = event.getClickedBlock().getType().getId();
	if(blockId == 68) {
	Sign sign = (Sign) event.getClickedBlock().getState();
		if(sign.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"knight"))
			if (sign.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){

				player.sendMessage("Test");
				event.getPlayer().sendMessage("You have chosen the Knight Class");
				ItemStack stonesword = new ItemStack(Material.STONE_SWORD, 1);
				ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
				ItemStack ironchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
				ItemStack ironlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
				ItemStack ironboots = new ItemStack(Material.IRON_BOOTS, 1);
				ItemStack stick = new ItemStack(Material.STICK, 1);
				PlayerInventory pi = player.getInventory();
				pi.clear();
				pi.addItem(stonesword);
				pi.addItem(stick);
				pi.setHelmet(ironhelmet);
				pi.setChestplate(ironchest);
				pi.setLeggings(ironlegs);
				pi.setBoots(ironboots);}
				
				player.updateInventory();
		
		if(sign.getLine(1).equalsIgnoreCase(ChatColor.GREEN+"archer"))
			if (sign.getLine(2).equalsIgnoreCase(ChatColor.GREEN+"class")){

				player.sendMessage("Test2");
				event.getPlayer().sendMessage("You have chosen the Archer Class");
				ItemStack woodsword = new ItemStack(Material.WOOD_SWORD, 1);
				ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
				ItemStack leatherchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				ItemStack leatherlegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				ItemStack leatherboots = new ItemStack(Material.LEATHER_BOOTS, 1);
				ItemStack bow = new ItemStack(Material.BOW, 1);
				ItemStack arrow = new ItemStack(Material.ARROW, 64);
				ItemStack stick = new ItemStack(Material.STICK, 2);
				PlayerInventory pi = player.getInventory();
				pi.clear();
				pi.addItem(woodsword);
				pi.addItem(bow);
				pi.addItem(arrow);
				pi.addItem(stick);
				pi.setHelmet(leatherhelmet);
				pi.setChestplate(leatherchest);
				pi.setLeggings(leatherlegs);
				pi.setBoots(leatherboots);
				player.updateInventory();}
		
	}
	if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR  && player.getItemInHand() != null) {
		if(player.getItemInHand().equals(Material.STICK)) {
			player.sendMessage("test stick");
			player.setHealth(20);
			player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
			// or player.getItemInHand().setAmount(0);
		}
	}
}
	
}
	
