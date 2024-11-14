package tech.benno.insomnia;

import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tech.benno.insomnia.commands.ReloadCommand;
import tech.benno.insomnia.listeners.onPlayerSleepEvent;
import tech.benno.insomnia.utils.PerformanceNode;

public final class Insomnia extends JavaPlugin {

    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";

    @Override
    public void onEnable() {
        PerformanceNode.start("Insomnia.onEnable");
        int pluginId = 23892;
        Metrics metrics = new Metrics(this, pluginId);
        saveDefaultConfig();

        getLogger().info(CYAN + "+=========================================+" + RESET);
        getLogger().info(BLUE + "Insomnia Initiated!" + RESET + YELLOW + " (Build: " + getDescription().getVersion() + ") [" + PerformanceNode.calc("Insomnia.onEnable") + "ms]" + RESET);
        getLogger().info(CYAN + "+=========================================+" + RESET);

        Bukkit.getPluginManager().registerEvents(new onPlayerSleepEvent(this), this);
        this.getCommand("ir").setExecutor(new ReloadCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info(CYAN + "+=========================================+" + RESET);
        getLogger().info(BLUE + "Insomnia Disabled!" + RESET + YELLOW + " (Build: " + getDescription().getVersion() + ")" + RESET);
        getLogger().info(CYAN + "+=========================================+" + RESET);
    }
}