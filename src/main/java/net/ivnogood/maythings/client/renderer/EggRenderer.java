
package net.ivnogood.maythings.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.ivnogood.maythings.entity.EggEntity;

public class EggRenderer extends MobRenderer<EggEntity, CreeperModel<EggEntity>> {
	public EggRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EggEntity entity) {
		return new ResourceLocation("coolthings:textures/loovobpsojsdbiom.png");
	}
}
