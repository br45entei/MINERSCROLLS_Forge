package com.gmail.br45entei.item.base;

import java.util.Set;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBasePickaxeBase extends ItemPickaxe {
	public String CodeName;

	public ItemModBasePickaxeBase(String CodeName, ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		this.CodeName = CodeName;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName(CodeName).setTextureName(CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBasePickaxeBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
