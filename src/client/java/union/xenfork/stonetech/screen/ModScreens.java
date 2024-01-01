package union.xenfork.stonetech.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static union.xenfork.stonetech.StoneTech.MODID;

public class ModScreens {
    public static void register() {
        HandledScreens.register(Registry.register(Registries.SCREEN_HANDLER, new Identifier(MODID, "soul_melting"),
            new ExtendedScreenHandlerType<>(SoulFurnaceScreenHandler::new)), SoulFurnaceScreen::new);
    }
}
