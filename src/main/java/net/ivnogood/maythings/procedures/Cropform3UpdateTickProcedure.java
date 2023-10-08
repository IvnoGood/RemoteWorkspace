package net.ivnogood.maythings.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ivnogood.maythings.init.CoolthingsModBlocks;

public class Cropform3UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), CoolthingsModBlocks.CROPFORM_4.get().defaultBlockState(), 3);
	}
}
