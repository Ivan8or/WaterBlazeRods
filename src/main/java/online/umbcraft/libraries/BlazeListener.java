package online.umbcraft.libraries;

import org.bukkit.Material;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class BlazeListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlazeDeath(final EntityDeathEvent e) {
        if(e.getEntity().getType() != EntityType.BLAZE)
            return;

        Blaze blaze = (Blaze) e.getEntity();

        if(blaze.getLastDamageCause().getCause() != EntityDamageEvent.DamageCause.DROWNING)
            return;

        if(Math.random() > 0.5)
            e.getDrops().add(new ItemStack(Material.BLAZE_ROD));
    }
}
