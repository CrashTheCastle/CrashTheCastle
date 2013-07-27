package uk.co.lukeparker.configs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class FarmerConfig {
	public static List<Integer> cantCraft = new ArrayList<Integer>();
	public static List<Integer> cantHold = new ArrayList<Integer>();
	public static List<Integer> cantPickup = new ArrayList<Integer>();
	public static List<Integer> cantBreak = new ArrayList<Integer>();
	public static List<Integer> cantSmelt = new ArrayList<Integer>();
	
	public FarmerConfig(){
		cantCraft();
		cantHold();
		cantPickup();
		cantBreak();
		cantSmelt();
	}
	
	public static void cantCraft(){
		cantCraft.add(Material.STONE_SWORD.getId());
		cantCraft.add(Material.IRON_SWORD.getId());
		cantCraft.add(Material.GOLD_SWORD.getId());
		cantCraft.add(Material.DIAMOND_SWORD.getId());
		cantCraft.add(Material.IRON_HELMET.getId());
		cantCraft.add(Material.IRON_CHESTPLATE.getId());
		cantCraft.add(Material.IRON_LEGGINGS.getId());
		cantCraft.add(Material.IRON_BOOTS.getId());
		cantCraft.add(Material.GOLD_HELMET.getId());
		cantCraft.add(Material.GOLD_CHESTPLATE.getId());
		cantCraft.add(Material.GOLD_LEGGINGS.getId());
		cantCraft.add(Material.GOLD_BOOTS.getId());
		cantCraft.add(Material.CHAINMAIL_HELMET.getId());
		cantCraft.add(Material.CHAINMAIL_CHESTPLATE.getId());
		cantCraft.add(Material.CHAINMAIL_LEGGINGS.getId());
		cantCraft.add(Material.CHAINMAIL_BOOTS.getId());
		cantCraft.add(Material.DIAMOND_HELMET.getId());
		cantCraft.add(Material.DIAMOND_CHESTPLATE.getId());
		cantCraft.add(Material.DIAMOND_LEGGINGS.getId());
		cantCraft.add(Material.DIAMOND_BOOTS.getId());
		cantCraft.add(Material.BOW.getId());
		cantCraft.add(Material.ARROW.getId());
		cantCraft.add(Material.POTION.getId());
	}
	
	public static void cantHold(){
		cantHold.add(Material.POTION.getId());
		cantHold.add(Material.STONE_SWORD.getId());
		cantHold.add(Material.IRON_SWORD.getId());
		cantHold.add(Material.GOLD_SWORD.getId());
		cantHold.add(Material.DIAMOND_SWORD.getId());
		cantHold.add(Material.IRON_HELMET.getId());
		cantHold.add(Material.IRON_CHESTPLATE.getId());
		cantHold.add(Material.IRON_LEGGINGS.getId());
		cantHold.add(Material.IRON_BOOTS.getId());
		cantHold.add(Material.GOLD_HELMET.getId());
		cantHold.add(Material.GOLD_CHESTPLATE.getId());
		cantHold.add(Material.GOLD_LEGGINGS.getId());
		cantHold.add(Material.GOLD_BOOTS.getId());
		cantHold.add(Material.CHAINMAIL_HELMET.getId());
		cantHold.add(Material.CHAINMAIL_CHESTPLATE.getId());
		cantHold.add(Material.CHAINMAIL_LEGGINGS.getId());
		cantHold.add(Material.CHAINMAIL_BOOTS.getId());
		cantHold.add(Material.DIAMOND_HELMET.getId());
		cantHold.add(Material.DIAMOND_CHESTPLATE.getId());
		cantHold.add(Material.DIAMOND_LEGGINGS.getId());
		cantHold.add(Material.DIAMOND_BOOTS.getId());
		cantHold.add(Material.BOW.getId());
		cantHold.add(Material.ARROW.getId());
		cantHold.add(Material.POTION.getId());
	}
	
	public static void cantPickup(){
		cantPickup.add(Material.STONE_SWORD.getId());
		cantPickup.add(Material.IRON_SWORD.getId());
		cantPickup.add(Material.GOLD_SWORD.getId());
		cantPickup.add(Material.DIAMOND_SWORD.getId());
		cantPickup.add(Material.IRON_HELMET.getId());
		cantPickup.add(Material.IRON_CHESTPLATE.getId());
		cantPickup.add(Material.IRON_LEGGINGS.getId());
		cantPickup.add(Material.IRON_BOOTS.getId());
		cantPickup.add(Material.GOLD_HELMET.getId());
		cantPickup.add(Material.GOLD_CHESTPLATE.getId());
		cantPickup.add(Material.GOLD_LEGGINGS.getId());
		cantPickup.add(Material.GOLD_BOOTS.getId());
		cantPickup.add(Material.CHAINMAIL_HELMET.getId());
		cantPickup.add(Material.CHAINMAIL_CHESTPLATE.getId());
		cantPickup.add(Material.CHAINMAIL_LEGGINGS.getId());
		cantPickup.add(Material.CHAINMAIL_BOOTS.getId());
		cantPickup.add(Material.DIAMOND_HELMET.getId());
		cantPickup.add(Material.DIAMOND_CHESTPLATE.getId());
		cantPickup.add(Material.DIAMOND_LEGGINGS.getId());
		cantPickup.add(Material.DIAMOND_BOOTS.getId());
		cantPickup.add(Material.BOW.getId());
		cantPickup.add(Material.ARROW.getId());
		cantPickup.add(Material.POTION.getId());
	}
	
	public static void cantBreak(){
		
	}
	
	public static void cantSmelt(){
		cantSmelt.add(Material.STONE_SWORD.getId());
		cantSmelt.add(Material.IRON_SWORD.getId());
		cantSmelt.add(Material.GOLD_SWORD.getId());
		cantSmelt.add(Material.DIAMOND_SWORD.getId());
		cantSmelt.add(Material.IRON_HELMET.getId());
		cantSmelt.add(Material.IRON_CHESTPLATE.getId());
		cantSmelt.add(Material.IRON_LEGGINGS.getId());
		cantSmelt.add(Material.IRON_BOOTS.getId());
		cantSmelt.add(Material.GOLD_HELMET.getId());
		cantSmelt.add(Material.GOLD_CHESTPLATE.getId());
		cantSmelt.add(Material.GOLD_LEGGINGS.getId());
		cantSmelt.add(Material.GOLD_BOOTS.getId());
		cantSmelt.add(Material.CHAINMAIL_HELMET.getId());
		cantSmelt.add(Material.CHAINMAIL_CHESTPLATE.getId());
		cantSmelt.add(Material.CHAINMAIL_LEGGINGS.getId());
		cantSmelt.add(Material.CHAINMAIL_BOOTS.getId());
		cantSmelt.add(Material.DIAMOND_HELMET.getId());
		cantSmelt.add(Material.DIAMOND_CHESTPLATE.getId());
		cantSmelt.add(Material.DIAMOND_LEGGINGS.getId());
		cantSmelt.add(Material.DIAMOND_BOOTS.getId());
		cantSmelt.add(Material.BOW.getId());
		cantSmelt.add(Material.ARROW.getId());
		cantSmelt.add(Material.POTION.getId());
	}
}
