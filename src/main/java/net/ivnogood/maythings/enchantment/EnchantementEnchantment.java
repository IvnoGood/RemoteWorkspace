
package net.ivnogood.maythings.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.ivnogood.maythings.init.CoolthingsModItems;

public class EnchantementEnchantment extends Enchantment {
	public EnchantementEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == CoolthingsModItems.SUPERTOOL.get())
			return true;
		return false;
	}
}
