package fixExitingEntity;

import fixExitingEntity.Handler;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Handler(), this);
    }

    @Override
    public void onDisable() {
        log.info("[fixEntity] Disable!");
    }
}
