package com.unrealdinnerbone.glow;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(Glow.MOD_ID)
public class Glow {

    private static final ForgeConfigSpec.Builder SPEC = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec.ConfigValue<Integer> time = SPEC.comment("How long should effect last").define("time", 10);

    public static final String MOD_ID = "glow";


    public Glow() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SPEC.build());
    }


}
