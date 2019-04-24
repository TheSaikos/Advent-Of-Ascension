package net.nevermine.resource.rage;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.player.EntityPlayer;

public class rageTickHandler {
	@SubscribeEvent
	public void onTick(final TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.START) {
			onTickStart(event.player);
		}
		else {
			onTickEnd(event.player);
		}
	}

	private void onTickEnd(final EntityPlayer player) {
		rageHelper.getProperties(player).updateAllBars();
	}

	private void onTickStart(final EntityPlayer player) {
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
	}

	@SubscribeEvent
	public void onPlayerLoggedOut(final PlayerEvent.PlayerLoggedOutEvent event) {
	}

	@SubscribeEvent
	public void onPlayerRespawn(final PlayerEvent.PlayerRespawnEvent event) {
		rageHelper.getProperties(event.player).setBarValue(0.0f);
	}
}
