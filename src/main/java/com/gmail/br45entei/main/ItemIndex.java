package com.gmail.br45entei.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.gmail.br45entei.block.BlockModBaseOre;
import com.gmail.br45entei.item.ItemModBaseAxe;
import com.gmail.br45entei.item.ItemModBaseIngot;
import com.gmail.br45entei.item.ItemModBaseItem;
import com.gmail.br45entei.item.ItemModBasePickaxe;
import com.gmail.br45entei.item.ItemModBaseSpade;
import com.gmail.br45entei.item.ItemModBaseSpear;
import com.gmail.br45entei.item.ItemModBaseWeapon;
import com.gmail.br45entei.item.ItemModBaseWeaponHammer;

/**@author Brian_Entei */
public class ItemIndex {
	private final MaterialIndex materialIndex;

	public ItemIndex(MaterialIndex materialIndex) {
		this.materialIndex = materialIndex;
		System.err.println("Item Test");
	}

	public ItemModBaseItem Chitin;//A shell like item to be used as armor(?)

	//Tools:
	public ItemModBasePickaxe testPickaxe;

	//Ingots:
	public ItemModBaseIngot ingotSteel;
	public ItemModBaseIngot ingotSilver;
	public ItemModBaseIngot ingotrefinedMalachite;
	public ItemModBaseIngot ingotQuicksilver;
	public ItemModBaseIngot ingotOrcichalcum;
	public ItemModBaseIngot ingotIron;
	public ItemModBaseIngot ingotGold;
	public ItemModBaseIngot ingotEbony;
	public ItemModBaseIngot ingotspecialDwarven;
	public ItemModBaseIngot ingotCorundum;
	public ItemModBaseIngot ingotMoonstone;

	//Weapons:
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

	public ItemModBaseWeapon bladeEbonyLongsword;
	public ItemModBaseAxe axeEbonyBattle;
	public ItemModBaseSpade spadeEbony;

	public ItemModBaseIngot gemoreQuicksilver;
	public ItemModBaseIngot gemoreOrcichalcum;
	public ItemModBaseIngot gemoreMoonstone;
	public ItemModBaseIngot gemoreGold;
	public ItemModBaseIngot gemoreEbony;
	public ItemModBaseIngot gemoreCorundum;
	public ItemModBaseIngot gemoreBase; //To be used exactly like cobblestone, crafting recipes, making a furnace, stone tools, etc
	public ItemModBaseIngot gemoreIron;
	public ItemModBaseIngot gemoreSilver;


	public final void initialize() {
		//Chitin = new ItemModBaseArmor();

		testPickaxe = new ItemModBasePickaxe("testPickaxe", materialIndex.toolMaterials.EBONY);


		ingotSteel = new ItemModBaseIngot("ingotSteel");
		ingotSilver = new ItemModBaseIngot("ingotSilver");
		ingotrefinedMalachite = new ItemModBaseIngot("ingotrefinedMalachite");
		ingotQuicksilver = new ItemModBaseIngot("ingotQuicksilver");
		ingotOrcichalcum = new ItemModBaseIngot("ingotOrcichalcum");
		ingotIron = new ItemModBaseIngot("ingotIron");
		ingotGold = new ItemModBaseIngot("ingotGold");
		ingotEbony = new ItemModBaseIngot("ingotEbony");
		ingotspecialDwarven = new ItemModBaseIngot("ingotspecialDwarven");
		ingotCorundum = new ItemModBaseIngot("ingotCorundum");
		ingotMoonstone = new ItemModBaseIngot("ingotMoonstone");

		ingotCorundum.setSmeltingRecipe(new ItemStack(this.ingotrefinedMalachite), 4.0F);
		ingotIron.setSmeltingRecipe(new ItemStack(this.ingotSteel), 4.2F);


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

		gemoreQuicksilver = new ItemModBaseIngot("gemoreQuicksilver").setSmeltingRecipe(new ItemStack(this.ingotQuicksilver, 2), 0.35F);
		gemoreOrcichalcum = new ItemModBaseIngot("gemoreOrcichalcum").setSmeltingRecipe(new ItemStack(this.ingotOrcichalcum, 2), 0.35F);
		gemoreMoonstone = new ItemModBaseIngot("gemoreMoonstone").setSmeltingRecipe(new ItemStack(this.ingotMoonstone, 2), 0.35F);
		gemoreGold = new ItemModBaseIngot("gemoreGold").setSmeltingRecipe(new ItemStack(this.ingotGold, 2), 0.35F);
		gemoreEbony = new ItemModBaseIngot("gemoreEbony").setSmeltingRecipe(new ItemStack(this.ingotEbony, 2), 0.35F);
		gemoreCorundum = new ItemModBaseIngot("gemoreCorundum").setSmeltingRecipe(new ItemStack(this.ingotCorundum, 2), 0.35F);
		gemoreBase = new ItemModBaseIngot("gemoreBase");
		gemoreIron = new ItemModBaseIngot("gemoreIron").setSmeltingRecipe(new ItemStack(this.ingotIron, 2), 0.35F);
		gemoreSilver = new ItemModBaseIngot("gemoreSilver").setSmeltingRecipe(new ItemStack(this.ingotSilver, 2), 0.35F);

	}

}
