package com.retrochipradio.theboundary.init;

import com.retrochipradio.theboundary.TheBoundary;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TheBoundary.MOD_ID);
	
	public static final RegistryObject<Block> BOUNDARYBLOCK_BLOCK = BLOCKS.register("boundaryblock_block", () -> new Block(Block.Properties.create(Material.EARTH)));
	
	public static final RegistryObject<Block> BOUNDARY_STAIRS = BLOCKS.register("boundary_stairs", () -> new StairsBlock(() -> BlockInit.boundaryblock_block.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA)));
}