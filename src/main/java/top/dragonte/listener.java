package top.dragonte;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class listener implements Listener {
    @EventHandler
    public void online(PlayerJoinEvent pje) {
        Player player = pje.getPlayer();
        System.out.println(player.getDisplayName());
    }
}
