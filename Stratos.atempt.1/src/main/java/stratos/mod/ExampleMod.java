package stratos.mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stratos.Items.ModItemGroups;
import stratos.Items.ModItems;
import stratos.block.ModBlocks;


public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "stratos";
    public static final Logger LOGGER = LoggerFactory.getLogger("stratos");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}