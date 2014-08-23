package com.gmail.br45entei.item.base;

import java.util.ArrayList;

import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
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
		this.setCreativeTab(creativeTab).setUnlocalizedName(Constants.MODID + "_" + CodeName).setTextureName(Constants.MODID + ":" + CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(Constants.MODID + ":" + this.CodeName);
		System.err.println("Registered icon for item \"" + Constants.MODID + ":" + this.CodeName + "\".");
	}

}
