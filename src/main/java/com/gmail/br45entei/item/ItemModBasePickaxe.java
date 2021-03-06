package com.gmail.br45entei.item;

import java.util.Set;

import com.gmail.br45entei.item.base.ItemModBasePickaxeBase;
import com.gmail.br45entei.main.lib.Constants;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

/**@author Brian_Entei */
public class ItemModBasePickaxe extends ItemModBasePickaxeBase {

	public ItemModBasePickaxe(String CodeName, ToolMaterial p_i45347_1_) {
		this(CodeName, p_i45347_1_, CreativeTabs.tabTools);
	}

	public ItemModBasePickaxe(String CodeName, ToolMaterial p_i45347_1_, CreativeTabs creativeTab) {
		super(CodeName, p_i45347_1_);
		this.setCreativeTab(creativeTab);
	}

	@Override
	public ItemModBasePickaxe setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(Constants.MODID + ":" + this.CodeName);
		//System.err.println("Registered icon for item \"" + Constants.MODID + ":" + this.CodeName + "\".");
	}

}
