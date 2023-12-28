
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.ivnogood.maythings.enchantment.SmletingEnchantment;
import net.ivnogood.maythings.enchantment.EnchantementEnchantment;
import net.ivnogood.maythings.CoolthingsMod;

public class CoolthingsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CoolthingsMod.MODID);
	public static final RegistryObject<Enchantment> ENCHANTEMENT = REGISTRY.register("enchantement", () -> new EnchantementEnchantment());
	public static final RegistryObject<Enchantment> SMLETING = REGISTRY.register("smleting", () -> new SmletingEnchantment());
}
