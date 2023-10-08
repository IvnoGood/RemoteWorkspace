
package net.ivnogood.maythings.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.ivnogood.maythings.init.CoolthingsModItems;
import net.ivnogood.maythings.init.CoolthingsModFluids;
import net.ivnogood.maythings.init.CoolthingsModBlocks;

public abstract class MilkFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CoolthingsModFluids.MILK,
			CoolthingsModFluids.FLOWING_MILK, FluidAttributes
					.builder(new ResourceLocation("coolthings:blocks/milkstill"), new ResourceLocation("coolthings:blocks/milkmove")).luminosity(20)

	).explosionResistance(100f)

			.bucket(CoolthingsModItems.MILK_BUCKET).block(() -> (LiquidBlock) CoolthingsModBlocks.MILK.get());

	private MilkFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MilkFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MilkFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
