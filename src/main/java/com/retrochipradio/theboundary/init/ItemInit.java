package com.retrochipradio.theboundary.init;

import com.retrochipradio.theboundary.TheBoundary;
import com.retrochipradio.theboundary.TheBoundary.BoundaryItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TheBoundary.MOD_ID, bus = Bus.MOD)
@ObjectHolder(TheBoundary.MOD_ID)
public class ItemInit 
{	
	public static final Item boundaryrod_item = null;
	public static final Item special_item = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(BoundaryItemGroup.instance)).setRegistryName("boundaryrod_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(BoundaryItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).build())).setRegistryName("boundaryfood_item"));
	}
}
