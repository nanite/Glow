package com.unrealdinnerbone.glow.mixin;

import com.unrealdinnerbone.glow.Glow;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LEMixin
{
    @Inject(method = "addEatEffect", at = @At("HEAD"))
    private void addGlowEatEffect(ItemStack stack, Level level, LivingEntity entity, CallbackInfo callbackInfo) {
        if(!level.isClientSide()) {
            if(stack.is(Items.GLOW_BERRIES)) {
                entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20 * Glow.time.get(), 1, false, false, true, null));
            }
        }
    }
}
