package com.gmail.br45entei.main;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

/**@author Brian_Entei */
public class GeneratorIndex {
	private final BlockIndex blockIndex;

	public GeneratorIndex(BlockIndex blockIndex) {
		this.blockIndex = blockIndex;
	}

	public BlockGenerator naturaloreQuicksilverGen;
	public BlockGenerator naturaloreOrcichalcumGen;
	public BlockGenerator naturaloreMoonstoneGen;
	public BlockGenerator naturaloreEbonyGen;
	public BlockGenerator naturaloreCorundumGen;

	public final void initialize() {
		this.naturaloreQuicksilverGen = new BlockGenerator(this.blockIndex.naturaloreQuicksilver).initialize(10);
		this.naturaloreOrcichalcumGen = new BlockGenerator(this.blockIndex.naturaloreOrcichalcum).initialize(10);
		this.naturaloreMoonstoneGen = new BlockGenerator(this.blockIndex.naturaloreMoonstone).initialize(10);
		this.naturaloreEbonyGen = new BlockGenerator(this.blockIndex.naturaloreEbony).initialize(10);
		this.naturaloreCorundumGen = new BlockGenerator(this.blockIndex.naturaloreCorundum).initialize(10);
		
	}

	public final class BlockGenerator implements IWorldGenerator {
		public final Block block;
		public String preferredBiome = "any";

		public BlockGenerator(Block block) {
			this.block = block;
		}

		public BlockGenerator(Block block, String preferredBiome) {
			this(block);
			this.preferredBiome = preferredBiome;
		}

		/**@param modGenerationWeight a weight to assign to this generator. Heavy weights tend to sink to the bottom of list of world generators (i.e. they run later) */
		public final BlockGenerator initialize(int modGenerationWeight) {
			GameRegistry.registerWorldGenerator(this, modGenerationWeight);
			return this;
		}

		@Override
		public final void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
			switch(world.provider.dimensionId) {
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
			}
		}

		private final void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
			
		}

		private final void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
			BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
			if(this.preferredBiome.equals("any") || b.biomeName.equalsIgnoreCase(this.preferredBiome)) {
				for(int k = 0; k < 10; k++) {
					Vector3 blockPos = new Vector3(chunkX + rand.nextInt(16), rand.nextInt(64), chunkZ + rand.nextInt(16));
					(new WorldGenMinable(this.block, 8)).generate(world, rand, blockPos.getX(), blockPos.getY(), blockPos.getZ());
					//System.out.println("Set block \"" + block.getUnlocalizedName() + "\" at: \"" + blockPos.toString() + "\"");
				}
			}
		}

		private final void generateNether(World world, Random rand, int chunkX, int chunkZ) {
			
		}

	}

	public final class Vector3 {
		private int x;
		private int y;
		private int z;

		public Vector3() {
			this.x = 0;
			this.y = 0;
			this.z = 0;
		}

		public Vector3(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public final String toString() {
			return "Vector3(X: " + this.x + ", Y: " + this.y + ", Z: " + this.z + ")";
		}

		public final int getX() {
			return this.x;
		}

		public final int getY() {
			return this.y;
		}

		public final int getZ() {
			return this.z;
		}

		public final Vector3 setX(int x) {
			this.x = x;
			return this;
		}

		public final Vector3 setY(int y) {
			this.y = y;
			return this;
		}

		public final Vector3 setZ(int z) {
			this.z = z;
			return this;
		}

		public final Vector3 setXY(int x, int y) {
			this.x = x;
			this.y = y;
			return this;
		}

		public final Vector3 setYZ(int y, int z) {
			this.y = y;
			this.z = z;
			return this;
		}

		public final Vector3 setXZ(int x, int z) {
			this.x = x;
			this.z = z;
			return this;
		}

		public final Vector3 setXYZ(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
			return this;
		}

	}

}
