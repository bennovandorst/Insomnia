package tech.benno.insomnia.listeners;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author bennovandorst
 * @package tech.benno.insomnia.listeners
 * @date 13/11/2024
 */
public class onPlayerSleepEvent implements Listener {

    private final JavaPlugin plugin;

    public onPlayerSleepEvent(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();
        World world = player.getWorld();
        long time = world.getTime();

        if (time >= 12000 && time < 24000) {
            e.setCancelled(true);

            String sleepMessage = plugin.getConfig().getString("messages.sleep");

            if (sleepMessage != null && !sleepMessage.isEmpty()) {
                sleepMessage = ChatColor.translateAlternateColorCodes('&', sleepMessage);
                player.sendMessage(sleepMessage);
            }
        }
    }
}