/**
 * 
 */
package com.gmail.br45entei.block;

import java.util.Random;

import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * @author Brian_Entei
 *
 */
public class BlockModBaseBlockFacing extends BlockModBaseBlock {

	public BlockModBaseBlockFacing(String CodeName) {
		super(CodeName);
		this.setWoodBlock();//this.setStoneBlock();
	}

	@Override
	public BlockModBaseBlock setCreativeTab(CreativeTabs creativeTab) {
		super.setCreativeTab(creativeTab);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setItemDropped(Item item) {
		this.itemDropped = item;
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setItemDropped(Item item, int amountDropped) {
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
	@Override
	public BlockModBaseBlockFacing setSmeltingRecipe(ItemStack output, float xp) {
		GameRegistry.addSmelting(this, output, xp);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setIngotBlock(ToolMaterial material) {
		if(material.equals(ToolMaterial.IRON) || material.equals(ToolMaterial.EMERALD) || material.name().equals("EBONY")) {
			this.setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal);
		}
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setStoneBlock() {
		this.setHardness(1.5F).setResistance(10.0F).setStepSound(soundTypePiston);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setGrassBlock() {
		this.setHardness(0.6F).setStepSound(soundTypeGrass);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setDirtBlock() {
		this.setHardness(0.5F).setStepSound(soundTypeGravel);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setWoodBlock() {
		this.setHardness(2.5F).setStepSound(soundTypeWood);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setIsSlippery(boolean isSlippery) {
		this.slipperiness = (isSlippery ? 1.0F : 0.6F);
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setCanBlockGrass(boolean canBlockGrass) {
		this.canBlockGrass = canBlockGrass;
		return this;
	}

	@Override
	public BlockModBaseBlockFacing setIsOpaqueCube(boolean isOpaqueCube) {
		this.opaque = isOpaqueCube;
		this.lightOpacity = this.opaque ? 255 : 0;
		return this;
	}

	/**@param lightLevel integer value 0 - 15 */
	@Override
	public BlockModBaseBlockFacing setLightLevel(int lightLevel) {
		if(lightLevel >= 0 && lightLevel <= 15) {
			this.lightValue = lightLevel;
		} else {
			System.err.println("Warning: The light level of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightLevel + "\"; it must be an integer value of 0 to 15.");
		}
		return this;
	}

	/**@param lightOpacity integer value 0(transparent) - 255(opaque) */
	@Override
	public BlockModBaseBlockFacing setLightOpacity(int lightOpacity) {
		if(lightOpacity >= 0 && lightOpacity <= 255) {
			this.lightOpacity = lightOpacity;
		} else {
			System.err.println("Warning: The light opacity value of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightOpacity + "\"; it must be an integer value of 0(transparent) to 255(opaque).");
		}
		return this;
	}


	private boolean canChangeSides = false;
	public BlockModBaseBlockFacing setCanSideChangeToPlayerView(boolean canChangeSides) {
		this.canChangeSides = canChangeSides;
		return this;
	}

	@SideOnly(Side.CLIENT)
	protected IIcon bottom;
	@SideOnly(Side.CLIENT)
	protected IIcon top;
	@SideOnly(Side.CLIENT)
	protected IIcon north;
	@SideOnly(Side.CLIENT)
	protected IIcon south;
	@SideOnly(Side.CLIENT)
	protected IIcon west;
	@SideOnly(Side.CLIENT)
	protected IIcon east;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName);
		this.bottom = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_bottom");
		this.top = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_top");
		this.north = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_north");
		this.south = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_south");
		this.west = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_west");
		this.east = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_east");
		System.err.println("Registered block icons for block \"" + this.CodeName + "\".");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		IIcon rtrn = null;//blockIcon;
		if(!this.canChangeSides) {
			if(side == 0) {rtrn = bottom;} else
			if(side == 1) {rtrn = top;} else
			if(side == 2) {rtrn = north;} else
			if(side == 3) {rtrn = south;} else
			if(side == 4) {rtrn = west;} else
			if(side == 5) {rtrn = east;} else {
				System.err.println("int side: \"" + side + "\"; int meta: \"" + meta + "\" was not registered!!!");
			}
		} else {
			if(meta == 0) {//player is facing up, block is facing down
				if(side == 0) {rtrn = south;} else
				if(side == 1) {rtrn = north;} else
				if(side == 2) {rtrn = bottom;} else
				if(side == 3) {rtrn = top;} else
				if(side == 4) {rtrn = west;} else
				if(side == 5) {rtrn = east;} else {
					System.err.println("int side: \"" + side + "\"; int meta: \"" + meta + "\" was not registered!!!");
				}
			} else if(meta == 1) {//player is facing down, block is facing up
				
			} else if(meta == 2) {//(normal)player is facing south, block is facing north
				if(side == 0) {rtrn = bottom;} else
				if(side == 1) {rtrn = top;} else
				if(side == 2) {rtrn = north;} else
				if(side == 3) {rtrn = south;} else
				if(side == 4) {rtrn = west;} else
				if(side == 5) {rtrn = east;} else {
					System.err.println("int side: \"" + side + "\"; int meta: \"" + meta + "\" was not registered!!!");
				}
			} else if(meta == 3) {//player is facing north, block is facing south
				
			}
		}
		//System.err.println("\"" + rtrn.getIconName().replace(Constants.MODID + ":", "") + "\" is meta: " + meta + "; side: " + side + ".");
		return rtrn;
	}

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
		int l = determineOrientation(par1World, par2, par3, par4, par5EntityLivingBase);
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
		System.out.println("metadata for block: " + par1World.getBlockMetadata(par2, par3, par4));
	}

	public static int determineOrientation(World par0World, int par1, int par2, int par3, EntityLivingBase par4EntityLivingBase) {
		if(MathHelper.abs((float)par4EntityLivingBase.posX - par1) < 2.0F && MathHelper.abs((float)par4EntityLivingBase.posZ - par3) < 2.0F) {
			double d0 = par4EntityLivingBase.posY + 1.82D - par4EntityLivingBase.yOffset;
			if(d0 - par2 > 2.0D) {
				return 1;
			}
			if(par2 - d0 > 0.0D) {
				return 0;
			}
		}
		int l = MathHelper.floor_double((par4EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		return l == 0 ? 2 : (l == 1 ? 5 : (l == 2 ? 3 : (l == 3 ? 4 : 0)));
	}

	public static int getOrientation(int par0) {
		return par0 & 7;
	}

}
