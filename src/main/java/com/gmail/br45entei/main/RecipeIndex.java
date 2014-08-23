package com.gmail.br45entei.main;

import com.gmail.br45entei.item.ItemModBaseIngot;

import net.minecraft.block.Block;
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

	//@SuppressWarnings("boxing")
	public final void initialize() {
		this.addIngotRecipe(blockIndex.ingotBlockEbony, itemIndex.ingotEbony, 9);

		

	}

	@SuppressWarnings("boxing")
	public final void addIngotRecipe(Block block, Item item, int itemAmount) {
		GameRegistry.addRecipe(new ItemStack(block), new Object[] {"###", "###", "###", '#', new ItemStack(item)});
		GameRegistry.addRecipe(new ItemStack(item, itemAmount), new Object[] {"#", '#', block});
	}

}
