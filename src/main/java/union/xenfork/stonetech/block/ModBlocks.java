package union.xenfork.stonetech.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static union.xenfork.stonetech.MainServer.MODID;

public class ModBlocks {
    public static final SoulFurnace SOUL_FURNACE = new SoulFurnace(FabricBlockSettings.create().hardness(3.5f));
    public static void register() {
        register("soul_frunace", SOUL_FURNACE);
    }

    private static void register(String path, Block block) {
        Registry.register(Registries.BLOCK, Identifier.of(MODID, path), block);
    }
}
