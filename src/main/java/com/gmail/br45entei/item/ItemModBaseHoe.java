package com.gmail.br45entei.item;

import com.gmail.br45entei.item.base.ItemModBaseHoeBase;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

/**@author Brian_Entei */
public class ItemModBaseHoe extends ItemModBaseHoeBase {

	public ItemModBaseHoe(String CodeName, ToolMaterial p_i45353_1_) {
		this(CodeName, p_i45353_1_, CreativeTabs.tabTools);
	}

	public ItemModBaseHoe(String CodeName, ToolMaterial p_i45353_1_, CreativeTabs creativeTab) {
		super(CodeName, p_i45353_1_);
		this.setCreativeTab(creativeTab);
	}

	@Override
	public ItemModBaseHoe setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
