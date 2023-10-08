
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.ivnogood.maythings.world.features.plants.PlantisideFeature;
import net.ivnogood.maythings.world.features.ores.SuperblockFeature;
import net.ivnogood.maythings.world.features.lakes.SuperfluidFeature;
import net.ivnogood.maythings.world.features.SuperpyramidFeature;
import net.ivnogood.maythings.CoolthingsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CoolthingsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CoolthingsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> SUPERBLOCK = register("superblock", SuperblockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SuperblockFeature.GENERATE_BIOMES, SuperblockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUPERFLUID = register("superfluid", SuperfluidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, SuperfluidFeature.GENERATE_BIOMES, SuperfluidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLANTISIDE = register("plantiside", PlantisideFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PlantisideFeature.GENERATE_BIOMES, PlantisideFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUPERPYRAMID = register("superpyramid", SuperpyramidFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, SuperpyramidFeature.GENERATE_BIOMES, SuperpyramidFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
