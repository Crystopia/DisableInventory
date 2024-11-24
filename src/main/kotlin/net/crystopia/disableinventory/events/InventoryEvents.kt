package net.crystopia.disableinventory.events

import net.minecraft.network.chat.ClickEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.ClickType
import org.bukkit.event.inventory.InventoryClickEvent

class InventoryEvents : Listener {


    @EventHandler
    fun InventoryClick(event: InventoryClickEvent) {



        if (ClickType.RIGHT == event.click || ClickType.LEFT == event.click) {
            event.isCancelled = true
        }

        if (ClickType.SHIFT_LEFT == event.click || ClickType.SHIFT_RIGHT == event.click) {
            event.isCancelled = true
        }

        if (ClickType.DOUBLE_CLICK == event.click) {
            event.isCancelled = true
        }

        if (ClickType.DROP == event.click) {
            event.isCancelled = true
        }

        if (ClickType.MIDDLE == event.click) {
            event.isCancelled = true
        }

        if (ClickType.SWAP_OFFHAND == event.click) {
            event.isCancelled = true
        }


    }

}