package me.thatsfinn.spigotjda;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class SpigotJDA extends JavaPlugin {

    public final String VERSION = "JDA-4.3.0_277";

    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "Version: " + VERSION);
    }

}
