package net.nevermine.block.modelblocks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.nevermine.block.modelblocks.ModelEternalBlock;

public class HiveKingStatue extends ModelBase implements ModelEternalBlock {
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
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
	ModelRenderer body16;
	ModelRenderer body17;
	ModelRenderer body18;
	ModelRenderer body19;
	ModelRenderer body20;
	ModelRenderer body21;
	ModelRenderer body22;
	ModelRenderer body23;

	public HiveKingStatue() {
		textureWidth = 256;
		textureHeight = 32;
		(body = new ModelRenderer(this, 92, 0)).addBox(-8.0f, -6.0f, -9.0f, 18, 6, 4);
		body.setRotationPoint(-1.0f, 14.0f, 8.0f);
		body.setTextureSize(256, 32);
		body.mirror = true;
		setRotation(body, -0.1745329f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 14)).addBox(-4.0f, 0.0f, -2.0f, 6, 12, 6);
		leg1.setRotationPoint(-10.0f, 12.0f, 20.0f);
		leg1.setTextureSize(256, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 14)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		leg2.setRotationPoint(10.0f, 12.0f, 20.0f);
		leg2.setTextureSize(256, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 31, 8)).addBox(-3.0f, 0.0f, -3.0f, 6, 17, 6);
		leg3.setRotationPoint(-12.0f, 7.0f, 1.0f);
		leg3.setTextureSize(256, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 31, 8)).addBox(-3.0f, 0.0f, -3.0f, 6, 17, 6);
		leg4.setRotationPoint(12.0f, 7.0f, 1.0f);
		leg4.setTextureSize(256, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -2.0f, -9.0f, 4, 4, 9);
		head2.setRotationPoint(4.0f, 10.0f, 0.0f);
		head2.setTextureSize(256, 32);
		setRotation(head2, -0.4363323f, 0.0f, 2.268928f);
		head2.mirror = false;
		(head3 = new ModelRenderer(this, 60, 0)).addBox(-1.0f, -7.0f, -14.0f, 2, 2, 9);
		head3.setRotationPoint(4.0f, 10.0f, 0.0f);
		head3.setTextureSize(256, 32);
		head3.mirror = true;
		setRotation(head3, 0.4363323f, 0.0f, 2.268928f);
		head3.mirror = false;
		(head4 = new ModelRenderer(this, 60, 0)).addBox(-1.0f, -7.0f, -14.0f, 2, 2, 9);
		head4.setRotationPoint(0.0f, 6.0f, 0.0f);
		head4.setTextureSize(256, 32);
		head4.mirror = true;
		setRotation(head4, 0.4363323f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 60, 0)).addBox(-1.0f, -7.0f, -14.0f, 2, 2, 9);
		head5.setRotationPoint(-4.0f, 10.0f, 0.0f);
		head5.setTextureSize(256, 32);
		head5.mirror = true;
		setRotation(head5, 0.4363323f, 0.0f, -2.268928f);
		(head6 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -2.0f, -9.0f, 4, 4, 9);
		head6.setRotationPoint(-4.0f, 10.0f, 0.0f);
		head6.setTextureSize(256, 32);
		head6.mirror = true;
		setRotation(head6, -0.4363323f, 0.0f, -2.268928f);
		(head7 = new ModelRenderer(this, 58, 18)).addBox(-4.0f, -4.0f, -3.0f, 2, 2, 4);
		head7.setRotationPoint(-6.0f, 8.0f, 0.0f);
		head7.setTextureSize(256, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -2.0f, -9.0f, 4, 4, 9);
		head8.setRotationPoint(0.0f, 6.0f, 0.0f);
		head8.setTextureSize(256, 32);
		head8.mirror = true;
		setRotation(head8, -0.4363323f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 35, 1)).addBox(-3.0f, -4.0f, -4.0f, 6, 5, 1);
		head9.setRotationPoint(5.0f, 12.0f, 0.0f);
		head9.setTextureSize(256, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 67, 12)).addBox(-7.0f, -4.0f, -3.0f, 5, 2, 4);
		head10.setRotationPoint(0.0f, 4.0f, 0.0f);
		head10.setTextureSize(256, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 67, 12)).addBox(2.0f, -4.0f, -3.0f, 5, 2, 4);
		head11.setRotationPoint(0.0f, 4.0f, 0.0f);
		head11.setTextureSize(256, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 58, 18)).addBox(2.0f, -4.0f, -3.0f, 2, 2, 4);
		head12.setRotationPoint(6.0f, 8.0f, 0.0f);
		head12.setTextureSize(256, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 89, 16)).addBox(-8.0f, -4.0f, -3.0f, 16, 12, 4);
		head13.setRotationPoint(0.0f, 6.0f, 0.0f);
		head13.setTextureSize(256, 32);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 35, 1)).addBox(-3.0f, -4.0f, -4.0f, 6, 5, 1);
		head14.setRotationPoint(0.0f, 6.0f, 0.0f);
		head14.setTextureSize(256, 32);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 35, 1)).addBox(-3.0f, -4.0f, -4.0f, 6, 5, 1);
		head15.setRotationPoint(-5.0f, 12.0f, 0.0f);
		head15.setTextureSize(256, 32);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(body16 = new ModelRenderer(this, 131, 15)).addBox(2.0f, -6.0f, 6.0f, 5, 2, 5);
		body16.setRotationPoint(0.0f, 14.0f, 8.0f);
		body16.setTextureSize(256, 32);
		body16.mirror = true;
		setRotation(body16, -0.1745329f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 136, 9)).addBox(-8.0f, -4.0f, -7.0f, 16, 4, 18);
		body17.setRotationPoint(0.0f, 14.0f, 8.0f);
		body17.setTextureSize(256, 32);
		body17.mirror = true;
		setRotation(body17, -0.1745329f, 0.0f, 0.0f);
		(body18 = new ModelRenderer(this, 207, 7)).addBox(4.0f, -13.0f, -4.0f, 2, 5, 20);
		body18.setRotationPoint(0.0f, 14.0f, 8.0f);
		body18.setTextureSize(256, 32);
		body18.mirror = true;
		setRotation(body18, 0.3490659f, 0.0f, 0.0f);
		(body19 = new ModelRenderer(this, 131, 15)).addBox(-7.0f, -6.0f, 6.0f, 5, 2, 5);
		body19.setRotationPoint(0.0f, 14.0f, 8.0f);
		body19.setTextureSize(256, 32);
		body19.mirror = true;
		setRotation(body19, -0.1745329f, 0.0f, 0.0f);
		(body20 = new ModelRenderer(this, 136, 9)).addBox(-7.0f, -8.0f, -9.0f, 14, 2, 20);
		body20.setRotationPoint(0.0f, 14.0f, 8.0f);
		body20.setTextureSize(256, 32);
		body20.mirror = true;
		setRotation(body20, -0.1745329f, 0.0f, 0.0f);
		(body21 = new ModelRenderer(this, 207, 7)).addBox(1.0f, -8.0f, 0.0f, 2, 5, 20);
		body21.setRotationPoint(0.0f, 14.0f, 8.0f);
		body21.setTextureSize(256, 32);
		body21.mirror = true;
		setRotation(body21, 0.1745329f, 0.0f, 0.0f);
		(body22 = new ModelRenderer(this, 207, 7)).addBox(-6.0f, -13.0f, -4.0f, 2, 5, 20);
		body22.setRotationPoint(0.0f, 14.0f, 8.0f);
		body22.setTextureSize(256, 32);
		body22.mirror = true;
		setRotation(body22, 0.3490659f, 0.0f, 0.0f);
		(body23 = new ModelRenderer(this, 207, 7)).addBox(-3.0f, -8.0f, 0.0f, 2, 5, 20);
		body23.setRotationPoint(0.0f, 14.0f, 8.0f);
		body23.setTextureSize(256, 32);
		body23.mirror = true;
		setRotation(body23, 0.1745329f, 0.0f, 0.0f);
	}

	public void render(final float par7) {
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
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
		body16.render(par7);
		body17.render(par7);
		body18.render(par7);
		body19.render(par7);
		body20.render(par7);
		body21.render(par7);
		body22.render(par7);
		body23.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
