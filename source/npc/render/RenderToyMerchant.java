package net.nevermine.npc.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.celeve.modelChocko;

@SideOnly(Side.CLIENT)
public class RenderToyMerchant extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelChocko model;

	public RenderToyMerchant(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelChocko)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderToyMerchant.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/toyMerchant.png");
	}
}
