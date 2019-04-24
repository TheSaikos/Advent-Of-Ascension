package net.nevermine.mob.model.voxponds;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelExoid extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;

	public modelExoid() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 26, 13)).addBox(4.0f, -8.0f, -6.0f, 1, 8, 7);
		head.setRotationPoint(0.0f, -4.0f, 2.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 19, 54)).addBox(-1.0f, -3.0f, -1.0f, 2, 3, 2);
		body.setRotationPoint(0.0f, 0.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 43, 29)).addBox(-3.0f, -2.0f, -2.0f, 3, 12, 3);
		rightarm.setRotationPoint(-4.0f, 2.0f, 0.0f);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 43, 29)).addBox(0.0f, -2.0f, -2.0f, 3, 12, 3);
		leftarm.setRotationPoint(4.0f, 2.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 42)).addBox(-2.0f, 0.0f, -2.0f, 3, 12, 3);
		rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 42)).addBox(-1.0f, 0.0f, -2.0f, 3, 12, 3);
		leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 29)).addBox(-5.0f, 0.0f, -6.0f, 10, 1, 7);
		head2.setRotationPoint(0.0f, -4.0f, 2.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 44, 13)).addBox(-5.0f, -8.0f, -6.0f, 1, 8, 7);
		head3.setRotationPoint(0.0f, -4.0f, 2.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 5);
		head4.setRotationPoint(0.0f, -4.0f, 2.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 29, 0)).addBox(-5.0f, -9.0f, -6.0f, 10, 1, 7);
		head5.setRotationPoint(0.0f, -4.0f, 2.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 50, 46)).addBox(-2.0f, -20.0f, -1.0f, 4, 15, 2);
		body2.setRotationPoint(2.0f, 3.0f, 4.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, -2.356194f);
		(body3 = new ModelRenderer(this, 32, 55)).addBox(-3.0f, 0.0f, -2.0f, 6, 5, 2);
		body3.setRotationPoint(0.0f, 0.0f, 4.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 50, 46)).addBox(-2.0f, -15.0f, 0.0f, 4, 15, 2);
		body4.setRotationPoint(0.0f, 3.0f, 4.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, -3.141593f);
		(body5 = new ModelRenderer(this, 50, 46)).addBox(-2.0f, -20.0f, -1.0f, 4, 15, 2);
		body5.setRotationPoint(-2.0f, 3.0f, 4.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, -3.926991f);
		(body6 = new ModelRenderer(this, 16, 37)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body6.setRotationPoint(0.0f, 0.0f, 0.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 50, 46)).addBox(-2.0f, -15.0f, -1.0f, 4, 15, 2);
		body7.setRotationPoint(0.0f, 3.0f, 4.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 50, 46)).addBox(-2.0f, -15.0f, -1.0f, 4, 15, 2);
		body8.setRotationPoint(-2.0f, 3.0f, 5.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, -0.7853982f);
		(body9 = new ModelRenderer(this, 50, 46)).addBox(-2.0f, -15.0f, -1.0f, 4, 15, 2);
		body9.setRotationPoint(2.0f, 3.0f, 5.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.7853982f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		head3.rotateAngleY = par4 / 57.295776f;
		head3.rotateAngleX = par5 / 54.11268f;
		head4.rotateAngleY = par4 / 57.295776f;
		head4.rotateAngleX = par5 / 54.11268f;
		head5.rotateAngleY = par4 / 57.295776f;
		head5.rotateAngleX = par5 / 54.11268f;
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
