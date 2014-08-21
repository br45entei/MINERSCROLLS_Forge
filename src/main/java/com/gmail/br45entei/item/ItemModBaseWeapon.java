package com.gmail.br45entei.item;

import com.gmail.br45entei.item.base.ItemModBaseWeaponBase;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

/**@author Brian_Entei */
public class ItemModBaseWeapon extends ItemModBaseWeaponBase {

	public ItemModBaseWeapon(String CodeName, ToolMaterial p_i45356_1_) {
		this(CodeName, p_i45356_1_, CreativeTabs.tabCombat);
	}

	public ItemModBaseWeapon(String CodeName, ToolMaterial p_i45356_1_, CreativeTabs creativeTab) {
		super(CodeName, p_i45356_1_);
		this.setCreativeTab(creativeTab);
	}

	@Override
	public ItemModBaseWeapon setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}