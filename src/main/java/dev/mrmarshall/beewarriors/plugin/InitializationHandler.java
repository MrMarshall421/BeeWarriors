/*
 * Copyright © 2020 Marshall Developments. Some Rights reserved.
 */

package dev.mrmarshall.beewarriors.plugin;

import dev.mrmarshall.beewarriors.commands.BeeWarriorsCMD;

public class InitializationHandler {

    public InitializationHandler() {
        loadFiles();

        registerCommands();
        registerBukkitEvents();
    }

    private void registerCommands() {
        BeeWarriorsCMD beeWarriorsCMD = new BeeWarriorsCMD();
        BeeWarriors.getInstance().getCommand("beewarriors").setExecutor(beeWarriorsCMD);
    }

    private void registerBukkitEvents() {

    }

    private void loadFiles() {

    }
}
