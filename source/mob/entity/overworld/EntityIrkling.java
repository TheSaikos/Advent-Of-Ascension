package net.nevermine.mob.entity.overworld;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.event.dimensional.overworld.LunarEvent;
import net.nevermine.izer.Itemizer;

public class EntityIrkling extends EntityMob {
	private int jumpcount;

	public EntityIrkling(final World par1World) {
		super(par1World);
		jumpcount = 1;
		setSize(0.8f, 2.0f);
	}

	protected String getLivingSound() {
		return "nevermine:IrklingLiving";
	}

	protected String getDeathSound() {
		return "nevermine:IrklingHit";
	}

	protected String getHurtSound() {
		return "nevermine:IrklingHit";
	}

	protected void fall(final float par1) {
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 1.0f, 1.0f);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		fallDistance = -0.5f;
		++jumpcount;
		if (jumpcount == 80) {
			motionY = 0.800000011920929;
			if (entityToAttack != null) {
				motionZ = (entityToAttack.posZ - posZ) * 0.0949999988079071;
				motionX = (entityToAttack.posX - posX) * 0.0949999988079071;
			}
			jumpcount = 0;
		}
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && LunarEvent.isLunar() && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.Orbulon, 1);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(135.0);
	}
}
