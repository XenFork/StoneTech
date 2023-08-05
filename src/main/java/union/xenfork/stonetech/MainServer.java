package union.xenfork.stonetech;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import union.xenfork.stonetech.block.ModBlocks;
import union.xenfork.stonetech.item.ModItems;
import union.xenfork.stonetech.itemGroup.ModItemGroups;

public class MainServer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final String MODID = "stonetech";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.register();
		ModItems.register();
		ModItemGroups.register();
	}
}