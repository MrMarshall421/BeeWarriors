/*
 * Copyright © 2020 Marshall Developments. Some Rights reserved.
 */

package dev.mrmarshall.beewarriors.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BeeWarriors extends JavaPlugin {

    private static BeeWarriors instance;

    @Override
    public void onEnable() {
        instance = this;

        new InitializationHandler();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static BeeWarriors getInstance() { return instance; }
}
