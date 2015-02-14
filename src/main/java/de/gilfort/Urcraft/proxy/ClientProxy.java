package de.gilfort.Urcraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import de.gilfort.Urcraft.client.settings.Keybindings;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerKeyBindings() {

		ClientRegistry.registerKeyBinding(Keybindings.EXPLODE);

	}

}
