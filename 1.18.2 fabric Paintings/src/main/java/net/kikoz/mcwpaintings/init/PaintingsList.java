package net.kikoz.mcwpaintings.init;

import net.kikoz.mcwpaintings.MacawsPaintings;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PaintingsList {

    public static final PaintingMotive BONSAI = registerPainting("bonsai", new PaintingMotive(16,16));
    public static final PaintingMotive CLIFFS = registerPainting("cliffs", new PaintingMotive(16,16));
    public static final PaintingMotive LIGHTS = registerPainting("lights", new PaintingMotive(16,16));
    public static final PaintingMotive SCENERY_LAVA = registerPainting("scenery_lava", new PaintingMotive(16,16));
    public static final PaintingMotive SCENERY_LAVA2 = registerPainting("scenery_lava2", new PaintingMotive(16,16));
    public static final PaintingMotive SCENERY_TREE = registerPainting("scenery_tree", new PaintingMotive(16,16));

    public static final PaintingMotive CACTI = registerPainting("cacti", new PaintingMotive(16,32));
    public static final PaintingMotive PUFFER_LIFE = registerPainting("puffer_life", new PaintingMotive(16,32));
    public static final PaintingMotive MACAW = registerPainting("macaw", new PaintingMotive(16,32));

    public static final PaintingMotive BADLANDS = registerPainting("badlands", new PaintingMotive(32,16));
    public static final PaintingMotive FOX = registerPainting("fox", new PaintingMotive(32,16));
    public static final PaintingMotive BATS = registerPainting("bats", new PaintingMotive(32,16));
    public static final PaintingMotive CACTI_DESERT = registerPainting("cacti_desert", new PaintingMotive(32,16));
    public static final PaintingMotive HALLOWEEN_PUMPKIN = registerPainting("halloween_pumpkin", new PaintingMotive(32,16));
    public static final PaintingMotive MOUNTAINS = registerPainting("mountains", new PaintingMotive(32,16));
    public static final PaintingMotive SAKURA = registerPainting("sakura", new PaintingMotive(32,16));
    public static final PaintingMotive SWAMP_LAND = registerPainting("swamp_land", new PaintingMotive(32,16));
    public static final PaintingMotive WARPED_FOREST = registerPainting("warped_forest", new PaintingMotive(32,16));

    public static final PaintingMotive PANDA = registerPainting("panda", new PaintingMotive(32,32));

    public static final PaintingMotive SUNSET_FOREST = registerPainting("sunset_forest", new PaintingMotive(48,32));

    public static final PaintingMotive CHERRY_TREE = registerPainting("cherry_tree", new PaintingMotive(48,48));
    public static final PaintingMotive GLOW_SQUID = registerPainting("glow_squid", new PaintingMotive(48,48));
    public static final PaintingMotive WITHER_ROSE = registerPainting("wither_rose", new PaintingMotive(48,48));

    public static final PaintingMotive AXOLOTLS = registerPainting("axolotls", new PaintingMotive(64,32));

    public static final PaintingMotive HALLOWEEN_HOUSE = registerPainting("halloween_house", new PaintingMotive(64,64));

    public static final PaintingMotive SCENERY_TREE2 = registerPainting("scenery_tree2", new PaintingMotive(16,16));
    public static final PaintingMotive SCENERY_TREE3 = registerPainting("scenery_tree3", new PaintingMotive(16,16));
    public static final PaintingMotive SCENERY_TREE4 = registerPainting("scenery_tree4", new PaintingMotive(16,16));

    public static final PaintingMotive SKYBLOCK = registerPainting("skyblock", new PaintingMotive(48,16));
    public static final PaintingMotive NETHER_PORTAL = registerPainting("nether_portal", new PaintingMotive(48,16));
    public static final PaintingMotive SAVANA = registerPainting("savana", new PaintingMotive(48,16));
    public static final PaintingMotive BRIDGE = registerPainting("bridge", new PaintingMotive(48,16));

    public static final PaintingMotive BEACH = registerPainting("beach", new PaintingMotive(32,16));
    public static final PaintingMotive FALL = registerPainting("fall", new PaintingMotive(32,16));
    public static final PaintingMotive GREEN_PLANT = registerPainting("green_plant", new PaintingMotive(16,16));
    public static final PaintingMotive HILL = registerPainting("hill", new PaintingMotive(32,48));
    public static final PaintingMotive IGLOO = registerPainting("igloo", new PaintingMotive(32,16));
    public static final PaintingMotive LIGHTHOUSE= registerPainting("lighthouse", new PaintingMotive(32,16));
    public static final PaintingMotive MAGNOLIA = registerPainting("magnolia",new PaintingMotive(48,48));
    public static final PaintingMotive POTTED_PLANT = registerPainting("potted_plant",new PaintingMotive(16,16));
    public static final PaintingMotive SHINTO = registerPainting("shinto", new PaintingMotive(48,48));
    public static final PaintingMotive SNAKE_PLANT = registerPainting("snake_plant",new PaintingMotive(16,32));
    public static final PaintingMotive MOUNTAIN = registerPainting("mountain", new PaintingMotive(32,32));
    public static final PaintingMotive ARCTIC_SKY = registerPainting("arctic_sky", new PaintingMotive(32,32));
    public static final PaintingMotive ISLAND = registerPainting("island", new PaintingMotive(32,16));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(MacawsPaintings.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        MacawsPaintings.LOGGER.info("Registering Paintings for " + MacawsPaintings.MOD_ID);
    }
}
