package union.xenfork.stonetech.itemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import union.xenfork.stonetech.item.ModItems;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> SOUL = register("soul");

    public static final RegistryKey<ItemGroup> MOD_BLOCKS = register("blocks");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(id));
    }

    public static void register() {
        Registry<ItemGroup> rg = Registries.ITEM_GROUP;
        Registry.register(rg, SOUL, ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.stonetech.soul"))
                .icon(() -> new ItemStack(Blocks.SOUL_LANTERN))
                .entries((displayContext, entries) -> {
                    entries.add(Items.SOUL_LANTERN);
                    entries.add(Items.SOUL_CAMPFIRE);
                    entries.add(Items.SOUL_TORCH);
                    entries.add(ModItems.SOUL_FURNACE);
                })
                .build());
        Registry.register(rg, MOD_BLOCKS, ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.stonetech.blocks"))
                .icon(() -> new ItemStack(Blocks.BRICKS))
                .entries((displayContext, entries) -> {
                    entries.add(Blocks.BRICKS);
                })
                .build());
    }
}
