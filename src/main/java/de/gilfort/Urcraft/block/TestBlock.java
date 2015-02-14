package de.gilfort.Urcraft.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import de.gilfort.Urcraft.init.ModBlocks;
import de.gilfort.Urcraft.reference.Names;

public class TestBlock extends BlockUrcraft {

	public TestBlock() {

		setBlockName(Names.Blocks.TESTBLOCK_NAME);
	}

	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer entitiyPlayer, int sideOfBlock, float hitX,
			float hitY, float hitZ) {

		for (int i = 1; i < 5; i++) {

			// if (world.getBlock(x, y + i, z) == Blocks.air) ----- Careful, you
			// can create custom "airblocks" with forge - /heatsourceblocks
			// railcraft
			if (world.isAirBlock(x, y + i, z) == true) {

				world.setBlock(x, y + i, z, ModBlocks.TestBlock);
			}
		}

		// Return true, if you dont want to place a block against it without
		// "shift"
		return true;
	}
}
