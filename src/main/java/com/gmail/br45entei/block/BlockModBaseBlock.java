package com.gmail.br45entei.block;

import java.util.Random;

import com.gmail.br45entei.item.ItemModBaseIngot;
import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

/**
 * @author Brian_Entei
 *
 */
public class BlockModBaseBlock extends Block {
	public String CodeName;
	public Item itemDropped;
	public int amountDropped = 1;

	public BlockModBaseBlock(String CodeName) {
		super(Material.rock);
		this.CodeName = CodeName;
		this.setStoneBlock().setCreativeTab(CreativeTabs.tabBlock).setBlockName(Constants.MODID + "_" + CodeName).setBlockTextureName(Constants.MODID + ":" + CodeName);
		GameRegistry.registerBlock(this, CodeName);
	}

	@Override
	public BlockModBaseBlock setCreativeTab(CreativeTabs creativeTab) {
		super.setCreativeTab(creativeTab);
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon(Constants.MODID + ":" + this.CodeName);
		//System.err.println("Registered icon for block \"" + Constants.MODID + ":" + this.CodeName + "\".");
	}

	public BlockModBaseBlock setItemDropped(Item item) {
		this.itemDropped = item;
		return this;
	}

	public BlockModBaseBlock setItemDropped(Item item, int amountDropped) {
		this.itemDropped = item;
		this.amountDropped = amountDropped;
		return this;
	}

	@Override
	public int quantityDropped(Random p_149745_1_) {
		return this.amountDropped;// + (this.dropRandomExtraAmount ? p_149745_1_.nextInt(3) : 0);
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return (this.itemDropped == null ? Item.getItemFromBlock(this) : this.itemDropped);
	}

	/**Enables this block to be smelted in a furnace into another item
	 * @param output The item or block that comes out of the furnace
	 * @param xp The amount of experience the player receives upon removal of the output item
	 */
	public BlockModBaseBlock setSmeltingRecipe(ItemStack output, float xp) {
		GameRegistry.addSmelting(this, output, xp);
		return this;
	}

	public BlockModBaseBlock setIngotBlock(ToolMaterial material) {
		if(material.equals(ToolMaterial.IRON) || material.equals(ToolMaterial.EMERALD) || material.name().equals("EBONY")) {
			this.setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal);
		}
		return this;
	}

	public BlockModBaseBlock setStoneBlock() {
		this.setHardness(1.5F).setResistance(10.0F).setStepSound(soundTypePiston);
		return this;
	}

	public BlockModBaseBlock setGrassBlock() {
		this.setHardness(0.6F).setStepSound(soundTypeGrass);
		return this;
	}

	public BlockModBaseBlock setDirtBlock() {
		this.setHardness(0.5F).setStepSound(soundTypeGravel);
		return this;
	}

	public BlockModBaseBlock setWoodBlock() {
		this.setHardness(2.5F).setStepSound(soundTypeWood);
		return this;
	}

	public BlockModBaseBlock setIsSlippery(boolean isSlippery) {
		this.slipperiness = (isSlippery ? 1.0F : 0.6F);
		return this;
	}

	public BlockModBaseBlock setCanBlockGrass(boolean canBlockGrass) {
		this.canBlockGrass = canBlockGrass;
		return this;
	}

	public BlockModBaseBlock setIsOpaqueCube(boolean isOpaqueCube) {
		this.opaque = isOpaqueCube;
		this.lightOpacity = this.opaque ? 255 : 0;
		return this;
	}

	/**@param lightLevel integer value 0 - 15 */
	public BlockModBaseBlock setLightLevel(int lightLevel) {
		if(lightLevel >= 0 && lightLevel <= 15) {
			this.lightValue = lightLevel;
		} else {
			System.err.println("Warning: The light level of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightLevel + "\"; it must be an integer value of 0 to 15.");
		}
		return this;
	}

	/**@param lightOpacity integer value 0(transparent) - 255(opaque) */
	@Override
	public BlockModBaseBlock setLightOpacity(int lightOpacity) {
		if(lightOpacity >= 0 && lightOpacity <= 255) {
			this.lightOpacity = lightOpacity;
		} else {
			System.err.println("Warning: The light opacity value of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightOpacity + "\"; it must be an integer value of 0(transparent) to 255(opaque).");
		}
		return this;
	}

}
