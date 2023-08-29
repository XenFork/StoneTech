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

    public static void register() {
        register("soul_furnace", SOUL_FURNACE);
    }

    private static void register(String path, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MODID, path), item);
    }
}
