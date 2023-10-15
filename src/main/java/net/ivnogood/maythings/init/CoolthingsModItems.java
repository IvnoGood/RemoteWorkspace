
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.ivnogood.maythings.item.WaitcapturerItem;
import net.ivnogood.maythings.item.UndertaleMegalovaniaItem;
import net.ivnogood.maythings.item.UltimatepastaItem;
import net.ivnogood.maythings.item.UltimatebreadItem;
import net.ivnogood.maythings.item.SupertoolItem;
import net.ivnogood.maythings.item.SuperswordItem;
import net.ivnogood.maythings.item.SuperstickItem;
import net.ivnogood.maythings.item.SupershovelItem;
import net.ivnogood.maythings.item.SuperpowderItem;
import net.ivnogood.maythings.item.SuperplateItem;
import net.ivnogood.maythings.item.SuperingotItem;
import net.ivnogood.maythings.item.SuperaxeItem;
import net.ivnogood.maythings.item.SuperarmorItem;
import net.ivnogood.maythings.item.SeedItem;
import net.ivnogood.maythings.item.SansrecipepaperItem;
import net.ivnogood.maythings.item.SansItem;
import net.ivnogood.maythings.item.Rush_E_recipepaperItem;
import net.ivnogood.maythings.item.RushEItem;
import net.ivnogood.maythings.item.PastaItem;
import net.ivnogood.maythings.item.OoftownroadrecipepaperItem;
import net.ivnogood.maythings.item.OoftownroadItem;
import net.ivnogood.maythings.item.MixerheadItem;
import net.ivnogood.maythings.item.MilkItem;
import net.ivnogood.maythings.item.MemorychipItem;
import net.ivnogood.maythings.item.MegalovaniarecipepaperItem;
import net.ivnogood.maythings.item.IronpastaItem;
import net.ivnogood.maythings.item.IronbreadItem;
import net.ivnogood.maythings.item.HarddriveItem;
import net.ivnogood.maythings.item.GunheaderItem;
import net.ivnogood.maythings.item.GoldpastaItem;
import net.ivnogood.maythings.item.GoldbreadItem;
import net.ivnogood.maythings.item.FlourItem;
import net.ivnogood.maythings.item.EmptyybulletItem;
import net.ivnogood.maythings.item.EmptydiskItem;
import net.ivnogood.maythings.item.EmeraldpastaItem;
import net.ivnogood.maythings.item.EmeraldbreadItem;
import net.ivnogood.maythings.item.ElectronicCircuitItem;
import net.ivnogood.maythings.item.DiamondpastaItem;
import net.ivnogood.maythings.item.DiamondbreadItem;
import net.ivnogood.maythings.item.ChargerItem;
import net.ivnogood.maythings.item.ButterstickItem;
import net.ivnogood.maythings.item.BulletItem;
import net.ivnogood.maythings.item.AssaultrifleItem;
import net.ivnogood.maythings.CoolthingsMod;

