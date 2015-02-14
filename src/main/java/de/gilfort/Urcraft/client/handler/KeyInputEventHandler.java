package de.gilfort.Urcraft.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import de.gilfort.Urcraft.client.settings.Keybindings;
import de.gilfort.Urcraft.network.MessageExplode;
import de.gilfort.Urcraft.network.NetworkHandler;
import de.gilfort.Urcraft.reference.Key;
import de.gilfort.Urcraft.utility.LogHelper;

public class KeyInputEventHandler {

	private static Key getPressedKeybinding() {

		if (Keybindings.EXPLODE.isPressed()) {
			return Key.EXPLOSION;
		}
		else if (Keybindings.EXPLODE_BIG.isPressed()) {
			return Key.EXPLOSION_BIG;
		}

		return Key.UNKNOWN;

	}

	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {

		switch (getPressedKeybinding()) {
		case EXPLOSION:
			LogHelper.info("Boom!");
			NetworkHandler.sendToServer(new MessageExplode(3F));
			break;

		case EXPLOSION_BIG:
			LogHelper.info("BOOOM!!!");
			NetworkHandler.sendToServer(new MessageExplode(50F));
			break;

		default:
			break;

		}

	}

}
