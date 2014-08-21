package com.gmail.br45entei.item.base;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBaseHoeBase extends ItemHoe {
	public String CodeName;

	public ItemModBaseHoeBase(String CodeName, ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.CodeName = CodeName;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(CodeName).setTextureName(CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBaseHoeBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
