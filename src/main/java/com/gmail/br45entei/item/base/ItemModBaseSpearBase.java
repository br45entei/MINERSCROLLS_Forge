package com.gmail.br45entei.item.base;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBaseSpearBase extends ItemModBaseWeaponBase {
	public String CodeName;

	public ItemModBaseSpearBase(String CodeName, ToolMaterial p_i45356_1_) {
		super(CodeName, p_i45356_1_);
	}

	@Override
	public ItemModBaseSpearBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
