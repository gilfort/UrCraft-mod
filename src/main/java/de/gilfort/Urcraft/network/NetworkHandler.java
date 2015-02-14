package de.gilfort.Urcraft.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import de.gilfort.Urcraft.reference.Reference;

public class NetworkHandler {

	private static SimpleNetworkWrapper INSTANCE;

	public static void init() {
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);

		// registerMessage(MessageHandler, Message, packet ID (i++), Receiving
		// side)
		INSTANCE.registerMessage(MessageExplode.class, MessageExplode.class, 0,
				Side.SERVER);

	}

	public static void sendToServer(IMessage message) {
		INSTANCE.sendToServer(message);
	}

}
