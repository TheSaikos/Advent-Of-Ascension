package net.nevermine.mob.model.nether;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelEmbrake extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer body2;
	ModelRenderer leg1p2;
	ModelRenderer leg2p2;
	ModelRenderer leg4p2;
	ModelRenderer leg3p2;
	ModelRenderer leg1p3;
	ModelRenderer leg2p3;
	ModelRenderer leg4p3;
	ModelRenderer leg3p3;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;

	public modelEmbrake() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 28, 16)).addBox(-4.0f, 2.0f, -6.0f, 8, 2, 9);
		head.setRotationPoint(0.0f, 11.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 14, 28)).addBox(-3.0f, -7.0f, -1.0f, 6, 14, 2);
		body.setRotationPoint(0.0f, 9.0f, 2.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 1, 31)).addBox(0.0f, 6.0f, -5.0f, 1, 2, 3);
		leg1.setRotationPoint(-3.0f, 16.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 1, 31)).addBox(2.0f, 6.0f, -5.0f, 1, 2, 3);
		leg2.setRotationPoint(3.0f, 16.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 1, 31)).addBox(0.0f, 6.0f, -6.0f, 1, 2, 3);
		leg3.setRotationPoint(-3.0f, 16.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 1, 31)).addBox(2.0f, 6.0f, -6.0f, 1, 2, 3);
		leg4.setRotationPoint(3.0f, 16.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -5.0f, -6.0f, 4, 2, 9);
		head2.setRotationPoint(0.0f, 11.0f, -8.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 28, 1)).addBox(-4.0f, -3.0f, -6.0f, 8, 4, 9);
		head3.setRotationPoint(0.0f, 11.0f, -8.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 17, 14)).addBox(3.5f, -9.0f, -4.0f, 1, 9, 3);
		body2.setRotationPoint(2.0f, 14.0f, 4.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, -0.6981317f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 8, 4);
		leg1p2.setRotationPoint(-3.0f, 16.0f, 7.0f);
		leg1p2.setTextureSize(64, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 8, 4);
		leg2p2.setRotationPoint(3.0f, 16.0f, 7.0f);
		leg2p2.setTextureSize(64, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 8, 4);
		leg4p2.setRotationPoint(3.0f, 16.0f, -5.0f);
		leg4p2.setTextureSize(64, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 8, 4);
		leg3p2.setRotationPoint(-3.0f, 16.0f, -5.0f);
		leg3p2.setTextureSize(64, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 1, 31)).addBox(-3.0f, 6.0f, -5.0f, 1, 2, 3);
		leg1p3.setRotationPoint(-3.0f, 16.0f, 7.0f);
		leg1p3.setTextureSize(64, 64);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 1, 31)).addBox(-1.0f, 6.0f, -5.0f, 1, 2, 3);
		leg2p3.setRotationPoint(3.0f, 16.0f, 7.0f);
		leg2p3.setTextureSize(64, 64);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 1, 31)).addBox(-1.0f, 6.0f, -6.0f, 1, 2, 3);
		leg4p3.setRotationPoint(3.0f, 16.0f, -5.0f);
		leg4p3.setTextureSize(64, 64);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 1, 31)).addBox(-3.0f, 6.0f, -6.0f, 1, 2, 3);
		leg3p3.setRotationPoint(-3.0f, 16.0f, -5.0f);
		leg3p3.setTextureSize(64, 64);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 26, 40)).addBox(-6.0f, -10.0f, -7.0f, 12, 17, 6);
		body3.setRotationPoint(0.0f, 9.0f, 2.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 1.570796f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 1, 48)).addBox(-4.5f, -9.0f, -5.0f, 5, 9, 6);
		body4.setRotationPoint(2.0f, 14.0f, 8.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, -0.8551081f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 17, 14)).addBox(3.5f, -9.0f, -4.0f, 1, 9, 3);
		body5.setRotationPoint(2.0f, 14.0f, -3.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, -0.6981317f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 17, 14)).addBox(-8.5f, -9.0f, -4.0f, 1, 9, 3);
		body6.setRotationPoint(2.0f, 14.0f, 4.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, -0.6981317f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 17, 14)).addBox(-8.5f, -9.0f, -4.0f, 1, 9, 3);
		body7.setRotationPoint(2.0f, 14.0f, -3.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, -0.6981317f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		head2.render(par7);
		head3.render(par7);
		body2.render(par7);
		leg1p2.render(par7);
		leg2p2.render(par7);
		leg4p2.render(par7);
		leg3p2.render(par7);
		leg1p3.render(par7);
		leg2p3.render(par7);
		leg4p3.render(par7);
		leg3p3.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p2.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p2.rotateAngleY = 0.0f;
		leg1p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p3.rotateAngleY = 0.0f;
		leg3p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
