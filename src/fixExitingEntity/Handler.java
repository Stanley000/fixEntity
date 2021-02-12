package fixExitingEntity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.logging.Logger;

public class Handler implements Listener {

    Logger log = Logger.getLogger("Minecraft");

    @EventHandler
    public void onExit(PlayerQuitEvent event)
    {
        if  (event.getPlayer().getVehicle() != null) {
            event.getPlayer().leaveVehicle();
            log.warning("[fixEntity] " + event.getPlayer().getDisplayName() + " the left the server while on entity!");
        }
    }

}
