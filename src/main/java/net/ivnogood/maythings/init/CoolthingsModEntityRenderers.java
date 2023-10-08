
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.ivnogood.maythings.client.renderer.TheblacklionRenderer;
import net.ivnogood.maythings.client.renderer.EggRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CoolthingsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CoolthingsModEntities.EGG.get(), EggRenderer::new);
		event.registerEntityRenderer(CoolthingsModEntities.WAITCAPTURER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CoolthingsModEntities.ASSAULTRIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CoolthingsModEntities.THEBLACKLION.get(), TheblacklionRenderer::new);
	}
}
