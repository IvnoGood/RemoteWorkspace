package net.ivnogood.maythings.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.ivnogood.maythings.network.CoolthingsModVariables;
import net.ivnogood.maythings.init.CoolthingsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BuletsleftProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(CoolthingsModItems.BULLET.get()))
				: false) {
			for (int index0 = 0; index0 < (int) (64); index0++) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CoolthingsModItems.BULLET
						.get()) {
					CoolthingsModVariables.bulletsremaining = CoolthingsModVariables.bulletsremaining + 1;
				} else {
					CoolthingsModVariables.MapVariables.get(world).slotstolookat = CoolthingsModVariables.MapVariables.get(world).slotstolookat + 1;
					CoolthingsModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else {
			CoolthingsModVariables.bulletsremaining = 0;
		}
	}
}
