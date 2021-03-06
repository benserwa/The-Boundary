package com.retrochipradio.theboundary.events;

import com.retrochipradio.theboundary.TheBoundary;
import com.retrochipradio.theboundary.init.BlockInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = TheBoundary.MOD_ID, bus = Bus.FORGE)
public class TestJumpEvent {
	@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event)
	{	
		TheBoundary.LOGGER.info("testJumpEvent fired");
		LivingEntity livingEntity = event.getEntityLiving();
		World world = livingEntity.getEntityWorld();

		world.setBlockState(livingEntity.getPosition().add(0, 5, 0), BlockInit.BOUNDARYBLOCK_BLOCK.get().getDefaultState());
		livingEntity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 600, 255));
		livingEntity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5000, 255));
		livingEntity.setGlowing(true);
	}
}
