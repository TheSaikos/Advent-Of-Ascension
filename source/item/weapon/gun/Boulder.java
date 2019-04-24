package net.nevermine.item.weapon.gun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.projectiles.gun.EntityShell;

import java.util.List;

public class Boulder extends BaseGun {
	private final float dmg = 24.0f;

	public Boulder(final int consumeChance, final String effect, final int uses, final int fireRate, final Item item) {
		super(consumeChance, effect, uses, fireRate, item);
		setCreativeTab(Weaponizer.WeaponsTab);
	}

	@Override
	public void fireGun(final World world, final ItemStack stack, final EntityPlayer player, final float multi, boolean consume) {
		player.worldObj.spawnEntityInWorld(new EntityShell(player.worldObj, player, dmg, 0.0f));
		player.worldObj.spawnEntityInWorld(new EntityShell(player.worldObj, player, dmg, 0.025f));
		player.worldObj.spawnEntityInWorld(new EntityShell(player.worldObj, player, dmg, -0.025f));
		player.worldObj.spawnEntityInWorld(new EntityShell(player.worldObj, player, dmg, 0.05f));
		player.worldObj.spawnEntityInWorld(new EntityShell(player.worldObj, player, dmg, -0.05f));
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.ranged", EnumChatFormatting.DARK_RED, Integer.toString((int)dmg)));
		list.add(StringUtil.getColourLocaleString("item.Boulder.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getLocaleString("items.description.knockback.strong"));
		list.add(StringUtil.getLocaleString("items.description.speed.extremelySlow"));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.ammo", EnumChatFormatting.LIGHT_PURPLE, StringUtil.getLocaleString("item.MetalPellet.name")));
	}
}
