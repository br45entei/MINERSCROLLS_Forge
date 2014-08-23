package com.gmail.br45entei.item;

import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**@author Brian_Entei */
public class ItemModBaseWeaponHammer extends ItemModBaseWeapon {

	public ItemModBaseWeaponHammer(String CodeName, ToolMaterial p_i45356_1_) {
		this(CodeName, p_i45356_1_, CreativeTabs.tabCombat);
	}

	public ItemModBaseWeaponHammer(String CodeName, ToolMaterial p_i45356_1_, CreativeTabs creativeTab) {
		super(CodeName, p_i45356_1_);
		this.setCreativeTab(creativeTab);
	}

	@Override
	public ItemModBaseWeaponHammer setCreativeTab(CreativeTabs p_77637_1_) {
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
