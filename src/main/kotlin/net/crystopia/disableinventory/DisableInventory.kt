package net.crystopia.disableinventory

import net.crystopia.disableinventory.events.InventoryEvents
import org.bukkit.plugin.java.JavaPlugin

class DisableInventory : JavaPlugin() {



    override fun onEnable() {
        server.pluginManager.registerEvents(InventoryEvents(), this)
        logger.info("DisableInventory has been enabled")
    }

    override fun onDisable() {
        logger.info("DisableInventory has been disabled")
    }

}