package net.nevermine.mob.entity.barathos;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.SpecialBlockizer;

import java.util.List;

public class EntityTorano extends EntityMob {
	public EntityTorano(final World par1World) {
		super(par1World);
		setSize(0.7f, 1.4f);
	}

	protected String getLivingSound() {
		return "nevermine:ToranoLiving";
	}

	protected String getDeathSound() {
		return "nevermine:ToranoDeath";
	}

	protected String getHurtSound() {
		return "nevermine:ToranoHit";
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(2) == 0) {
			dropItem(Itemizer.CopperCoin, 4);
		}
		if (rand.nextInt(4) == 3) {
			dropItem(Item.getItemFromBlock(SpecialBlockizer.FragmentBanner), 1);
		}
		if (rand.nextInt(30) == 25) {
			dropItem(Itemizer.RealmstoneFragment2, 1);
		}
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		for (final EntityPlayer e : (List<EntityPlayer>)worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox.expand(7.0, 7.0, 7.0))) {
			if (e.capabilities.isCreativeMode)
				continue;

			e.addVelocity(motionX * 3.5, motionY * 0.5, motionZ * 3.0);
		}
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
	}
}
