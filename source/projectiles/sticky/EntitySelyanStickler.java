package net.nevermine.projectiles.sticky;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.nevermine.fx.circular.GreenCircular;

public class EntitySelyanStickler extends EntityThrowable {
	private float damage;
	float f4;
	private int age;
	private EntityLivingBase entity;

	public EntitySelyanStickler(final World par1World) {
		super(par1World);
		age = 0;
	}

	public EntitySelyanStickler(final World par1World, final EntityPlayer par3EntityPlayer, final float dmg, final EntityLivingBase entityhit) {
		super(par1World, par3EntityPlayer);
		age = 0;
		damage = dmg;
		entity = entityhit;
		setThrowableHeading(0.0, 0.0, 0.0, 0.0f, 0.0f);
	}

	protected float getGravityVelocity() {
		return 0.0f;
	}

	protected void onImpact(final MovingObjectPosition movingobjectposition) {
	}

	public void onUpdate() {
		super.onUpdate();
		++age;
		if (!worldObj.isRemote) {
			if (entity != null) {
				setLocationAndAngles(entity.posX, entity.posY, entity.posZ, 0.0f, 360.0f);
				getThrower().heal(0.03f);
			}
			else {
				worldObj.createExplosion(getThrower(), posX, posY, posZ, 2.0f, false);
				if (!worldObj.isRemote) {
					setDead();
				}
			}
			if (age == 100) {
				worldObj.createExplosion(getThrower(), posX, posY, posZ, 2.0f, false);
				if (!worldObj.isRemote) {
					setDead();
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void onEntityUpdate() {
		super.onEntityUpdate();
		for (int var3 = 0; var3 < 14; ++var3) {
			final GreenCircular var4 = new GreenCircular(worldObj, posX, posY, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var4);
		}
	}
}
