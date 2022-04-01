package com.max.tablist;

import com.max.tablist.listeners.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TabList extends JavaPlugin {

    public final String RED = "\033[0;31m";
    public final String GREEN = "\033[0;32m";
    public final String RESET = "\033[0m";

    @Override
    public void onEnable() {
        System.out.println(GREEN + "===========================================" + RESET);
        System.out.println(GREEN + "|                                         |" + RESET);
        System.out.println(GREEN + "|          Tab list has started!          |" + RESET);
        System.out.println(GREEN + "|                                         |" + RESET);
        System.out.println(GREEN + "===========================================" + RESET);

        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        System.out.println(RED + "===========================================" + RESET);
        System.out.println(RED + "|                                         |" + RESET);
        System.out.println(RED + "|           Tab list has ended!           |" + RESET);
        System.out.println(RED + "|                                         |" + RESET);
        System.out.println(RED + "===========================================" + RESET);
    }
}
