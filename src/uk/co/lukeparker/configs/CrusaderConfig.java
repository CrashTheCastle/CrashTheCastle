package uk.co.lukeparker.configs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class CrusaderConfig {
	
	public static List<Integer> crusadersCantCraft = new ArrayList<Integer>();
	public static List<Integer> crusadersCantHold = new ArrayList<Integer>();
	public static List<Integer> crusadersCantPickup = new ArrayList<Integer>();
	public static List<Integer> crusadersCantBreak = new ArrayList<Integer>();
	public static List<Integer> crusadersCantSmelt = new ArrayList<Integer>();
	
	public CrusaderConfig(){
		cantCraft();
		cantHold();
		cantPickup();
		cantBreak();
	}
	
	public static void cantCraft(){
		crusadersCantCraft.add(Material.WOOD_SWORD.getId());
		crusadersCantCraft.add(Material.STONE_SWORD.getId());
		crusadersCantCraft.add(Material.IRON_SWORD.getId());
		crusadersCantCraft.add(Material.GOLD_SWORD.getId());
		crusadersCantCraft.add(Material.DIAMOND_SWORD.getId());
		crusadersCantCraft.add(Material.LEATHER_HELMET.getId());
		crusadersCantCraft.add(Material.LEATHER_CHESTPLATE.getId());
		crusadersCantCraft.add(Material.LEATHER_LEGGINGS.getId());
		crusadersCantCraft.add(Material.LEATHER_BOOTS.getId());
		crusadersCantCraft.add(Material.IRON_HELMET.getId());
		crusadersCantCraft.add(Material.IRON_CHESTPLATE.getId());
		crusadersCantCraft.add(Material.IRON_LEGGINGS.getId());
		crusadersCantCraft.add(Material.IRON_BOOTS.getId());
		crusadersCantCraft.add(Material.GOLD_HELMET.getId());
		crusadersCantCraft.add(Material.GOLD_CHESTPLATE.getId());
		crusadersCantCraft.add(Material.GOLD_LEGGINGS.getId());
		crusadersCantCraft.add(Material.GOLD_BOOTS.getId());
		crusadersCantCraft.add(Material.CHAINMAIL_HELMET.getId());
		crusadersCantCraft.add(Material.CHAINMAIL_CHESTPLATE.getId());
		crusadersCantCraft.add(Material.CHAINMAIL_LEGGINGS.getId());
		crusadersCantCraft.add(Material.CHAINMAIL_BOOTS.getId());
		crusadersCantCraft.add(Material.DIAMOND_HELMET.getId());
		crusadersCantCraft.add(Material.DIAMOND_CHESTPLATE.getId());
		crusadersCantCraft.add(Material.DIAMOND_LEGGINGS.getId());
		crusadersCantCraft.add(Material.DIAMOND_BOOTS.getId());
		crusadersCantCraft.add(Material.BOW.getId());
		crusadersCantCraft.add(Material.ARROW.getId());
	}
	
	public static void cantHold(){
		crusadersCantHold.add(Material.WOOD_HOE.getId());
		crusadersCantHold.add(Material.STONE_HOE.getId());
		crusadersCantHold.add(Material.IRON_HOE.getId());
		crusadersCantHold.add(Material.GOLD_HOE.getId());
		crusadersCantHold.add(Material.DIAMOND_HOE.getId());
		crusadersCantHold.add(Material.BOW.getId());
		crusadersCantHold.add(Material.ARROW.getId());
		crusadersCantHold.add(Material.POTION.getId());
	}
	
	public static void cantPickup(){
		crusadersCantPickup.add(Material.WOOD_HOE.getId());
		crusadersCantPickup.add(Material.STONE_HOE.getId());
		crusadersCantPickup.add(Material.IRON_HOE.getId());
		crusadersCantPickup.add(Material.GOLD_HOE.getId());
		crusadersCantPickup.add(Material.DIAMOND_HOE.getId());
		crusadersCantPickup.add(Material.BOW.getId());
		crusadersCantPickup.add(Material.ARROW.getId());
		crusadersCantPickup.add(Material.POTION.getId());
	}
	
	public static void cantBreak(){
		crusadersCantBreak.add(Material.SUGAR_CANE_BLOCK.getId());
		crusadersCantBreak.add(Material.CARROT.getId());
		crusadersCantBreak.add(Material.POTATO.getId());
		crusadersCantBreak.add(Material.CROPS.getId());
		crusadersCantBreak.add(Material.RED_MUSHROOM.getId());
		crusadersCantBreak.add(Material.BROWN_MUSHROOM.getId());
		crusadersCantBreak.add(Material.PUMPKIN.getId());
	}
	
	public static void cantSmelt(){
		crusadersCantSmelt.add(Material.BREAD.getId());
		crusadersCantSmelt.add(Material.CAKE.getId());
		crusadersCantSmelt.add(Material.COOKED_BEEF.getId());
		crusadersCantSmelt.add(Material.COOKED_CHICKEN.getId());
		crusadersCantSmelt.add(Material.COOKED_FISH.getId());
	}
}
