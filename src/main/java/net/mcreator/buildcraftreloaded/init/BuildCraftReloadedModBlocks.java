
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildcraftreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.buildcraftreloaded.block.TinOreBlock;
import net.mcreator.buildcraftreloaded.block.TesBlock;
import net.mcreator.buildcraftreloaded.block.SilveroreBlock;
import net.mcreator.buildcraftreloaded.BuildCraftReloadedMod;

public class BuildCraftReloadedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildCraftReloadedMod.MODID);
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> SILVERORE = REGISTRY.register("silverore", () -> new SilveroreBlock());
	public static final RegistryObject<Block> TES = REGISTRY.register("tes", () -> new TesBlock());
}
