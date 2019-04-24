package net.nevermine.mob.model.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelSpinux extends ModelBase {
	ModelRenderer head;
	ModelRenderer head2;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer head3;
	ModelRenderer body6;
	ModelRenderer leftarm2;
	ModelRenderer rightarm2;

	public modelSpinux() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -8.0f, -4.0f, 6, 8, 8);
		head.setRotationPoint(0.0f, 0.0f, -2.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 16, 33)).addBox(-1.0f, -13.0f, -3.0f, 2, 11, 4);
		head2.setRotationPoint(0.0f, 0.0f, -2.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 40, 11)).addBox(0.0f, -2.0f, -2.0f, 1, 2, 2);
		rightarm.setRotationPoint(-3.0f, 2.0f, 0.0f);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 40, 11)).addBox(-1.0f, -2.0f, -2.0f, 1, 2, 2);
		leftarm.setRotationPoint(3.0f, 2.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 12, 2);
		rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 12, 2);
		leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		body2.setRotationPoint(0.0f, 0.0f, 0.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 16, 33)).addBox(-1.0f, 0.0f, -2.0f, 2, 11, 4);
		body3.setRotationPoint(0.0f, 7.0f, 11.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, -1.22173f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 16, 33)).addBox(-1.0f, 0.0f, -2.0f, 2, 11, 4);
		body4.setRotationPoint(0.0f, -7.0f, 8.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, -0.7853982f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 16, 33)).addBox(-1.0f, -14.0f, -1.0f, 2, 11, 4);
		head3.setRotationPoint(0.0f, 0.0f, -2.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, -0.2617994f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 16, 33)).addBox(-1.0f, -1.0f, -2.0f, 2, 11, 4);
		body6.setRotationPoint(0.0f, 1.0f, 9.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, -1.047198f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 40, 16)).addBox(0.0f, -2.0f, -2.0f, 2, 15, 2);
		leftarm2.setRotationPoint(3.0f, 2.0f, 0.0f);
		leftarm2.setTextureSize(64, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 40, 16)).addBox(-2.0f, -2.0f, -2.0f, 2, 15, 2);
		rightarm2.setRotationPoint(-3.0f, 2.0f, 0.0f);
		rightarm2.setTextureSize(64, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		head2.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		head3.render(par7);
		body6.render(par7);
		leftarm2.render(par7);
		rightarm2.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / (float)(180f / Math.PI);
		head2.rotateAngleY = par4 / (float)(180f / Math.PI);
		head3.rotateAngleY = par4 / (float)(180f / Math.PI);
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
