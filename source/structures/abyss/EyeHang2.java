package net.nevermine.structures.abyss;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class EyeHang2 extends WorldGenerator {

	public EyeHang2() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 3, k + 1, Blockizer.EyeBlock);
		world.setBlock(i + 0, j + 4, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 0, j + 7, k + 1, Blockizer.EyeBlock);
		world.setBlock(i + 0, j + 8, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 0, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 1, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 2, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 3, k + 0, Blockizer.EyeBlock);
		world.setBlock(i + 1, j + 3, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 3, k + 2, Blockizer.EyeBlock);
		world.setBlock(i + 1, j + 4, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 4, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 4, k + 2, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 5, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 6, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 7, k + 0, Blockizer.EyeBlock);
		world.setBlock(i + 1, j + 7, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 7, k + 2, Blockizer.EyeBlock);
		world.setBlock(i + 1, j + 8, k + 0, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 8, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 1, j + 8, k + 2, Blockizer.WoodBlood);
		world.setBlock(i + 2, j + 3, k + 1, Blockizer.EyeBlock);
		world.setBlock(i + 2, j + 4, k + 1, Blockizer.WoodBlood);
		world.setBlock(i + 2, j + 7, k + 1, Blockizer.EyeBlock);
		world.setBlock(i + 2, j + 8, k + 1, Blockizer.WoodBlood);

		return true;
	}
}