package online.umbcraft.libraries.waterblazerods;

import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class BlazeListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlazeDeath(final EntityDeathEvent e) {
        if(e.getEntity().getType() != EntityType.BLAZE)
            return;

        Blaze blaze = (Blaze) e.getEntity();

    }

}
