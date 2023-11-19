package com.davigj.irregular_chef.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vectorwing.farmersdelight.common.Configuration;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import javax.annotation.Nullable;
import java.util.List;

public class PricklyPuddingItem extends ConsumableItem {
    private final boolean hasFoodEffectTooltip;
    private final boolean hasCustomTooltip;

    public PricklyPuddingItem(Properties properties, boolean hasFoodEffectTooltip, boolean hasCustomTooltip) {
        super(properties, hasFoodEffectTooltip, hasCustomTooltip);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = hasCustomTooltip;
    }

    public void affectConsumer(ItemStack stack, Level worldIn, LivingEntity consumer) {
//        float humid = consumer.level.getBiomeManager().getBiome(consumer.blockPosition()).get().getDownfall();
//        float temp = consumer.level.getBiomeManager().getBiome(consumer.blockPosition()).get().getBaseTemperature();
//
//        if (humid <= 0.4 && temp > 0.75) {
//            int duration = 15;
//
//            consumer.addEffect(new MobEffectInstance(MobEffects.REGENERATION, duration * 20, 0));
//        }
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
//        if ((Boolean) Configuration.FOOD_EFFECT_TOOLTIP.get()) {
//            tooltip.add(Component.translatable("irregular_chef.tooltip.eat_prickly_pudding").withStyle(ChatFormatting.GRAY));
//            tooltip.add(Component.empty().append(" ").append(Component.translatable(MobEffects.REGENERATION.getDescriptionId()).append(" (0:15)").withStyle(ChatFormatting.BLUE)));
//        }
    }
}
