package union.xenfork.stonetech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import union.xenfork.stonetech.block.ModBlocks;

import static union.xenfork.stonetech.StoneTech.MODID;

public class ModItems {
    public static final Item SOUL_FURNACE = new BlockItem(ModBlocks.SOUL_FURNACE, new FabricItemSettings());
    public static final Item SOUL_SANDSTONE = new BlockItem(ModBlocks.SOUL_SANDSTONE, new FabricItemSettings());
    public static final Item CUT_SOUL_SANDSTONE = new BlockItem(ModBlocks.CUT_SOUL_SANDSTONE, new FabricItemSettings());
    public static final Item CHISELED_SOUL_SANDSTONE = new BlockItem(ModBlocks.CHISELED_SOUL_SANDSTONE, new FabricItemSettings());
    public static final Item SMOOTH_SOUL_SANDSTONE = new BlockItem(ModBlocks.SMOOTH_SOUL_SANDSTONE, new FabricItemSettings());
    public static final Item SOUL_SOIL_BRICKS = new BlockItem(ModBlocks.SOUL_SOIL_BRICKS, new FabricItemSettings());

    public static void register() {
        register("soul_furnace", SOUL_FURNACE);
        register("soul_sandstone", SOUL_SANDSTONE);
        register("cut_soul_sandstone", CUT_SOUL_SANDSTONE);
        register("chiseled_soul_sandstone", CHISELED_SOUL_SANDSTONE);
        register("smooth_soul_sandstone", SMOOTH_SOUL_SANDSTONE);
        register("soul_soil_bricks", SOUL_SOIL_BRICKS);
    }

    private static void register(String path, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MODID, path), item);
    }
}
