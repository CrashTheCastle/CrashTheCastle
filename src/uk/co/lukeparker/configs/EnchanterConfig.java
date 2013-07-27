package uk.co.lukeparker.configs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class EnchanterConfig {
	
	public static List<Integer> cantCraft = new ArrayList<Integer>();
	public static List<Integer> cantHold = new ArrayList<Integer>();
	public static List<Integer> cantPickup = new ArrayList<Integer>();
	public static List<Integer> cantBreak = new ArrayList<Integer>();
	public static List<Integer> cantSmelt = new ArrayList<Integer>();
	
	public EnchanterConfig(){
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
	}
	
	public static void cantPickup(){
		
	}
	
	public static void cantBreak(){
		cantBreak.add(Material.SUGAR_CANE_BLOCK.getId());
		cantBreak.add(Material.CARROT.getId());
		cantBreak.add(Material.POTATO.getId());
		cantBreak.add(Material.CROPS.getId());
		cantBreak.add(Material.RED_MUSHROOM.getId());
		cantBreak.add(Material.BROWN_MUSHROOM.getId());
		cantBreak.add(Material.PUMPKIN.getId());
	}
	
	public static void cantSmelt(){
		
	}
	
}
