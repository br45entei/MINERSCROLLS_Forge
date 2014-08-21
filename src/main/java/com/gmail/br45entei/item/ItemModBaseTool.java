package com.gmail.br45entei.item;

import java.util.Set;

import com.gmail.br45entei.item.base.ItemModBaseToolBase;
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
public class ItemModBaseTool extends ItemModBaseToolBase {


	public ItemModBaseTool(String CodeName, float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
		this(CodeName, CreativeTabs.tabTools, p_i45333_1_, p_i45333_2_, p_i45333_3_);
	}

	public ItemModBaseTool(String CodeName, CreativeTabs creativeTab, float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
		super(CodeName, p_i45333_1_, p_i45333_2_, p_i45333_3_);
	}

	@Override
	public ItemModBaseTool setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
