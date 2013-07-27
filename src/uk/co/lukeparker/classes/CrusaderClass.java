package uk.co.lukeparker.classes;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import uk.co.lukeparker.PlayerClasses;

public class CrusaderClass implements Listener{

	public PlayerClasses plugin;
	
	public boolean messageSent = false;
	
	public CrusaderClass(PlayerClasses plugin){
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		if(plugin.getConfig().getList("Crusaders").contains(event.getPlayer().getName())){
			event.getPlayer().setDisplayName(plugin.getConfig().getString("Class Names.Crusader") + " - " + event.getPlayer().getName());
		}
	}
	
	@EventHandler
	public void onPotion(PlayerInteractEvent e){
		ItemStack item = e.getPlayer().getItemInHand();
		Block block = e.getClickedBlock();
		if(plugin.getConfig().getList("Crusaders").contains(e.getPlayer().getName()) && !plugin.bypassers.contains(e.getPlayer().getName())){
			if(item == null)return;
			if(item.getType() == Material.POTION){
				e.setCancelled(true);
				e.getPlayer().sendMessage(plugin.message("You can not use Potions!", ChatColor.RED));
			}
			if(e.getAction() == Action.RIGHT_CLICK_BLOCK && block.getType() == Material.ENCHANTMENT_TABLE){
				e.setCancelled(true);
				e.getPlayer().sendMessage(plugin.message("You can not use enchantment tables!", ChatColor.RED));
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onHoldItem(PlayerItemHeldEvent event){
		int newSlot = event.getNewSlot();
		ItemStack result = event.getPlayer().getInventory().getItem(newSlot);
		Player player = event.getPlayer();
		if(plugin.getConfig().getList("Crusaders").contains(player.getName()) && !plugin.bypassers.contains(player.getName())){
			List<Integer> cantHold = (List<Integer>) plugin.getConfig().getList("Cant Hold.Crusaders");
			for(Integer matID: cantHold){
				if(result != null && result.getType() == Material.getMaterial(matID)){
					event.setCancelled(true);
					player.sendMessage(plugin.message("You cant hold this!", ChatColor.RED));
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onCraftItem(CraftItemEvent event){
		Material result = event.getInventory().getResult().getType();
		Player player = (Player)event.getWhoClicked();
		if(plugin.getConfig().getList("Crusaders").contains(player.getName()) && !plugin.bypassers.contains(player.getName())){
			List<Integer> cantCraft = (List<Integer>) plugin.getConfig().getList("Cant Craft.Crusaders");
			for(Integer matID: cantCraft){
				if(result == Material.getMaterial(matID)){
					event.setCancelled(true);
					player.sendMessage(plugin.message("You can not craft that!", ChatColor.RED));
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onPickupItem(PlayerPickupItemEvent event){
		if(plugin.getConfig().getList("Crusaders").contains(event.getPlayer().getName()) && !plugin.bypassers.contains(event.getPlayer().getName())){
			Player player = event.getPlayer();
			Material item = event.getItem().getItemStack().getType();
			List<Integer> cantPickup = (List<Integer>) plugin.getConfig().getList("Cant Pickup.Crusaders");
			for(Integer matID: cantPickup){
				if(item == Material.getMaterial(matID)){
					event.setCancelled(true);
					if(!messageSent){
						player.sendMessage(plugin.message("You can not pick this up!", ChatColor.RED));
						messageSent = true;
					}
				}
			}
			
			// Schedule Message
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
				public void run(){
					messageSent = false;
				}
			}, 200);
		}
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onInventoryClicked(InventoryClickEvent event){
		Player player = (Player)event.getWhoClicked();
		if(plugin.getConfig().getList("Crusaders").contains(player.getName()) && !plugin.bypassers.contains(player.getName())){
		if(!event.getInventory().getType().equals(InventoryType.CHEST) || event.getSlot() < 0 || event.getSlotType().equals(SlotType.QUICKBAR)) return;
		if(event.getInventory().getItem(event.getSlot()) == null) return;
			if(event.getInventory().getType() == InventoryType.CHEST){
				List<Integer> cantPickup = (List<Integer>) plugin.getConfig().getList("Cant Pickup.Crusaders");
				for(Integer matID: cantPickup){
					if(event.getInventory().getItem(event.getSlot()).getType() == Material.getMaterial(matID)){
						event.setCancelled(true);
						player.sendMessage(plugin.message("You can't take this!", ChatColor.RED));
					}
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onPlayerBreakBlock(BlockBreakEvent event){
		Player player = event.getPlayer();
		if(plugin.getConfig().getList("Crusaders").contains(player.getName()) && !plugin.bypassers.contains(player.getName())){
			List<Integer> cantBreak = (List<Integer>) plugin.getConfig().getList("Cant Break.Crusaders");
			for(Integer b: cantBreak){
				if(event.getBlock().getType() == Material.getMaterial(b)){
					event.setCancelled(true);
					player.sendMessage(plugin.message("You can't break this!", ChatColor.RED));
				}
			}
		}
	}
	
}
