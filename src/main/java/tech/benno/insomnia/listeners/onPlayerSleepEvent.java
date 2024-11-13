package tech.benno.insomnia.listeners;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class onPlayerSleepEvent implements Listener {

    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();
        World world = player.getWorld();
        long time = world.getTime();

        if (time >= 12000 && time < 24000) {
            e.setCancelled(true);
            player.sendMessage(ChatColor.YELLOW + "As you approach the bed, an unseen force pulls you back!");
            player.sendMessage(ChatColor.DARK_RED + "It seems the night itself has other plans for you...");
            player.sendMessage(ChatColor.RED + "You won't be resting anytime soon.");
        }
    }
}
