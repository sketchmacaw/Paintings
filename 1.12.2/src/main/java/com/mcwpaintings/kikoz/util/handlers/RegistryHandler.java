package com.mcwpaintings.kikoz.util.handlers;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	
	public static void preInitRegistries()
	{
	}

	public static void initRegistries()
	{
		EnumHelper.addArt("green_plant", "green_plant", 16, 16, 112, 0);
		EnumHelper.addArt("lights", "lights", 16, 16, 128, 0);
		EnumHelper.addArt("potted_plant", "potted_plant", 16, 16, 144, 0);
		EnumHelper.addArt("scenery_lava", "scenery_lava", 16, 16, 160, 0);
		EnumHelper.addArt("scenery_lava2", "scenery_lava2", 16, 16, 176, 0);
		EnumHelper.addArt("scenery_tree", "scenery_tree", 16, 16, 0, 16);
		EnumHelper.addArt("scenery_tree2", "scenery_tree2", 16, 16, 16, 16);
		EnumHelper.addArt("scenery_tree3", "scenery_tree3", 16, 16, 32, 16);
		EnumHelper.addArt("scenery_tree4", "scenery_tree4", 16, 16, 48, 16);
		EnumHelper.addArt("bonsai", "bonsai", 16, 16, 64, 16);
		EnumHelper.addArt("cliffs", "cliffs", 16, 16, 80, 16);
		
		EnumHelper.addArt("hawai", "hawai", 32, 16, 96, 16);
		EnumHelper.addArt("lighthouse", "lighthouse", 32, 16, 128, 16);
		EnumHelper.addArt("mountains", "mountains", 32, 16, 160, 16);
		EnumHelper.addArt("bats", "bats", 32, 16, 0, 48);
		EnumHelper.addArt("beach", "beach", 32, 16, 32, 48);
		EnumHelper.addArt("badlands", "badlands", 32, 16, 160, 32);
		EnumHelper.addArt("fox", "fox", 32, 16, 160, 80);
		EnumHelper.addArt("igloo", "igloo", 32, 16, 160, 48);
		EnumHelper.addArt("swamp", "swamp", 32, 16, 160, 96);
		EnumHelper.addArt("smallsakura", "smallsakura", 32, 16, 160, 64);
		EnumHelper.addArt("fall", "fall", 32, 16, 160, 112);
		EnumHelper.addArt("nether", "nether", 32, 16, 96, 96);
		EnumHelper.addArt("desert", "desert", 32, 16, 96, 112);
		
		EnumHelper.addArt("skyblock", "skyblock", 32, 16, 64, 96);
		EnumHelper.addArt("bridge", "bridge", 32, 16, 64, 112);
		EnumHelper.addArt("portal", "portal", 32, 16, 128, 112);
		EnumHelper.addArt("mesa", "mesa", 32, 16, 128, 96);
		
		EnumHelper.addArt("macaw", "macaw", 16, 32, 48, 64);
		EnumHelper.addArt("cactus", "cactus", 16, 32, 32, 64);
		EnumHelper.addArt("plantlong", "plantlong", 16, 32, 192, 192);
		EnumHelper.addArt("puffer", "puffer", 16, 32, 192, 224);
		
		EnumHelper.addArt("panda", "panda", 32, 32, 176, 160);
		EnumHelper.addArt("tundra_mountain", "tundra_mountain", 32, 32, 144, 160);
		EnumHelper.addArt("arctic_night", "arctic_night", 32, 32, 48, 160);
		
		EnumHelper.addArt("sakura", "sakura", 48, 48, 208, 160);
		EnumHelper.addArt("shinto", "shinto", 48, 48, 208, 208);
		EnumHelper.addArt("squid", "squid", 48, 48, 64, 48);
		EnumHelper.addArt("cherry", "cherry", 48, 48, 112, 48);
		
		EnumHelper.addArt("sunset", "sunset", 48, 32, 0, 160);
		EnumHelper.addArt("axolotl", "axolotl", 64, 32, 80, 160);
	}
	
	
	public static void postInitRegistries()
	{
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}