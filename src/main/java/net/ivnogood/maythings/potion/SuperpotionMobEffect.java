
package net.ivnogood.maythings.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.ivnogood.maythings.procedures.SuperpotionspecialProcedure;
import net.ivnogood.maythings.procedures.SuperpotionPotionExpiresProcedure;

public class SuperpotionMobEffect extends MobEffect {
	public SuperpotionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.coolthings.superpotion_potion_item";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SuperpotionspecialProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SuperpotionPotionExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
