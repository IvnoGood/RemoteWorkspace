
package net.ivnogood.maythings.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.ivnogood.maythings.init.CoolthingsModFluids;
import net.ivnogood.maythings.init.CoolthingsModBlocks;

public abstract class SuperfluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CoolthingsModFluids.SUPERFLUID,
			CoolthingsModFluids.FLOWING_SUPERFLUID, FluidAttributes.builder(new ResourceLocation("coolthings:blocks/fluidstatick"),
					new ResourceLocation("coolthings:blocks/fluinnotstaticjk"))

	).explosionResistance(100f)

			.block(() -> (LiquidBlock) CoolthingsModBlocks.SUPERFLUID.get());

	private SuperfluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SuperfluidFluid {
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

	public static class Flowing extends SuperfluidFluid {
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
