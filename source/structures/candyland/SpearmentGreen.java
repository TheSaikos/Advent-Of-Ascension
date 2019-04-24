package net.nevermine.structures.candyland;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class SpearmentGreen extends WorldGenerator {
	public SpearmentGreen() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		for (int y = j; y < j + 5; y++) {
			world.setBlock(i, y, k, Blockizer.SpearmentGreen);
			if ((rand.nextInt(2) == 1) || y == j + 3) {
				break;
			}
		}
		return true;
	}
}