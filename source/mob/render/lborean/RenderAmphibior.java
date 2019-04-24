package net.nevermine.mob.render.lborean;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.lborean.modelAmphibior;

@SideOnly(Side.CLIENT)
public class RenderAmphibior extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelAmphibior model;

	public RenderAmphibior(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelAmphibior)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderAmphibior.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/amphibior.png");
	}
}
