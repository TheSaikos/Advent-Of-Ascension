package net.nevermine.mob.render.crystevia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.crystevia.modelConstructRange;

@SideOnly(Side.CLIENT)
public class RenderConstructRange extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelConstructRange model;

	public RenderConstructRange(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelConstructRange)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderConstructRange.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/constructRange.png");
	}
}
