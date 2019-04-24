package net.nevermine.projectiles.energy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.nevermine.assist.EntityUtil;
import net.nevermine.fx.trail.CyanTrail;
import net.nevermine.fx.trail.WhiteTrail;

public class EntityIonShot extends EntityThrowable {
	private float damage;
	float f4;
	private int age;
	private int knockbackStrength;

	public EntityIonShot(final World par1World) {
		super(par1World);
		age = 0;
	}

	public EntityIonShot(final World par1World, final EntityPlayer par3EntityPlayer, final float dmg, final int knock) {
		super(par1World, par3EntityPlayer);
		age = 0;
		damage = dmg;
		knockbackStrength = knock;
		setThrowableHeading(motionX, motionY, motionZ, 3.0f, 1.0f);
	}

	public EntityIonShot(final World par1World, final double par2, final double par4, final double par6) {
		super(par1World, par2, par4, par6);
		age = 0;
	}

	protected float getGravityVelocity() {
		return 0.0f;
	}

	protected void onImpact(final MovingObjectPosition movingobjectposition) {
		if (movingobjectposition.entityHit != null) {
			EntityUtil.shootEntity(movingobjectposition.entityHit, getThrower(), this, damage);
			f4 = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
			movingobjectposition.entityHit.addVelocity(motionX * knockbackStrength * 0.6000000238418579 / f4, 0.1, motionZ * knockbackStrength * 0.6000000238418579 / f4);
		}

		if (!worldObj.isRemote) {
			setDead();
		}
	}

	public void onUpdate() {
		super.onUpdate();
		if (age == 60) {
			if (!worldObj.isRemote) {
				setDead();
			}
		}
		else {
			++age;
		}
	}

	@SideOnly(Side.CLIENT)
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (worldObj.isRemote) {
			for (int var3 = 0; var3 < 8; ++var3) {
				final CyanTrail var4 = new CyanTrail(worldObj, posX, posY - 2.0, posZ, 0.0, 0.0, 0.0, 8);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var4);
				final CyanTrail var5 = new CyanTrail(worldObj, posX, posY + 2.0, posZ, 0.0, 0.0, 0.0, 8);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var5);
				final WhiteTrail var6 = new WhiteTrail(worldObj, posX, posY, posZ, 0.0, 0.0, 0.0, 8);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var6);
			}
		}
	}
}
