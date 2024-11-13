package tech.benno.insomnia;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tech.benno.insomnia.listeners.onPlayerSleepEvent;

public final class Insomnia extends JavaPlugin {

    @Override
    public void onEnable() {
        // Add colors??
        getLogger().info("+=========================================+");
        getLogger().info("Insomnia Initiated! (Build: " + getDescription().getVersion() + ")");
        getLogger().info("+=========================================+");
        Bukkit.getPluginManager().registerEvents(new onPlayerSleepEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
