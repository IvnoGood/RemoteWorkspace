
package net.ivnogood.maythings.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.ivnogood.maythings.init.CoolthingsModTabs;

public class IronbreadItem extends Item {
	public IronbreadItem() {
		super(new Item.Properties().tab(CoolthingsModTabs.TAB_SUPERFOODS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
