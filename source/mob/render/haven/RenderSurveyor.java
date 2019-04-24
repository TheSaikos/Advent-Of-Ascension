package net.nevermine.mob.render.haven;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.entity.haven.EntitySurveyor;
import net.nevermine.mob.model.haven.modelSurveyor;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderSurveyor extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	private float scale;
	protected modelSurveyor model;

	public RenderSurveyor(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelSurveyor)mainModel;
		scale = 2.5f;
	}

	protected void preRenderCallback(final EntitySurveyor par1EntitySurveyor, final float par2) {
		GL11.glScalef(scale, scale, scale);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderSurveyor.EntityTexture;
	}

	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		preRenderCallback((EntitySurveyor)par1EntityLivingBase, par2);
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/surveyor.png");
	}
}
