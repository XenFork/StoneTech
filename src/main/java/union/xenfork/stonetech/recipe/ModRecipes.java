package union.xenfork.stonetech.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static union.xenfork.stonetech.StoneTech.MODID;

public class ModRecipes {
    public static void register() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MODID, SoulSmeltingRecipe.Serializer.ID),
            SoulSmeltingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(MODID, SoulSmeltingRecipe.Type.ID),
            SoulSmeltingRecipe.Type.INSTANCE);
    }
}
