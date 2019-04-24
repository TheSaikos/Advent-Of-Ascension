package net.nevermine.mob.entity.underground;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.projectiles.enemy.EntityClownShot;

public class EntityClown extends EntityMob implements IRangedAttackMob {
	private static final ItemStack defaultHeldItem;
	private EntityAIArrowAttack aiArrowAttack;

	public EntityClown(final World par1World) {
		super(par1World);
		aiArrowAttack = new EntityAIArrowAttack(this, getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), 20, 60, 15.0f);
		final float moveSpeed = 0.45f;
		tasks.addTask(7, new EntityAIArrowAttack(this, getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), 20, 64.0f));
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIRestrictSun(this));
		tasks.addTask(5, new EntityAIWander(this, (double)moveSpeed));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		setSize(0.6f, 2f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(25) == 6) {
			dropItem(Weaponizer.ConfettiCannon, 1);
		}
		if (rand.nextInt(12) == 3) {
			dropItem(Itemizer.RealmstoneCeleve, 2);
		}
		if (rand.nextInt(15) == 4) {
			dropItem(Itemizer.RealmstoneDeeplands, 2);
		}
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && posY < 50.0 && isValidLightLevel() && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty();
	}

	protected String getLivingSound() {
		return "nevermine:ClownLiving1";
	}

	protected String getDeathSound() {
		return "nevermine:ClownDeath";
	}

	protected String getHurtSound() {
		return "nevermine:ClownHit";
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	protected void entityInit() {
		super.entityInit();
		dataWatcher.addObject(16, new Integer(5));
	}

	public ItemStack getHeldItem() {
		return EntityClown.defaultHeldItem;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
	}

	public boolean isAIEnabled() {
		return true;
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public void attackEntityWithRangedAttack(final EntityLivingBase var1, final float f) {
		final EntityClownShot var2 = new EntityClownShot(worldObj, this, 4.0f, 1);
		final double var3 = var1.posX - posX;
		final double var4 = var1.posY + var1.getEyeHeight() - 1.100000023841858 - var2.posY;
		final double var5 = var1.posZ - posZ;
		final float var6 = MathHelper.sqrt_double(var3 * var3 + var5 * var5) * 0.2f;
		var2.setThrowableHeading(var3, var4 + var6, var5, 1.6f, 12.0f);
		playSound("nevermine:ClownLiving2", 1.0f, 1.0f / (getRNG().nextFloat() * 0.4f + 0.8f));
		worldObj.spawnEntityInWorld(var2);
	}

	static {
		defaultHeldItem = new ItemStack(Weaponizer.ConfettiCannon, 1);
	}
}
