package uk.co.lukeparker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor{

	private PlayerClasses plugin;
	
	public String archerName;
	public String alchemistName;
	public String blacksmithName;
	public String crusaderName;
	public String enchanterName;
	public String farmerName;
	
	public CommandHandler(PlayerClasses plugin){
		this.plugin = plugin;
	}
	
	public boolean notChosenClass(Player player){
		if(!plugin.archers.contains(player.getName()) && !plugin.alchemists.contains(player.getName()) && !plugin.blacksmiths.contains(player.getName()) && !plugin.crusaders.contains(player.getName()) && !plugin.enchanters.contains(player.getName()) && !plugin.farmers.contains(player.getName())){
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		archerName = plugin.getConfig().getString("Class Names.Archer");
		alchemistName = plugin.getConfig().getString("Class Names.Alchemist");
		blacksmithName = plugin.getConfig().getString("Class Names.Blacksmith");
		crusaderName = plugin.getConfig().getString("Class Names.Crusader");
		enchanterName = plugin.getConfig().getString("Class Names.Enchanter");
		farmerName = plugin.getConfig().getString("Class Names.Farmer");
		
		if(cmd.getName().equalsIgnoreCase("class")){
			if(args.length < 1){
				sender.sendMessage(ChatColor.GREEN + "Player Classes Commands: ");
				sender.sendMessage("- /class pick <class name> - Allows you to pick the class you wish to play on spawn");
				if(player.hasPermission("classes.online")){
					sender.sendMessage("- /class online <class name> - List all online players in this class");
				}
				if(player.hasPermission("classes.setspawn")){
					sender.sendMessage("- /class setfirstspawn - Sets the location that players first spawn to your location!");
				}
				if(player.hasPermission("classes.leave")){
					sender.sendMessage("- /class leave - Lets you leave the class you are currently in!");
				}
				if(player.hasPermission("classes.bypass")){
					sender.sendMessage("- /class bypass - Lets you bypass all class restrictions");
				}
				return true;
			}
			if(args[0].equalsIgnoreCase("pick")){
					if(args.length < 2){
						player.sendMessage(plugin.message("You must choose a class!", ChatColor.RED));
						return true;
					}
					if(args[1].equalsIgnoreCase(archerName) || args[1].equalsIgnoreCase(archerName + "s")){
						if(player.hasPermission("classes.pick.archer")){
							if(notChosenClass(player)){
								plugin.archers.add(player.getName());
								player.sendMessage(plugin.message("You have chosen " + archerName + "!", ChatColor.GREEN));
								player.setDisplayName(archerName + " - " + player.getName());
								player.teleport(player.getWorld().getSpawnLocation());
								plugin.getConfig().set("Archers", plugin.archers);
								plugin.saveConfig();
								return true;
							}
						}else{
							sender.sendMessage(ChatColor.RED + "You dont have Permission to choose Archer!");
						}
					}
					if(args[1].equalsIgnoreCase(alchemistName) || args[1].equalsIgnoreCase(alchemistName + "s")){
						if(player.hasPermission("classes.pick.alchemist")){
							if(notChosenClass(player)){
								plugin.alchemists.add(player.getName());
								player.sendMessage(plugin.message("You have chosen " + alchemistName + "!", ChatColor.GREEN));
								player.setDisplayName(alchemistName + " - " + player.getName());
								player.teleport(player.getWorld().getSpawnLocation());
								plugin.getConfig().set("Alchemists", plugin.alchemists);
								plugin.saveConfig();
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(blacksmithName) || args[1].equalsIgnoreCase(blacksmithName + "s")){
						if(player.hasPermission("classes.pick.blacksmith")){
							if(notChosenClass(player)){
								plugin.blacksmiths.add(player.getName());
								player.sendMessage(plugin.message("You have chosen " + blacksmithName + "!", ChatColor.GREEN));
								player.setDisplayName(blacksmithName + " - " + player.getName());
								player.teleport(player.getWorld().getSpawnLocation());
								plugin.getConfig().set("Blacksmiths", plugin.blacksmiths);
								plugin.saveConfig();
								return true;
							}
						}
						
						// Andy Goswell was here 13:11 02/04/2013
					}
					if(args[1].equalsIgnoreCase(crusaderName) || args[1].equalsIgnoreCase(crusaderName + "s")){
						if(player.hasPermission("classes.pick.crusader")){
							if(notChosenClass(player)){
								plugin.crusaders.add(player.getName());
								player.sendMessage(plugin.message("You have chosen " + crusaderName + "!", ChatColor.GREEN));
								player.setDisplayName(crusaderName + " - " + player.getName());
								player.teleport(player.getWorld().getSpawnLocation());
								plugin.getConfig().set("Crusaders", plugin.crusaders);
								plugin.saveConfig();
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(enchanterName) || args[1].equalsIgnoreCase(enchanterName + "s")){
						if(player.hasPermission("classes.pick.enchanter")){
							if(notChosenClass(player)){
								plugin.enchanters.add(player.getName());
								player.sendMessage(plugin.message("You have chosen " + enchanterName + "!", ChatColor.GREEN));
								player.setDisplayName(enchanterName + " - " + player.getName());
								player.teleport(player.getWorld().getSpawnLocation());
								plugin.getConfig().set("Enchanters", plugin.enchanters);
								plugin.saveConfig();
								return true;
							}
						}
					}
					
					if(args[1].equalsIgnoreCase(farmerName) || args[1].equalsIgnoreCase(farmerName + "s")){
						if(player.hasPermission("classes.pick.farmer")){
							if(notChosenClass(player)){
								plugin.farmers.add(player.getName());
								player.sendMessage(plugin.message("You have chosen Farmer!", ChatColor.GREEN));
								player.setDisplayName(farmerName + " - " + player.getName());
								player.teleport(player.getWorld().getSpawnLocation());
								plugin.getConfig().set("Farmers", plugin.farmers);
								plugin.saveConfig();
								return true;
							}
						}
					}
					return true;
			}
			if(args[0].equalsIgnoreCase("setfirstspawn")){
				if(player.hasPermission("classes.setspawn")){
					plugin.getConfig().set("First Spawn.world", player.getLocation().getWorld().getName());
					plugin.getConfig().set("First Spawn.x", player.getLocation().getX());
					plugin.getConfig().set("First Spawn.y", player.getLocation().getY());
					plugin.getConfig().set("First Spawn.z", player.getLocation().getZ());
					plugin.saveConfig();
					plugin.firstSpawn = new Location(plugin.getServer().getWorld(plugin.getConfig().getString("First Spawn.world")), plugin.getConfig().getInt("First Spawn.x"), plugin.getConfig().getInt("First Spawn.y"), plugin.getConfig().getInt("First Spawn.z"));
					player.sendMessage(plugin.message("First spawn set to your location!", ChatColor.GREEN));
					return true;
				}else{
					player.sendMessage(plugin.message("You do not have permission to do this!", ChatColor.RED));
				}
			}
			if(args[0].equalsIgnoreCase("leave")){
				if(player.hasPermission("classes.leave")){
					if(plugin.getConfig().getList("Archers").contains(player.getName())){
						plugin.getConfig().getList("Archers").remove(player.getName());
						player.sendMessage(plugin.message("You have left " + archerName + "!", ChatColor.GREEN));
						return true;
					}
					if(plugin.getConfig().getList("Alchemists").contains(player.getName())){
						plugin.getConfig().getList("Alchemists").remove(player.getName());
						player.sendMessage(plugin.message("You have left " + alchemistName + "!", ChatColor.GREEN));
						return true;
					}
					if(plugin.getConfig().getList("Blacksmiths").contains(player.getName())){
						plugin.getConfig().getList("Blacksmiths").remove(player.getName());
						player.sendMessage(plugin.message("You have left " + blacksmithName + "!", ChatColor.GREEN));
						return true;
					}
					if(plugin.getConfig().getList("Crusaders").contains(player.getName())){
						plugin.getConfig().getList("Crusaders").remove(player.getName());
						player.sendMessage(plugin.message("You have left " + crusaderName + "!", ChatColor.GREEN));
						return true;
					}
					if(plugin.getConfig().getList("Enchanters").contains(player.getName())){
						plugin.getConfig().getList("Enchanters").remove(player.getName());
						player.sendMessage(plugin.message("You have left " + enchanterName + "!", ChatColor.GREEN));
					}
					if(plugin.getConfig().getList("Farmers").contains(player.getName())){
						plugin.getConfig().getList("Farmers").remove(player.getName());
						player.sendMessage(plugin.message("You have left " + farmerName + "!", ChatColor.GREEN));
					}
					if(!plugin.getConfig().getList("Archers").contains(player.getName()) && !plugin.getConfig().getList("Alchemists").contains(player.getName()) && !plugin.getConfig().getList("Blacksmiths").contains(player.getName()) && !plugin.getConfig().getList("Crusaders").contains(player.getName()) && !plugin.getConfig().getList("Enchanters").contains(player.getName()) && !plugin.getConfig().getList("Farmers").contains(player.getName())){
						player.sendMessage(plugin.message("You are not in a class!", ChatColor.RED));
						return true;
					}
				}else{
					player.sendMessage(plugin.message("You don't have permission to do this!", ChatColor.RED));
					return true;
				}
				return true;
			}
			if(args[0].equalsIgnoreCase("list")){
				sender.sendMessage(ChatColor.GREEN + "Avalible Classes:");
				sender.sendMessage(ChatColor.WHITE + "- " + archerName);
				sender.sendMessage(ChatColor.WHITE + "- " + alchemistName);
				sender.sendMessage(ChatColor.WHITE + "- " + blacksmithName);
				sender.sendMessage(ChatColor.WHITE + "- " + crusaderName);
				sender.sendMessage(ChatColor.WHITE + "- " + enchanterName);
				sender.sendMessage(ChatColor.WHITE + "- " + farmerName);
				return true;
			}
			
			// LOL
			
			if(args[0].equalsIgnoreCase("online")){
				if(player.hasPermission("online")){
					String message = ChatColor.GREEN + "List ";
					if(args[1].equalsIgnoreCase(archerName)){
						for(Player p: Bukkit.getOnlinePlayers()){
							message += "archers";
							sender.sendMessage(message);
							String archers = ChatColor.GREEN + "Online: ";
							if(plugin.getConfig().getList("Archers").contains(p.getName())){
								archers += ChatColor.YELLOW + p.getName() + ", ";
								sender.sendMessage(archers);
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(alchemistName)){
						for(Player p: Bukkit.getOnlinePlayers()){
							message += "alchemists";
							sender.sendMessage(message);
							String alchemists = ChatColor.GREEN + "Online: ";
							if(plugin.getConfig().getList("Alchemists").contains(p.getName())){
								alchemists += ChatColor.YELLOW + p.getName() + ", ";
								sender.sendMessage(alchemists);
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(blacksmithName)){
						for(Player p: Bukkit.getOnlinePlayers()){
							message += "blacksmiths";
							sender.sendMessage(message);
							String blacksmiths = ChatColor.GREEN + "Online: ";
							if(plugin.getConfig().getList("Blacksmiths").contains(p.getName())){
								blacksmiths += ChatColor.YELLOW + p.getName() + ", ";
								sender.sendMessage(blacksmiths);
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(crusaderName)){
						for(Player p: Bukkit.getOnlinePlayers()){
							message += "crusaders";
							sender.sendMessage(message);
							String crusaders = ChatColor.GREEN + "Online: ";
							if(plugin.getConfig().getList("Crusaders").contains(p.getName())){
								crusaders += ChatColor.YELLOW + p.getName() + ", ";
								sender.sendMessage(crusaders);
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(enchanterName)){
						for(Player p: Bukkit.getOnlinePlayers()){
							message += "enchanters";
							sender.sendMessage(message);
							String enchanters = ChatColor.GREEN + "Online: ";
							if(plugin.getConfig().getList("Enchanters").contains(p.getName())){
								enchanters += ChatColor.YELLOW + p.getName() + ", ";
								sender.sendMessage(enchanters);
								return true;
							}
						}
					}
					if(args[1].equalsIgnoreCase(farmerName)){
						for(Player p: Bukkit.getOnlinePlayers()){
							message += "farmers";
							sender.sendMessage(message);
							String farmers = ChatColor.GREEN + "Online: ";
							if(plugin.getConfig().getList("Farmers").contains(p.getName())){
								farmers += ChatColor.YELLOW + p.getName() + ", ";
								sender.sendMessage(farmers);
								return true;
							}
						}
					}
				}else{
					player.sendMessage("You don't have permission to do this!");
					return true;
				}
			}
			
			if(args[0].equalsIgnoreCase("bypass")){
				if(player.hasPermission("classes.bypass")){
					if(plugin.bypassers.contains(player.getName())){
						plugin.bypassers.remove(player.getName());
						sender.sendMessage(plugin.message("You are no longer in bypass mode!", ChatColor.GREEN));
						return true;
					}else{
						plugin.bypassers.add(player.getName());
						sender.sendMessage(plugin.message("You are now in bypass mode!", ChatColor.GREEN));
						return true;
					}
				}else{
					sender.sendMessage(plugin.message("You don't have permission to do this!", ChatColor.RED));
					return true;
				}
			}
		}
		return false;
	}
}
