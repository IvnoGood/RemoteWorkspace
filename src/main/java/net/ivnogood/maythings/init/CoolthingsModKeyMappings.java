
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.ivnogood.maythings.network.CraftkeyMessage;
import net.ivnogood.maythings.CoolthingsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CoolthingsModKeyMappings {
	public static final KeyMapping CRAFTKEY = new KeyMapping("key.coolthings.craftkey", GLFW.GLFW_KEY_0, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(CRAFTKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == CRAFTKEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						CoolthingsMod.PACKET_HANDLER.sendToServer(new CraftkeyMessage(0, 0));
						CraftkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
