
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.ivnogood.maythings.CoolthingsMod;

public class CoolthingsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CoolthingsMod.MODID);
	public static final RegistryObject<Potion> SUPERPOTION_POTION_ITEM = REGISTRY.register("superpotion_potion_item",
			() -> new Potion(new MobEffectInstance(CoolthingsModMobEffects.SUPERPOTION_POTION_ITEM.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> NONEFFECTPOTION_POTION_ITEM = REGISTRY.register("noneffectpotion_potion_item",
			() -> new Potion(new MobEffectInstance(CoolthingsModMobEffects.NONEFFECTPOTION_POTION_ITEM.get(), 3600, 0, false, true)));
}
