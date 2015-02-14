package de.gilfort.Urcraft.world.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgeneratorUrcraft implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		int dimensionId = world.provider.dimensionId;

		/*
		 * Takes a look in which dimension the generation shall happen
		 */
		switch (dimensionId) {
		case 0:
			generateSurface(world, chunkX * 16, chunkZ * 16, random);
			break;
		case -1:
			generateNether(world, chunkX * 16, chunkZ * 16, random);
			break;
		case 1:
			generateEnd(world, chunkX * 16, chunkZ * 16, random);
			break;
		default:
			generateSurface(world, chunkX * 16, chunkZ * 16, random);
			break;
		}

	}

	private void generateSurface(World world, int x, int z, Random random) {
		// Generates Things on the Surface and Mystcraft/Not Vanilla Dimensions

		if (random.nextInt(10) == 0) {

			int RandX = x + random.nextInt(16);
			int RandZ = z + random.nextInt(16);
			int RandY = world.getHeightValue(RandX, RandZ);
			if (world.getBlock(RandX, RandY - 1, RandZ) == Blocks.dirt
					|| world.getBlock(RandX, RandY - 1, RandZ) == Blocks.grass) {

				generateCube(world, RandX, RandY, RandZ);
			}
		}

	}

	private void generateNether(World world, int x, int z, Random random) {
		// Generates Things in the Nether

	}

	private void generateEnd(World world, int x, int z, Random random) {
		// Generates Things in the End

	}

	private void generateCube(World world, int x, int y, int z) {

		for (int dx = 0; dx < 3; dx++) {
			for (int dy = 0; dy < 3; dy++) {
				for (int dz = 0; dz < 3; dz++) {
					world.setBlock(x + dx, y + dy, z + dz, Blocks.gold_block);
				}
			}
		}
	}
}