public class CoolthingsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoolthingsMod.MODID);
	public static final RegistryObject<Item> SUPERBLOCK = block(CoolthingsModBlocks.SUPERBLOCK, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> SUPERINGOT = REGISTRY.register("superingot", () -> new SuperingotItem());
	public static final RegistryObject<Item> SUPERPOWDER = REGISTRY.register("superpowder", () -> new SuperpowderItem());
	public static final RegistryObject<Item> SUPERSWORD = REGISTRY.register("supersword", () -> new SuperswordItem());
	public static final RegistryObject<Item> EGG = REGISTRY.register("egg_spawn_egg",
			() -> new ForgeSpawnEggItem(CoolthingsModEntities.EGG, -1, -16777216, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS)));
	public static final RegistryObject<Item> SUPERSTICK = REGISTRY.register("superstick", () -> new SuperstickItem());
	public static final RegistryObject<Item> SUPERAXE = REGISTRY.register("superaxe", () -> new SuperaxeItem());
	public static final RegistryObject<Item> SUPERTOOL = REGISTRY.register("supertool", () -> new SupertoolItem());
	public static final RegistryObject<Item> SUPERBBLOCK = block(CoolthingsModBlocks.SUPERBBLOCK, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> GENERATIONBLOCK = block(CoolthingsModBlocks.GENERATIONBLOCK, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> PLANTISIDE = block(CoolthingsModBlocks.PLANTISIDE, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> SANS = REGISTRY.register("sans", () -> new SansItem());
	public static final RegistryObject<Item> EMPTYDISK = REGISTRY.register("emptydisk", () -> new EmptydiskItem());
	public static final RegistryObject<Item> MUSICSTATION = block(CoolthingsModBlocks.MUSICSTATION, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> ELECTRONIC_CIRCUIT = REGISTRY.register("electronic_circuit", () -> new ElectronicCircuitItem());
	public static final RegistryObject<Item> MEMORYCHIP = REGISTRY.register("memorychip", () -> new MemorychipItem());
	public static final RegistryObject<Item> SANSRECIPEPAPER = REGISTRY.register("sansrecipepaper", () -> new SansrecipepaperItem());
	public static final RegistryObject<Item> SUPERSHOVEL = REGISTRY.register("supershovel", () -> new SupershovelItem());
	public static final RegistryObject<Item> SUPERARMOR_HELMET = REGISTRY.register("superarmor_helmet", () -> new SuperarmorItem.Helmet());
	public static final RegistryObject<Item> SUPERARMOR_CHESTPLATE = REGISTRY.register("superarmor_chestplate",
			() -> new SuperarmorItem.Chestplate());
	public static final RegistryObject<Item> SUPERARMOR_LEGGINGS = REGISTRY.register("superarmor_leggings", () -> new SuperarmorItem.Leggings());
	public static final RegistryObject<Item> SUPERARMOR_BOOTS = REGISTRY.register("superarmor_boots", () -> new SuperarmorItem.Boots());
	public static final RegistryObject<Item> BUTTERSTICK = REGISTRY.register("butterstick", () -> new ButterstickItem());
	public static final RegistryObject<Item> MILK_BUCKET = REGISTRY.register("milk_bucket", () -> new MilkItem());
	public static final RegistryObject<Item> SUPERPLATE = REGISTRY.register("superplate", () -> new SuperplateItem());
	public static final RegistryObject<Item> CRUSHER = block(CoolthingsModBlocks.CRUSHER, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> FLOUR = REGISTRY.register("flour", () -> new FlourItem());
	public static final RegistryObject<Item> PASTA = REGISTRY.register("pasta", () -> new PastaItem());
	public static final RegistryObject<Item> MIXERBLOCK = block(CoolthingsModBlocks.MIXERBLOCK, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> GOLDPASTA = REGISTRY.register("goldpasta", () -> new GoldpastaItem());
	public static final RegistryObject<Item> DIAMONDPASTA = REGISTRY.register("diamondpasta", () -> new DiamondpastaItem());
	public static final RegistryObject<Item> IRONPASTA = REGISTRY.register("ironpasta", () -> new IronpastaItem());
	public static final RegistryObject<Item> EMERALDPASTA = REGISTRY.register("emeraldpasta", () -> new EmeraldpastaItem());
	public static final RegistryObject<Item> ULTIMATEPASTA = REGISTRY.register("ultimatepasta", () -> new UltimatepastaItem());
	public static final RegistryObject<Item> BREADFURNACEBLOCK = block(CoolthingsModBlocks.BREADFURNACEBLOCK, CoolthingsModTabs.TAB_SUPERFOODS);
	public static final RegistryObject<Item> IRONBREAD = REGISTRY.register("ironbread", () -> new IronbreadItem());
	public static final RegistryObject<Item> GOLDBREAD = REGISTRY.register("goldbread", () -> new GoldbreadItem());
	public static final RegistryObject<Item> DIAMONDBREAD = REGISTRY.register("diamondbread", () -> new DiamondbreadItem());
	public static final RegistryObject<Item> EMERALDBREAD = REGISTRY.register("emeraldbread", () -> new EmeraldbreadItem());
	public static final RegistryObject<Item> ULTIMATEBREAD = REGISTRY.register("ultimatebread", () -> new UltimatebreadItem());
	public static final RegistryObject<Item> MIXERHEAD = REGISTRY.register("mixerhead", () -> new MixerheadItem());
	public static final RegistryObject<Item> OOFTOWNROAD = REGISTRY.register("ooftownroad", () -> new OoftownroadItem());
	public static final RegistryObject<Item> UNDERTALE_MEGALOVANIA = REGISTRY.register("undertale_megalovania", () -> new UndertaleMegalovaniaItem());
	public static final RegistryObject<Item> FJJFFIGHTNT = block(CoolthingsModBlocks.FJJFFIGHTNT, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> CROPFORM_1 = block(CoolthingsModBlocks.CROPFORM_1, null);
	public static final RegistryObject<Item> SUPERCHEST = block(CoolthingsModBlocks.SUPERCHEST, CoolthingsModTabs.TAB_SUPER_THINGS);
	public static final RegistryObject<Item> SEED = REGISTRY.register("seed", () -> new SeedItem());
	public static final RegistryObject<Item> CROPFORM_2 = block(CoolthingsModBlocks.CROPFORM_2, null);
	public static final RegistryObject<Item> CROPFORM_3 = block(CoolthingsModBlocks.CROPFORM_3, null);
	public static final RegistryObject<Item> CROPFORM_4 = block(CoolthingsModBlocks.CROPFORM_4, null);
	public static final RegistryObject<Item> CROPFORM_5 = block(CoolthingsModBlocks.CROPFORM_5, null);
	public static final RegistryObject<Item> HARDDRIVE = REGISTRY.register("harddrive", () -> new HarddriveItem());
	public static final RegistryObject<Item> GUNBULLET = block(CoolthingsModBlocks.GUNBULLET, null);
	public static final RegistryObject<Item> WAITCAPTURER = REGISTRY.register("waitcapturer", () -> new WaitcapturerItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> BULLETCRAFTER = block(CoolthingsModBlocks.BULLETCRAFTER, CoolthingsModTabs.TAB_SUPERGUNS);
	public static final RegistryObject<Item> EMPTYYBULLET = REGISTRY.register("emptyybullet", () -> new EmptyybulletItem());
	public static final RegistryObject<Item> ASSAULTRIFLE = REGISTRY.register("assaultrifle", () -> new AssaultrifleItem());
	public static final RegistryObject<Item> GUNHEADER = REGISTRY.register("gunheader", () -> new GunheaderItem());
	public static final RegistryObject<Item> CHARGER = REGISTRY.register("charger", () -> new ChargerItem());
	public static final RegistryObject<Item> OOFTOWNROADRECIPEPAPER = REGISTRY.register("ooftownroadrecipepaper",
			() -> new OoftownroadrecipepaperItem());
	public static final RegistryObject<Item> MEGALOVANIARECIPEPAPER = REGISTRY.register("megalovaniarecipepaper",
			() -> new MegalovaniarecipepaperItem());
	public static final RegistryObject<Item> RUSH_E = REGISTRY.register("rush_e", () -> new RushEItem());
	public static final RegistryObject<Item> RUSH_E_RECIPEPAPER = REGISTRY.register("rush_e_recipepaper", () -> new Rush_E_recipepaperItem());
	public static final RegistryObject<Item> THEBLACKLION = REGISTRY.register("theblacklion_spawn_egg",
			() -> new ForgeSpawnEggItem(CoolthingsModEntities.THEBLACKLION, -1, -1, new Item.Properties().tab(CoolthingsModTabs.TAB_SUPER_THINGS)));
	public static final RegistryObject<Item> ATM = block(CoolthingsModBlocks.ATM, CoolthingsModTabs.TAB_SUPER_THINGS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
