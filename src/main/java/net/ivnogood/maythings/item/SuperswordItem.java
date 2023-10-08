
package net.ivnogood.maythings.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.ivnogood.maythings.init.CoolthingsModTabs;
import net.ivnogood.maythings.init.CoolthingsModBlocks;

public class SuperswordItem extends SwordItem {
	public SuperswordItem() {
		super(new Tier() {
			public int getUses() {
				return 15;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CoolthingsModBlocks.SUPERBLOCK.get()));
			}
		}, 3, 6f, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS));
	}
}
