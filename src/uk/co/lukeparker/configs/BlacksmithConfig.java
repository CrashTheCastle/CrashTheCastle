package uk.co.lukeparker.configs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class BlacksmithConfig {
	public static List<Integer> blacksmithsCantCraft = new ArrayList<Integer>();
	public static List<Integer> blacksmithsCantHold = new ArrayList<Integer>();
	public static List<Integer> blacksmithsCantPickup = new ArrayList<Integer>();
	public static List<Integer> blacksmithsCantBreak = new ArrayList<Integer>();
	public static List<Integer> blacksmithsCantSmelt = new ArrayList<Integer>();
	
	public BlacksmithConfig(){
		cantCraft();
		cantHold();
		cantPickup();
		cantBreak();
		cantSmelt();
	}
	
	public static void cantCraft(){
		blacksmithsCantCraft.add(Material.BOW.getId());
		blacksmithsCantCraft.add(Material.ARROW.getId());
		blacksmithsCantCraft.add(Material.PUMPKIN_PIE.getId());
		blacksmithsCantCraft.add(Material.BREAD.getId());
		blacksmithsCantCraft.add(Material.CAKE.getId());
	}
	
	public static void cantHold(){
		blacksmithsCantHold.add(Material.DIAMOND_SWORD.getId());
		blacksmithsCantHold.add(Material.DIAMOND_HELMET.getId());
		blacksmithsCantHold.add(Material.DIAMOND_CHESTPLATE.getId());
		blacksmithsCantHold.add(Material.DIAMOND_LEGGINGS.getId());
		blacksmithsCantHold.add(Material.DIAMOND_BOOTS.getId());
		
		// Hoes
		blacksmithsCantHold.add(Material.WOOD_HOE.getId());
		blacksmithsCantHold.add(Material.STONE_HOE.getId());
		blacksmithsCantHold.add(Material.IRON_HOE.getId());
		blacksmithsCantHold.add(Material.GOLD_HOE.getId());
		blacksmithsCantHold.add(Material.DIAMOND_HOE.getId());
		
		blacksmithsCantHold.add(Material.BOW.getId());
		blacksmithsCantHold.add(Material.ARROW.getId());
		
		blacksmithsCantHold.add(Material.POTION.getId());
	}
	
	public static void cantPickup(){
		blacksmithsCantPickup.add(Material.DIAMOND_HELMET.getId());
		blacksmithsCantPickup.add(Material.DIAMOND_CHESTPLATE.getId());
		blacksmithsCantPickup.add(Material.DIAMOND_LEGGINGS.getId());
		blacksmithsCantPickup.add(Material.DIAMOND_BOOTS.getId());
	}
	
	public static void cantBreak(){
		blacksmithsCantBreak.add(Material.SUGAR_CANE_BLOCK.getId());
		blacksmithsCantBreak.add(Material.CARROT.getId());
		blacksmithsCantBreak.add(Material.POTATO.getId());
		blacksmithsCantBreak.add(Material.CROPS.getId());
		blacksmithsCantBreak.add(Material.RED_MUSHROOM.getId());
		blacksmithsCantBreak.add(Material.BROWN_MUSHROOM.getId());
		blacksmithsCantBreak.add(Material.PUMPKIN.getId());
	}
	
	public static void cantSmelt(){
		blacksmithsCantSmelt.add(Material.PUMPKIN_PIE.getId());
		blacksmithsCantSmelt.add(Material.BREAD.getId());
		blacksmithsCantSmelt.add(Material.CAKE.getId());
		blacksmithsCantSmelt.add(Material.COOKED_BEEF.getId());
		blacksmithsCantSmelt.add(Material.COOKED_CHICKEN.getId());
		blacksmithsCantSmelt.add(Material.COOKED_FISH.getId());
	}
}
