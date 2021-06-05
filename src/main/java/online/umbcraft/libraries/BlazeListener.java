package online.umbcraft.libraries;

import org.bukkit.Bukkit;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class BlazeListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlazeDeath(final EntityDeathEvent e) {
        if(e.getEntity().getType() != EntityType.BLAZE)
            return;

        Blaze blaze = (Blaze) e.getEntity();
        Bukkit.getServer().broadcastMessage("blaze died by "+blaze.getLastDamageCause().getCause().toString());
        //if(blaze.getLastDamageCause().getCause() == DamageCause.
    }

}
