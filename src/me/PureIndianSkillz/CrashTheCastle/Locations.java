package me.PureIndianSkillz.CrashTheCastle;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class Locations {

	public void saveLoc(Location loc, String spawnname){
		String location = loc.getWorld().getName()+","+ loc.getX()+","+ loc.getY()+","+ loc.getZ()+","+ loc.getYaw()+","+ loc.getPitch();
		CrashTheCastle.plugin.getConfig().set(spawnname + ".location", location);
		CrashTheCastle.plugin.saveConfig();
		}
	
	
	
	  public Location getLocation() {
	        String[] loc = CrashTheCastle.plugin.getConfig().getString("location").split("\\,");
	        World w = Bukkit.getWorld(loc[0]);
	        Double x = Double.parseDouble(loc[1]);
	        Double y = Double.parseDouble(loc[2]);
	        Double z = Double.parseDouble(loc[3]);
	        float yaw = Float.parseFloat(loc[4]);
	        float pitch = Float.parseFloat(loc[5]);
	        Location location = new Location(w, x, y, z, yaw, pitch);
	        return location;
	    }
	
	
	
	
	
	
}
