package de.gilfort.Urcraft.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import de.gilfort.Urcraft.reference.Reference;

public class CreativeTabUrcraft {

	public static final CreativeTabs URCRAFT_TAB = new CreativeTabs(
			Reference.MOD_ID_LOWER) {
		@Override
		public Item getTabIconItem() {
			return Items.bowl;
		}
	};

}
