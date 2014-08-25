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

	public BlockModBaseBlock smoothshalestone;
	public BlockModBaseBlock smoothMudstone;
	public BlockModBaseBlock smoothSiltstone;
	public BlockModBaseBlock smoothClaystone;


	public BlockModBaseBlock blockCorundum;
	public BlockModBaseBlock blockDwarven;
	public BlockModBaseBlock blockEbony;
	public BlockModBaseBlock blockGold;
	public BlockModBaseBlock blockIron;
	public BlockModBaseBlock blockMoonstone;
	public BlockModBaseBlock blockOrcichalcum;
	public BlockModBaseBlock blockQuicksilver;
	public BlockModBaseBlock blockRefinedMalachite;
	public BlockModBaseBlock blockSilver;
	public BlockModBaseBlock blockSteel;

	public BlockModBaseBlock thatchBasicdark;
	public BlockModBaseBlock thatchtiedBasiccross;
	public BlockModBaseBlock thatchtiedBasichorizontal;
	public BlockModBaseBlock thatchtiedSquare;
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

		smoothshalestone = new BlockModBaseBlock("smoothshalestone");
		smoothMudstone = new BlockModBaseBlock("smoothMudstone");
		smoothSiltstone = new BlockModBaseBlock("smoothSiltstone");
		smoothClaystone = new BlockModBaseBlock("smoothClaystone");


		blockCorundum = new BlockModBaseBlock("blockCorundum").setIngotBlock(new ItemStack(itemIndex.ingotCorundum, 9));
		blockDwarven = new BlockModBaseBlock("blockDwarven").setIngotBlock(new ItemStack(itemIndex.ingotspecialDwarven, 9));
		blockEbony = new BlockModBaseBlock("blockEbony").setIngotBlock(new ItemStack(itemIndex.ingotEbony, 9));
		blockGold = new BlockModBaseBlock("blockGold").setIngotBlock(new ItemStack(itemIndex.ingotGold, 9));
		blockIron = new BlockModBaseBlock("blockIron").setIngotBlock(new ItemStack(itemIndex.ingotIron, 9));
		blockMoonstone = new BlockModBaseBlock("blockMoonstone").setIngotBlock(new ItemStack(itemIndex.ingotMoonstone, 9));
		blockOrcichalcum = new BlockModBaseBlock("blockOrcichalcum").setIngotBlock(new ItemStack(itemIndex.ingotOrcichalcum, 9));
		blockQuicksilver = new BlockModBaseBlock("blockQuicksilver").setIngotBlock(new ItemStack(itemIndex.ingotQuicksilver, 9));
		blockRefinedMalachite = new BlockModBaseBlock("blockRefinedMalachite").setIngotBlock(new ItemStack(itemIndex.ingotrefinedMalachite, 9));
		blockSilver = new BlockModBaseBlock("blockSilver").setIngotBlock(new ItemStack(itemIndex.ingotSilver, 9));
		blockSteel = new BlockModBaseBlock("blockSteel").setIngotBlock(new ItemStack(itemIndex.ingotSteel, 9));

		thatchBasicdark = new BlockModBaseBlock("thatchBasicdark").setGrassBlock().setCanBeFurnaceFuel(true, 200);
		thatchtiedBasiccross = new BlockModBaseBlock("thatchtiedBasiccross").setGrassBlock().setCanBeFurnaceFuel(true, 200);
		thatchtiedBasichorizontal = new BlockModBaseBlock("thatchtiedBasichorizontal").setGrassBlock().setCanBeFurnaceFuel(true, 200);
		thatchtiedSquare = new BlockModBaseBlock("thatchtiedSquare").setGrassBlock().setCanBeFurnaceFuel(true, 200);
		thatchtiedAdvanced = new BlockModBaseBlock("thatchtiedAdvanced").setGrassBlock().setCanBeFurnaceFuel(true, 200);
		weaveAdvanced = new BlockModBaseBlock("weaveAdvanced").setGrassBlock().setCanBeFurnaceFuel(true, 200);

		facingBlockTest = new BlockModBaseBlockMultiTextured("facingBlockTest").initialize().setDirtBlock().setIsMultiTextured(true).setCanSideChangeToPlayerView(true);
	}

}
