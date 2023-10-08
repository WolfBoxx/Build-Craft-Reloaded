
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildcraftreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.buildcraftreloaded.BuildCraftReloadedMod;

public class BuildCraftReloadedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuildCraftReloadedMod.MODID);
	public static final RegistryObject<CreativeModeTab> BUILD_CRAFT_RELOADED = REGISTRY.register("build_craft_reloaded",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.build_craft_reloaded.build_craft_reloaded")).icon(() -> new ItemStack(BuildCraftReloadedModItems.REINFORCEDIRON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BuildCraftReloadedModItems.REINFORCEDIRON.get());
				tabData.accept(BuildCraftReloadedModItems.COPPER_PICKAXE.get());
				tabData.accept(BuildCraftReloadedModItems.RAW_TIN.get());
				tabData.accept(BuildCraftReloadedModBlocks.TIN_ORE.get().asItem());
				tabData.accept(BuildCraftReloadedModItems.TIN_INGOT.get());
				tabData.accept(BuildCraftReloadedModItems.RAWSILVER.get());
				tabData.accept(BuildCraftReloadedModBlocks.SILVERORE.get().asItem());
				tabData.accept(BuildCraftReloadedModBlocks.TES.get().asItem());
			}).withSearchBar().build());
}
