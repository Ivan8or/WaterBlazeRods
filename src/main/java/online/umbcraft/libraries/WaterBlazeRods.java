package online.umbcraft.libraries;

import org.bukkit.plugin.java.JavaPlugin;

public final class WaterBlazeRods extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(
                new BlazeListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
