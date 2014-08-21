package com.gmail.br45entei.main;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;

import com.gmail.br45entei.block.BlockModBaseBlock;
import com.gmail.br45entei.block.BlockModBaseOre;

/**@author Brian_Entei */
public class BlockIndex {

	public BlockIndex() {System.err.println("Block Test");}

	public BlockModBaseOre naturaloreQuicksilver;
	public BlockModBaseOre naturaloreOrcichalcum;
	public BlockModBaseOre naturaloreMoonstone;
	public BlockModBaseOre gemoreQuicksilver;
	public BlockModBaseOre gemoreOrcichalcum;
	public BlockModBaseOre gemoreMoonstone;
	public BlockModBaseOre gemoreGold;
	public BlockModBaseOre gemoreEbony;
	public BlockModBaseOre gemoreCorundum;
	public BlockModBaseOre gemoreBase;
	public BlockModBaseOre naturaloreEbony;
	public BlockModBaseOre naturaloreCorundum;

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


	public final void initialize() {
		naturaloreQuicksilver = new BlockModBaseOre("naturaloreQuicksilver");
		naturaloreOrcichalcum = new BlockModBaseOre("naturaloreOrcichalcum");
		naturaloreMoonstone = new BlockModBaseOre("naturaloreMoonstone");
		gemoreQuicksilver = new BlockModBaseOre("gemoreQuicksilver");
		gemoreOrcichalcum = new BlockModBaseOre("gemoreOrcichalcum");
		gemoreMoonstone = new BlockModBaseOre("gemoreMoonstone");
		gemoreGold = new BlockModBaseOre("gemoreGold");
		gemoreEbony = new BlockModBaseOre("gemoreEbony");
		gemoreCorundum = new BlockModBaseOre("gemoreCorundum");
		gemoreBase = new BlockModBaseOre("gemoreBase");
		naturaloreEbony = new BlockModBaseOre("naturaloreEbony");
		naturaloreCorundum = new BlockModBaseOre("naturaloreCorundum");

		naturalstoneClaystone = new BlockModBaseBlock("naturalstoneClaystone");
		naturalstoneMudstone = new BlockModBaseBlock("naturalstoneMudstone");
		naturalstoneShale = new BlockModBaseBlock("naturalstoneShale");
		naturalstoneSilt = new BlockModBaseBlock("naturalstoneSilt");
		stoneSmoothhorizontalclaystone = new BlockModBaseBlock("stoneSmoothhorizontalclaystone");
		stoneSmoothhorizontalmudstone = new BlockModBaseBlock("stoneSmoothhorizontalmudstone");
		stoneSmoothhorizontalshalestone = new BlockModBaseBlock("stoneSmoothhorizontalshalestone");
		stoneSmoothhorizontalsiltstone = new BlockModBaseBlock("stoneSmoothhorizontalsiltstone");
		stoneSmoothshalestone = new BlockModBaseBlock("stoneSmoothshalestone");

		ingotBlockEbony = new BlockModBaseBlock("ingotBlockEbony").setIngotBlock(ToolMaterial.EMERALD);
	}

}
