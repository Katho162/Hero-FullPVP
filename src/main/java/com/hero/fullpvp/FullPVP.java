package com.hero.fullpvp;

import com.hero.fullpvp.listeners.MOTD;
import com.hero.fullpvp.listeners.WeatherRemove;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class FullPVP extends JavaPlugin
{

    public static FullPVP instance;

    /**
     * Evento disparado quando o plugin é iniciado.
     * Inicia algumas variais e faz a primeira conexão com o banco de dados.
     **/
    public void onEnable()
    {
        instance = this;
        registerCommands();
        registerListeners();
        genConfig();
    }

    /**
     * Evento disparado quando o plugin é desativado.
     **/
    public void onDisable()
    {
        // TODO
    }

    /**
     * Registra os Listeners de todos os comandos do plugin.
     **/
    public void registerCommands()
    {
        // TODO
    }

    /**
     * Registra todos os Listeners dos Events do plugin.
     **/
    public void registerListeners()
    {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new MOTD(), this);
        pm.registerEvents(new WeatherRemove(), this);
    }

    /**
     * Gera a primeira configuração do plugin.
     **/
    public void genConfig()
    {
        if (!(new File(getDataFolder() + "/config.json").exists()))
            saveResource("config.json", false);
    }

}
