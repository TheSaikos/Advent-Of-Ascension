package net.nevermine.item.tool.pickaxe;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.item.tool.ExtractionTool;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Toolizer;
import net.nevermine.resource.soulpower.soulPowerHelper;

import java.util.List;

public class SoulstonePickaxe extends ItemPickaxe implements ExtractionTool {

	@Override
	public int getLevelReq() {
		return 40;
	}

	public SoulstonePickaxe(final Item.ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setCreativeTab(Toolizer.ToolsTab);
	}

	public boolean onBlockDestroyed(final ItemStack stack, final World world, final Block b, final int x, final int y, final int z, final EntityLivingBase entity) {
		if (b.getBlockHardness(world, x, y, z) != 0.0 && b instanceof BlockOre) {
			if (!world.isRemote && entity instanceof EntityPlayer)
				soulPowerHelper.getProperties((EntityPlayer)entity).regen(500.0f);
		}

		if (!world.isRemote)
			stack.damageItem(1, entity);

		return true;
	}

	public boolean getIsRepairable(final ItemStack par1ItemStack, final ItemStack par2ItemStack) {
		return Itemizer.IngotRosite == par2ItemStack.getItem() || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleString("item.SoulstonePickaxe.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.skillRequirement", EnumChatFormatting.RED, Integer.toString(40), StringUtil.getLocaleString("skills.extraction.name")));
	}
}