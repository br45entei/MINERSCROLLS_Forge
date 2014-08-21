package com.gmail.br45entei.item;

import java.util.Random;

import com.gmail.br45entei.item.base.ItemModBase;

import cpw.mods.fml.common.registry.GameRegistry;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBaseItem extends ItemModBase {

	public ItemModBaseItem(String CodeName) {
		super(CodeName, CreativeTabs.tabMaterials);
	}

	@Override
	public ItemModBaseItem setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
