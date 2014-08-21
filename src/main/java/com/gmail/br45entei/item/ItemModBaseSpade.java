package com.gmail.br45entei.item;

import java.util.Set;

import com.gmail.br45entei.item.base.ItemModBaseSpadeBase;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

/**@author Brian_Entei */
public class ItemModBaseSpade extends ItemModBaseSpadeBase {

	public ItemModBaseSpade(String CodeName, ToolMaterial p_i45353_1_) {
		this(CodeName, p_i45353_1_, CreativeTabs.tabTools);
	}

	public ItemModBaseSpade(String CodeName, ToolMaterial p_i45353_1_, CreativeTabs creativeTab) {
		super(CodeName, p_i45353_1_);
		this.setCreativeTab(creativeTab);
	}

	@Override
	public ItemModBaseSpade setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
