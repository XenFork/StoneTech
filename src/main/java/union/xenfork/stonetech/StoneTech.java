package union.xenfork.stonetech;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import union.xenfork.stonetech.block.ModBlocks;
import union.xenfork.stonetech.block.entity.ModBlockEntities;
import union.xenfork.stonetech.item.ModItems;
import union.xenfork.stonetech.item.ModItemGroups;
import union.xenfork.stonetech.recipe.ModRecipes;

public class StoneTech implements ModInitializer {
    public static final String MODID = "stonetech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModItemGroups.register();
        ModRecipes.register();
	}
}
