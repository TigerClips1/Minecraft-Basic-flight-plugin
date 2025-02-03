/*
 * **************************************************************************
 *    handleFlightMovement.java                                            *
 **************************************************************************
 *                         This file is part of:                          *
 *                          FlightPlugin                                  *
 *                      https://github.com/TigerClips1                    *
 **************************************************************************
 *                                                                        *
 * Copyright (c) 2025 TigerClips1.                                        *
 *                                                                        *
 * Permission is hereby granted, free of charge, to any person obtaining  *
 * a copy of this software and associated documentation files (the        *
 * "Software"), to deal in the Software without restriction, including    *
 * without limitation the rights to use, copy, modify, merge, publish,    *
 * distribute, sublicense, and/or sell copies of the Software, and to     *
 * permit persons to whom the Software is furnished to do so, subject to  *
 * the following conditions:                                              *
 *                                                                        *
 * The above copyright notice and this permission notice shall be         *
 * included in all copies or substantial portions of the Software.        *
 *                                                                        *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,        *
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF     *
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. *
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY   *
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,   *
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE      *
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                 *
 */

// create a  artifact to i can package it
package me.tigerclips1.flightPlugin;

// import the required modules
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

// the main class and it also implements listener to we can use the minecraft spigot event system
public class handleFlightMovement  implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // Handle Flight Logic.
        if(!(sender instanceof Player player)) {
            sender.sendMessage("Only player can run this command. ");
            return  true;
        }
        if(player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage("§4 [§l Flight Disable] ");
        } else {
            player.setAllowFlight(true);
            player.sendMessage("§a [§l Flight Enabled] ");
        }
        return  true;
    }
}