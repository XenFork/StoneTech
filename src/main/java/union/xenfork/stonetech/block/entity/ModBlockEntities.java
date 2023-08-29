package union.xenfork.stonetech.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import union.xenfork.stonetech.StoneTech;
import union.xenfork.stonetech.block.ModBlocks;

/**
 * @author squid233
 * @since 1.0.0
 */
public class ModBlockEntities {
    public static final BlockEntityType<SoulFurnaceBlockEntity> SOUL_FURNACE_BLOCK_ENTITY = BlockEntityType.Builder.create(SoulFurnaceBlockEntity::new, ModBlocks.SOUL_FURNACE).build(null);

    private static void register(String name, BlockEntityType<?> type) {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(StoneTech.MODID, name), type);
    }

    public static void register() {
        register("soul_furnace", SOUL_FURNACE_BLOCK_ENTITY);
    }
}
