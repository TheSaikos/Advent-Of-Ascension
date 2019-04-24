package net.nevermine.mob.model.dustopia;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelCrusilisk extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer leg4p2;
	ModelRenderer leg2p2;
	ModelRenderer leg3p2;
	ModelRenderer leg1p2;
	ModelRenderer leg2p3;
	ModelRenderer leg4p3;
	ModelRenderer leg1p3;
	ModelRenderer leg3p3;
	ModelRenderer leg2p4;
	ModelRenderer leg4p4;
	ModelRenderer leg1p4;
	ModelRenderer leg3p4;
	ModelRenderer body2;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer head8;
	ModelRenderer head9;
	ModelRenderer head10;
	ModelRenderer head11;
	ModelRenderer head12;
	ModelRenderer head13;
	ModelRenderer head14;
	ModelRenderer head15;
	ModelRenderer head16;
	ModelRenderer head18;
	ModelRenderer head17;
	ModelRenderer head30;
	ModelRenderer head19;
	ModelRenderer head20;
	ModelRenderer head21;
	ModelRenderer head22;
	ModelRenderer head23;
	ModelRenderer head24;
	ModelRenderer head25;
	ModelRenderer head26;
	ModelRenderer head27;
	ModelRenderer head28;
	ModelRenderer head29;

	public modelCrusilisk() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 31)).addBox(4.0f, -4.0f, -1.0f, 5, 8, 1);
		head.setRotationPoint(0.0f, 4.0f, -8.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 26, 23)).addBox(-6.0f, -10.0f, -3.0f, 12, 7, 6);
		body.setRotationPoint(0.0f, 5.0f, 2.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 9, 23)).addBox(-3.0f, 7.0f, -2.0f, 1, 5, 1);
		leg1.setRotationPoint(-4.0f, 12.0f, 7.0f);
		leg1.setTextureSize(64, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 9, 23)).addBox(2.0f, 7.0f, -2.0f, 1, 5, 1);
		leg2.setRotationPoint(4.0f, 12.0f, 7.0f);
		leg2.setTextureSize(64, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 9, 23)).addBox(-3.0f, 7.0f, -3.0f, 1, 5, 1);
		leg3.setRotationPoint(-4.0f, 12.0f, -5.0f);
		leg3.setTextureSize(64, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 9, 23)).addBox(2.0f, 7.0f, -3.0f, 1, 5, 1);
		leg4.setRotationPoint(4.0f, 12.0f, -5.0f);
		leg4.setTextureSize(64, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 14, 27)).addBox(2.0f, -6.0f, -1.0f, 1, 3, 1);
		leg4p2.setRotationPoint(4.0f, 12.0f, -5.0f);
		leg4p2.setTextureSize(64, 32);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 14, 27)).addBox(2.0f, -6.0f, 0.0f, 1, 3, 1);
		leg2p2.setRotationPoint(4.0f, 12.0f, 7.0f);
		leg2p2.setTextureSize(64, 32);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 14, 27)).addBox(-3.0f, -6.0f, -1.0f, 1, 3, 1);
		leg3p2.setRotationPoint(-4.0f, 12.0f, -5.0f);
		leg3p2.setTextureSize(64, 32);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 14, 27)).addBox(-3.0f, -6.0f, 0.0f, 1, 3, 1);
		leg1p2.setRotationPoint(-4.0f, 12.0f, 7.0f);
		leg1p2.setTextureSize(64, 32);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 0, 16)).addBox(2.0f, -3.0f, -2.0f, 1, 10, 3);
		leg2p3.setRotationPoint(4.0f, 12.0f, 7.0f);
		leg2p3.setTextureSize(64, 32);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 0, 16)).addBox(2.0f, -3.0f, -3.0f, 1, 10, 3);
		leg4p3.setRotationPoint(4.0f, 12.0f, -5.0f);
		leg4p3.setTextureSize(64, 32);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, -3.0f, -2.0f, 1, 10, 3);
		leg1p3.setRotationPoint(-4.0f, 12.0f, 7.0f);
		leg1p3.setTextureSize(64, 32);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, -3.0f, -3.0f, 1, 10, 3);
		leg3p3.setRotationPoint(-4.0f, 12.0f, -5.0f);
		leg3p3.setTextureSize(64, 32);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(leg2p4 = new ModelRenderer(this, 12, 16)).addBox(2.0f, -8.0f, -2.0f, 1, 5, 1);
		leg2p4.setRotationPoint(4.0f, 12.0f, 7.0f);
		leg2p4.setTextureSize(64, 32);
		leg2p4.mirror = true;
		setRotation(leg2p4, 0.0f, 0.0f, 0.0f);
		(leg4p4 = new ModelRenderer(this, 12, 16)).addBox(2.0f, -8.0f, -3.0f, 1, 5, 1);
		leg4p4.setRotationPoint(4.0f, 12.0f, -5.0f);
		leg4p4.setTextureSize(64, 32);
		leg4p4.mirror = true;
		setRotation(leg4p4, 0.0f, 0.0f, 0.0f);
		(leg1p4 = new ModelRenderer(this, 12, 16)).addBox(-3.0f, -8.0f, -2.0f, 1, 5, 1);
		leg1p4.setRotationPoint(-4.0f, 12.0f, 7.0f);
		leg1p4.setTextureSize(64, 32);
		leg1p4.mirror = true;
		setRotation(leg1p4, 0.0f, 0.0f, 0.0f);
		(leg3p4 = new ModelRenderer(this, 12, 16)).addBox(-3.0f, -8.0f, -3.0f, 1, 5, 1);
		leg3p4.setRotationPoint(-4.0f, 12.0f, -5.0f);
		leg3p4.setTextureSize(64, 32);
		leg3p4.mirror = true;
		setRotation(leg3p4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 30, 0)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 4);
		body2.setRotationPoint(0.0f, 5.0f, 2.0f);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 20, 7)).addBox(-1.0f, 8.0f, -1.0f, 2, 5, 1);
		head2.setRotationPoint(0.0f, 4.0f, -8.0f);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 7, 59)).addBox(-11.0f, -5.0f, -1.0f, 1, 3, 1);
		head3.setRotationPoint(0.0f, 4.0f, -8.0f);
		head3.setTextureSize(64, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 7, 48)).addBox(-1.0f, -13.0f, -1.0f, 2, 9, 1);
		head4.setRotationPoint(0.0f, 4.0f, -8.0f);
		head4.setTextureSize(64, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 20, 1)).addBox(2.0f, 8.0f, -1.0f, 2, 3, 1);
		head5.setRotationPoint(0.0f, 4.0f, -8.0f);
		head5.setTextureSize(64, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 20, 1)).addBox(-4.0f, 8.0f, -1.0f, 2, 3, 1);
		head6.setRotationPoint(0.0f, 4.0f, -8.0f);
		head6.setTextureSize(64, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 14, 47)).addBox(-1.0f, -4.0f, -2.0f, 2, 12, 1);
		head7.setRotationPoint(0.0f, 4.0f, -8.0f);
		head7.setTextureSize(64, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 0, 41)).addBox(-9.0f, -8.0f, -1.0f, 1, 4, 1);
		head8.setRotationPoint(0.0f, 4.0f, -8.0f);
		head8.setTextureSize(64, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 0, 41)).addBox(8.0f, -8.0f, -1.0f, 1, 4, 1);
		head9.setRotationPoint(0.0f, 4.0f, -8.0f);
		head9.setTextureSize(64, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 5, 41)).addBox(5.0f, -9.0f, -1.0f, 2, 5, 1);
		head10.setRotationPoint(0.0f, 4.0f, -8.0f);
		head10.setTextureSize(64, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 5, 41)).addBox(-7.0f, -9.0f, -1.0f, 2, 5, 1);
		head11.setRotationPoint(0.0f, 4.0f, -8.0f);
		head11.setTextureSize(64, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 0, 48)).addBox(-4.0f, -10.0f, -1.0f, 2, 6, 1);
		head12.setRotationPoint(0.0f, 4.0f, -8.0f);
		head12.setTextureSize(64, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 0, 48)).addBox(2.0f, -10.0f, -1.0f, 2, 6, 1);
		head13.setRotationPoint(0.0f, 4.0f, -8.0f);
		head13.setTextureSize(64, 32);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 0, 31)).addBox(-9.0f, -4.0f, -1.0f, 5, 8, 1);
		head14.setRotationPoint(0.0f, 4.0f, -8.0f);
		head14.setTextureSize(64, 32);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 0, 57)).addBox(-11.0f, -2.0f, -1.0f, 2, 1, 1);
		head15.setRotationPoint(0.0f, 4.0f, -8.0f);
		head15.setTextureSize(64, 32);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 0, 57)).addBox(9.0f, -2.0f, -1.0f, 2, 1, 1);
		head16.setRotationPoint(0.0f, 4.0f, -8.0f);
		head16.setTextureSize(64, 32);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 7, 59)).addBox(10.0f, -5.0f, -1.0f, 1, 3, 1);
		head18.setRotationPoint(0.0f, 4.0f, -8.0f);
		head18.setTextureSize(64, 32);
		head18.mirror = true;
		setRotation(head18, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 0, 1)).addBox(-4.0f, -4.0f, -1.0f, 8, 12, 1);
		head17.setRotationPoint(0.0f, 4.0f, -8.0f);
		head17.setTextureSize(64, 32);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
		(head30 = new ModelRenderer(this, 14, 33)).addBox(-4.0f, -4.0f, -2.0f, 1, 12, 1);
		head30.setRotationPoint(0.0f, 4.0f, -8.0f);
		head30.setTextureSize(64, 32);
		head30.mirror = true;
		setRotation(head30, 0.0f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 20, 33)).addBox(-2.0f, 2.0f, -1.5f, 1, 2, 1);
		head19.setRotationPoint(0.0f, 4.0f, -8.0f);
		head19.setTextureSize(64, 32);
		head19.mirror = true;
		setRotation(head19, 0.0f, 0.0f, 0.0f);
		(head20 = new ModelRenderer(this, 14, 33)).addBox(3.0f, -4.0f, -2.0f, 1, 12, 1);
		head20.setRotationPoint(0.0f, 4.0f, -8.0f);
		head20.setTextureSize(64, 32);
		head20.mirror = true;
		setRotation(head20, 0.0f, 0.0f, 0.0f);
		(head21 = new ModelRenderer(this, 20, 33)).addBox(1.0f, 2.0f, -1.5f, 1, 2, 1);
		head21.setRotationPoint(0.0f, 4.0f, -8.0f);
		head21.setTextureSize(64, 32);
		head21.mirror = true;
		setRotation(head21, 0.0f, 0.0f, 0.0f);
		(head22 = new ModelRenderer(this, 20, 33)).addBox(5.0f, -2.0f, -1.5f, 1, 2, 1);
		head22.setRotationPoint(0.0f, 4.0f, -8.0f);
		head22.setTextureSize(64, 32);
		head22.mirror = true;
		setRotation(head22, 0.0f, 0.0f, 0.0f);
		(head23 = new ModelRenderer(this, 20, 33)).addBox(1.0f, -2.0f, -1.5f, 1, 2, 1);
		head23.setRotationPoint(0.0f, 4.0f, -8.0f);
		head23.setTextureSize(64, 32);
		head23.mirror = true;
		setRotation(head23, 0.0f, 0.0f, 0.0f);
		(head24 = new ModelRenderer(this, 20, 33)).addBox(-2.0f, -2.0f, -1.5f, 1, 2, 1);
		head24.setRotationPoint(0.0f, 4.0f, -8.0f);
		head24.setTextureSize(64, 32);
		head24.mirror = true;
		setRotation(head24, 0.0f, 0.0f, 0.0f);
		(head25 = new ModelRenderer(this, 20, 33)).addBox(4.0f, 1.0f, -1.5f, 1, 2, 1);
		head25.setRotationPoint(0.0f, 4.0f, -8.0f);
		head25.setTextureSize(64, 32);
		head25.mirror = true;
		setRotation(head25, 0.0f, 0.0f, 0.0f);
		(head26 = new ModelRenderer(this, 20, 33)).addBox(7.0f, -2.0f, -1.5f, 1, 2, 1);
		head26.setRotationPoint(0.0f, 4.0f, -8.0f);
		head26.setTextureSize(64, 32);
		head26.mirror = true;
		setRotation(head26, 0.0f, 0.0f, 0.0f);
		(head27 = new ModelRenderer(this, 20, 33)).addBox(-6.0f, -2.0f, -1.5f, 1, 2, 1);
		head27.setRotationPoint(0.0f, 4.0f, -8.0f);
		head27.setTextureSize(64, 32);
		head27.mirror = true;
		setRotation(head27, 0.0f, 0.0f, 0.0f);
		(head28 = new ModelRenderer(this, 20, 33)).addBox(-8.0f, -2.0f, -1.5f, 1, 2, 1);
		head28.setRotationPoint(0.0f, 4.0f, -8.0f);
		head28.setTextureSize(64, 32);
		head28.mirror = true;
		setRotation(head28, 0.0f, 0.0f, 0.0f);
		(head29 = new ModelRenderer(this, 20, 33)).addBox(-5.0f, 1.0f, -1.5f, 1, 2, 1);
		head29.setRotationPoint(0.0f, 4.0f, -8.0f);
		head29.setTextureSize(64, 32);
		head29.mirror = true;
		setRotation(head29, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		leg4p2.render(par7);
		leg2p2.render(par7);
		leg3p2.render(par7);
		leg1p2.render(par7);
		leg2p3.render(par7);
		leg4p3.render(par7);
		leg1p3.render(par7);
		leg3p3.render(par7);
		leg2p4.render(par7);
		leg4p4.render(par7);
		leg1p4.render(par7);
		leg3p4.render(par7);
		body2.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		head8.render(par7);
		head9.render(par7);
		head10.render(par7);
		head11.render(par7);
		head12.render(par7);
		head13.render(par7);
		head14.render(par7);
		head15.render(par7);
		head16.render(par7);
		head18.render(par7);
		head17.render(par7);
		head30.render(par7);
		head19.render(par7);
		head20.render(par7);
		head21.render(par7);
		head22.render(par7);
		head23.render(par7);
		head24.render(par7);
		head25.render(par7);
		head26.render(par7);
		head27.render(par7);
		head28.render(par7);
		head29.render(par7);
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
		leg1p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p4.rotateAngleY = 0.0f;
		leg3p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p4.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
