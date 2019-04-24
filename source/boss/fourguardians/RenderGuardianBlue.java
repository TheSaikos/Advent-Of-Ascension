package net.nevermine.boss.fourguardians;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.nevermine.resource.boss.EternalBossStatus;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderGuardianBlue extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelGuardian model;
	private float scale;

	public RenderGuardianBlue(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelGuardian)mainModel;
		scale = 2.0f;
	}

	protected void preRenderCallback(final EntityGuardianBlue par1EntityMegatherium, final float par2) {
		GL11.glScalef(scale, scale, scale);
	}

	public void renderGuardianBlue(final EntityGuardianBlue var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		EternalBossStatus.setBossStatus(var1, true, 8);
		super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRender(final EntityLiving var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		renderGuardianBlue((EntityGuardianBlue)var1, var2, var4, var6, var8, var9);
	}

	public void doRender(final Entity var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		renderGuardianBlue((EntityGuardianBlue)var1, var2, var4, var6, var8, var9);
	}

	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		preRenderCallback((EntityGuardianBlue)par1EntityLivingBase, par2);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderGuardianBlue.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/guardianblue.png");
	}
}
