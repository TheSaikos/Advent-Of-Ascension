package net.nevermine.structures.iromine;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.SpecialBlockizer;

import java.util.Random;

public class MechTower extends WorldGenerator {

	public MechTower() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 0, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 0, j + 3, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 0, j + 3, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 0, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 1, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 1, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 1, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 1, j + 3, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 1, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 2, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 2, j + 2, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 2, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 2, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 3, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 2, j + 4, k + 8, Blockizer.MechBotAltar);
		world.setBlock(i + 3, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 3, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 3, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 3, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 3, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 4, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 5, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 0, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 12, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 13, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 14, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 15, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 16, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 5, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 0, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 0, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 1, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 1, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 2, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 2, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 3, k + 0, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 3, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 3, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 3, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 3, k + 12, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 3, k + 13, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 14, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 15, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 16, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 4, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 4, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 5, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 5, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 5, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 6, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 6, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 7, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 7, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 8, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 8, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 7, j + 9, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 9, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 9, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 0, k + 11, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 11, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 12, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 13, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 1, k + 14, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 2, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 2, k + 14, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 0, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 11, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 12, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 13, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 14, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 15, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 16, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 4, k + 2, Blockizer.MechBotAltar);
		world.setBlock(i + 8, j + 4, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 4, k + 11, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 4, k + 14, Blockizer.MechBotAltar);
		world.setBlock(i + 8, j + 5, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 5, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 5, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 5, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 5, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 5, k + 11, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 9, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 9, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 9, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 0, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 0, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 1, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 1, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 2, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 2, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 3, k + 0, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 3, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 3, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 3, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 3, k + 12, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 3, k + 13, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 14, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 15, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 16, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 4, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 4, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 5, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 5, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 5, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 6, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 6, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 7, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 7, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 8, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 8, k + 9, SpecialBlockizer.Iropole);
		world.setBlock(i + 9, j + 9, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 9, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 9, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 0, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 12, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 13, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 14, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 15, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 16, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 5, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 0, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 3, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 4, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 5, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 3, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 3, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 3, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 14, j + 1, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 14, j + 2, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 14, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 14, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 3, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 14, j + 4, k + 8, Blockizer.MechBotAltar);
		world.setBlock(i + 15, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 15, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 15, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 15, j + 3, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 15, j + 3, k + 10, Blockizer.IrobrickStriped);
		world.setBlock(i + 16, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 16, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 16, j + 3, k + 8, Blockizer.IrobrickStriped);
		world.setBlock(i + 16, j + 3, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 16, j + 3, k + 10, Blockizer.IrobrickStriped);

		return true;
	}
}