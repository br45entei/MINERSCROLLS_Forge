package com.gmail.br45entei.item.base;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBase extends Item {
	public String CodeName;

	public ItemModBase(String CodeName, CreativeTabs creativeTab) {
		this.CodeName = CodeName;
		this.maxStackSize = 64;
		this.setUnlocalizedName(CodeName).setCreativeTab(creativeTab).setTextureName(CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
