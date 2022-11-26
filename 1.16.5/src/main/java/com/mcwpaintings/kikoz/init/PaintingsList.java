package com.mcwpaintings.kikoz.init;



import com.mcwpaintings.kikoz.MacawsPaintings;

import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PaintingsList {

		
	public static final DeferredRegister<PaintingType> PAINTING_TYPES = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, MacawsPaintings.MOD_ID);
	
	
	 // SIRKA - VYSKA
	public static final RegistryObject<PaintingType> BONSAI = PAINTING_TYPES.register("bonsai", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> CLIFFS = PAINTING_TYPES.register("cliffs", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> LIGHTS = PAINTING_TYPES.register("lights", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> SCENERY_LAVA = PAINTING_TYPES.register("scenery_lava", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> SCENERY_LAVA2 = PAINTING_TYPES.register("scenery_lava2", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> SCENERY_TREE = PAINTING_TYPES.register("scenery_tree", () -> new PaintingType(16,16));
	
	public static final RegistryObject<PaintingType> CACTI = PAINTING_TYPES.register("cacti", () -> new PaintingType(16,32));
	public static final RegistryObject<PaintingType> PUFFER_LIFE = PAINTING_TYPES.register("puffer_life", () -> new PaintingType(16,32));
	public static final RegistryObject<PaintingType> MACAW = PAINTING_TYPES.register("macaw", () -> new PaintingType(16,32));
	
	public static final RegistryObject<PaintingType> BADLANDS = PAINTING_TYPES.register("badlands", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> FOX = PAINTING_TYPES.register("fox", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> BATS = PAINTING_TYPES.register("bats", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> CACTI_DESERT = PAINTING_TYPES.register("cacti_desert", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> HALLOWEEN_PUMPKIN = PAINTING_TYPES.register("halloween_pumpkin", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> MOUNTAINS = PAINTING_TYPES.register("mountains", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> SAKURA = PAINTING_TYPES.register("sakura", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> SWAMP_LAND = PAINTING_TYPES.register("swamp_land", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> WARPED_FOREST = PAINTING_TYPES.register("warped_forest", () -> new PaintingType(32,16));
	
	public static final RegistryObject<PaintingType> PANDA = PAINTING_TYPES.register("panda", () -> new PaintingType(32,32));
	
	public static final RegistryObject<PaintingType> SUNSET_FOREST = PAINTING_TYPES.register("sunset_forest", () -> new PaintingType(48,32));
	
	public static final RegistryObject<PaintingType> CHERRY_TREE = PAINTING_TYPES.register("cherry_tree", () -> new PaintingType(48,48));
	public static final RegistryObject<PaintingType> GLOW_SQUID = PAINTING_TYPES.register("glow_squid", () -> new PaintingType(48,48));
	public static final RegistryObject<PaintingType> WITHER_ROSE = PAINTING_TYPES.register("wither_rose", () -> new PaintingType(48,48));
	
	public static final RegistryObject<PaintingType> AXOLOTLS = PAINTING_TYPES.register("axolotls", () -> new PaintingType(64,32));
	
	public static final RegistryObject<PaintingType> HALLOWEEN_HOUSE = PAINTING_TYPES.register("halloween_house", () -> new PaintingType(64,64));
	
	
	
	public static final RegistryObject<PaintingType> SCENERY_TREE2 = PAINTING_TYPES.register("scenery_tree2", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> SCENERY_TREE3 = PAINTING_TYPES.register("scenery_tree3", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> SCENERY_TREE4 = PAINTING_TYPES.register("scenery_tree4", () -> new PaintingType(16,16));
	
	public static final RegistryObject<PaintingType> SKYBLOCK = PAINTING_TYPES.register("skyblock", () -> new PaintingType(48,16));
	public static final RegistryObject<PaintingType> NETHER_PORTAL = PAINTING_TYPES.register("nether_portal", () -> new PaintingType(48,16));
	public static final RegistryObject<PaintingType> SAVANA = PAINTING_TYPES.register("savana", () -> new PaintingType(48,16));
	public static final RegistryObject<PaintingType> BRIDGE = PAINTING_TYPES.register("bridge", () -> new PaintingType(48,16));
	
	public static final RegistryObject<PaintingType> BEACH = PAINTING_TYPES.register("beach", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> FALL = PAINTING_TYPES.register("fall", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> GREEN_PLANT = PAINTING_TYPES.register("green_plant", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> HILL = PAINTING_TYPES.register("hill", () -> new PaintingType(32,48));
	public static final RegistryObject<PaintingType> IGLOO = PAINTING_TYPES.register("igloo", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> LIGHTHOUSE= PAINTING_TYPES.register("lighthouse", () -> new PaintingType(32,16));
	public static final RegistryObject<PaintingType> MAGNOLIA = PAINTING_TYPES.register("magnolia", () -> new PaintingType(48,48));
	public static final RegistryObject<PaintingType> POTTED_PLANT = PAINTING_TYPES.register("potted_plant", () -> new PaintingType(16,16));
	public static final RegistryObject<PaintingType> SHINTO = PAINTING_TYPES.register("shinto", () -> new PaintingType(48,48));
	public static final RegistryObject<PaintingType> SNAKE_PLANT = PAINTING_TYPES.register("snake_plant", () -> new PaintingType(16,32));
	public static final RegistryObject<PaintingType> MOUNTAIN = PAINTING_TYPES.register("mountain", () -> new PaintingType(32,32));
	public static final RegistryObject<PaintingType> ARCTIC_SKY = PAINTING_TYPES.register("arctic_sky", () -> new PaintingType(32,32));
	public static final RegistryObject<PaintingType> ISLAND = PAINTING_TYPES.register("island", () -> new PaintingType(32,16));
}
