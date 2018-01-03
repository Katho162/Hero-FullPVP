package com.hero.fullpvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.Random;

public class MOTD implements Listener
{

    private final String[] motds = {
            "Seja bem vindo ao nosso servidor",
            "O melhor fullpvp de todos"
    };

    /**
     * Evento que escolhe uma motd quando o servidor aparece na lista de servidores.
     */
    @EventHandler
    public void pingList(ServerListPingEvent e)
    {
        e.setMotd(motds[new Random().nextInt(motds.length)]);
    }

}
