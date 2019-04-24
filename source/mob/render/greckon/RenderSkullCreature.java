package net.nevermine.mob.render.greckon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.greckon.modelSkullCreature;

@SideOnly(Side.CLIENT)
public class RenderSkullCreature extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelSkullCreature model;

	public RenderSkullCreature(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelSkullCreature)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderSkullCreature.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/skullcreature.png");
	}
}
