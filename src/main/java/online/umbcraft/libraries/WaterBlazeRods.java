package online.umbcraft.libraries;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class WaterBlazeRods extends JavaPlugin {

    @Override
    public void onEnable() {

        //bStats metrics
        new Metrics(this, 11587);

        getServer().getPluginManager().registerEvents(
                new BlazeListener(), this);

    }
}
