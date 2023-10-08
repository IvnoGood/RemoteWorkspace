
package net.ivnogood.maythings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.ivnogood.maythings.init.CoolthingsModTabs;

public class GoldbreadItem extends Item {
	public GoldbreadItem() {
		super(new Item.Properties().tab(CoolthingsModTabs.TAB_SUPERFOODS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(11.5f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
