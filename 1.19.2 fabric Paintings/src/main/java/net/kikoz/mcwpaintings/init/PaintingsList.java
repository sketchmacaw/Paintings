package net.kikoz.mcwpaintings.init;

import net.kikoz.mcwpaintings.MacawsPaintings;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PaintingsList {

    public static final PaintingVariant BONSAI = registerPainting("bonsai", new PaintingVariant(16,16));
    public static final PaintingVariant CLIFFS = registerPainting("cliffs", new PaintingVariant(16,16));
    public static final PaintingVariant LIGHTS = registerPainting("lights", new PaintingVariant(16,16));
    public static final PaintingVariant SCENERY_LAVA = registerPainting("scenery_lava", new PaintingVariant(16,16));
    public static final PaintingVariant SCENERY_LAVA2 = registerPainting("scenery_lava2", new PaintingVariant(16,16));
    public static final PaintingVariant SCENERY_TREE = registerPainting("scenery_tree", new PaintingVariant(16,16));

    public static final PaintingVariant CACTI = registerPainting("cacti", new PaintingVariant(16,32));
    public static final PaintingVariant PUFFER_LIFE = registerPainting("puffer_life", new PaintingVariant(16,32));
    public static final PaintingVariant MACAW = registerPainting("macaw", new PaintingVariant(16,32));

    public static final PaintingVariant BADLANDS = registerPainting("badlands", new PaintingVariant(32,16));
    public static final PaintingVariant FOX = registerPainting("fox", new PaintingVariant(32,16));
    public static final PaintingVariant BATS = registerPainting("bats", new PaintingVariant(32,16));
    public static final PaintingVariant CACTI_DESERT = registerPainting("cacti_desert", new PaintingVariant(32,16));
    public static final PaintingVariant HALLOWEEN_PUMPKIN = registerPainting("halloween_pumpkin", new PaintingVariant(32,16));
    public static final PaintingVariant MOUNTAINS = registerPainting("mountains", new PaintingVariant(32,16));
    public static final PaintingVariant SAKURA = registerPainting("sakura", new PaintingVariant(32,16));
    public static final PaintingVariant SWAMP_LAND = registerPainting("swamp_land", new PaintingVariant(32,16));
    public static final PaintingVariant WARPED_FOREST = registerPainting("warped_forest", new PaintingVariant(32,16));

    public static final PaintingVariant PANDA = registerPainting("panda", new PaintingVariant(32,32));

    public static final PaintingVariant SUNSET_FOREST = registerPainting("sunset_forest", new PaintingVariant(48,32));

    public static final PaintingVariant CHERRY_TREE = registerPainting("cherry_tree", new PaintingVariant(48,48));
    public static final PaintingVariant GLOW_SQUID = registerPainting("glow_squid", new PaintingVariant(48,48));
    public static final PaintingVariant WITHER_ROSE = registerPainting("wither_rose", new PaintingVariant(48,48));

    public static final PaintingVariant AXOLOTLS = registerPainting("axolotls", new PaintingVariant(64,32));

    public static final PaintingVariant HALLOWEEN_HOUSE = registerPainting("halloween_house", new PaintingVariant(64,64));

    public static final PaintingVariant SCENERY_TREE2 = registerPainting("scenery_tree2", new PaintingVariant(16,16));
    public static final PaintingVariant SCENERY_TREE3 = registerPainting("scenery_tree3", new PaintingVariant(16,16));
    public static final PaintingVariant SCENERY_TREE4 = registerPainting("scenery_tree4", new PaintingVariant(16,16));

    public static final PaintingVariant SKYBLOCK = registerPainting("skyblock", new PaintingVariant(48,16));
    public static final PaintingVariant NETHER_PORTAL = registerPainting("nether_portal", new PaintingVariant(48,16));
    public static final PaintingVariant SAVANA = registerPainting("savana", new PaintingVariant(48,16));
    public static final PaintingVariant BRIDGE = registerPainting("bridge", new PaintingVariant(48,16));

    public static final PaintingVariant BEACH = registerPainting("beach", new PaintingVariant(32,16));
    public static final PaintingVariant FALL = registerPainting("fall", new PaintingVariant(32,16));
    public static final PaintingVariant GREEN_PLANT = registerPainting("green_plant", new PaintingVariant(16,16));
    public static final PaintingVariant HILL = registerPainting("hill", new PaintingVariant(32,48));
    public static final PaintingVariant IGLOO = registerPainting("igloo", new PaintingVariant(32,16));
    public static final PaintingVariant LIGHTHOUSE= registerPainting("lighthouse", new PaintingVariant(32,16));
    public static final PaintingVariant MAGNOLIA = registerPainting("magnolia",new PaintingVariant(48,48));
    public static final PaintingVariant POTTED_PLANT = registerPainting("potted_plant",new PaintingVariant(16,16));
    public static final PaintingVariant SHINTO = registerPainting("shinto", new PaintingVariant(48,48));
    public static final PaintingVariant SNAKE_PLANT = registerPainting("snake_plant",new PaintingVariant(16,32));
    public static final PaintingVariant MOUNTAIN = registerPainting("mountain", new PaintingVariant(32,32));
    public static final PaintingVariant ARCTIC_SKY = registerPainting("arctic_sky", new PaintingVariant(32,32));
    public static final PaintingVariant ISLAND = registerPainting("island", new PaintingVariant(32,16));

    private static PaintingVariant registerPainting(String name, PaintingVariant PaintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(MacawsPaintings.MOD_ID, name), PaintingVariant);
    }

    public static void registerPaintings() {
        MacawsPaintings.LOGGER.info("Registering Paintings for " + MacawsPaintings.MOD_ID);
    }
}
