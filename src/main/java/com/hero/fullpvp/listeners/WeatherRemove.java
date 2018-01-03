package com.hero.fullpvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherRemove implements Listener
{

    /**
     * Impossibilita que começe a chover no servidor.
     */
    @EventHandler
    public void wheaterChange(WeatherChangeEvent e)
    {
        if (e.toWeatherState())
            e.setCancelled(true);
    }
}
