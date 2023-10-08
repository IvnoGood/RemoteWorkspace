
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.ivnogood.maythings.world.inventory.SupercontainerguiMenu;
import net.ivnogood.maythings.world.inventory.MusicstationguiMenu;
import net.ivnogood.maythings.world.inventory.MixerMenu;
import net.ivnogood.maythings.world.inventory.FurnaceMenu;
import net.ivnogood.maythings.world.inventory.CrusherguiMenu;
import net.ivnogood.maythings.world.inventory.CONTAINERGUIMenu;
import net.ivnogood.maythings.world.inventory.BulletcrafterguiMenu;
import net.ivnogood.maythings.world.inventory.BreadfurnaceMenu;
import net.ivnogood.maythings.world.inventory.BlackmarketMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoolthingsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MusicstationguiMenu> MUSICSTATIONGUI = register("musicstationgui",
			(id, inv, extraData) -> new MusicstationguiMenu(id, inv, extraData));
	public static final MenuType<BlackmarketMenu> BLACKMARKET = register("blackmarket",
			(id, inv, extraData) -> new BlackmarketMenu(id, inv, extraData));
	public static final MenuType<CrusherguiMenu> CRUSHERGUI = register("crushergui", (id, inv, extraData) -> new CrusherguiMenu(id, inv, extraData));
	public static final MenuType<MixerMenu> MIXER = register("mixer", (id, inv, extraData) -> new MixerMenu(id, inv, extraData));
	public static final MenuType<BreadfurnaceMenu> BREADFURNACE = register("breadfurnace",
			(id, inv, extraData) -> new BreadfurnaceMenu(id, inv, extraData));
	public static final MenuType<FurnaceMenu> FURNACE = register("furnace", (id, inv, extraData) -> new FurnaceMenu(id, inv, extraData));
	public static final MenuType<SupercontainerguiMenu> SUPERCONTAINERGUI = register("supercontainergui",
			(id, inv, extraData) -> new SupercontainerguiMenu(id, inv, extraData));
	public static final MenuType<CONTAINERGUIMenu> CONTAINERGUI = register("containergui",
			(id, inv, extraData) -> new CONTAINERGUIMenu(id, inv, extraData));
	public static final MenuType<BulletcrafterguiMenu> BULLETCRAFTERGUI = register("bulletcraftergui",
			(id, inv, extraData) -> new BulletcrafterguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
