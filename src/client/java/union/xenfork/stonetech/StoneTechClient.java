package union.xenfork.stonetech;

import net.fabricmc.api.ClientModInitializer;
import union.xenfork.stonetech.screen.ModScreens;

public class StoneTechClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        ModScreens.register();
	}
}
