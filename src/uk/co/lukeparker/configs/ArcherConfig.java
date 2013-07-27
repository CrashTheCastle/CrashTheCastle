package uk.co.lukeparker.configs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class ArcherConfig {
	public static List<Integer> archersCantCraft = new ArrayList<Integer>();
	public static List<Integer> archersCantHold = new ArrayList<Integer>();
	public static List<Integer> archersCantPickup = new ArrayList<Integer>();
	public static List<Integer> archersCantBreak = new ArrayList<Integer>();
	public static List<Integer> archersCantSmelt = new ArrayList<Integer>();
	
	public ArcherConfig(){
		cantCraft();
		cantHold();
		cantPickup();
		cantBreak();
		cantSmelt();
	}
	
	public static void cantCraft(){
		archersCantCraft.add(Material.STONE_SWORD.getId());
		archersCantCraft.add(Material.IRON_SWORD.getId());
		archersCantCraft.add(Material.GOLD_SWORD.getId());
		archersCantCraft.add(Material.DIAMOND_SWORD.getId());
		archersCantCraft.add(Material.IRON_HELMET.getId());
		archersCantCraft.add(Material.IRON_CHESTPLATE.getId());
		archersCantCraft.add(Material.IRON_LEGGINGS.getId());
		archersCantCraft.add(Material.IRON_BOOTS.getId());
		archersCantCraft.add(Material.GOLD_HELMET.getId());
		archersCantCraft.add(Material.GOLD_CHESTPLATE.getId());
		archersCantCraft.add(Material.GOLD_LEGGINGS.getId());
		archersCantCraft.add(Material.GOLD_BOOTS.getId());
		archersCantCraft.add(Material.DIAMOND_HELMET.getId());
		archersCantCraft.add(Material.DIAMOND_CHESTPLATE.getId());
		archersCantCraft.add(Material.DIAMOND_LEGGINGS.getId());
		archersCantCraft.add(Material.DIAMOND_BOOTS.getId());
		archersCantCraft.add(Material.PUMPKIN_PIE.getId());
		archersCantCraft.add(Material.BREAD.getId());
		archersCantCraft.add(Material.CAKE.getId());
		archersCantCraft.add(Material.POTION.getId());
		archersCantCraft.add(Material.PUMPKIN_SEEDS.getId());
		archersCantCraft.add(Material.SEEDS.getId());
		archersCantCraft.add(Material.POTION.getId());
		archersCantCraft.add(Material.WOOD_HOE.getId());
		archersCantCraft.add(Material.STONE_HOE.getId());
		archersCantCraft.add(Material.IRON_HOE.getId()); 
		archersCantCraft.add(Material.GOLD_HOE.getId());
		archersCantCraft.add(Material.DIAMOND_HOE.getId());
	}
	
	public static void cantHold(){
		archersCantHold.add(Material.STONE_SWORD.getId());
		archersCantHold.add(Material.IRON_SWORD.getId());
		archersCantHold.add(Material.GOLD_SWORD.getId());
		archersCantHold.add(Material.DIAMOND_SWORD.getId());
		archersCantHold.add(Material.IRON_HELMET.getId());
		archersCantHold.add(Material.IRON_CHESTPLATE.getId());
		archersCantHold.add(Material.IRON_LEGGINGS.getId());
		archersCantHold.add(Material.IRON_BOOTS.getId());
		archersCantHold.add(Material.GOLD_HELMET.getId());
		archersCantHold.add(Material.GOLD_CHESTPLATE.getId());
		archersCantHold.add(Material.GOLD_LEGGINGS.getId());
		archersCantHold.add(Material.GOLD_BOOTS.getId());
		archersCantHold.add(Material.DIAMOND_HELMET.getId());
		archersCantHold.add(Material.DIAMOND_CHESTPLATE.getId());
		archersCantHold.add(Material.DIAMOND_LEGGINGS.getId());
		archersCantHold.add(Material.DIAMOND_BOOTS.getId());
		archersCantHold.add(Material.POTION.getId());
		archersCantHold.add(Material.PUMPKIN_SEEDS.getId());
		archersCantHold.add(Material.SEEDS.getId());
		archersCantHold.add(Material.POTION.getId());
		archersCantHold.add(Material.WOOD_HOE.getId());
		archersCantHold.add(Material.STONE_HOE.getId());
		archersCantHold.add(Material.IRON_HOE.getId()); 
		archersCantHold.add(Material.GOLD_HOE.getId());
		archersCantHold.add(Material.DIAMOND_HOE.getId());
	}
	
	public static void cantPickup(){
		archersCantPickup.add(Material.STONE_SWORD.getId());
		archersCantPickup.add(Material.IRON_SWORD.getId());
		archersCantPickup.add(Material.GOLD_SWORD.getId());
		archersCantPickup.add(Material.DIAMOND_SWORD.getId());
		archersCantPickup.add(Material.IRON_HELMET.getId());
		archersCantPickup.add(Material.IRON_CHESTPLATE.getId());
		archersCantPickup.add(Material.IRON_LEGGINGS.getId());
		archersCantPickup.add(Material.IRON_BOOTS.getId());
		archersCantPickup.add(Material.GOLD_HELMET.getId());
		archersCantPickup.add(Material.GOLD_CHESTPLATE.getId());
		archersCantPickup.add(Material.GOLD_LEGGINGS.getId());
		archersCantPickup.add(Material.GOLD_BOOTS.getId());
		archersCantPickup.add(Material.DIAMOND_HELMET.getId());
		archersCantPickup.add(Material.DIAMOND_CHESTPLATE.getId());
		archersCantPickup.add(Material.DIAMOND_LEGGINGS.getId());
		archersCantPickup.add(Material.DIAMOND_BOOTS.getId());
		archersCantPickup.add(Material.PUMPKIN_PIE.getId());
		archersCantPickup.add(Material.BREAD.getId());
		archersCantPickup.add(Material.CAKE.getId());
		archersCantPickup.add(Material.POTION.getId());
		archersCantPickup.add(Material.PUMPKIN_SEEDS.getId());
		archersCantPickup.add(Material.SEEDS.getId());
		archersCantPickup.add(Material.POTION.getId());
		archersCantPickup.add(Material.WOOD_HOE.getId());
		archersCantPickup.add(Material.STONE_HOE.getId());
		archersCantPickup.add(Material.IRON_HOE.getId()); 
		archersCantPickup.add(Material.GOLD_HOE.getId());
		archersCantPickup.add(Material.DIAMOND_HOE.getId());
		archersCantPickup.add(Material.POTION.getId());
		archersCantPickup.add(Material.SEEDS.getId());
		archersCantPickup.add(Material.PUMPKIN_SEEDS.getId());
		archersCantPickup.add(Material.SUGAR_CANE.getId());
	}
	
	public static void cantBreak(){
		archersCantBreak.add(Material.SUGAR_CANE_BLOCK.getId());
		archersCantBreak.add(Material.CARROT.getId());
		archersCantBreak.add(Material.POTATO.getId());
		archersCantBreak.add(Material.CROPS.getId());
		archersCantBreak.add(Material.RED_MUSHROOM.getId());
		archersCantBreak.add(Material.BROWN_MUSHROOM.getId());
		archersCantBreak.add(Material.PUMPKIN.getId());
	}
	
	public static void cantSmelt(){
		
	}
}
