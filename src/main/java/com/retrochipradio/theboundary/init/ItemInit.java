package com.retrochipradio.theboundary.init;

import com.retrochipradio.theboundary.TheBoundary;
import com.retrochipradio.theboundary.TheBoundary.BoundaryItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheBoundary.MOD_ID);
	
	public static final RegistryObject<Item> BOUNDARYROD_ITEM = ITEMS.register("boundaryrod_item", () -> new Item(new Item.Properties().group(BoundaryItemGroup.instance)));
	public static final RegistryObject<Item> BOUNDARYFOOD_ITEM = ITEMS.register("boundaryfood_item", () -> new Item(new Item.Properties().group(BoundaryItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).build())));
	
}