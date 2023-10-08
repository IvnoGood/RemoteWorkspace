
package net.ivnogood.maythings.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.ivnogood.maythings.init.CoolthingsModTabs;
import net.ivnogood.maythings.init.CoolthingsModItems;

public abstract class SuperarmorItem extends ArmorItem {
	public SuperarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 8, 10, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CoolthingsModItems.SUPERINGOT.get()));
			}

			@Override
			public String getName() {
				return "superarmor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SuperarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "coolthings:textures/models/armor/superarmor_layer_1.png";
		}
	}

	public static class Chestplate extends SuperarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "coolthings:textures/models/armor/superarmor_layer_1.png";
		}
	}

	public static class Leggings extends SuperarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "coolthings:textures/models/armor/superarmor_layer_2.png";
		}
	}

	public static class Boots extends SuperarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "coolthings:textures/models/armor/superarmor_layer_1.png";
		}
	}
}
