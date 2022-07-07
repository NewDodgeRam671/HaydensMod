package net.newdodgeram.haydensmod;

import net.fabricmc.api.ModInitializer;
import net.newdodgeram.haydensmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class HaydensMod implements ModInitializer {
	public static final String MOD_ID = "haydensmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
