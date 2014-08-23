package com.gmail.br45entei.item;

import com.gmail.br45entei.item.base.ItemModBaseAxeBase;
import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

/**@author Brian_Entei */
public class ItemModBaseAxe extends ItemModBaseAxeBase {

	public ItemModBaseAxe(String CodeName, ToolMaterial p_i45327_1_) {
		this(CodeName, p_i45327_1_, CreativeTabs.tabTools);
	}

	public ItemModBaseAxe(String CodeName, ToolMaterial p_i45327_1_, CreativeTabs creativeTab) {
		super(CodeName, p_i45327_1_);
		this.setCreativeTab(creativeTab);
	}

	@Override
	public ItemModBaseAxe setCreativeTab(CreativeTabs p_77637_1_) {
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
