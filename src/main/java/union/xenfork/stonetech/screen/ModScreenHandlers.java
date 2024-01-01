package union.xenfork.stonetech.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

import static union.xenfork.stonetech.StoneTech.MODID;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SoulFurnaceScreenHandler> SOUL_FURNACE_SCREEN_HANDLER =
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(MODID, "soul_melting"),
            new ExtendedScreenHandlerType<>(SoulFurnaceScreenHandler::new));
}
