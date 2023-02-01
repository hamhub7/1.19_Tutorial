package net.hamhub7.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.hamhub7.tutorialmod.block.ModBlocks;
import net.hamhub7.tutorialmod.item.ModItems;
import net.hamhub7.tutorialmod.painting.ModPaintings;
import net.hamhub7.tutorialmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer
{
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
		ModPaintings.registerPaintings();
	}
}
