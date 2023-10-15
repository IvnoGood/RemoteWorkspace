
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.ivnogood.maythings.client.gui.SupercontainerguiScreen;
import net.ivnogood.maythings.client.gui.MusicstationguiScreen;
import net.ivnogood.maythings.client.gui.MixerScreen;
import net.ivnogood.maythings.client.gui.FurnaceScreen;
import net.ivnogood.maythings.client.gui.CrusherguiScreen;
import net.ivnogood.maythings.client.gui.BulletcrafterguiScreen;
import net.ivnogood.maythings.client.gui.BreadfurnaceScreen;
import net.ivnogood.maythings.client.gui.BlackmarketScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CoolthingsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CoolthingsModMenus.MUSICSTATIONGUI, MusicstationguiScreen::new);
			MenuScreens.register(CoolthingsModMenus.BLACKMARKET, BlackmarketScreen::new);
			MenuScreens.register(CoolthingsModMenus.CRUSHERGUI, CrusherguiScreen::new);
			MenuScreens.register(CoolthingsModMenus.MIXER, MixerScreen::new);
			MenuScreens.register(CoolthingsModMenus.BREADFURNACE, BreadfurnaceScreen::new);
			MenuScreens.register(CoolthingsModMenus.FURNACE, FurnaceScreen::new);
			MenuScreens.register(CoolthingsModMenus.SUPERCONTAINERGUI, SupercontainerguiScreen::new);
			MenuScreens.register(CoolthingsModMenus.BULLETCRAFTERGUI, BulletcrafterguiScreen::new);
		});
	}
}
