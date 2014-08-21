package com.gmail.br45entei.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

import com.gmail.br45entei.item.ItemModBaseAxe;
import com.gmail.br45entei.item.ItemModBaseItem;
import com.gmail.br45entei.item.ItemModBaseSpear;
import com.gmail.br45entei.item.ItemModBaseWeapon;
import com.gmail.br45entei.item.ItemModBaseWeaponHammer;

/**@author Brian_Entei */
public class ItemIndex {

	public ItemIndex() {System.err.println("Item Test");}

	public ItemModBaseItem ingotSteel;
	public ItemModBaseItem ingotSilver;
	public ItemModBaseItem ingotrefinedMalachite;
	public ItemModBaseItem ingotQuicksilver;
	public ItemModBaseItem ingotOrcichalcum;
	public ItemModBaseItem ingotIron;
	public ItemModBaseItem ingotGold;
	public ItemModBaseItem ingotEbony;
	public ItemModBaseItem ingotspecialDwarven;
	public ItemModBaseItem ingotCorundum;
	public ItemModBaseItem ingotMoonstone;

	public ItemModBaseAxe axeironBattle;
	public ItemModBaseAxe axeironWar;
	public ItemModBaseWeapon bladeironDagger;
	public ItemModBaseSpear spearironHalberd;
	public ItemModBaseAxe axeironHatchet;
	public ItemModBaseWeapon bladeironKnife;
	public ItemModBaseWeapon bladeironLongsword;
	public ItemModBaseWeapon bluntironMace;
	public ItemModBaseWeapon bladeironSaber;
	public ItemModBaseWeapon bladeironShortsword;
	public ItemModBaseSpear spearironSpear;
	public ItemModBaseWeaponHammer bluntironWarhammer;
	public ItemModBaseWeapon bluntsteelMace;

	//Since I have no idea what the following entries are, I'm just going to classify them as Items:
	public ItemModBaseItem thatchBasicdark;
	public ItemModBaseItem thatchtiedBasiccross;
	public ItemModBaseItem thatchtiedBasichorizontal;
	public ItemModBaseItem thatchtiedSquare;
	public ItemModBaseItem wovenNormal;
	public ItemModBaseItem thatchtiedAdvanced;


	public final void initialize() {
		ingotSteel = new ItemModBaseItem("ingotSteel");
		ingotSilver = new ItemModBaseItem("ingotSilver");
		ingotrefinedMalachite = new ItemModBaseItem("ingotrefinedMalachite");
		ingotQuicksilver = new ItemModBaseItem("ingotQuicksilver");
		ingotOrcichalcum = new ItemModBaseItem("ingotOrcichalcum");
		ingotIron = new ItemModBaseItem("ingotIron");
		ingotGold = new ItemModBaseItem("ingotGold");
		ingotEbony = new ItemModBaseItem("ingotEbony");
		ingotspecialDwarven = new ItemModBaseItem("ingotspecialDwarven");
		ingotCorundum = new ItemModBaseItem("ingotCorundum");
		ingotMoonstone = new ItemModBaseItem("ingotMoonstone");

		axeironBattle = new ItemModBaseAxe("axeironBattle", ToolMaterial.IRON);
		axeironWar = new ItemModBaseAxe("axeironWar", ToolMaterial.IRON);
		bladeironDagger = new ItemModBaseWeapon("bladeironDagger", ToolMaterial.IRON);
		spearironHalberd = new ItemModBaseSpear("spearironHalberd", ToolMaterial.IRON);
		axeironHatchet = new ItemModBaseAxe("axeironHatchet", ToolMaterial.IRON);
		bladeironKnife = new ItemModBaseWeapon("bladeironKnife", ToolMaterial.IRON);
		bladeironLongsword = new ItemModBaseWeapon("bladeironLongsword", ToolMaterial.IRON);
		bluntironMace = new ItemModBaseWeapon("bluntironMace", ToolMaterial.IRON);
		bladeironSaber = new ItemModBaseWeapon("bladeironSaber", ToolMaterial.IRON);
		bladeironShortsword = new ItemModBaseWeapon("bladeironShortsword", ToolMaterial.IRON);
		spearironSpear = new ItemModBaseSpear("spearironSpear", ToolMaterial.IRON);
		bluntironWarhammer = new ItemModBaseWeaponHammer("bluntironWarhammer", ToolMaterial.IRON);
		bluntsteelMace = new ItemModBaseWeapon("bluntsteelMace", ToolMaterial.IRON);

		thatchBasicdark = new ItemModBaseItem("thatchBasicdark");
		thatchtiedBasiccross = new ItemModBaseItem("thatchtiedBasiccross");
		thatchtiedBasichorizontal = new ItemModBaseItem("thatchtiedBasichorizontal");
		thatchtiedSquare = new ItemModBaseItem("thatchtiedSquare");
		wovenNormal = new ItemModBaseItem("wovenNormal");
		thatchtiedAdvanced = new ItemModBaseItem("thatchtiedAdvanced");
	}

}
