package com.gmail.br45entei.main;

import com.gmail.br45entei.block.BlockModBaseBlock;
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
		/*this.addIngotRecipe(blockIndex.blockEbony, itemIndex.ingotEbony, 9);
		this.addIngotRecipe(blockIndex.blockCorundum, itemIndex.ingotCorundum, 9);
		this.addIngotRecipe(blockIndex.blockDwarven, itemIndex.ingotspecialDwarven, 9);
		this.addIngotRecipe(blockIndex.blockEbony, itemIndex.ingotEbony, 9);
		this.addIngotRecipe(blockIndex.blockGold, itemIndex.ingotGold, 9);
		this.addIngotRecipe(blockIndex.blockIron, itemIndex.ingotIron, 9);
		this.addIngotRecipe(blockIndex.blockMoonstone, itemIndex.ingotMoonstone, 9);
		this.addIngotRecipe(blockIndex.blockOrcichalcum, itemIndex.ingotOrcichalcum, 9);
		this.addIngotRecipe(blockIndex.blockQuicksilver, itemIndex.ingotQuicksilver, 9);
		this.addIngotRecipe(blockIndex.blockRefinedMalachite, itemIndex.ingotrefinedMalachite, 9);
		this.addIngotRecipe(blockIndex.blockSilver, itemIndex.ingotSilver, 9);
		this.addIngotRecipe(blockIndex.blockSteel, itemIndex.ingotSteel, 9);*/

		

	}

	@SuppressWarnings("boxing")
	public static final void addIngotRecipe(Block block, Item item, int itemAmount) {
		GameRegistry.addRecipe(new ItemStack(block), new Object[] {"###", "###", "###", '#', new ItemStack(item)});
		GameRegistry.addRecipe(new ItemStack(item, itemAmount), new Object[] {"#", '#', block});
	}

}
