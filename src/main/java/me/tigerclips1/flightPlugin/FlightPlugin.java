/*
 * **************************************************************************
 *    FlightPlugin.java                                                    *
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

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

// the main class that will run when the plugin starts

public final class FlightPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // make an event
       Objects.requireNonNull(Bukkit.getPluginCommand("fly")).setExecutor(new handleFlightMovement());
    }
}
