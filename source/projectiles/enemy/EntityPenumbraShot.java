package net.nevermine.projectiles.enemy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.nevermine.fx.trail.BlackTrail;
import net.nevermine.mob.entity.abyss.EntityApparition;
import net.nevermine.mob.entity.abyss.EntityOcculent;
import net.nevermine.mob.entity.dustopia.EntityBasilisk;
import net.nevermine.mob.entity.dustopia.EntityDevourer;
import net.nevermine.mob.entity.dustopia.EntityStalker;
import net.nevermine.mob.entity.greckon.EntityShifter;
import net.nevermine.mob.entity.nether.EntityHellspot;
import net.nevermine.mob.entity.voxponds.EntityAlarmo;

public class EntityPenumbraShot extends EntityThrowable {
	private float damage;
	private int clr;
	private int age;

	public EntityPenumbraShot(final World par1World) {
		super(par1World);
		age = 0;
	}

	public EntityPenumbraShot(final World par1World, final EntityMob entityGoblin, final float dmg, final int color) {
		super(par1World, entityGoblin);
		age = 0;
		clr = color;
		damage = 4.0f;
	}

	public EntityPenumbraShot(final World par1World, final double par2, final double par4, final double par6) {
		super(par1World, par2, par4, par6);
		age = 0;
	}

	protected float getGravityVelocity() {
		return 0.075f;
	}

	protected void onImpact(final MovingObjectPosition movingobjectposition) {
		if (movingobjectposition.entityHit instanceof EntityLivingBase) {
			movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage);

			EntityMob entity = null;

			switch (rand.nextInt(8)) {
				case 0:
					entity = new EntityOcculent(worldObj);
					break;
				case 1:
					entity = new EntityAlarmo(worldObj);
					break;
				case 2:
					entity = new EntityShifter(worldObj);
					break;
				case 3:
					entity = new EntityDevourer(worldObj);
					break;
				case 4:
					entity = new EntityBasilisk(worldObj);
					break;
				case 5:
					entity = new EntityApparition(worldObj);
					break;
				case 6:
					entity = new EntityStalker(worldObj);
					break;
				case 7:
					entity = new EntityHellspot(worldObj);
					break;
				default:
					break;
			}

			entity.setPosition(posX, posY, posZ);
			worldObj.spawnEntityInWorld(entity);
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
			final BlackTrail var4 = new BlackTrail(worldObj, posX, posY, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var4);
		}
	}
}
