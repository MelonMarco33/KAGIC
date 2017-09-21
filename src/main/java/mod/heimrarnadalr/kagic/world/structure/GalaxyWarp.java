package mod.heimrarnadalr.kagic.world.structure;

import java.util.Random;

import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GalaxyWarp extends SunkenRuinStructure {

	public GalaxyWarp(String type) {
		super(type, 40, Blocks.STONE.getDefaultState(), true, true);

		this.structures.add("/assets/kagic/structures/GalaxyWarpDamaged.schematic");
		this.structures.add("/assets/kagic/structures/GalaxyWarpPristine.schematic");
		
		this.chestTables.put(new BlockPos(28, 55, 30), LootTables.GALAXY_WARP);

		this.allowedBiomes.add(Biomes.OCEAN);
		this.allowedBiomes.add(Biomes.DEEP_OCEAN);
		this.allowedBiomes.add(Biomes.FROZEN_OCEAN);
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		if (rand.nextInt(1000) != 0) {
			return false;
		}

		return super.generate(world, rand, pos);
	}
}
