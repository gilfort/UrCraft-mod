package de.gilfort.Urcraft.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import de.gilfort.Urcraft.reference.Names;
import de.gilfort.Urcraft.tileentity.TileEntityCamomine;

public class BlockCamoMine extends BlockUrcraftTileEntity {

	public BlockCamoMine() {
		setBlockName(Names.Blocks.CAMO_MINE);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {

		return new TileEntityCamomine();
	}

}
