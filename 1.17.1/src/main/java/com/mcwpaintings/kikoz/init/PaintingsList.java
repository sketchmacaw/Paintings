package com.mcwpaintings.kikoz.init;

import com.mcwpaintings.kikoz.MacawsPaintings;


import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class PaintingsList {

		
	public static final DeferredRegister<Motive> PAINTING_TYPES = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, MacawsPaintings.MOD_ID);
	
	
	 // SIRKA - VYSKA
	public static final RegistryObject<Motive> BONSAI = PAINTING_TYPES.register("bonsai", () -> new Motive(16,16));
	public static final RegistryObject<Motive> CLIFFS = PAINTING_TYPES.register("cliffs", () -> new Motive(16,16));
	public static final RegistryObject<Motive> LIGHTS = PAINTING_TYPES.register("lights", () -> new Motive(16,16));
	public static final RegistryObject<Motive> SCENERY_LAVA = PAINTING_TYPES.register("scenery_lava", () -> new Motive(16,16));
	public static final RegistryObject<Motive> SCENERY_LAVA2 = PAINTING_TYPES.register("scenery_lava2", () -> new Motive(16,16));
	public static final RegistryObject<Motive> SCENERY_TREE = PAINTING_TYPES.register("scenery_tree", () -> new Motive(16,16));
	
	public static final RegistryObject<Motive> CACTI = PAINTING_TYPES.register("cacti", () -> new Motive(16,32));
	public static final RegistryObject<Motive> PUFFER_LIFE = PAINTING_TYPES.register("puffer_life", () -> new Motive(16,32));
	public static final RegistryObject<Motive> MACAW = PAINTING_TYPES.register("macaw", () -> new Motive(16,32));
	
	public static final RegistryObject<Motive> BADLANDS = PAINTING_TYPES.register("badlands", () -> new Motive(32,16));
	public static final RegistryObject<Motive> FOX = PAINTING_TYPES.register("fox", () -> new Motive(32,16));
	public static final RegistryObject<Motive> BATS = PAINTING_TYPES.register("bats", () -> new Motive(32,16));
	public static final RegistryObject<Motive> CACTI_DESERT = PAINTING_TYPES.register("cacti_desert", () -> new Motive(32,16));
	public static final RegistryObject<Motive> HALLOWEEN_PUMPKIN = PAINTING_TYPES.register("halloween_pumpkin", () -> new Motive(32,16));
	public static final RegistryObject<Motive> MOUNTAINS = PAINTING_TYPES.register("mountains", () -> new Motive(32,16));
	public static final RegistryObject<Motive> SAKURA = PAINTING_TYPES.register("sakura", () -> new Motive(32,16));
	public static final RegistryObject<Motive> SWAMP_LAND = PAINTING_TYPES.register("swamp_land", () -> new Motive(32,16));
	public static final RegistryObject<Motive> WARPED_FOREST = PAINTING_TYPES.register("warped_forest", () -> new Motive(32,16));
	
	public static final RegistryObject<Motive> PANDA = PAINTING_TYPES.register("panda", () -> new Motive(32,32));
	
	public static final RegistryObject<Motive> SUNSET_FOREST = PAINTING_TYPES.register("sunset_forest", () -> new Motive(48,32));
	
	public static final RegistryObject<Motive> CHERRY_TREE = PAINTING_TYPES.register("cherry_tree", () -> new Motive(48,48));
	public static final RegistryObject<Motive> GLOW_SQUID = PAINTING_TYPES.register("glow_squid", () -> new Motive(48,48));
	public static final RegistryObject<Motive> WITHER_ROSE = PAINTING_TYPES.register("wither_rose", () -> new Motive(48,48));
	
	public static final RegistryObject<Motive> AXOLOTLS = PAINTING_TYPES.register("axolotls", () -> new Motive(64,32));
	
	public static final RegistryObject<Motive> HALLOWEEN_HOUSE = PAINTING_TYPES.register("halloween_house", () -> new Motive(64,64));
	
	
	
	public static final RegistryObject<Motive> SCENERY_TREE2 = PAINTING_TYPES.register("scenery_tree2", () -> new Motive(16,16));
	public static final RegistryObject<Motive> SCENERY_TREE3 = PAINTING_TYPES.register("scenery_tree3", () -> new Motive(16,16));
	public static final RegistryObject<Motive> SCENERY_TREE4 = PAINTING_TYPES.register("scenery_tree4", () -> new Motive(16,16));
	
	public static final RegistryObject<Motive> SKYBLOCK = PAINTING_TYPES.register("skyblock", () -> new Motive(48,16));
	public static final RegistryObject<Motive> NETHER_PORTAL = PAINTING_TYPES.register("nether_portal", () -> new Motive(48,16));
	public static final RegistryObject<Motive> SAVANA = PAINTING_TYPES.register("savana", () -> new Motive(48,16));
	public static final RegistryObject<Motive> BRIDGE = PAINTING_TYPES.register("bridge", () -> new Motive(48,16));

	public static final RegistryObject<Motive> BEACH = PAINTING_TYPES.register("beach", () -> new Motive(32,16));
	public static final RegistryObject<Motive> FALL = PAINTING_TYPES.register("fall", () -> new Motive(32,16));
	public static final RegistryObject<Motive> GREEN_PLANT = PAINTING_TYPES.register("green_plant", () -> new Motive(16,16));
	public static final RegistryObject<Motive> HILL = PAINTING_TYPES.register("hill", () -> new Motive(32,48));
	public static final RegistryObject<Motive> IGLOO = PAINTING_TYPES.register("igloo", () -> new Motive(32,16));
	public static final RegistryObject<Motive> LIGHTHOUSE= PAINTING_TYPES.register("lighthouse", () -> new Motive(32,16));
	public static final RegistryObject<Motive> MAGNOLIA = PAINTING_TYPES.register("magnolia", () -> new Motive(48,48));
	public static final RegistryObject<Motive> POTTED_PLANT = PAINTING_TYPES.register("potted_plant", () -> new Motive(16,16));
	public static final RegistryObject<Motive> SHINTO = PAINTING_TYPES.register("shinto", () -> new Motive(48,48));
	public static final RegistryObject<Motive> SNAKE_PLANT = PAINTING_TYPES.register("snake_plant", () -> new Motive(16,32));
	public static final RegistryObject<Motive> MOUNTAIN = PAINTING_TYPES.register("mountain", () -> new Motive(32,32));
	public static final RegistryObject<Motive> ARCTIC_SKY = PAINTING_TYPES.register("arctic_sky", () -> new Motive(32,32));
	public static final RegistryObject<Motive> ISLAND = PAINTING_TYPES.register("island", () -> new Motive(32,16));
	
}
