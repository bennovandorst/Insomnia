package tech.benno.insomnia;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tech.benno.insomnia.listeners.onPlayerSleepEvent;

public final class Insomnia extends JavaPlugin {

    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getLogger().info(CYAN + "+=========================================+" + RESET);
        getLogger().info(BLUE + "Insomnia Initiated!" + RESET + YELLOW + " (Build: " + getDescription().getVersion() + ")" + RESET);
        getLogger().info(CYAN + "+=========================================+" + RESET);

        Bukkit.getPluginManager().registerEvents(new onPlayerSleepEvent(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
