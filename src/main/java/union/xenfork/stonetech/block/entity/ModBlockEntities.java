package union.xenfork.stonetech.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static union.xenfork.stonetech.StoneTech.MODID;
import static union.xenfork.stonetech.block.ModBlocks.SOUL_FURNACE;

/**
 * @author squid233
 * @since 1.0.0
 */
public class ModBlockEntities {
     public static final BlockEntityType<SoulFurnaceBlockEntity> SOUL_FURNACE_BLOCK_ENTITY =
                Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MODID, "soul_furnace_block_entity"),
                        FabricBlockEntityTypeBuilder.create(SoulFurnaceBlockEntity::new,
                                SOUL_FURNACE).build());
}
