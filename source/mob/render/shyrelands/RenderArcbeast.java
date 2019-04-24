package net.nevermine.mob.render.shyrelands;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.shyrelands.modelArcbeast;

@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
public class RenderArcbeast extends RenderLiving {
	private static final ResourceLocation EntityTexture = new ResourceLocation("nevermine:textures/mobs/arcbeast.png");
	protected modelArcbeast model;

	public RenderArcbeast(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		this.model = ((modelArcbeast)this.mainModel);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return EntityTexture;
	}
}
