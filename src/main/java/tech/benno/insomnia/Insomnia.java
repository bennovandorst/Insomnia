package tech.benno.insomnia;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;
import tech.benno.insomnia.listeners.onPlayerSleepEvent;

public final class Insomnia extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(Color.PURPLE + "+=========================================+");
        getLogger().info(Color.PURPLE + "Insomnia Initiated! (Build: " + getDescription().getVersion() + ")");
        getLogger().info(Color.PURPLE + "+=========================================+");
        Bukkit.getPluginManager().registerEvents(new onPlayerSleepEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
