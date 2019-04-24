package net.nevermine.mob.model.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelEnt extends ModelBase {
	ModelRenderer body;
	ModelRenderer leftarmbot;
	ModelRenderer rightlegtop;
	ModelRenderer leftlegtop;
	ModelRenderer rightlegbot;
	ModelRenderer leftlegbot;
	ModelRenderer leftarmtop;
	ModelRenderer rightarmbot;
	ModelRenderer rightarmtop;
	ModelRenderer head1;
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
	ModelRenderer leftarmmid;
	ModelRenderer rightarmmid;
	ModelRenderer head15;
	ModelRenderer head16;
	ModelRenderer head17;
	ModelRenderer head18;
	ModelRenderer head19;
	ModelRenderer head20;
	ModelRenderer head21;
	ModelRenderer head22;
	ModelRenderer head23;
	ModelRenderer head24;
	ModelRenderer head25;
	ModelRenderer head26;
	ModelRenderer head27;

	public modelEnt() {
		textureWidth = 256;
		textureHeight = 64;
		(body = new ModelRenderer(this, 94, 0)).addBox(-6.0f, 0.0f, -3.0f, 12, 16, 6);
		body.setRotationPoint(0.0f, -12.0f, 0.0f);
		body.setTextureSize(256, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leftarmbot = new ModelRenderer(this, 134, 22)).addBox(-2.0f, 10.0f, -3.0f, 6, 12, 6);
		leftarmbot.setRotationPoint(10.0f, -8.0f, 0.0f);
		leftarmbot.setTextureSize(256, 64);
		leftarmbot.mirror = true;
		setRotation(leftarmbot, 0.0f, 0.0f, 0.0f);
		(rightlegtop = new ModelRenderer(this, 72, 1)).addBox(-2.5f, 0.0f, -2.5f, 5, 8, 5);
		rightlegtop.setRotationPoint(-4.0f, 4.0f, 0.0f);
		rightlegtop.setTextureSize(256, 64);
		rightlegtop.mirror = true;
		setRotation(rightlegtop, 0.0f, 0.0f, 0.0f);
		(leftlegtop = new ModelRenderer(this, 72, 1)).addBox(-2.5f, 0.0f, -2.5f, 5, 8, 5);
		leftlegtop.setRotationPoint(4.0f, 4.0f, 0.0f);
		leftlegtop.setTextureSize(256, 64);
		leftlegtop.mirror = true;
		setRotation(leftlegtop, 0.0f, 0.0f, 0.0f);
		(rightlegbot = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 8.0f, -3.0f, 6, 12, 6);
		rightlegbot.setRotationPoint(-4.0f, 4.0f, 0.0f);
		rightlegbot.setTextureSize(256, 64);
		rightlegbot.mirror = true;
		setRotation(rightlegbot, 0.0f, 0.0f, 0.0f);
		(leftlegbot = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 8.0f, -3.0f, 6, 12, 6);
		leftlegbot.setRotationPoint(4.0f, 4.0f, 0.0f);
		leftlegbot.setTextureSize(256, 64);
		leftlegbot.mirror = true;
		setRotation(leftlegbot, 0.0f, 0.0f, 0.0f);
		(leftarmtop = new ModelRenderer(this, 58, 15)).addBox(-4.0f, -5.0f, -3.0f, 8, 3, 6);
		leftarmtop.setRotationPoint(10.0f, -8.0f, 0.0f);
		leftarmtop.setTextureSize(256, 64);
		leftarmtop.mirror = true;
		setRotation(leftarmtop, 0.0f, 0.0f, 0.0f);
		(rightarmbot = new ModelRenderer(this, 134, 22)).addBox(-4.0f, 10.0f, -3.0f, 6, 12, 6);
		rightarmbot.setRotationPoint(-10.0f, -8.0f, 0.0f);
		rightarmbot.setTextureSize(256, 64);
		rightarmbot.mirror = true;
		setRotation(rightarmbot, 0.0f, 0.0f, 0.0f);
		(rightarmtop = new ModelRenderer(this, 26, 16)).addBox(-4.0f, -5.0f, -3.0f, 8, 3, 6);
		rightarmtop.setRotationPoint(-10.0f, -8.0f, 0.0f);
		rightarmtop.setTextureSize(256, 64);
		rightarmtop.mirror = true;
		setRotation(rightarmtop, 0.0f, 0.0f, 0.0f);
		(head1 = new ModelRenderer(this, 38, 0)).addBox(-4.0f, -6.0f, -4.0f, 8, 6, 8);
		head1.setRotationPoint(0.0f, -11.0f, -2.0f);
		head1.setTextureSize(256, 64);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-5.0f, -14.0f, -4.0f, 10, 8, 8);
		head2.setRotationPoint(0.0f, -11.0f, -2.0f);
		head2.setTextureSize(256, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 58, 25)).addBox(0.0f, -22.0f, 10.0f, 12, 6, 5);
		head3.setRotationPoint(0.0f, -11.0f, -2.0f);
		head3.setTextureSize(256, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 95, 31)).addBox(-8.0f, -30.0f, 0.0f, 8, 8, 8);
		head4.setRotationPoint(0.0f, -11.0f, -2.0f);
		head4.setTextureSize(256, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 95, 31)).addBox(0.0f, -30.0f, 0.0f, 8, 8, 8);
		head5.setRotationPoint(0.0f, -11.0f, -2.0f);
		head5.setTextureSize(256, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 90, 48)).addBox(-17.0f, -22.0f, 0.0f, 5, 6, 10);
		head6.setRotationPoint(0.0f, -11.0f, -2.0f);
		head6.setTextureSize(256, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 90, 48)).addBox(-17.0f, -22.0f, -10.0f, 5, 6, 10);
		head7.setRotationPoint(0.0f, -11.0f, -2.0f);
		head7.setTextureSize(256, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 90, 48)).addBox(12.0f, -22.0f, -10.0f, 5, 6, 10);
		head8.setRotationPoint(0.0f, -11.0f, -2.0f);
		head8.setTextureSize(256, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 90, 48)).addBox(12.0f, -22.0f, 0.0f, 5, 6, 10);
		head9.setRotationPoint(0.0f, -11.0f, -2.0f);
		head9.setTextureSize(256, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 0, 36)).addBox(-12.0f, -22.0f, -10.0f, 24, 8, 20);
		head10.setRotationPoint(0.0f, -11.0f, -2.0f);
		head10.setTextureSize(256, 64);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 58, 25)).addBox(-12.0f, -22.0f, 10.0f, 12, 6, 5);
		head11.setRotationPoint(0.0f, -11.0f, -2.0f);
		head11.setTextureSize(256, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 58, 25)).addBox(-12.0f, -22.0f, -15.0f, 12, 6, 5);
		head12.setRotationPoint(0.0f, -11.0f, -2.0f);
		head12.setTextureSize(256, 64);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 95, 31)).addBox(0.0f, -30.0f, -8.0f, 8, 8, 8);
		head13.setRotationPoint(0.0f, -11.0f, -2.0f);
		head13.setTextureSize(256, 64);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 95, 31)).addBox(-8.0f, -30.0f, -8.0f, 8, 8, 8);
		head14.setRotationPoint(0.0f, -11.0f, -2.0f);
		head14.setTextureSize(256, 64);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(leftarmmid = new ModelRenderer(this, 134, 2)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftarmmid.setRotationPoint(10.0f, -8.0f, 0.0f);
		leftarmmid.setTextureSize(256, 64);
		leftarmmid.mirror = true;
		setRotation(leftarmmid, 0.0f, 0.0f, 0.0f);
		(rightarmmid = new ModelRenderer(this, 134, 2)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightarmmid.setRotationPoint(-10.0f, -8.0f, 0.0f);
		rightarmmid.setTextureSize(256, 64);
		rightarmmid.mirror = true;
		setRotation(rightarmmid, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 58, 25)).addBox(0.0f, -22.0f, -15.0f, 12, 6, 5);
		head15.setRotationPoint(0.0f, -11.0f, -2.0f);
		head15.setTextureSize(256, 64);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 207, 24)).addBox(-12.0f, -16.0f, 10.0f, 0, 20, 5);
		head16.setRotationPoint(0.0f, -11.0f, -2.0f);
		head16.setTextureSize(256, 64);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 160, 1)).addBox(-12.0f, -16.0f, -15.0f, 24, 20, 0);
		head17.setRotationPoint(0.0f, -11.0f, -2.0f);
		head17.setTextureSize(256, 64);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 160, 24)).addBox(-17.0f, -16.0f, -10.0f, 0, 20, 20);
		head18.setRotationPoint(0.0f, -11.0f, -2.0f);
		head18.setTextureSize(256, 64);
		head18.mirror = true;
		setRotation(head18, 0.0f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 160, 1)).addBox(-12.0f, -16.0f, 15.0f, 24, 20, 0);
		head19.setRotationPoint(0.0f, -11.0f, -2.0f);
		head19.setTextureSize(256, 64);
		head19.mirror = true;
		setRotation(head19, 0.0f, 0.0f, 0.0f);
		(head20 = new ModelRenderer(this, 214, 1)).addBox(12.0f, -16.0f, -10.0f, 5, 20, 0);
		head20.setRotationPoint(0.0f, -11.0f, -2.0f);
		head20.setTextureSize(256, 64);
		head20.mirror = true;
		setRotation(head20, 0.0f, 0.0f, 0.0f);
		(head21 = new ModelRenderer(this, 214, 1)).addBox(12.0f, -16.0f, 10.0f, 5, 20, 0);
		head21.setRotationPoint(0.0f, -11.0f, -2.0f);
		head21.setTextureSize(256, 64);
		head21.mirror = true;
		setRotation(head21, 0.0f, 0.0f, 0.0f);
		(head22 = new ModelRenderer(this, 214, 1)).addBox(-17.0f, -16.0f, 10.0f, 5, 20, 0);
		head22.setRotationPoint(0.0f, -11.0f, -2.0f);
		head22.setTextureSize(256, 64);
		head22.mirror = true;
		setRotation(head22, 0.0f, 0.0f, 0.0f);
		(head23 = new ModelRenderer(this, 214, 1)).addBox(-17.0f, -16.0f, -10.0f, 5, 20, 0);
		head23.setRotationPoint(0.0f, -11.0f, -2.0f);
		head23.setTextureSize(256, 64);
		head23.mirror = true;
		setRotation(head23, 0.0f, 0.0f, 0.0f);
		(head24 = new ModelRenderer(this, 160, 24)).addBox(17.0f, -16.0f, -10.0f, 0, 20, 20);
		head24.setRotationPoint(0.0f, -11.0f, -2.0f);
		head24.setTextureSize(256, 64);
		head24.mirror = true;
		setRotation(head24, 0.0f, 0.0f, 0.0f);
		(head25 = new ModelRenderer(this, 207, 24)).addBox(-12.0f, -16.0f, -15.0f, 0, 20, 5);
		head25.setRotationPoint(0.0f, -11.0f, -2.0f);
		head25.setTextureSize(256, 64);
		head25.mirror = true;
		setRotation(head25, 0.0f, 0.0f, 0.0f);
		(head26 = new ModelRenderer(this, 207, 24)).addBox(12.0f, -16.0f, 10.0f, 0, 20, 5);
		head26.setRotationPoint(0.0f, -11.0f, -2.0f);
		head26.setTextureSize(256, 64);
		head26.mirror = true;
		setRotation(head26, 0.0f, 0.0f, 0.0f);
		(head27 = new ModelRenderer(this, 207, 24)).addBox(12.0f, -16.0f, -15.0f, 0, 20, 5);
		head27.setRotationPoint(0.0f, -11.0f, -2.0f);
		head27.setTextureSize(256, 64);
		head27.mirror = true;
		setRotation(head27, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		leftarmbot.render(par7);
		rightlegtop.render(par7);
		leftlegtop.render(par7);
		rightlegbot.render(par7);
		leftlegbot.render(par7);
		leftarmtop.render(par7);
		rightarmbot.render(par7);
		rightarmtop.render(par7);
		head1.render(par7);
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
		leftarmmid.render(par7);
		rightarmmid.render(par7);
		head15.render(par7);
		head16.render(par7);
		head17.render(par7);
		head18.render(par7);
		head19.render(par7);
		head20.render(par7);
		head21.render(par7);
		head22.render(par7);
		head23.render(par7);
		head24.render(par7);
		head25.render(par7);
		head26.render(par7);
		head27.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head1.rotateAngleY = par4 / 57.295776f;
		head1.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		head3.rotateAngleY = par4 / 57.295776f;
		head3.rotateAngleX = par5 / 54.11268f;
		head4.rotateAngleY = par4 / 57.295776f;
		head4.rotateAngleX = par5 / 54.11268f;
		head5.rotateAngleY = par4 / 57.295776f;
		head5.rotateAngleX = par5 / 54.11268f;
		head6.rotateAngleY = par4 / 57.295776f;
		head6.rotateAngleX = par5 / 54.11268f;
		head7.rotateAngleY = par4 / 57.295776f;
		head7.rotateAngleX = par5 / 54.11268f;
		head8.rotateAngleY = par4 / 57.295776f;
		head8.rotateAngleX = par5 / 54.11268f;
		head9.rotateAngleY = par4 / 57.295776f;
		head9.rotateAngleX = par5 / 54.11268f;
		head10.rotateAngleY = par4 / 57.295776f;
		head10.rotateAngleX = par5 / 54.11268f;
		head11.rotateAngleY = par4 / 57.295776f;
		head11.rotateAngleX = par5 / 54.11268f;
		head12.rotateAngleY = par4 / 57.295776f;
		head12.rotateAngleX = par5 / 54.11268f;
		head13.rotateAngleY = par4 / 57.295776f;
		head13.rotateAngleX = par5 / 54.11268f;
		head14.rotateAngleY = par4 / 57.295776f;
		head14.rotateAngleX = par5 / 54.11268f;
		head15.rotateAngleY = par4 / 57.295776f;
		head15.rotateAngleX = par5 / 54.11268f;
		head16.rotateAngleY = par4 / 57.295776f;
		head16.rotateAngleX = par5 / 54.11268f;
		head17.rotateAngleY = par4 / 57.295776f;
		head17.rotateAngleX = par5 / 54.11268f;
		head18.rotateAngleY = par4 / 57.295776f;
		head18.rotateAngleX = par5 / 54.11268f;
		head19.rotateAngleY = par4 / 57.295776f;
		head19.rotateAngleX = par5 / 54.11268f;
		head20.rotateAngleY = par4 / 57.295776f;
		head20.rotateAngleX = par5 / 54.11268f;
		head21.rotateAngleY = par4 / 57.295776f;
		head21.rotateAngleX = par5 / 54.11268f;
		head22.rotateAngleY = par4 / 57.295776f;
		head22.rotateAngleX = par5 / 54.11268f;
		head23.rotateAngleY = par4 / 57.295776f;
		head23.rotateAngleX = par5 / 54.11268f;
		head24.rotateAngleY = par4 / 57.295776f;
		head24.rotateAngleX = par5 / 54.11268f;
		head25.rotateAngleY = par4 / 57.295776f;
		head25.rotateAngleX = par5 / 54.11268f;
		head26.rotateAngleY = par4 / 57.295776f;
		head26.rotateAngleX = par5 / 54.11268f;
		head27.rotateAngleY = par4 / 57.295776f;
		head27.rotateAngleX = par5 / 54.11268f;
		rightarmtop.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarmtop.rotateAngleZ = 0.0f;
		rightarmbot.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarmbot.rotateAngleZ = 0.0f;
		rightarmmid.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarmmid.rotateAngleZ = 0.0f;
		leftarmtop.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarmtop.rotateAngleZ = 0.0f;
		leftarmbot.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarmbot.rotateAngleZ = 0.0f;
		leftarmmid.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarmmid.rotateAngleZ = 0.0f;
		rightlegtop.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightlegtop.rotateAngleY = 0.0f;
		rightlegbot.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightlegbot.rotateAngleY = 0.0f;
		leftlegbot.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftlegtop.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
