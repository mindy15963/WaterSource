package gloridifice.watersource.common.block.tree;

import gloridifice.watersource.registry.BlockRegistry;
import gloridifice.watersource.registry.FeatureRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;


import javax.annotation.Nullable;
import java.util.Random;

public class CoconutTree extends Tree {
    public static final TreeFeatureConfig COCONUT_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.blockCoconutTreeLog.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.blockCoconutTreeLeaf.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(2).trunkHeight(0).ignoreVines().setSapling((net.minecraftforge.common.IPlantable) BlockRegistry.blockCoconutSapling).build();

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return FeatureRegistry.COCONUT_TREE.withConfiguration(COCONUT_TREE_CONFIG);
    }
}
