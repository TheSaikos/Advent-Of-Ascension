package net.nevermine.mob.render.precasia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.entity.precasia.EntityTortione;
import net.nevermine.mob.model.precasia.modelTortione;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderTortione extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelTortione model;
	private float scale;

	public RenderTortione(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelTortione)mainModel;
		scale = 2.0f;
	}

	protected void preRenderCallback(final EntityTortione par1EntityMegatherium, final float par2) {
		GL11.glScalef(scale, scale, scale);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderTortione.EntityTexture;
	}

	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		preRenderCallback((EntityTortione)par1EntityLivingBase, par2);
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/tortione.png");
	}
}
