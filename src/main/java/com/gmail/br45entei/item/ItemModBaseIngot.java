package com.gmail.br45entei.item;

import java.util.Random;

import com.gmail.br45entei.item.base.ItemModBase;
import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * @author Brian_Entei
 *
 */
public class ItemModBaseIngot extends ItemModBase {

	public ItemModBaseIngot(String CodeName) {
		super(CodeName, CreativeTabs.tabMaterials);
	}

	@Override
	public ItemModBaseIngot setCreativeTab(CreativeTabs p_77637_1_) {
		super.setCreativeTab(p_77637_1_);
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(Constants.MODID + ":" + this.CodeName);
		//System.err.println("Registered icon for item \"" + Constants.MODID + ":" + this.CodeName + "\".");
	}

	/**Enables this ingot to be smelted in a furnace into another item
	 * @param output The item or block that comes out of the furnace
	 * @param xp The amount of experience the player receives upon removal of the output item
	 */
	public ItemModBaseIngot setSmeltingRecipe(ItemStack output, float xp) {
		GameRegistry.addSmelting(this, output, xp);
		return this;
	}

}
