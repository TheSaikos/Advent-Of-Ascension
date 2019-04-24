package net.nevermine.structures.precasia;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class PrecasiaTree1 extends WorldGenerator {
	protected int[] GetValidSpawnBlocks() {
		return new int[0];
	}

	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		if (world.getBlock(i + 7, j - 1, k + 7) != Blockizer.GrassPrecasia && world.getBlock(i + 7, j - 1, k + 7) != Blockizer.StonePrecasianHigh) {
			return false;
		}
		world.setBlock(i + 0, j + 28, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 28, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 28, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 29, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 29, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 29, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 30, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 30, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 0, j + 30, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 27, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 27, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 27, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 28, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 28, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 29, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 29, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 30, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 30, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 31, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 31, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 1, j + 31, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 27, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 27, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 27, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 28, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 28, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 29, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 2, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 2, j + 29, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 30, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 30, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 31, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 31, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 2, j + 31, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 27, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 27, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 27, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 28, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 28, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 29, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 3, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 3, j + 29, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 30, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 30, k + 10, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 31, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 31, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 3, j + 31, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 28, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 28, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 28, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 29, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 29, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 29, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 30, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 30, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 4, j + 30, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 28, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 28, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 28, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 29, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 29, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 29, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 5, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 5, j + 30, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 30, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 5, j + 30, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 27, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 27, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 27, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 28, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 28, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 28, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 28, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 28, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 29, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 29, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 6, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 6, j + 29, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 29, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 29, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 30, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 30, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 30, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 30, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 30, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 31, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 31, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 6, j + 31, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 0, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 0, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 1, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 1, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 2, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 2, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 3, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 3, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 4, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 4, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 5, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 5, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 6, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 6, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 7, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 7, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 8, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 8, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 9, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 9, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 10, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 10, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 11, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 11, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 12, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 12, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 13, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 13, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 14, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 14, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 15, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 15, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 16, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 16, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 17, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 17, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 18, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 18, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 19, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 19, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 20, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 20, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 21, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 21, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 22, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 22, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 23, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 23, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 24, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 24, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 25, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 25, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 26, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 26, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 27, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 27, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 27, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 27, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 27, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 27, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 27, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 27, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 28, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 28, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 28, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 28, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 28, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 28, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 29, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 29, k + 2, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 3, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 29, k + 5, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 6, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 9, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 10, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 29, k + 12, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 13, Blockizer.WoodStranglewood);
		world.setBlock(i + 7, j + 29, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 30, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 30, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 30, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 30, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 31, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 31, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 31, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 31, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 31, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 7, j + 31, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 0, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 0, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 1, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 1, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 2, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 2, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 3, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 3, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 4, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 4, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 5, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 5, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 6, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 6, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 7, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 7, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 8, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 8, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 9, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 9, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 10, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 10, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 11, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 11, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 12, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 12, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 13, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 13, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 14, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 14, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 15, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 15, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 16, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 16, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 17, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 17, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 18, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 18, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 19, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 19, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 20, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 20, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 21, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 21, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 22, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 22, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 23, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 23, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 24, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 24, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 25, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 25, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 26, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 26, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 27, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 27, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 27, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 27, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 27, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 27, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 27, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 27, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 28, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 28, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 28, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 28, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 28, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 28, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 29, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 29, k + 2, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 3, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 29, k + 5, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 6, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 9, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 10, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 29, k + 12, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 13, Blockizer.WoodStranglewood);
		world.setBlock(i + 8, j + 29, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 30, k + 0, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 30, k + 4, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 30, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 30, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 31, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 31, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 31, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 31, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 31, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 8, j + 31, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 27, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 27, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 27, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 28, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 28, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 28, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 28, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 28, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 29, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 29, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 29, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 9, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 9, j + 29, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 29, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 30, k + 1, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 30, k + 2, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 30, k + 3, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 30, k + 11, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 30, k + 15, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 31, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 31, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 9, j + 31, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 28, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 28, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 28, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 10, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 10, j + 29, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 29, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 29, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 30, k + 12, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 30, k + 13, Blockizer.LeavesStranglewood);
		world.setBlock(i + 10, j + 30, k + 14, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 28, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 28, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 28, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 29, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 29, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 29, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 30, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 30, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 11, j + 30, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 27, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 27, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 27, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 28, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 28, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 29, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 12, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 12, j + 29, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 30, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 30, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 31, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 31, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 12, j + 31, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 27, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 27, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 27, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 28, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 28, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 29, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 29, k + 7, Blockizer.WoodStranglewood);
		world.setBlock(i + 13, j + 29, k + 8, Blockizer.WoodStranglewood);
		world.setBlock(i + 13, j + 29, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 30, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 30, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 31, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 31, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 13, j + 31, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 27, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 27, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 27, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 28, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 28, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 29, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 29, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 30, k + 5, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 30, k + 9, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 31, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 31, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 14, j + 31, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 28, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 28, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 28, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 29, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 29, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 29, k + 8, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 30, k + 6, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 30, k + 7, Blockizer.LeavesStranglewood);
		world.setBlock(i + 15, j + 30, k + 8, Blockizer.LeavesStranglewood);
		return true;
	}
}