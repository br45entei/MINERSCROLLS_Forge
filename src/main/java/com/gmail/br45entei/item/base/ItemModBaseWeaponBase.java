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
public class ItemModBaseWeaponBase extends ItemSword {
	public String CodeName;

	public ItemModBaseWeaponBase(String CodeName, ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.CodeName = CodeName;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName(CodeName).setTextureName(CodeName);
		GameRegistry.registerItem(this, CodeName);
	}

	@Override
	public ItemModBaseWeaponBase setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

}
