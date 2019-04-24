package net.nevermine.structures.abyss;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class EyeCane4 extends WorldGenerator {

	public EyeCane4() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 0, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 1, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 2, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 3, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 4, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 5, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 6, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 7, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 7, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 2, j + 3, k + 0, Blockizer.EyeBlock);
		world.setBlock(i + 2, j + 4, k + 0, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 5, k + 0, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 6, k + 0, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 7, k + 0, Blockizer.WoodBlood);

		return true;
	}
}