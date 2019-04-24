package net.nevermine.block.modelblocks.banner;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.block.modelblocks.ModelEternalBlock;

public class TileEntityBanner extends TileEntity {
	public ResourceLocation texture;
	public ModelEternalBlock model;

	public TileEntityBanner() {
	}

	public TileEntityBanner(final ResourceLocation texture, final ModelEternalBlock model) {
		this.model = model;
		this.texture = texture;
	}
}
