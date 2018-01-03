package com.hero.fullpvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.Random;

public class MOTD implements Listener
{

    private final String[] motds = {
            "§e§lHERO FULLPVP: §8Se junte e monte seu império!\n§7Se divirta o maximo com nosso sistema de economia exclusivo!",
            "§e§lHERO FULLPVP: §8Compre VIP para ajudar o servidor!\n§7Entre na arena e veja os inimigos cairem sobre seus pés!!",
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
