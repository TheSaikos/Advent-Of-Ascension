package net.nevermine.mob.entity.night.ghostly;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.event.dimensional.overworld.SoulScurryEvent;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.SpecialBlockizer;

public class EntityGhostlySasquatch extends EntityMob {
	public EntityGhostlySasquatch(final World par1World) {
		super(par1World);
		setSize(0.6f, 2f);
	}

	protected String getLivingSound() {
		return "nevermine:SasquatchLiving";
	}

	protected String getDeathSound() {
		return "nevermine:YetiDeath";
	}

	protected String getHurtSound() {
		return "nevermine:YetiHit";
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(3) == 1) {
			dropItem(Itemizer.GhostStone, 4);
		}
		if (rand.nextInt(5) == 3) {
			dropItem(Item.getItemFromBlock(SpecialBlockizer.GhostlyBanner), 1);
		}
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && SoulScurryEvent.isScurry() && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox) && !worldObj.isDaytime();
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.3);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0);
	}
}
