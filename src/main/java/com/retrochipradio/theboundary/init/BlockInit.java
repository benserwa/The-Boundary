package com.retrochipradio.theboundary.init;

import com.retrochipradio.theboundary.TheBoundary;
import com.retrochipradio.theboundary.TheBoundary.BoundaryItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TheBoundary.MOD_ID)
@Mod.EventBusSubscriber(modid = TheBoundary.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
	public static final Block boundaryblock_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE)).setRegistryName("boundaryblock_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new BlockItem(boundaryblock_block, new Item.Properties().group(BoundaryItemGroup.instance)).setRegistryName("boundaryblock_block"));
	}
}
