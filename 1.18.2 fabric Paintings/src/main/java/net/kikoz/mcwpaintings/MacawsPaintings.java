package net.kikoz.mcwpaintings;

import net.fabricmc.api.ModInitializer;
import net.kikoz.mcwpaintings.init.PaintingsList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacawsPaintings implements ModInitializer {

	public static final String MOD_ID = "mcwpaintings";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		PaintingsList.registerPaintings();
	}
}
