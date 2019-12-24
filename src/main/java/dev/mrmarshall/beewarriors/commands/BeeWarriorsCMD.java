/*
 * Copyright © 2020 Marshall Developments. Some Rights reserved.
 */

package dev.mrmarshall.beewarriors.commands;

import dev.mrmarshall.beewarriors.objects.BeeWarrior;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BeeWarriorsCMD implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            //> Player usage
            Player p = (Player) sender;

            switch(args.length) {
                case 0:
                    //> Open Plugin Help

                    break;
                case 1:
                    if(args[0].equalsIgnoreCase("spawn")) {
                        //> Spawn BeeWarrior
                        BeeWarrior testBee = new BeeWarrior(p.getUniqueId(), "§e§lMichael's §e§lB§0§le§e§le");
                        testBee.spawn(p.getLocation());
                    }

                    break;
                default:
                    break;
            }
        } else{
            //> Console usage

        }

        return false;
    }
}
