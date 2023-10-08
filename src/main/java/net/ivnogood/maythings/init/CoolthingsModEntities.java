
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.ivnogood.maythings.entity.WaitcapturerEntity;
import net.ivnogood.maythings.entity.TheblacklionEntity;
import net.ivnogood.maythings.entity.EggEntity;
import net.ivnogood.maythings.entity.AssaultrifleEntity;
import net.ivnogood.maythings.CoolthingsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoolthingsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CoolthingsMod.MODID);
	public static final RegistryObject<EntityType<EggEntity>> EGG = register("egg",
			EntityType.Builder.<EggEntity>of(EggEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EggEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<WaitcapturerEntity>> WAITCAPTURER = register("projectile_waitcapturer",
			EntityType.Builder.<WaitcapturerEntity>of(WaitcapturerEntity::new, MobCategory.MISC).setCustomClientFactory(WaitcapturerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AssaultrifleEntity>> ASSAULTRIFLE = register("projectile_assaultrifle",
			EntityType.Builder.<AssaultrifleEntity>of(AssaultrifleEntity::new, MobCategory.MISC).setCustomClientFactory(AssaultrifleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TheblacklionEntity>> THEBLACKLION = register("theblacklion",
			EntityType.Builder.<TheblacklionEntity>of(TheblacklionEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheblacklionEntity::new)

					.sized(0.6f, 1.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EggEntity.init();
			TheblacklionEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EGG.get(), EggEntity.createAttributes().build());
		event.put(THEBLACKLION.get(), TheblacklionEntity.createAttributes().build());
	}
}
