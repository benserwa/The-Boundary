package com.retrochipradio.theboundary.init;

import com.retrochipradio.theboundary.TheBoundary;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TheBoundary.MOD_ID);
	
	public static final RegistryObject<Block> BOUNDARYBLOCK_BLOCK = BLOCKS.register("boundaryblock_block", () -> new Block(Block.Properties.create(Material.EARTH)));
}