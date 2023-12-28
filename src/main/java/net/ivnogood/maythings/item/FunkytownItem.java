
package net.ivnogood.maythings.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.ivnogood.maythings.init.CoolthingsModTabs;
import net.ivnogood.maythings.init.CoolthingsModSounds;

public class FunkytownItem extends RecordItem {
	public FunkytownItem() {
		super(0, CoolthingsModSounds.REGISTRY.get(new ResourceLocation("coolthings:funkytown")),
				new Item.Properties().tab(CoolthingsModTabs.TAB_MUSIC).stacksTo(1).rarity(Rarity.RARE));
	}
}
