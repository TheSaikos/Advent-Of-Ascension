package net.nevermine.projectiles.enemy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.nevermine.fx.trail.CyanTrail;
import net.nevermine.fx.trail.WhiteTrail;

public class EntitySpectralShot extends EntityThrowable {
	private float damage;
	private float grav;
	private int age;

	public EntitySpectralShot(final World par1World) {
		super(par1World);
		age = 0;
	}

	public EntitySpectralShot(final World par1World, final EntityMob entityGoblin, final float dmg, final float gravity) {
		super(par1World, entityGoblin);
		age = 0;
		grav = gravity;
		damage = dmg;
	}

	public EntitySpectralShot(final World par1World, final double par2, final double par4, final double par6) {
		super(par1World, par2, par4, par6);
		age = 0;
	}

	protected float getGravityVelocity() {
		return 0.075f;
	}

	protected void onImpact(final MovingObjectPosition movingobjectposition) {
		if (movingobjectposition.entityHit instanceof EntityLivingBase) {
			movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage);
			if (movingobjectposition.entityHit instanceof EntityLivingBase) {
				if (damage == 13.5f) {
					((EntityLivingBase)movingobjectposition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 45, 6));
				}
				else {
					((EntityLivingBase)movingobjectposition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 1));
				}
			}
		}
		if (!worldObj.isRemote) {
			setDead();
		}
	}

	public void onUpdate() {
		super.onUpdate();
		if (age == 40) {
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
		for (int var3 = 0; var3 < 8; ++var3) {
			final CyanTrail var4 = new CyanTrail(worldObj, posX, posY, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var4);
			final WhiteTrail var5 = new WhiteTrail(worldObj, posX, posY + 0.25, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var5);
			final WhiteTrail var6 = new WhiteTrail(worldObj, posX, posY - 0.25, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var6);
		}
	}
}
