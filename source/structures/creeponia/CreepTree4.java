package net.nevermine.structures.creeponia;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class CreepTree4 extends WorldGenerator {
	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		world.setBlock(i + 1, j + 5, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 2, j + 5, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 2, j + 6, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 0, k + 3, Blockizer.WoodCreep);
		world.setBlock(i + 3, j + 1, k + 3, Blockizer.WoodCreep);
		world.setBlock(i + 3, j + 2, k + 3, Blockizer.WoodCreep);
		world.setBlock(i + 3, j + 3, k + 3, Blockizer.WoodCreep);
		world.setBlock(i + 3, j + 4, k + 3, Blockizer.WoodCreep);
		world.setBlock(i + 3, j + 5, k + 1, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 5, k + 2, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 5, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 5, k + 4, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 5, k + 5, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 6, k + 2, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 6, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 3, j + 6, k + 4, Blockizer.LeavesCreep);
		world.setBlock(i + 4, j + 5, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 4, j + 6, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 5, j + 5, k + 3, Blockizer.LeavesCreep);
		world.setBlock(i + 0, j + 3, k + 3, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 0, j + 4, k + 3, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 0, j + 5, k + 3, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 1, j + 3, k + 2, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 1, j + 3, k + 4, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 1, j + 4, k + 2, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 1, j + 4, k + 4, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 1, j + 5, k + 2, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 1, j + 5, k + 4, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 2, j + 3, k + 1, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 2, j + 3, k + 5, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 2, j + 4, k + 1, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 2, j + 4, k + 5, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 2, j + 5, k + 1, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 2, j + 5, k + 5, Blockizer.CreepVines, 8, 2);
		world.setBlock(i + 3, j + 3, k + 0, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 3, j + 3, k + 6, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 3, j + 4, k + 0, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 3, j + 4, k + 6, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 3, j + 5, k + 0, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 3, j + 5, k + 6, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 4, j + 3, k + 1, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 4, j + 3, k + 5, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 4, j + 4, k + 1, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 4, j + 4, k + 5, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 4, j + 5, k + 1, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 4, j + 5, k + 5, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 5, j + 3, k + 2, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 5, j + 3, k + 4, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 5, j + 4, k + 2, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 5, j + 4, k + 4, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 5, j + 5, k + 2, Blockizer.CreepVines, 1, 2);
		world.setBlock(i + 5, j + 5, k + 4, Blockizer.CreepVines, 4, 2);
		world.setBlock(i + 6, j + 3, k + 3, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 6, j + 4, k + 3, Blockizer.CreepVines, 2, 2);
		world.setBlock(i + 6, j + 5, k + 3, Blockizer.CreepVines, 2, 2);
		return true;
	}
}
