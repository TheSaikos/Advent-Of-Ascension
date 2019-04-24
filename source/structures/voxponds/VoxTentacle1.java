package net.nevermine.structures.voxponds;

import net.minecraft.block.Block;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class VoxTentacle1 implements IVoxpondsStructure {
	private Random rand;

	public VoxTentacle1() {
		rand = new Random();
	}

	@Override
	public void generate(final Block[][][] chunk, final int i, final int j, final int k) {
		chunk[i + 0][j + 0][k + 0] = Blockizer.TentacleBlockGreen;
		chunk[i + 0][j + 1][k + 0] = Blockizer.TentacleBlockGreen;
		chunk[i + 0][j + 2][k + 0] = Blockizer.TentacleBlockGreen;
		chunk[i + 0][j + 3][k + 0] = Blockizer.TentacleBlockGreen;
		chunk[i + 0][j + 3][k + 1] = Blockizer.TentacleBlockGreen;
		chunk[i + 0][j + 4][k + 1] = Blockizer.TentacleBlockGreen;
		if (rand.nextInt(2) == 1) {
			chunk[i + 0][j + 5][k + 1] = Blockizer.TentacleDotsLeft;
		}
		else {
			chunk[i + 0][j + 5][k + 1] = Blockizer.TentacleDotsRight;
		}
		chunk[i + 0][j + 6][k + 1] = Blockizer.TentacleBlockGreen;
		chunk[i + 1][j + 6][k + 1] = Blockizer.TentacleBlockGreen;
		chunk[i + 1][j + 7][k + 1] = Blockizer.TentacleBlockGreen;
		if (rand.nextInt(2) == 1) {
			chunk[i + 1][j + 8][k + 1] = Blockizer.TentacleDotsLeft;
		}
		else {
			chunk[i + 1][j + 8][k + 1] = Blockizer.TentacleDotsRight;
		}
		chunk[i + 1][j + 9][k + 1] = Blockizer.TentacleBlockGreen;
	}
}
