package com.mcwpaintings.kikoz;


import com.mcwpaintings.kikoz.init.PaintingsList;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwpaintings")
@Mod.EventBusSubscriber(modid = MacawsPaintings.MOD_ID, bus = Bus.MOD)
public class MacawsPaintings 
{
	public static final String MOD_ID = "mcwpaintings";
	public static MacawsPaintings instance;
	
	
	public MacawsPaintings() 
	{
			final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			PaintingsList.PAINTING_TYPES.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}

	
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}
	
	

	private void doClientStuff(final FMLClientSetupEvent event)
	{
 
	}
	
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event)
	{
	
	}
	
	
}














