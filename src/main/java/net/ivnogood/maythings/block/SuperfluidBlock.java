
package net.ivnogood.maythings.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.ivnogood.maythings.init.CoolthingsModFluids;

public class SuperfluidBlock extends LiquidBlock {
	public SuperfluidBlock() {
		super(() -> (FlowingFluid) CoolthingsModFluids.SUPERFLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
