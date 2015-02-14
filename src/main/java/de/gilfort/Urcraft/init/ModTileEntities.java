package de.gilfort.Urcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.gilfort.Urcraft.reference.Names;
import de.gilfort.Urcraft.tileentity.TileEntityCamomine;

public class ModTileEntities {

	public static void init() {

		GameRegistry.registerTileEntity(TileEntityCamomine.class,
				Names.TileEntities.CAMO_MINE);
	}

}
