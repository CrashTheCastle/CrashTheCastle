package uk.co.lukeparker;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import uk.co.lukeparker.classes.AlchemistClass;
import uk.co.lukeparker.classes.ArcherClass;
import uk.co.lukeparker.classes.BlacksmithClass;
import uk.co.lukeparker.classes.CrusaderClass;
import uk.co.lukeparker.classes.EnchanterClass;
import uk.co.lukeparker.classes.FarmerClass;
import uk.co.lukeparker.configs.*;
import uk.co.lukeparker.listeners.PlayerListener;

public class PlayerClasses extends JavaPlugin{
	
	public PlayerListener playerListener = new PlayerListener(this);
	
	public ArcherClass archerClass = new ArcherClass(this);
	public AlchemistClass alchemistClass = new AlchemistClass(this);
	public BlacksmithClass blacksmithClass = new BlacksmithClass(this);
	public CrusaderClass crusaderClass = new CrusaderClass(this);
	public EnchanterClass enchanterClass = new EnchanterClass(this);
	public FarmerClass farmerClass = new FarmerClass(this);
	
	public ArcherConfig archerConfig = new ArcherConfig();
	public AlchemistConfig alchemistConfig = new AlchemistConfig();
	public BlacksmithConfig blacksmithConfig = new BlacksmithConfig();
	public CrusaderConfig crusaderConfig = new CrusaderConfig();
	public EnchanterConfig enchanterConfig = new EnchanterConfig();
	public FarmerConfig farmerConfig = new FarmerConfig();
	
	public List<String> bypassers = new ArrayList<String>();
	
	public List<String> archers = new ArrayList<String>();
	public List<String> alchemists = new ArrayList<String>();
	public List<String> blacksmiths = new ArrayList<String>();
	public List<String> crusaders = new ArrayList<String>();
	public List<String> enchanters = new ArrayList<String>();
	public List<String> farmers = new ArrayList<String>();

	public Location firstSpawn;
	
	@SuppressWarnings("unchecked")
	@Override
	public void onEnable(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(playerListener, this);
		pm.registerEvents(archerClass, this);
		pm.registerEvents(alchemistClass, this);
		pm.registerEvents(blacksmithClass, this);
		pm.registerEvents(crusaderClass, this);
		pm.registerEvents(enchanterClass, this);
		pm.registerEvents(farmerClass, this);
		
		FileConfiguration config = getConfig();
		
		config.addDefault("Class Names.Archer", "Archer");
		config.addDefault("Class Names.Alchemist", "Alchemist");
		config.addDefault("Class Names.Blacksmith", "Blacksmith");
		config.addDefault("Class Names.Crusader", "Crusader");
		config.addDefault("Class Names.Enchanter", "Enchanter");
		config.addDefault("Class Names.Farmer", "Farmer");
		
		config.addDefault("Archers", archers);
		config.addDefault("Alchemists", alchemists);
		config.addDefault("Blacksmiths", blacksmiths);
		config.addDefault("Crusaders", crusaders);
		config.addDefault("Enchanters", enchanters);
		config.addDefault("Farmers", farmers);
		
		config.addDefault("First Spawn.world", "world");
		config.addDefault("First Spawn.x", 0);
		config.addDefault("First Spawn.y", 0);
		config.addDefault("First Spawn.z", 0);
		
		// Archers Config
		config.addDefault("Cant Craft.Archers", ArcherConfig.archersCantCraft);
		config.addDefault("Cant Hold.Archers", ArcherConfig.archersCantHold);
		config.addDefault("Cant Pickup.Archers", ArcherConfig.archersCantPickup);
		config.addDefault("Cant Break.Archers", ArcherConfig.archersCantBreak);
		
		
		//Alchemist Config	
		config.addDefault("Cant Craft.Alchemists", AlchemistConfig.alchemistsCantCraft);
		config.addDefault("Cant Hold.Alchemists", AlchemistConfig.alchemistsCantHold);
		config.addDefault("Cant Pickup.Alchemists", AlchemistConfig.alchemistsCantPickup);
		config.addDefault("Cant Break.Alchemists", AlchemistConfig.alchemistsCantBreak);
		
		// Blacksmith Config
		
		config.addDefault("Cant Craft.Blacksmiths", BlacksmithConfig.blacksmithsCantCraft);
		config.addDefault("Cant Hold.Blacksmiths", BlacksmithConfig.blacksmithsCantHold);
		config.addDefault("Cant Pickup.Blacksmiths", BlacksmithConfig.blacksmithsCantPickup);
		config.addDefault("Cant Break.Blacksmiths", BlacksmithConfig.blacksmithsCantBreak);
		
		// Crusader Config
		config.addDefault("Cant Craft.Crusaders", CrusaderConfig.crusadersCantCraft);
		config.addDefault("Cant Hold.Crusaders", CrusaderConfig.crusadersCantHold);
		config.addDefault("Cant Pickup.Crusaders", CrusaderConfig.crusadersCantPickup);
		config.addDefault("Cant Break.Crusaders", CrusaderConfig.crusadersCantBreak);
		
		// Enchanter Config
		config.addDefault("Cant Craft.Enchanters", EnchanterConfig.cantCraft);
		config.addDefault("Cant Hold.Enchanters", EnchanterConfig.cantHold);
		config.addDefault("Cant Pickup.Enchanters", EnchanterConfig.cantPickup);
		config.addDefault("Cant Break.Enchanters", EnchanterConfig.cantBreak);
		
		// Farmers Config
		config.addDefault("Cant Craft.Farmers", FarmerConfig.cantCraft);
		config.addDefault("Cant Hold.Farmers", FarmerConfig.cantHold);
		config.addDefault("Cant Pickup.Farmers", FarmerConfig.cantPickup);
		config.addDefault("Cant Break.Farmers", FarmerConfig.cantBreak);
		
		config.options().copyDefaults(true);
		saveConfig();
		
		archers = (List<String>) config.getList("Archers");
		alchemists = (List<String>) config.getList("Alchemists");
		blacksmiths = (List<String>) config.getList("Blacksmiths");
		crusaders = (List<String>) config.getList("Crusaders");
		farmers = (List<String>) config.getList("Farmers");
		
		getCommand("class").setExecutor(new CommandHandler(this));
		
		firstSpawn = new Location(getServer().getWorld(config.getString("First Spawn.world")), config.getInt("First Spawn.x"), config.getInt("First Spawn.y"), config.getInt("First Spawn.z"));
		
		getLogger().info("Classes is Enabled!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("Classes is Disabled!");
	}
	
	public String message(String message, ChatColor color){
		return ChatColor.YELLOW + "[Classes] " + color + message;
	}
}
