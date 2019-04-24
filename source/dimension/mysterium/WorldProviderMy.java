package net.nevermine.dimension.mysterium;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.nevermine.dimension.DimensionOrganizer;
import net.nevermine.izer.Dimensionizer;

public class WorldProviderMy extends WorldProvider {
	public String getDimensionName() {
		return "DimensionMysterium";
	}

	public void registerWorldChunkManager() {
		worldChunkMgr = new WorldChunkManagerHell(DimensionOrganizer.Mysterium, 1.0f);
		dimensionId = Dimensionizer.mysteriumId;
		hasNoSky = true;
	}

	@SideOnly(Side.CLIENT)
	public Vec3 getFogColor(final float par1, final float par2) {
		float f2 = MathHelper.cos(par1 * 3.1415927f * 2.0f) * 2.0f + 0.5f;
		if (f2 < 1.5f) {
			f2 = 1.5f;
		}
		if (f2 > 5.0f) {
			f2 = 5.0f;
		}
		float f3 = 0.7529412f;
		float f4 = 0.84705883f;
		float f5 = 1.0f;
		f3 *= f2 * 0.94f + 0.06f;
		f4 *= f2 * 0.94f + 0.06f;
		f5 *= f2 * 0.91f + 0.09f;
		f3 = 0.214f * f2;
		f4 = 0.221f * f2;
		f5 = 0.53f * f2;
		return Vec3.createVectorHelper((double)f3, (double)f4, (double)f5);
	}

	public boolean doesXZShowFog(final int par1, final int par2) {
		return true;
	}

	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderMysterium(worldObj, worldObj.getSeed());
	}

	public float getCloudHeight() {
		return 128.0f;
	}

	public boolean canRespawnHere() {
		return false;
	}

	public String getSaveFolder() {
		return "Mysterium";
	}

	public boolean isSurfaceWorld() {
		return false;
	}

	public float calculateCelestialAngle(final long var1, final float var3) {
		return 0.05f;
	}
}
