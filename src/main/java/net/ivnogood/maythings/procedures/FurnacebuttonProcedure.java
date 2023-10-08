package net.ivnogood.maythings.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class FurnacebuttonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(1)).getItem()
				: ItemStack.EMPTY).getItem() == Items.COAL
				|| (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == Blocks.COAL_BLOCK.asItem())
				&& (world instanceof Level _lvlCanSmelt
						? _lvlCanSmelt.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer(
										(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
												&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)),
								_lvlCanSmelt).isPresent()
						: false)) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.COAL_BLOCK.asItem()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = ((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(
							RecipeType.SMELTING,
							new SimpleContainer((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)),
							_lvlSmeltResult).isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((entity instanceof ServerPlayer _plrSlotItem
															&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																	? ((Slot) _slt.get(0)).getItem()
																	: ItemStack.EMPTY)),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.COAL);
					_setstack.setCount(8);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(1));
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = ((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(
							RecipeType.SMELTING,
							new SimpleContainer((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)),
							_lvlSmeltResult).isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((entity instanceof ServerPlayer _plrSlotItem
															&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																	? ((Slot) _slt.get(0)).getItem()
																	: ItemStack.EMPTY)),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(1));
			}
		}
	}
}
