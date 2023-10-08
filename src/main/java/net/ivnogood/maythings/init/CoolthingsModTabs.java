
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CoolthingsModTabs {
	public static CreativeModeTab TAB_SUPER_THINGS;
	public static CreativeModeTab TAB_SUPERGUNS;
	public static CreativeModeTab TAB_SUPERFOODS;

	public static void load() {
		TAB_SUPER_THINGS = new CreativeModeTab("tabsuper_things") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CoolthingsModBlocks.SUPERBLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SUPERGUNS = new CreativeModeTab("tabsuperguns") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CoolthingsModItems.ASSAULTRIFLE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SUPERFOODS = new CreativeModeTab("tabsuperfoods") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CoolthingsModItems.ULTIMATEBREAD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
