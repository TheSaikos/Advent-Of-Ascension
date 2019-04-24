package net.nevermine.npc.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.nevermine.npc.entity.zal.EntityZalLunarade;
import net.nevermine.npc.model.modelZal;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderZalLunarade extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelZal model;
	private float scale;

	public RenderZalLunarade(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		scale = 0.6f;
		model = (modelZal)mainModel;
	}

	protected void preRenderCallback(final EntityZalLunarade par1EntitySlimer, final float par2) {
		GL11.glScalef(scale, scale, scale);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderZalLunarade.EntityTexture;
	}

	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		preRenderCallback((EntityZalLunarade)par1EntityLivingBase, par2);
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/zalChild.png");
	}
}
