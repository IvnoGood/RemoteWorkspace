
package net.ivnogood.maythings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.ivnogood.maythings.init.CoolthingsModTabs;
import net.ivnogood.maythings.init.CoolthingsModFluids;

public class MilkItem extends BucketItem {
	public MilkItem() {
		super(CoolthingsModFluids.MILK,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CoolthingsModTabs.TAB_SUPER_THINGS));
	}
}
