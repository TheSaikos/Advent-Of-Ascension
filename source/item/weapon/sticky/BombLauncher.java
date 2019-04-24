package net.nevermine.item.weapon.sticky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.item.weapon.gun.BaseGun;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.projectiles.sticky.EntityStickyBomb;

import java.util.List;

public class BombLauncher extends BaseGun {
	private final float dmg = 10.0f;

	public BombLauncher(final int consumeChance, final String effect, final int uses, final int fireRate, final Item item) {
		super(consumeChance, effect, uses, fireRate, item);
		setCreativeTab(Weaponizer.CannonsTab);
	}

	@Override
	public void fireGun(final World world, final ItemStack stack, final EntityPlayer player, final float multi, boolean consume) {
		player.worldObj.spawnEntityInWorld(new EntityStickyBomb(player.worldObj, player, dmg * multi, 0));
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.ranged", EnumChatFormatting.DARK_RED, Integer.toString((int)dmg)));
		list.add(StringUtil.getColourLocaleString("item.BombLauncher.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getColourLocaleString("item.BombLauncher.desc.2", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getLocaleString("items.description.speed.medium"));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.ammo", EnumChatFormatting.LIGHT_PURPLE, StringUtil.getLocaleString("item.Grenade.name")));
	}
}
