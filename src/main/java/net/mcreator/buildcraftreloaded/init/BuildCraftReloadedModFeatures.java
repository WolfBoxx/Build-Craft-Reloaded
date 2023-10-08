
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildcraftreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.buildcraftreloaded.world.features.ores.TinOreFeature;
import net.mcreator.buildcraftreloaded.world.features.ores.SilveroreFeature;
import net.mcreator.buildcraftreloaded.BuildCraftReloadedMod;

@Mod.EventBusSubscriber
public class BuildCraftReloadedModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BuildCraftReloadedMod.MODID);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::new);
	public static final RegistryObject<Feature<?>> SILVERORE = REGISTRY.register("silverore", SilveroreFeature::new);
}
