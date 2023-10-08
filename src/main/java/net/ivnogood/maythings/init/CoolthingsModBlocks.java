
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ivnogood.maythings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.ivnogood.maythings.block.UltimatedimensionPortalBlock;
import net.ivnogood.maythings.block.SuperfluidBlock;
import net.ivnogood.maythings.block.SuperchestBlock;
import net.ivnogood.maythings.block.SuperblockBlock;
import net.ivnogood.maythings.block.SuperbblockBlock;
import net.ivnogood.maythings.block.PlantisideBlock;
import net.ivnogood.maythings.block.MusicstationBlock;
import net.ivnogood.maythings.block.MixerblockBlock;
import net.ivnogood.maythings.block.MilkBlock;
import net.ivnogood.maythings.block.GunbulletBlock;
import net.ivnogood.maythings.block.GenerationblockBlock;
import net.ivnogood.maythings.block.FjjffightntBlock;
import net.ivnogood.maythings.block.CrusherBlock;
import net.ivnogood.maythings.block.Cropform5Block;
import net.ivnogood.maythings.block.Cropform4Block;
import net.ivnogood.maythings.block.Cropform3Block;
import net.ivnogood.maythings.block.Cropform2Block;
import net.ivnogood.maythings.block.Cropform1Block;
import net.ivnogood.maythings.block.BulletcrafterBlock;
import net.ivnogood.maythings.block.BreadfurnaceblockBlock;
import net.ivnogood.maythings.CoolthingsMod;

public class CoolthingsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoolthingsMod.MODID);
	public static final RegistryObject<Block> SUPERBLOCK = REGISTRY.register("superblock", () -> new SuperblockBlock());
	public static final RegistryObject<Block> SUPERBBLOCK = REGISTRY.register("superbblock", () -> new SuperbblockBlock());
	public static final RegistryObject<Block> GENERATIONBLOCK = REGISTRY.register("generationblock", () -> new GenerationblockBlock());
	public static final RegistryObject<Block> ULTIMATEDIMENSION_PORTAL = REGISTRY.register("ultimatedimension_portal",
			() -> new UltimatedimensionPortalBlock());
	public static final RegistryObject<Block> SUPERFLUID = REGISTRY.register("superfluid", () -> new SuperfluidBlock());
	public static final RegistryObject<Block> PLANTISIDE = REGISTRY.register("plantiside", () -> new PlantisideBlock());
	public static final RegistryObject<Block> MUSICSTATION = REGISTRY.register("musicstation", () -> new MusicstationBlock());
	public static final RegistryObject<Block> MILK = REGISTRY.register("milk", () -> new MilkBlock());
	public static final RegistryObject<Block> CRUSHER = REGISTRY.register("crusher", () -> new CrusherBlock());
	public static final RegistryObject<Block> MIXERBLOCK = REGISTRY.register("mixerblock", () -> new MixerblockBlock());
	public static final RegistryObject<Block> BREADFURNACEBLOCK = REGISTRY.register("breadfurnaceblock", () -> new BreadfurnaceblockBlock());
	public static final RegistryObject<Block> FJJFFIGHTNT = REGISTRY.register("fjjffightnt", () -> new FjjffightntBlock());
	public static final RegistryObject<Block> CROPFORM_1 = REGISTRY.register("cropform_1", () -> new Cropform1Block());
	public static final RegistryObject<Block> SUPERCHEST = REGISTRY.register("superchest", () -> new SuperchestBlock());
	public static final RegistryObject<Block> CROPFORM_2 = REGISTRY.register("cropform_2", () -> new Cropform2Block());
	public static final RegistryObject<Block> CROPFORM_3 = REGISTRY.register("cropform_3", () -> new Cropform3Block());
	public static final RegistryObject<Block> CROPFORM_4 = REGISTRY.register("cropform_4", () -> new Cropform4Block());
	public static final RegistryObject<Block> CROPFORM_5 = REGISTRY.register("cropform_5", () -> new Cropform5Block());
	public static final RegistryObject<Block> GUNBULLET = REGISTRY.register("gunbullet", () -> new GunbulletBlock());
	public static final RegistryObject<Block> BULLETCRAFTER = REGISTRY.register("bulletcrafter", () -> new BulletcrafterBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SuperblockBlock.registerRenderLayer();
			PlantisideBlock.registerRenderLayer();
			MusicstationBlock.registerRenderLayer();
			Cropform1Block.registerRenderLayer();
			Cropform2Block.registerRenderLayer();
			Cropform3Block.registerRenderLayer();
			Cropform4Block.registerRenderLayer();
			Cropform5Block.registerRenderLayer();
			GunbulletBlock.registerRenderLayer();
			BulletcrafterBlock.registerRenderLayer();
		}
	}
}
