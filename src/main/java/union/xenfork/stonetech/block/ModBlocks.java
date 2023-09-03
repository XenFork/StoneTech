package union.xenfork.stonetech.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;
import static union.xenfork.stonetech.StoneTech.MODID;

public class ModBlocks {
    public static final SoulFurnaceBlock SOUL_FURNACE = new SoulFurnaceBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(3.5f).luminance(createLightLevelFromLitBlockState(9)));
    public static final Block SOUL_SANDSTONE = new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.8f));
    public static final Block CUT_SOUL_SANDSTONE = new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.8f));
    public static final Block CHISELED_SOUL_SANDSTONE = new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.8f));
    public static final Block SMOOTH_SOUL_SANDSTONE = new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.8f));
    public static final Block SOUL_SOIL_BRICKS = new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.5f));

    public static void register() {
        register("soul_furnace", SOUL_FURNACE);
        register("soul_sandstone", SOUL_SANDSTONE);
        register("cut_soul_sandstone", CUT_SOUL_SANDSTONE);
        register("chiseled_soul_sandstone", CHISELED_SOUL_SANDSTONE);
        register("smooth_soul_sandstone", SMOOTH_SOUL_SANDSTONE);
        register("soul_soil_bricks", SOUL_SOIL_BRICKS);
    }

    private static void register(String path, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MODID, path), block);
    }
}
