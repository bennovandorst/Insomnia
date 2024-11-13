package tech.benno.insomnia.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class onPlayerSleepEvent implements Listener {

    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent e) {
        e.setCancelled(true);
        Player player = e.getPlayer();
        player.sendMessage(ChatColor.YELLOW + "As you approach the bed, an unseen force pulls you back!");
        player.sendMessage(ChatColor.DARK_RED + "It seems the night itself has other plans for you...");
        player.sendMessage(ChatColor.RED + "You won't be resting anytime soon.");
    }
}
