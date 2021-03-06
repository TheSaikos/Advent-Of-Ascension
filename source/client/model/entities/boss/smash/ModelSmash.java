package net.tslat.aoa3.client.model.entities.boss.smash;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSmash extends ModelBase {
	private ModelRenderer headbrace;
	private ModelRenderer bodylower;
	private ModelRenderer rightArm1;
	private ModelRenderer leftArm10;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer rightArm;
	private ModelRenderer leftArm1;
	private ModelRenderer leftArm2;
	private ModelRenderer leftArm3;
	private ModelRenderer leftArm4;
	private ModelRenderer leftArm5;
	private ModelRenderer leftArm6;
	private ModelRenderer leftArm7;
	private ModelRenderer leftArm8;
	private ModelRenderer leftArm9;

	public ModelSmash() {
		textureWidth = 128;
		textureHeight = 32;
		(headbrace = new ModelRenderer(this, 35, 1)).addBox(-5.0f, -1.0f, -5.0f, 10, 2, 10);
		headbrace.setRotationPoint(0.0f, -9.0f, 0.0f);
		headbrace.setTextureSize(128, 32);
		headbrace.mirror = true;
		setRotation(headbrace, 0.0f, 0.0f, 0.0f);
		(bodylower = new ModelRenderer(this, 100, 1)).addBox(-4.0f, 0.0f, -2.0f, 8, 8, 4);
		bodylower.setRotationPoint(0.0f, 4.0f, 0.0f);
		bodylower.setTextureSize(128, 32);
		bodylower.mirror = true;
		setRotation(bodylower, 0.0f, 0.0f, 0.0f);
		(rightArm1 = new ModelRenderer(this, 71, 21)).addBox(-4.0f, -1.0f, -3.0f, 7, 5, 6);
		rightArm1.setRotationPoint(-7.0f, -4.0f, 0.0f);
		rightArm1.setTextureSize(128, 32);
		rightArm1.mirror = true;
		setRotation(rightArm1, 0.0f, 0.0f, 0.0f);
		(leftArm10 = new ModelRenderer(this, 71, 21)).addBox(-3.0f, -1.0f, -3.0f, 7, 5, 6);
		leftArm10.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm10.setTextureSize(128, 32);
		leftArm10.mirror = true;
		setRotation(leftArm10, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 51, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		rightLeg.setRotationPoint(-3.0f, 12.0f, 0.0f);
		rightLeg.setTextureSize(128, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 51, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		leftLeg.setRotationPoint(3.0f, 12.0f, 0.0f);
		leftLeg.setTextureSize(128, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, -9.0f, 0.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 99, 14)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 6);
		body.setRotationPoint(0.0f, -8.0f, -1.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 81, 2)).addBox(-3.0f, 4.0f, -2.0f, 4, 12, 4);
		rightArm.setRotationPoint(-7.0f, -4.0f, 0.0f);
		rightArm.setTextureSize(128, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm1 = new ModelRenderer(this, 4, 21)).addBox(-3.0f, 9.0f, -16.0f, 8, 8, 2);
		leftArm1.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm1.setTextureSize(128, 32);
		leftArm1.mirror = true;
		setRotation(leftArm1, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 81, 2)).addBox(-1.0f, 4.0f, -2.0f, 4, 12, 4);
		leftArm2.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm2.setTextureSize(128, 32);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 39, 17)).addBox(0.0f, 12.0f, -4.0f, 2, 2, 2);
		leftArm3.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm3.setTextureSize(128, 32);
		leftArm3.mirror = true;
		setRotation(leftArm3, 0.0f, 0.0f, 0.0f);
		(leftArm4 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -18.0f, 4, 4, 2);
		leftArm4.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm4.setTextureSize(128, 32);
		leftArm4.mirror = true;
		setRotation(leftArm4, 0.0f, 0.0f, 0.0f);
		(leftArm5 = new ModelRenderer(this, 4, 21)).addBox(-3.0f, 9.0f, -8.0f, 8, 8, 2);
		leftArm5.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm5.setTextureSize(128, 32);
		leftArm5.mirror = true;
		setRotation(leftArm5, 0.0f, 0.0f, 0.0f);
		(leftArm6 = new ModelRenderer(this, 4, 21)).addBox(-3.0f, 9.0f, -12.0f, 8, 8, 2);
		leftArm6.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm6.setTextureSize(128, 32);
		leftArm6.mirror = true;
		setRotation(leftArm6, 0.0f, 0.0f, 0.0f);
		(leftArm7 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -6.0f, 4, 4, 2);
		leftArm7.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm7.setTextureSize(128, 32);
		leftArm7.mirror = true;
		setRotation(leftArm7, 0.0f, 0.0f, 0.0f);
		(leftArm8 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -10.0f, 4, 4, 2);
		leftArm8.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm8.setTextureSize(128, 32);
		leftArm8.mirror = true;
		setRotation(leftArm8, 0.0f, 0.0f, 0.0f);
		(leftArm9 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -14.0f, 4, 4, 2);
		leftArm9.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftArm9.setTextureSize(128, 32);
		leftArm9.mirror = true;
		setRotation(leftArm9, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		headbrace.render(par7);
		bodylower.render(par7);
		rightArm1.render(par7);
		leftArm10.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		head.render(par7);
		body.render(par7);
		rightArm.render(par7);
		leftArm1.render(par7);
		leftArm2.render(par7);
		leftArm3.render(par7);
		leftArm4.render(par7);
		leftArm5.render(par7);
		leftArm6.render(par7);
		leftArm7.render(par7);
		leftArm8.render(par7);
		leftArm9.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		headbrace.rotateAngleY = par4 / 57.295776f;
		headbrace.rotateAngleX = par5 / 54.11268f;
		rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm1.rotateAngleZ = 0.0f;
		leftArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm1.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		leftArm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm3.rotateAngleZ = 0.0f;
		leftArm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm4.rotateAngleZ = 0.0f;
		leftArm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm5.rotateAngleZ = 0.0f;
		leftArm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm6.rotateAngleZ = 0.0f;
		leftArm7.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm7.rotateAngleZ = 0.0f;
		leftArm8.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm8.rotateAngleZ = 0.0f;
		leftArm9.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm9.rotateAngleZ = 0.0f;
		leftArm10.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm10.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
