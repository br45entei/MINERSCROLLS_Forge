package com.gmail.br45entei.main;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

import com.gmail.br45entei.block.BlockModBaseBlock;
import com.gmail.br45entei.block.BlockModBaseBlockMultiTextured;
import com.gmail.br45entei.block.BlockModBaseOre;
import com.gmail.br45entei.item.ItemModBaseIngot;
import com.gmail.br45entei.item.ItemModBaseItem;
import com.gmail.br45entei.main.lib.Constants;

/**@author Brian_Entei */
public class BlockIndex {

	public BlockIndex() {System.err.println("Block Test");}

	public BlockModBaseOre naturaloreQuicksilver;
	public BlockModBaseOre naturaloreOrcichalcum;
	public BlockModBaseOre naturaloreMoonstone;
	public BlockModBaseOre naturaloreGold;
	public BlockModBaseOre naturaloreEbony;
	public BlockModBaseOre naturaloreCorundum;
	public BlockModBaseOre naturaloreIron;
	public BlockModBaseOre naturaloreSilver;

	public BlockModBaseBlock naturalstoneClaystone;
	public BlockModBaseBlock naturalstoneMudstone;
	public BlockModBaseBlock naturalstoneShale;
	public BlockModBaseBlock naturalstoneSilt;
	public BlockModBaseBlock stoneSmoothhorizontalclaystone;
	public BlockModBaseBlock stoneSmoothhorizontalmudstone;
	public BlockModBaseBlock stoneSmoothhorizontalshalestone;
	public BlockModBaseBlock stoneSmoothhorizontalsiltstone;
	public BlockModBaseBlock stoneSmoothshalestone;

	public BlockModBaseBlock ingotBlockEbony;

	public BlockModBaseBlock thatchBasicdark;
	public BlockModBaseBlock thatchtiedBasiccross;
	public BlockModBaseBlock thatchtiedBasichorizontal;
	public BlockModBaseBlock thatchtiedSquare;
	public BlockModBaseBlock wovenNormal;
	public BlockModBaseBlock thatchtiedAdvanced;
	public BlockModBaseBlock weaveAdvanced;

	public BlockModBaseBlockMultiTextured facingBlockTest;

	public final void initialize(ItemIndex itemIndex, MaterialIndex materialIndex) {
		
		naturaloreQuicksilver = new BlockModBaseOre("naturaloreQuicksilver").setItemDropped(itemIndex.gemoreQuicksilver).setSmeltingRecipe(new ItemStack(itemIndex.gemoreQuicksilver), 0.25F);
		naturaloreOrcichalcum = new BlockModBaseOre("naturaloreOrcichalcum").setItemDropped(itemIndex.gemoreOrcichalcum).setSmeltingRecipe(new ItemStack(itemIndex.gemoreOrcichalcum), 0.27F);
		naturaloreMoonstone = new BlockModBaseOre("naturaloreMoonstone").setItemDropped(itemIndex.gemoreMoonstone).setSmeltingRecipe(new ItemStack(itemIndex.gemoreMoonstone), 0.3F);
		naturaloreGold = new BlockModBaseOre("naturaloreGold").setItemDropped(itemIndex.gemoreGold).setSmeltingRecipe(new ItemStack(itemIndex.gemoreGold), 0.32F);
		naturaloreEbony = new BlockModBaseOre("naturaloreEbony").setItemDropped(itemIndex.gemoreEbony).setSmeltingRecipe(new ItemStack(itemIndex.gemoreEbony), 0.4F);
		naturaloreCorundum = new BlockModBaseOre("naturaloreCorundum").setItemDropped(itemIndex.gemoreCorundum).setSmeltingRecipe(new ItemStack(itemIndex.gemoreCorundum), 0.25F);
		naturaloreIron = new BlockModBaseOre("naturaloreIron").setItemDropped(itemIndex.gemoreIron).setSmeltingRecipe(new ItemStack(itemIndex.gemoreIron), 0.28F);
		naturaloreSilver = new BlockModBaseOre("naturaloreSilver").setItemDropped(itemIndex.gemoreSilver).setSmeltingRecipe(new ItemStack(itemIndex.gemoreSilver), 0.37F);

		naturalstoneClaystone = new BlockModBaseBlock("naturalstoneClaystone");
		naturalstoneMudstone = new BlockModBaseBlock("naturalstoneMudstone");
		naturalstoneShale = new BlockModBaseBlock("naturalstoneShale");
		naturalstoneSilt = new BlockModBaseBlock("naturalstoneSilt");
		stoneSmoothhorizontalclaystone = new BlockModBaseBlock("stoneSmoothhorizontalclaystone");
		stoneSmoothhorizontalmudstone = new BlockModBaseBlock("stoneSmoothhorizontalmudstone");
		stoneSmoothhorizontalshalestone = new BlockModBaseBlock("stoneSmoothhorizontalshalestone");
		stoneSmoothhorizontalsiltstone = new BlockModBaseBlock("stoneSmoothhorizontalsiltstone");
		stoneSmoothshalestone = new BlockModBaseBlock("stoneSmoothshalestone");

		ingotBlockEbony = new BlockModBaseBlock("ingotBlockEbony").setIngotBlock(materialIndex.toolMaterials.EBONY).setItemDropped(itemIndex.ingotEbony, 9);

		thatchBasicdark = new BlockModBaseBlock("thatchBasicdark").setGrassBlock();
		thatchtiedBasiccross = new BlockModBaseBlock("thatchtiedBasiccross").setGrassBlock();
		thatchtiedBasichorizontal = new BlockModBaseBlock("thatchtiedBasichorizontal").setGrassBlock();
		thatchtiedSquare = new BlockModBaseBlock("thatchtiedSquare").setGrassBlock();
		wovenNormal = new BlockModBaseBlock("wovenNormal").setGrassBlock();
		thatchtiedAdvanced = new BlockModBaseBlock("thatchtiedAdvanced").setGrassBlock();
		weaveAdvanced = new BlockModBaseBlock("weaveAdvanced").setGrassBlock();

		facingBlockTest = new BlockModBaseBlockMultiTextured("facingBlockTest").setDirtBlock().setIsMultiTextured(true).setCanSideChangeToPlayerView(true);
	}

}
