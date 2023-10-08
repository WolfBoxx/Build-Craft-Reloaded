
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildcraftreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.buildcraftreloaded.item.TinIngotItem;
import net.mcreator.buildcraftreloaded.item.ReinforcedironItem;
import net.mcreator.buildcraftreloaded.item.RawsilverItem;
import net.mcreator.buildcraftreloaded.item.RawTinItem;
import net.mcreator.buildcraftreloaded.item.CopperPickaxeItem;
import net.mcreator.buildcraftreloaded.BuildCraftReloadedMod;

public class BuildCraftReloadedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BuildCraftReloadedMod.MODID);
	public static final RegistryObject<Item> REINFORCEDIRON = REGISTRY.register("reinforcediron", () -> new ReinforcedironItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> TIN_ORE = block(BuildCraftReloadedModBlocks.TIN_ORE);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> RAWSILVER = REGISTRY.register("rawsilver", () -> new RawsilverItem());
	public static final RegistryObject<Item> SILVERORE = block(BuildCraftReloadedModBlocks.SILVERORE);
	public static final RegistryObject<Item> TES = block(BuildCraftReloadedModBlocks.TES);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
