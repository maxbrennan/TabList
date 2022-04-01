package com.max.tablist.listeners;

import me.TahaCheji.proxyData.SendPlayer;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        try {
            e.getPlayer().setPlayerListHeaderFooter(ChatColor.GOLD + "Welcome, " + e.getPlayer().getDisplayName() +
                            ", to the " + ChatColor.RESET + ChatColor.GRAY + ChatColor.BOLD + "\nMAFANA NATION!\n \n" +
                            ChatColor.RESET + ChatColor.GOLD + "You are playing: \n" +
                            ChatColor.RESET + ChatColor.GRAY + ChatColor.BOLD + new SendPlayer(e.getPlayer()).getServer().getName() + "\n ",
                    "\n " + ChatColor.GOLD + "Do you like the server?" +
                            "\nType " +
                            ChatColor.RESET + ChatColor.GRAY + ChatColor.BOLD + "/discord" +
                            ChatColor.RESET + ChatColor.GOLD + " to join the discord.");
        } catch (NullPointerException i) {
            e.getPlayer().setPlayerListHeaderFooter(ChatColor.GOLD + "Welcome, " + e.getPlayer().getDisplayName() +
                            ", to the " + ChatColor.RESET + ChatColor.GRAY + ChatColor.BOLD + "\nMAFANA NATION!\n \n" +
                            ChatColor.RESET + ChatColor.GOLD + "You are playing: \n" +
                            ChatColor.RESET + ChatColor.GRAY + ChatColor.BOLD + "<SERVERNAME>\n ",
                    "\n " + ChatColor.GOLD + "Do you like the server?" +
                            "\nType " +
                            ChatColor.RESET + ChatColor.GRAY + ChatColor.BOLD + "/discord" +
                            ChatColor.RESET + ChatColor.GOLD + " to join the discord.");
        }
    }

}
