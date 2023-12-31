package net.ivnogood.maythings.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ivnogood.maythings.network.CoolthingsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DimensionidplayerinProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		CoolthingsModVariables.MapVariables.get(world).temperatuure = world.getBiome(new BlockPos(x, y, z)).value().getBaseTemperature() * 100f;
		CoolthingsModVariables.MapVariables.get(world).syncData(world);
	}
}
