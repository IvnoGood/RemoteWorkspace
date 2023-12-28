package net.ivnogood.maythings.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.ivnogood.maythings.network.CoolthingsModVariables;
import net.ivnogood.maythings.init.CoolthingsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BullletsrleftDisplayOverlayIngameProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(CoolthingsModItems.BULLET.get()))
				: false) {
			CoolthingsModVariables.bulletsremaining = 1;
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(CoolthingsModItems.ASSAULTRIFLE.get()))
				: false) {
			{
				boolean _setval = true;
				entity.getCapability(CoolthingsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.guninhand = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
