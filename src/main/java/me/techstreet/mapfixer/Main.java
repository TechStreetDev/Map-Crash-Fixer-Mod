package me.techstreet.mapfixer;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.MapColor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Main implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger(Main.class);

	@Override
	public void onInitialize() {
		/*
			Maps contain an array of bytes that each represent their own colors.

			Minecraft has a limited amount of colors, as a result they have the map color array
			sized to have the appropriate amount of colors.
			However, not every color is used yet. This means some objects stored in the array
			are NULL.

			Because these colors do not exist you should never run into issues.
			However, the issue playing Minecraft right now which causes people to crash is
			due to these colors being sent to the client. Specifically, empty maps seem to all be
			-1... which when deserialized turns out to be ~63rd index in the MapColor array.

			Simply this will replace these null colors with fake colors. This should prevent the crash.
         */
		Arrays.fill(MapColor.COLORS, 62, 64, MapColor.BLUE);
		log(Level.INFO, "Say goodbye to map crashes! \uD83D\uDC4B");
	}


	public static void log(Level level, String message) {
		LOGGER.log(level, "[CBP Mod] " + message);
	}
}
