/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.ivnogood.maythings;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.ivnogood.maythings.init.CoolthingsModTabs;
import net.ivnogood.maythings.init.CoolthingsModPotions;
import net.ivnogood.maythings.init.CoolthingsModParticleTypes;
import net.ivnogood.maythings.init.CoolthingsModMobEffects;
import net.ivnogood.maythings.init.CoolthingsModItems;
import net.ivnogood.maythings.init.CoolthingsModFluids;
import net.ivnogood.maythings.init.CoolthingsModFeatures;
import net.ivnogood.maythings.init.CoolthingsModEntities;
import net.ivnogood.maythings.init.CoolthingsModEnchantments;
import net.ivnogood.maythings.init.CoolthingsModBlocks;
import net.ivnogood.maythings.init.CoolthingsModBlockEntities;
import net.ivnogood.maythings.init.CoolthingsModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("coolthings")
public class CoolthingsMod {
	public static final Logger LOGGER = LogManager.getLogger(CoolthingsMod.class);
	public static final String MODID = "coolthings";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public CoolthingsMod() {
		CoolthingsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		CoolthingsModBlocks.REGISTRY.register(bus);
		CoolthingsModItems.REGISTRY.register(bus);
		CoolthingsModEntities.REGISTRY.register(bus);
		CoolthingsModBlockEntities.REGISTRY.register(bus);
		CoolthingsModFeatures.REGISTRY.register(bus);
		CoolthingsModFluids.REGISTRY.register(bus);
		CoolthingsModEnchantments.REGISTRY.register(bus);
		CoolthingsModMobEffects.REGISTRY.register(bus);
		CoolthingsModPotions.REGISTRY.register(bus);
		CoolthingsModBiomes.REGISTRY.register(bus);
		CoolthingsModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
