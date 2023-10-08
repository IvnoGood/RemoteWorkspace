package net.ivnogood.maythings.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.ivnogood.maythings.init.CoolthingsModItems;
import net.ivnogood.maythings.init.CoolthingsModBlocks;

public class CropplacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Blocks.FARMLAND == (world.getBlockState(new BlockPos(x, y, z))).getBlock() && CoolthingsModItems.SEED
				.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			world.setBlock(new BlockPos(x, y + 1, z), CoolthingsModBlocks.CROPFORM_1.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CoolthingsModItems.SEED.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
