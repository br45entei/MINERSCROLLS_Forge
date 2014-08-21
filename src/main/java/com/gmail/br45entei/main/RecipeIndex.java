package com.gmail.br45entei.main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

/**@author Brian_Entei */
public class RecipeIndex {
	private final BlockIndex blockIndex;
	private final ItemIndex itemIndex;

	public RecipeIndex(BlockIndex blockIndex, ItemIndex itemIndex) {
		this.blockIndex = blockIndex;
		this.itemIndex = itemIndex;
		System.err.println("Recipe Test");
	}

	@SuppressWarnings("boxing")
	public final void initialize() {
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(blockIndex.ingotBlockEbony)), new Object[]{"XXX", "XXX", "XXX", 'X', itemIndex.ingotEbony});
		
		
	}

}
