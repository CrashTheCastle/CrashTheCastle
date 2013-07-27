package uk.co.lukeparker.configs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class AlchemistConfig {
	
	public static List<Integer> alchemistsCantCraft = new ArrayList<Integer>();
	public static List<Integer> alchemistsCantHold = new ArrayList<Integer>();
	public static List<Integer> alchemistsCantPickup = new ArrayList<Integer>();
	public static List<Integer> alchemistsCantBreak = new ArrayList<Integer>();
	public static List<Integer> alchemistsCantSmelt = new ArrayList<Integer>();
	
	public AlchemistConfig(){
		cantCraft();
		cantHold();
		cantPickup();
		cantBreak();
	}
	
	public static void cantCraft(){
		alchemistsCantCraft.add(Material.STONE_SWORD.getId());
		alchemistsCantCraft.add(Material.IRON_SWORD.getId());
		alchemistsCantCraft.add(Material.GOLD_SWORD.getId());
		alchemistsCantCraft.add(Material.DIAMOND_SWORD.getId());
		alchemistsCantCraft.add(Material.CHAINMAIL_HELMET.getId());
		alchemistsCantCraft.add(Material.CHAINMAIL_CHESTPLATE.getId());
		alchemistsCantCraft.add(Material.CHAINMAIL_LEGGINGS.getId());
		alchemistsCantCraft.add(Material.CHAINMAIL_BOOTS.getId());
		alchemistsCantCraft.add(Material.DIAMOND_HELMET.getId());
		alchemistsCantCraft.add(Material.DIAMOND_CHESTPLATE.getId());
		alchemistsCantCraft.add(Material.DIAMOND_LEGGINGS.getId());
		alchemistsCantCraft.add(Material.DIAMOND_BOOTS.getId());
		alchemistsCantCraft.add(Material.BOW.getId());
		alchemistsCantCraft.add(Material.ARROW.getId());
		alchemistsCantCraft.add(Material.PUMPKIN_PIE.getId());
		alchemistsCantCraft.add(Material.BREAD.getId());
		alchemistsCantCraft.add(Material.CAKE.getId());
	}
	
	public static void cantHold(){
		alchemistsCantHold.add(Material.STONE_SWORD.getId());
		alchemistsCantHold.add(Material.IRON_SWORD.getId());
		alchemistsCantHold.add(Material.GOLD_SWORD.getId());
		alchemistsCantHold.add(Material.DIAMOND_SWORD.getId());
		alchemistsCantHold.add(Material.CHAINMAIL_HELMET.getId());
		alchemistsCantHold.add(Material.CHAINMAIL_CHESTPLATE.getId());
		alchemistsCantHold.add(Material.CHAINMAIL_LEGGINGS.getId());
		alchemistsCantHold.add(Material.CHAINMAIL_BOOTS.getId());
		alchemistsCantHold.add(Material.DIAMOND_HELMET.getId());
		alchemistsCantHold.add(Material.DIAMOND_CHESTPLATE.getId());
		alchemistsCantHold.add(Material.DIAMOND_LEGGINGS.getId());
		alchemistsCantHold.add(Material.DIAMOND_BOOTS.getId());
		alchemistsCantHold.add(Material.BOW.getId());
		alchemistsCantHold.add(Material.ARROW.getId());
		alchemistsCantHold.add(Material.BOW.getId());
		alchemistsCantHold.add(Material.ARROW.getId());
		alchemistsCantHold.add(Material.WOOD_HOE.getId());
		alchemistsCantHold.add(Material.STONE_HOE.getId());
		alchemistsCantHold.add(Material.IRON_HOE.getId());
		alchemistsCantHold.add(Material.GOLD_HOE.getId());
		alchemistsCantHold.add(Material.DIAMOND_HOE.getId());
	}
	
	public static void cantPickup(){
		alchemistsCantPickup.add(Material.STONE_SWORD.getId());
		alchemistsCantPickup.add(Material.IRON_SWORD.getId());
		alchemistsCantPickup.add(Material.GOLD_SWORD.getId());
		alchemistsCantPickup.add(Material.DIAMOND_SWORD.getId());
		alchemistsCantPickup.add(Material.CHAINMAIL_HELMET.getId());
		alchemistsCantPickup.add(Material.CHAINMAIL_CHESTPLATE.getId());
		alchemistsCantPickup.add(Material.CHAINMAIL_LEGGINGS.getId());
		alchemistsCantPickup.add(Material.CHAINMAIL_BOOTS.getId());
		alchemistsCantPickup.add(Material.DIAMOND_HELMET.getId());
		alchemistsCantPickup.add(Material.DIAMOND_CHESTPLATE.getId());
		alchemistsCantPickup.add(Material.DIAMOND_LEGGINGS.getId());
		alchemistsCantPickup.add(Material.DIAMOND_BOOTS.getId());
		alchemistsCantPickup.add(Material.BOW.getId());
		alchemistsCantPickup.add(Material.ARROW.getId());
	}
	
	public static void cantBreak(){
		alchemistsCantBreak.add(Material.SUGAR_CANE_BLOCK.getId());
		alchemistsCantBreak.add(Material.CARROT.getId());
		alchemistsCantBreak.add(Material.POTATO.getId());
		alchemistsCantBreak.add(Material.CROPS.getId());
		alchemistsCantBreak.add(Material.RED_MUSHROOM.getId());
		alchemistsCantBreak.add(Material.BROWN_MUSHROOM.getId());
		alchemistsCantBreak.add(Material.PUMPKIN.getId());
	}
}
