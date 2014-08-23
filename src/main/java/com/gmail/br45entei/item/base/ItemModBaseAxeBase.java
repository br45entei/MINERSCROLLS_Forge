package com.gmail.br45entei.item.base;

import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBaseAxeBase extends ItemAxe {
	public String CodeName;

	public ItemModBaseAxeBase(String CodeName, ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		this.CodeName = CodeName;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(Constants.MODID + "_" + CodeName).setTextureName(Constants.MODID + ":" + CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBaseAxeBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
