package net.nevermine.boss.creep;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelCreep extends ModelBase {
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer body10;
	ModelRenderer body11;
	ModelRenderer body12;
	ModelRenderer body13;
	ModelRenderer body14;
	ModelRenderer body15;
	ModelRenderer body16;
	ModelRenderer body17;
	ModelRenderer body18;
	ModelRenderer rightarm2;
	ModelRenderer leftarm2;
	ModelRenderer leftarm3;
	ModelRenderer rightarm3;
	ModelRenderer leftarm4;
	ModelRenderer rightarm4;
	ModelRenderer leftarm5;
	ModelRenderer rightarm5;
	ModelRenderer leftarm6;
	ModelRenderer rightarm6;
	ModelRenderer head;

	public modelCreep() {
		textureWidth = 64;
		textureHeight = 64;
		(body = new ModelRenderer(this, 45, 5)).addBox(-5.0f, -1.0f, -3.0f, 1, 1, 8);
		body.setRotationPoint(9.0f, -2.0f, -1.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 5, 38)).addBox(0.5f, -9.0f, -9.0f, 1, 1, 1);
		rightarm.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 1.047198f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 5, 45)).addBox(2.5f, -9.0f, -9.0f, 1, 1, 1);
		leftarm.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 1.047198f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 7, 4);
		rightleg.setRotationPoint(-3.0f, 17.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 7, 4);
		leftleg.setRotationPoint(3.0f, 17.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 16)).addBox(-5.0f, 0.0f, -3.0f, 10, 19, 6);
		body2.setRotationPoint(0.0f, -2.0f, 0.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, 4.0f, 1, 8, 1);
		body3.setRotationPoint(9.0f, -2.0f, -1.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, -3.0f, 1, 8, 1);
		body4.setRotationPoint(9.0f, -2.0f, -1.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, -3.0f, 1, 8, 1);
		body5.setRotationPoint(0.0f, -2.0f, -1.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 45, 5)).addBox(-5.0f, -1.0f, -3.0f, 1, 1, 8);
		body6.setRotationPoint(0.0f, -2.0f, -1.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 54, 35)).addBox(0.0f, -1.0f, 5.0f, 1, 1, 4);
		body7.setRotationPoint(2.0f, -3.0f, -1.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 38, 5)).addBox(3.0f, 7.0f, 4.0f, 1, 1, 1);
		body8.setRotationPoint(0.0f, -2.0f, -1.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 40, 48)).addBox(-5.0f, 0.0f, 4.0f, 6, 10, 6);
		body9.setRotationPoint(2.0f, -3.0f, -1.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 40, 45)).addBox(-5.0f, -1.0f, 4.0f, 6, 1, 1);
		body10.setRotationPoint(2.0f, -3.0f, -1.0f);
		body10.setTextureSize(64, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 40, 42)).addBox(-5.0f, -1.0f, 9.0f, 6, 1, 1);
		body11.setRotationPoint(2.0f, -3.0f, -1.0f);
		body11.setTextureSize(64, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 54, 42)).addBox(-5.0f, -1.0f, 5.0f, 1, 1, 4);
		body12.setRotationPoint(2.0f, -3.0f, -1.0f);
		body12.setTextureSize(64, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 33, 5)).addBox(-5.0f, 0.0f, 4.0f, 1, 8, 1);
		body13.setRotationPoint(0.0f, -2.0f, -1.0f);
		body13.setTextureSize(64, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 38, 5)).addBox(3.0f, 1.0f, 4.0f, 1, 1, 1);
		body14.setRotationPoint(0.0f, -2.0f, -1.0f);
		body14.setTextureSize(64, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 38, 5)).addBox(3.0f, 4.0f, 4.0f, 1, 1, 1);
		body15.setRotationPoint(0.0f, -2.0f, -1.0f);
		body15.setTextureSize(64, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
		(body16 = new ModelRenderer(this, 38, 5)).addBox(-4.0f, 7.0f, 4.0f, 1, 1, 1);
		body16.setRotationPoint(0.0f, -2.0f, -1.0f);
		body16.setTextureSize(64, 64);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 38, 5)).addBox(-4.0f, 4.0f, 4.0f, 1, 1, 1);
		body17.setRotationPoint(0.0f, -2.0f, -1.0f);
		body17.setTextureSize(64, 64);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, 0.0f);
		(body18 = new ModelRenderer(this, 38, 5)).addBox(-4.0f, 1.0f, 4.0f, 1, 1, 1);
		body18.setRotationPoint(0.0f, -2.0f, -1.0f);
		body18.setTextureSize(64, 64);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 48, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightarm2.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightarm2.setTextureSize(64, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 48, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftarm2.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftarm2.setTextureSize(64, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 0, 28)).addBox(0.5f, -7.0f, -10.0f, 1, 19, 1);
		leftarm3.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftarm3.setTextureSize(64, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 1.047198f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 0, 28)).addBox(-1.5f, -7.0f, -10.0f, 1, 19, 1);
		rightarm3.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightarm3.setTextureSize(64, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 1.047198f, 0.0f, 0.0f);
		(leftarm4 = new ModelRenderer(this, 0, 57)).addBox(-0.5f, -9.0f, -11.0f, 3, 2, 3);
		leftarm4.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftarm4.setTextureSize(64, 64);
		leftarm4.mirror = true;
		setRotation(leftarm4, 1.047198f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 0, 50)).addBox(-2.5f, -9.0f, -11.0f, 3, 2, 3);
		rightarm4.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightarm4.setTextureSize(64, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 1.047198f, 0.0f, 0.0f);
		(leftarm5 = new ModelRenderer(this, 5, 41)).addBox(-0.5f, -11.0f, -11.0f, 3, 2, 1);
		leftarm5.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftarm5.setTextureSize(64, 64);
		leftarm5.mirror = true;
		setRotation(leftarm5, 1.047198f, 0.0f, 0.0f);
		(rightarm5 = new ModelRenderer(this, 5, 34)).addBox(-2.5f, -11.0f, -11.0f, 3, 2, 1);
		rightarm5.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightarm5.setTextureSize(64, 64);
		rightarm5.mirror = true;
		setRotation(rightarm5, 1.047198f, 0.0f, 0.0f);
		(leftarm6 = new ModelRenderer(this, 5, 45)).addBox(-1.5f, -9.0f, -9.0f, 1, 1, 1);
		leftarm6.setRotationPoint(6.0f, 1.0f, 0.0f);
		leftarm6.setTextureSize(64, 64);
		leftarm6.mirror = true;
		setRotation(leftarm6, 1.047198f, 0.0f, 0.0f);
		(rightarm6 = new ModelRenderer(this, 5, 38)).addBox(-3.5f, -9.0f, -9.0f, 1, 1, 1);
		rightarm6.setRotationPoint(-6.0f, 1.0f, 0.0f);
		rightarm6.setTextureSize(64, 64);
		rightarm6.mirror = true;
		setRotation(rightarm6, 1.047198f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, 4.0f, -6.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		body10.render(par7);
		body11.render(par7);
		body12.render(par7);
		body13.render(par7);
		body14.render(par7);
		body15.render(par7);
		body16.render(par7);
		body17.render(par7);
		body18.render(par7);
		rightarm2.render(par7);
		leftarm2.render(par7);
		leftarm3.render(par7);
		rightarm3.render(par7);
		leftarm4.render(par7);
		rightarm4.render(par7);
		leftarm5.render(par7);
		rightarm5.render(par7);
		leftarm6.render(par7);
		rightarm6.render(par7);
		head.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 1.047f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 1.047f;
		rightarm3.rotateAngleZ = 0.0f;
		rightarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 1.047f;
		rightarm4.rotateAngleZ = 0.0f;
		rightarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 1.047f;
		rightarm5.rotateAngleZ = 0.0f;
		rightarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 1.047f;
		rightarm6.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f + 1.047f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		leftarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f + 1.047f;
		leftarm3.rotateAngleZ = 0.0f;
		leftarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f + 1.047f;
		leftarm4.rotateAngleZ = 0.0f;
		leftarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f + 1.047f;
		leftarm5.rotateAngleZ = 0.0f;
		leftarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f + 1.047f;
		leftarm6.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
