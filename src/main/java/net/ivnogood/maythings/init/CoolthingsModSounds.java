
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoolthingsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("coolthings", "sans"), new SoundEvent(new ResourceLocation("coolthings", "sans")));
		REGISTRY.put(new ResourceLocation("coolthings", "sansundertale"), new SoundEvent(new ResourceLocation("coolthings", "sansundertale")));
		REGISTRY.put(new ResourceLocation("coolthings", "oof_town_road"), new SoundEvent(new ResourceLocation("coolthings", "oof_town_road")));
		REGISTRY.put(new ResourceLocation("coolthings", "megalovania"), new SoundEvent(new ResourceLocation("coolthings", "megalovania")));
		REGISTRY.put(new ResourceLocation("coolthings", "rush_e"), new SoundEvent(new ResourceLocation("coolthings", "rush_e")));
		REGISTRY.put(new ResourceLocation("coolthings", "bip"), new SoundEvent(new ResourceLocation("coolthings", "bip")));
		REGISTRY.put(new ResourceLocation("coolthings", "blender"), new SoundEvent(new ResourceLocation("coolthings", "blender")));
		REGISTRY.put(new ResourceLocation("coolthings", "she_said_no"), new SoundEvent(new ResourceLocation("coolthings", "she_said_no")));
		REGISTRY.put(new ResourceLocation("coolthings", "etre_un_chat"), new SoundEvent(new ResourceLocation("coolthings", "etre_un_chat")));
		REGISTRY.put(new ResourceLocation("coolthings", "funkytown"), new SoundEvent(new ResourceLocation("coolthings", "funkytown")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
