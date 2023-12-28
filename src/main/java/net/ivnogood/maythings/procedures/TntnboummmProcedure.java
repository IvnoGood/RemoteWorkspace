package net.ivnogood.maythings.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.ivnogood.maythings.init.CoolthingsModItems;

public class TntnboummmProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.FLINT_AND_STEEL)) : false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(CoolthingsModItems.SUPERPOWDER.get()))
						: false)) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1000, Explosion.BlockInteraction.BREAK);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CoolthingsModItems.SUPERPOWDER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
