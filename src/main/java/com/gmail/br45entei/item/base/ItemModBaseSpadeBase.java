package com.gmail.br45entei.item.base;

import java.util.Set;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBaseSpadeBase extends ItemSpade {
	public String CodeName;

	public ItemModBaseSpadeBase(String CodeName, ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.CodeName = CodeName;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(CodeName).setTextureName(CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBaseSpadeBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
