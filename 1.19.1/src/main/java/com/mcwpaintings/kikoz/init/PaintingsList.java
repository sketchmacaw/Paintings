package com.mcwpaintings.kikoz.init;

import com.mcwpaintings.kikoz.MacawsPaintings;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingsList {
	
	public static final DeferredRegister<PaintingVariant> PAINTING_TYPES = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MacawsPaintings.MOD_ID);
	
	public static final RegistryObject<PaintingVariant> BONSAI = PAINTING_TYPES.register("bonsai", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> CLIFFS = PAINTING_TYPES.register("cliffs", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> LIGHTS = PAINTING_TYPES.register("lights", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> SCENERY_LAVA = PAINTING_TYPES.register("scenery_lava", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> SCENERY_LAVA2 = PAINTING_TYPES.register("scenery_lava2", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> SCENERY_TREE = PAINTING_TYPES.register("scenery_tree", () -> new PaintingVariant(16,16));
	
	public static final RegistryObject<PaintingVariant> CACTI = PAINTING_TYPES.register("cacti", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> PUFFER_LIFE = PAINTING_TYPES.register("puffer_life", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> MACAW = PAINTING_TYPES.register("macaw", () -> new PaintingVariant(16,32));
	
	public static final RegistryObject<PaintingVariant> BADLANDS = PAINTING_TYPES.register("badlands", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> FOX = PAINTING_TYPES.register("fox", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> BATS = PAINTING_TYPES.register("bats", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> CACTI_DESERT = PAINTING_TYPES.register("cacti_desert", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> HALLOWEEN_PUMPKIN = PAINTING_TYPES.register("halloween_pumpkin", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> MOUNTAINS = PAINTING_TYPES.register("mountains", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> SAKURA = PAINTING_TYPES.register("sakura", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> SWAMP_LAND = PAINTING_TYPES.register("swamp_land", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> WARPED_FOREST = PAINTING_TYPES.register("warped_forest", () -> new PaintingVariant(32,16));
	
	public static final RegistryObject<PaintingVariant> PANDA = PAINTING_TYPES.register("panda", () -> new PaintingVariant(32,32));
	
	public static final RegistryObject<PaintingVariant> SUNSET_FOREST = PAINTING_TYPES.register("sunset_forest", () -> new PaintingVariant(48,32));
	
	public static final RegistryObject<PaintingVariant> CHERRY_TREE = PAINTING_TYPES.register("cherry_tree", () -> new PaintingVariant(48,48));
	public static final RegistryObject<PaintingVariant> GLOW_SQUID = PAINTING_TYPES.register("glow_squid", () -> new PaintingVariant(48,48));
	public static final RegistryObject<PaintingVariant> WITHER_ROSE = PAINTING_TYPES.register("wither_rose", () -> new PaintingVariant(48,48));
	
	public static final RegistryObject<PaintingVariant> AXOLOTLS = PAINTING_TYPES.register("axolotls", () -> new PaintingVariant(64,32));
	
	public static final RegistryObject<PaintingVariant> HALLOWEEN_HOUSE = PAINTING_TYPES.register("halloween_house", () -> new PaintingVariant(64,64));
	
	
	
	public static final RegistryObject<PaintingVariant> SCENERY_TREE2 = PAINTING_TYPES.register("scenery_tree2", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> SCENERY_TREE3 = PAINTING_TYPES.register("scenery_tree3", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> SCENERY_TREE4 = PAINTING_TYPES.register("scenery_tree4", () -> new PaintingVariant(16,16));
	
	public static final RegistryObject<PaintingVariant> SKYBLOCK = PAINTING_TYPES.register("skyblock", () -> new PaintingVariant(48,16));
	public static final RegistryObject<PaintingVariant> NETHER_PORTAL = PAINTING_TYPES.register("nether_portal", () -> new PaintingVariant(48,16));
	public static final RegistryObject<PaintingVariant> SAVANA = PAINTING_TYPES.register("savana", () -> new PaintingVariant(48,16));
	public static final RegistryObject<PaintingVariant> BRIDGE = PAINTING_TYPES.register("bridge", () -> new PaintingVariant(48,16));

	public static final RegistryObject<PaintingVariant> BEACH = PAINTING_TYPES.register("beach", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> FALL = PAINTING_TYPES.register("fall", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> GREEN_PLANT = PAINTING_TYPES.register("green_plant", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> HILL = PAINTING_TYPES.register("hill", () -> new PaintingVariant(32,48));
	public static final RegistryObject<PaintingVariant> IGLOO = PAINTING_TYPES.register("igloo", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> LIGHTHOUSE= PAINTING_TYPES.register("lighthouse", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> MAGNOLIA = PAINTING_TYPES.register("magnolia", () -> new PaintingVariant(48,48));
	public static final RegistryObject<PaintingVariant> POTTED_PLANT = PAINTING_TYPES.register("potted_plant", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> SHINTO = PAINTING_TYPES.register("shinto", () -> new PaintingVariant(48,48));
	public static final RegistryObject<PaintingVariant> SNAKE_PLANT = PAINTING_TYPES.register("snake_plant", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> MOUNTAIN = PAINTING_TYPES.register("mountain", () -> new PaintingVariant(32,32));
	public static final RegistryObject<PaintingVariant> ARCTIC_SKY = PAINTING_TYPES.register("arctic_sky", () -> new PaintingVariant(32,32));
	public static final RegistryObject<PaintingVariant> ISLAND = PAINTING_TYPES.register("island", () -> new PaintingVariant(32,16));

	
}
