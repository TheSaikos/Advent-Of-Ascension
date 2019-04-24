package net.nevermine.structures.lunalus;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;
import net.nevermine.npc.entity.zal.EntityZalCitizen;

import java.util.Random;

public class LunarFountain extends WorldGenerator {
	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		world.setBlock(i + 0, j + 2, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 0, j + 2, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 1, j + 2, k + 16, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 1), (double)(j + 4), (double)(k + 10), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 2, j + 1, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 1, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 2, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 2, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 2, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 2, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 2, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 1, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 1, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 1, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 1, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 2, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 2, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 3, j + 2, k + 18, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 3), (double)(j + 4), (double)(k + 6), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 4, j + 0, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 7, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 8, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 9, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 10, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 11, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 4, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 0, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 1, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 1, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 4, j + 2, k + 18, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 14), (double)(j + 3), (double)(k + 3), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 5, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 5, Blocks.stained_glass);
		world.setBlock(i + 5, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 5, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 5, j + 0, k + 13, Blocks.stained_glass);
		world.setBlock(i + 5, j + 0, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 5, j + 12, k + 9, Blockizer.LampLunar);
		world.setBlock(i + 6, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 5, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 0, k + 8, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 9, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 10, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 0, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 0, k + 13, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 6, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 6, j + 2, k + 18, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 6), (double)(j + 4), (double)(k + 17), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 6, j + 12, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 7, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 7, Blocks.stained_glass);
		world.setBlock(i + 7, j + 0, k + 8, Blocks.stained_glass);
		world.setBlock(i + 7, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 10, Blocks.stained_glass);
		world.setBlock(i + 7, j + 0, k + 11, Blocks.stained_glass);
		world.setBlock(i + 7, j + 0, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 7, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 11, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 7, j + 12, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 8, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 8, j + 0, k + 7, Blocks.stained_glass);
		world.setBlock(i + 8, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 11, Blocks.stained_glass);
		world.setBlock(i + 8, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 8, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 8, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 1, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 1, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 8, j + 9, k + 9, Blocks.water);
		world.setBlock(i + 8, j + 11, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 9, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 9, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 9, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 9, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 3, k + 9, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 9), (double)(j + 4), (double)(k + 1), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 9, j + 4, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 5, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 6, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 7, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 8, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 9, k + 8, Blocks.water);
		world.setBlock(i + 9, j + 9, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 9, k + 10, Blocks.water);
		world.setBlock(i + 9, j + 10, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 11, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 11, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 11, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 11, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 11, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 12, k + 5, Blockizer.LampLunar);
		world.setBlock(i + 9, j + 12, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 12, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 12, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 12, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 9, j + 12, k + 13, Blockizer.LampLunar);
		world.setBlock(i + 10, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 10, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 10, j + 0, k + 7, Blocks.stained_glass);
		world.setBlock(i + 10, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 0, k + 11, Blocks.stained_glass);
		world.setBlock(i + 10, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 10, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 10, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 1, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 1, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 10, j + 2, k + 18, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 10), (double)(j + 4), (double)(k + 17), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 10, j + 9, k + 9, Blocks.water);
		world.setBlock(i + 10, j + 11, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 11, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 7, Blocks.stained_glass);
		world.setBlock(i + 11, j + 0, k + 8, Blocks.stained_glass);
		world.setBlock(i + 11, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 10, Blocks.stained_glass);
		world.setBlock(i + 11, j + 0, k + 11, Blocks.stained_glass);
		world.setBlock(i + 11, j + 0, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 11, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 11, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 11, j + 12, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 0, k + 4, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 5, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 0, k + 8, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 9, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 10, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 0, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 0, k + 13, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 14, Blocks.stained_glass);
		world.setBlock(i + 12, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 12, j + 12, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 5, Blocks.stained_glass);
		world.setBlock(i + 13, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 13, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 13, j + 0, k + 13, Blocks.stained_glass);
		world.setBlock(i + 13, j + 0, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 0, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 13, j + 12, k + 9, Blockizer.LampLunar);
		world.setBlock(i + 14, j + 0, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 0, k + 6, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 7, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 8, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 9, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 10, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 11, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 12, Blocks.stained_glass);
		world.setBlock(i + 14, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 0, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 1, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 1, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 1, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 1, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 14, j + 2, k + 18, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 0, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 1, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 1, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 1, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 1, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 2, k + 0, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 2, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 2, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 15, j + 2, k + 18, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 15), (double)(j + 3), (double)(k + 14), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 16, j + 1, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 1, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 2, k + 1, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 2, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 2, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 2, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 2, k + 16, Blockizer.LunarBricks);
		world.setBlock(i + 16, j + 2, k + 17, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 2, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 15, Blockizer.LunarBricks);
		world.setBlock(i + 17, j + 2, k + 16, Blockizer.LunarBricks);
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 17), (double)(j + 4), (double)(k + 5), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		if (!world.isRemote) {
			final EntityZalCitizen var2 = new EntityZalCitizen(world);
			var2.setLocationAndAngles((double)(i + 17), (double)(j + 4), (double)(k + 10), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 18, j + 2, k + 3, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 4, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 5, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 6, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 7, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 8, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 9, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 10, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 11, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 12, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 13, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 14, Blockizer.LunarBricks);
		world.setBlock(i + 18, j + 2, k + 15, Blockizer.LunarBricks);
		return true;
	}
}
