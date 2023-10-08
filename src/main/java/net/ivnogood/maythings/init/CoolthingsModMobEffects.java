
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.ivnogood.maythings.potion.SuperpotionMobEffect;
import net.ivnogood.maythings.potion.NoneffectpotionMobEffect;
import net.ivnogood.maythings.CoolthingsMod;

public class CoolthingsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CoolthingsMod.MODID);
	public static final RegistryObject<MobEffect> SUPERPOTION_POTION_ITEM = REGISTRY.register("superpotion_potion_item",
			() -> new SuperpotionMobEffect());
	public static final RegistryObject<MobEffect> NONEFFECTPOTION_POTION_ITEM = REGISTRY.register("noneffectpotion_potion_item",
			() -> new NoneffectpotionMobEffect());
}
