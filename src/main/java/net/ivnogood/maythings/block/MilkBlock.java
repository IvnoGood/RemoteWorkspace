
package net.ivnogood.maythings.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.ivnogood.maythings.init.CoolthingsModFluids;

public class MilkBlock extends LiquidBlock {
	public MilkBlock() {
		super(() -> (FlowingFluid) CoolthingsModFluids.MILK.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
