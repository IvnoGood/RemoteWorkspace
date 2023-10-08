
package net.ivnogood.maythings.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.ivnogood.maythings.entity.TheblacklionEntity;

public class TheblacklionRenderer extends MobRenderer<TheblacklionEntity, CreeperModel<TheblacklionEntity>> {
	public TheblacklionRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheblacklionEntity entity) {
		return new ResourceLocation("coolthings:textures/1f5b7c79f134c549.png");
	}
}
