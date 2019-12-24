/*
 * Copyright © 2020 Marshall Developments. Some Rights reserved.
 */

package dev.mrmarshall.beewarriors.objects;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Bee;
import org.bukkit.entity.EntityType;

import java.util.UUID;

public class BeeWarrior {

    private UUID owner;
    private String name;
    private Bee bee;

    public BeeWarrior(UUID owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public void spawn(Location spawnLocation) {
        this.bee = (Bee) spawnLocation.getWorld().spawnEntity(spawnLocation, EntityType.BEE);
        bee.setCustomName(ChatColor.translateAlternateColorCodes('&', this.name));
        bee.setCustomNameVisible(true);
    }

    public void kill() {
        this.bee.remove();
    }

    public UUID getOwner() { return this.owner; }
    public String getName() { return this.name; }

}
