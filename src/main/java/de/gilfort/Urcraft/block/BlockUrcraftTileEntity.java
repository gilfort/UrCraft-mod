package de.gilfort.Urcraft.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.gilfort.Urcraft.creativeTabs.CreativeTabUrcraft;
import de.gilfort.Urcraft.reference.Reference;

public abstract class BlockUrcraftTileEntity extends BlockContainer {

	public BlockUrcraftTileEntity(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabUrcraft.URCRAFT_TAB);
	}

	public BlockUrcraftTileEntity() {
		super(Material.wood);
		this.setCreativeTab(CreativeTabUrcraft.URCRAFT_TAB);
	}

	public String getUnlocalizedName() {

		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s",
				getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
