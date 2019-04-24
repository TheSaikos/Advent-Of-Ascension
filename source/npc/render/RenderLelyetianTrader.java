package net.nevermine.npc.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.npc.model.modelLelyetianNPC;

@SideOnly(Side.CLIENT)
public class RenderLelyetianTrader extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelLelyetianNPC model;

	public RenderLelyetianTrader(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelLelyetianNPC)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderLelyetianTrader.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/lelyetianMerchant.png");
	}
}
