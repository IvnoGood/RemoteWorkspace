
package net.ivnogood.maythings.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.ivnogood.maythings.init.CoolthingsModTabs;
import net.ivnogood.maythings.init.CoolthingsModSounds;

public class UndertaleMegalovaniaItem extends RecordItem {
	public UndertaleMegalovaniaItem() {
		super(0, CoolthingsModSounds.REGISTRY.get(new ResourceLocation("coolthings:megalovania")),
				new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS).stacksTo(1).rarity(Rarity.RARE));
	}
}
