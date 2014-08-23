package com.gmail.br45entei.item.base;

import java.util.Set;

import com.gmail.br45entei.main.lib.Constants;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

/**@author Brian_Entei */
public class ItemModBaseToolBase extends ItemTool {
	public String CodeName;

	public ItemModBaseToolBase(String CodeName, float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
		super(p_i45333_1_, p_i45333_2_, p_i45333_3_);
		this.CodeName = CodeName;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(Constants.MODID + "_" + CodeName).setTextureName(Constants.MODID + ":" + CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBaseToolBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
