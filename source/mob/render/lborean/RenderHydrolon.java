package net.nevermine.mob.render.lborean;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.entity.lborean.EntityHydrolon;
import net.nevermine.mob.model.lborean.modelCoralon;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderHydrolon extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelCoralon model;
	private float scale;

	public RenderHydrolon(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelCoralon)mainModel;
		scale = 1.5f;
	}

	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		preRenderCallback((EntityHydrolon)par1EntityLivingBase, par2);
	}

	protected void preRenderCallback(final EntityHydrolon par1EntityVoliant, final float par2) {
		GL11.glScalef(scale, scale, scale);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderHydrolon.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/hydrolon.png");
	}
}
