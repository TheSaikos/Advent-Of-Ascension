package net.nevermine.dimension.deeplands;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.nevermine.dimension.DimensionOrganizer;

public class GenLayerBiomesDeeplands extends GenLayer {
	protected BiomeGenBase[] allowedBiomes = {DimensionOrganizer.Deeplands, DimensionOrganizer.DeeplandsFungal, DimensionOrganizer.DeeplandsShine,};

	public GenLayerBiomesDeeplands(long seed) {
		super(seed);
	}

	public GenLayerBiomesDeeplands(long seed, GenLayer genlayer) {
		super(seed);
		parent = genlayer;
	}

	@Override
	public int[] getInts(int x, int z, int width, int depth) {
		int[] dest = IntCache.getIntCache(width * depth);
		for (int dz = 0; dz < depth; dz++) {
			for (int dx = 0; dx < width; dx++) {
				initChunkSeed(dx + x, dz + z);
				dest[(dx + dz * width)] = allowedBiomes[nextInt(allowedBiomes.length)].biomeID;
			}
		}
		return dest;
	}
}