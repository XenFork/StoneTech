package union.xenfork.stonetech.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import union.xenfork.stonetech.StoneTech;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> SOUL = of("soul");
    public static final RegistryKey<ItemGroup> MOD_BLOCKS = of("blocks");

    private static RegistryKey<ItemGroup> of(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(StoneTech.MODID, id));
    }

    private static void register(RegistryKey<ItemGroup> registryKey, ItemConvertible icon, ItemConvertible... items) {
        Registry.register(Registries.ITEM_GROUP, registryKey, FabricItemGroup.builder()
            .displayName(Text.translatable(registryKey.getValue().toTranslationKey("itemGroup")))
            .icon(() -> new ItemStack(icon))
            .entries((displayContext, entries) -> {
                for (ItemConvertible item : items) {
                    entries.add(item);
                }
            })
            .build());
    }

    public static void register() {
        register(SOUL, Blocks.SOUL_LANTERN,
            Items.SOUL_LANTERN,
            Items.SOUL_CAMPFIRE,
            Items.SOUL_TORCH,
            ModItems.SOUL_FURNACE
        );
        register(MOD_BLOCKS, Blocks.BRICKS,
            Blocks.BRICKS
        );
    }
}
