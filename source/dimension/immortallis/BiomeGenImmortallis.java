package net.nevermine.dimension.immortallis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import java.awt.*;

public class BiomeGenImmortallis extends BiomeGenBase {
	public BiomeGenImmortallis(final int par1) {
		super(par1);
		setBiomeName("Immortallis");
		topBlock = Blocks.air;
		fillerBlock = Blocks.air;
		rainfall = 0.0f;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		enableSnow = false;
		spawnableCaveCreatureList.clear();
		temperature = 0.0f;
	}

	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(final float par1) {
		return Color.BLUE.getRGB();
	}
}
