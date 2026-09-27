package be.littlemastermind.plugin1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Zet de whitelist uit (dit lijntje code is enkel nodig voor de eerste keer)
        this.getServer().setWhitelist(false);

        this.getLogger().info("-----------------------------------------------");
        this.getLogger().info("De Little MasterMind plugin is succesvol gestart!");
        this.getLogger().info("-----------------------------------------------");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
