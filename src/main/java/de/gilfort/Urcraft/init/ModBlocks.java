package de.gilfort.Urcraft.init;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import de.gilfort.Urcraft.block.BlockCamoMine;
import de.gilfort.Urcraft.block.BlockUrcraft;
import de.gilfort.Urcraft.block.TestBlock;
import de.gilfort.Urcraft.reference.Names;
import de.gilfort.Urcraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static BlockUrcraft TestBlock = new TestBlock();
	public static Block Camo_mine = new BlockCamoMine();

	public static void init() {

		GameRegistry.registerBlock(TestBlock, Names.Blocks.TESTBLOCK_NAME);
		GameRegistry.registerBlock(Camo_mine, Names.Blocks.CAMO_MINE);
	}

}
