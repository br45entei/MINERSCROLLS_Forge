package com.gmail.br45entei.block;

import java.util.Random;

import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * @author Brian_Entei
 *
 */
public class BlockModBaseOre extends BlockModBaseBlock {
	public Item itemDropped;
	public int amountDropped = 2;
	public boolean dropRandomExtraAmount = false;

	public BlockModBaseOre(String CodeName) {
		super(CodeName);
		this.setOreBlock();
	}

	@Override
	public BlockModBaseOre setCreativeTab(CreativeTabs creativeTab) {
		super.setCreativeTab(creativeTab);
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon(Constants.MODID + ":" + this.CodeName);
	}

	@Override
	public BlockModBaseOre setItemDropped(Item item) {
		this.itemDropped = item;
		return this;
	}

	@Override
	public BlockModBaseOre setItemDropped(Item item, int amountDropped) {
		this.itemDropped = item;
		this.amountDropped = amountDropped;
		return this;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return (this.itemDropped == null ? Item.getItemFromBlock(this) : this.itemDropped);
	}

	@Override
	public int quantityDropped(Random p_149745_1_) {
		return this.amountDropped + (this.dropRandomExtraAmount ? p_149745_1_.nextInt(3) : 0);
	}

	@Override
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_) {
		if(p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_)) {
			int var3 = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;
			if(var3 < 0) {
				var3 = 0;
			}
			return this.quantityDropped(p_149679_2_) * (var3 + 1);
		}
		return this.quantityDropped(p_149679_2_);
	}

	@Override
	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
		super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
		if (this.getItemDropped(p_149690_5_, p_149690_1_.rand, p_149690_7_) != Item.getItemFromBlock(this)) {
			int var8 = MathHelper.getRandomIntegerInRange(p_149690_1_.rand, 2, 5);
			this.dropXpOnBlockBreak(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, var8);
		}
	}

	@SuppressWarnings("cast")
	@Override
	public void dropXpOnBlockBreak(World p_149657_1_, int p_149657_2_, int p_149657_3_, int p_149657_4_, int p_149657_5_)
	{
		//if (!p_149657_1_.isClient)
		//{
			while (p_149657_5_ > 0)
			{
				int var6 = EntityXPOrb.getXPSplit(p_149657_5_);
				p_149657_5_ -= var6;
				p_149657_1_.spawnEntityInWorld(new EntityXPOrb(p_149657_1_, (double)p_149657_2_ + 0.5D, (double)p_149657_3_ + 0.5D, (double)p_149657_4_ + 0.5D, var6));
			}
		//}
	}

	/**Enables this block to be smelted in a furnace into another item
	 * @param output The item or block that comes out of the furnace
	 * @param xp The amount of experience the player receives upon removal of the output item
	 */
	@Override
	public BlockModBaseOre setSmeltingRecipe(ItemStack output, float xp) {
		GameRegistry.addSmelting(this, output, xp);
		return this;
	}

	public BlockModBaseOre setOreBlock() {
		this.setHardness(3.0F).setResistance(5.0F).setStepSound(soundTypePiston);
		this.setHarvestLevel("pickaxe", 1);
		return this;
	}

	@Override
	public BlockModBaseBlock setStoneBlock() {
		this.setHardness(1.5F).setResistance(10.0F).setStepSound(soundTypePiston);
		this.setHarvestLevel("pickaxe", 0);
		return this;
	}

	@Override
	public BlockModBaseBlock setGrassBlock() {
		this.setHardness(0.6F).setStepSound(soundTypeGrass);
		this.setHarvestLevel("shovel", 0);
		return this;
	}

	@Override
	public BlockModBaseBlock setDirtBlock() {
		this.setHardness(0.5F).setStepSound(soundTypeGravel);
		this.setHarvestLevel("shovel", 0);
		return this;
	}

	@Override
	public BlockModBaseBlock setWoodBlock() {
		this.setHardness(2.5F).setStepSound(soundTypeWood);
		this.setHarvestLevel("axe", 0);
		return this;
	}

	@Override
	public BlockModBaseOre setIsSlippery(boolean isSlippery) {
		this.slipperiness = (isSlippery ? 1.0F : 0.6F);
		return this;
	}

	@Override
	public BlockModBaseOre setCanBlockGrass(boolean canBlockGrass) {
		this.canBlockGrass = canBlockGrass;
		return this;
	}

	@Override
	public BlockModBaseOre setIsOpaqueCube(boolean isOpaqueCube) {
		this.opaque = isOpaqueCube;
		this.lightOpacity = this.opaque ? 255 : 0;
		return this;
	}

	/**@param lightLevel integer value 0 - 15 */
	@Override
	public BlockModBaseOre setLightLevel(int lightLevel) {
		if(lightLevel >= 0 && lightLevel <= 15) {
			this.lightValue = lightLevel;
		} else {
			System.err.println("Warning: The light level of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightLevel + "\"; it must be an integer value of 0 to 15.");
		}
		return this;
	}

	/**@param lightOpacity integer value 0(transparent) - 255(opaque) */
	@Override
	public BlockModBaseOre setLightOpacity(int lightOpacity) {
		if(lightOpacity >= 0 && lightOpacity <= 255) {
			this.lightOpacity = lightOpacity;
		} else {
			System.err.println("Warning: The light opacity value of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightOpacity + "\"; it must be an integer value of 0(transparent) to 255(opaque).");
		}
		return this;
	}

}
