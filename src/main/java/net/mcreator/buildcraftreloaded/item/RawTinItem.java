
package net.mcreator.buildcraftreloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawTinItem extends Item {
	public RawTinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
