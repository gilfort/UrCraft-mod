package de.gilfort.Urcraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.gilfort.Urcraft.client.handler.KeyInputEventHandler;
import de.gilfort.Urcraft.handler.ConfigurationHandler;
import de.gilfort.Urcraft.init.ModBlocks;
import de.gilfort.Urcraft.init.ModItems;
import de.gilfort.Urcraft.init.Recipes;
import de.gilfort.Urcraft.proxy.CommonProxy;
import de.gilfort.Urcraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Urcraft {

	@Mod.Instance(Reference.MOD_ID)
	public static Urcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		proxy.registerKeyBindings();

		ModBlocks.init();
		ModItems.init();

	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		Recipes.init();
	}

	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event) {

	}

}
