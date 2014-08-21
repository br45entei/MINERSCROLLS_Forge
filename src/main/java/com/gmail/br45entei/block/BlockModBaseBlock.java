package com.gmail.br45entei.block;

import java.util.Random;

import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

/**
 * @author Brian_Entei
 *
 */
public class BlockModBaseBlock extends Block {

	public BlockModBaseBlock(String CodeName) {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock).setBlockName(Constants.MODID + "_" + CodeName).setBlockTextureName(CodeName);
		GameRegistry.registerBlock(this, CodeName);
	}

	@Override
	public BlockModBaseBlock setCreativeTab(CreativeTabs creativeTab) {
		super.setCreativeTab(creativeTab);
		return this;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(this);
	}

	public BlockModBaseBlock setIngotBlock(ToolMaterial material) {
		if(material.equals(ToolMaterial.IRON) || material.equals(ToolMaterial.EMERALD)) {
			this.setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal);
		}
		return this;
	}

	public BlockModBaseBlock setWoodBlock() {
		this.setHardness(2.5F).setStepSound(soundTypeWood);
		return this;
	}

	public BlockModBaseBlock setStoneBlock() {
		this.setHardness(1.5F).setResistance(10.0F).setStepSound(soundTypePiston);
		return this;
	}

	public BlockModBaseBlock setDirtBlock() {
		this.setHardness(0.5F).setStepSound(soundTypeGravel);
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
			System.out.println("Warning: The light level of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightLevel + "\"; it must be an integer value of 0 to 15.");
		}
		return this;
	}

	/**@param lightOpacity integer value 0(transparent) - 255(opaque) */
	@Override
	public BlockModBaseBlock setLightOpacity(int lightOpacity) {
		if(lightOpacity >= 0 && lightOpacity <= 255) {
			this.lightOpacity = lightOpacity;
		} else {
			System.out.println("Warning: The light opacity value of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightOpacity + "\"; it must be an integer value of 0(transparent) to 255(opaque).");
		}
		return this;
	}

}
