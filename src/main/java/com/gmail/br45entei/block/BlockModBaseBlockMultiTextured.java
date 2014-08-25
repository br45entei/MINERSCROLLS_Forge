/**
 * 
 */
package com.gmail.br45entei.block;

import java.util.List;
import java.util.Random;

import com.gmail.br45entei.main.RecipeIndex;
import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

/**
 * @author Brian_Entei
 *
 */
public class BlockModBaseBlockMultiTextured extends BlockModBaseBlock {
	private boolean initialized = false;
	public BlockModBaseBlockMultiTextured initialize() {
		this.initialized = true;
		return this;
	}

	public BlockModBaseBlockMultiTextured(String CodeName) {
		super(CodeName);
		this.setWoodBlock();//this.setStoneBlock();
	}

	@Override
	public BlockModBaseBlockMultiTextured setBlockTextureName(String CodeName) {
		super.setBlockTextureName(Constants.MODID + ":" + CodeName);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setCreativeTab(CreativeTabs creativeTab) {
		super.setCreativeTab(creativeTab);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setItemDropped(Item item) {
		this.itemDropped = item;
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setItemDropped(Item item, int amountDropped) {
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
	public BlockModBaseBlockMultiTextured setSmeltingRecipe(ItemStack output, float xp) {
		GameRegistry.addSmelting(this, output, xp);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setIngotBlock(ItemStack itemStack, int harvestLevel) {
		this.ingotItem = itemStack;
		this.setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal);
		RecipeIndex.addIngotRecipe(this, this.ingotItem.getItem(), this.ingotItem.stackSize);
		this.setHarvestLevel("pickaxe", harvestLevel);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setIngotBlock(ItemStack itemStack) {
		return this.setIngotBlock(itemStack, 1);
	}

	@Override
	public BlockModBaseBlockMultiTextured setStoneBlock() {
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
	public BlockModBaseBlockMultiTextured setDirtBlock() {
		this.setHardness(0.5F).setStepSound(soundTypeGravel);
		this.setHarvestLevel("shovel", 0);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setWoodBlock() {
		this.setHardness(2.5F).setStepSound(soundTypeWood);
		this.setHarvestLevel("axe", 0);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setIsSlippery(boolean isSlippery) {
		this.slipperiness = (isSlippery ? 1.0F : 0.6F);
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setCanBlockGrass(boolean canBlockGrass) {
		this.canBlockGrass = canBlockGrass;
		return this;
	}

	@Override
	public BlockModBaseBlockMultiTextured setIsOpaqueCube(boolean isOpaqueCube) {
		this.opaque = isOpaqueCube;
		this.lightOpacity = this.opaque ? 255 : 0;
		return this;
	}

	/**@param lightLevel integer value 0 - 15 */
	@Override
	public BlockModBaseBlockMultiTextured setLightLevel(int lightLevel) {
		if(lightLevel >= 0 && lightLevel <= 15) {
			this.lightValue = lightLevel;
		} else {
			System.err.println("Warning: The light level of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightLevel + "\"; it must be an integer value of 0 to 15.");
		}
		return this;
	}

	/**@param lightOpacity integer value 0(transparent) - 255(opaque) */
	@Override
	public BlockModBaseBlockMultiTextured setLightOpacity(int lightOpacity) {
		if(lightOpacity >= 0 && lightOpacity <= 255) {
			this.lightOpacity = lightOpacity;
		} else {
			System.err.println("Warning: The light opacity value of block \"" + this.getUnlocalizedName() + "\" cannot be set to \"" + lightOpacity + "\"; it must be an integer value of 0(transparent) to 255(opaque).");
		}
		return this;
	}

	private boolean isMultiTextured = false;
	public BlockModBaseBlockMultiTextured setIsMultiTextured(boolean isMultiTextured) {
		this.isMultiTextured = isMultiTextured;
		return this;
	}

	private boolean canChangeSides = false;
	public BlockModBaseBlockMultiTextured setCanSideChangeToPlayerView(boolean canChangeSides) {
		this.canChangeSides = canChangeSides;
		return this;
	}

	/*@SideOnly(Side.CLIENT)
	protected IIcon north;
	@SideOnly(Side.CLIENT)
	protected IIcon south;
	@SideOnly(Side.CLIENT)
	protected IIcon top;
	@SideOnly(Side.CLIENT)
	protected IIcon bottom;
	@SideOnly(Side.CLIENT)
	protected IIcon west;
	@SideOnly(Side.CLIENT)
	protected IIcon east;*/

	@SideOnly(Side.CLIENT)
	protected IIcon[] sides;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName);
		/*this.bottom = thisiconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_bottom");
		/*this.top = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_top");
		/*this.south = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_south");
		/*this.north = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_north");
		/*this.east = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_east");
		/*this.west = iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_west");*/
		this.sides = new IIcon[] {
				iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_bottom"),
				iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_top"),
				iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_north"),
				iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_south"),
				iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_west"),
				iconRegister.registerIcon(Constants.MODID + ":" + this.CodeName + "_east")
		};
		System.err.println("Registered block icons for block \"" + this.CodeName + "\".");
	}

	public String getUnlocalizedName(ItemStack stack) {
		switch(stack.getItemDamage()) {
		case 0:
			return this.getUnlocalizedName() + "_bottom";
		case 1:
			return this.getUnlocalizedName() + "_top";
		case 2:
			return this.getUnlocalizedName() + "_north";
		case 3:
			return this.getUnlocalizedName() + "_south";
		case 4:
			return this.getUnlocalizedName() + "_west";
		case 5:
			return this.getUnlocalizedName() + "_east";
		default:
			return this.getUnlocalizedName();
		}
	}

	@Override
	public boolean renderAsNormalBlock() {
		return (this.isMultiTextured ? !this.canChangeSides : super.renderAsNormalBlock());
	}

	@Override
	public int getRenderType() {
		return (this.isMultiTextured ? (this.canChangeSides ? 16 : super.getRenderType()) : super.getRenderType());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		if(!this.canChangeSides) {
			return this.sides[side];
		}
		switch(meta) {
			case 0 :
				switch(side) {
					case 0 : return this.sides[1];
					case 1 : return this.sides[0];
					case 2 : return this.sides[3];
					case 3 : return this.sides[2];
					case 4 : return this.sides[4];
					case 5 : return this.sides[5];
				}
			case 1 :
				return this.sides[side];
			case 2 :
				switch(side) {
					case 0 : return this.sides[3];
					case 1 : return this.sides[2];
					case 2 : return this.sides[1];
					case 3 : return this.sides[0];
					case 4 : return this.sides[5];
					case 5 : return this.sides[4];
				}
			case 3 :
				switch(side) {
					case 0 : return this.sides[3];
					case 1 : return this.sides[2];
					case 2 : return this.sides[0];
					case 3 : return this.sides[1];
					case 4 : return this.sides[4];
					case 5 : return this.sides[5];
				}
			case 4 :
				switch(side) {
					case 0 : return this.sides[3];
					case 1 : return this.sides[2];
					case 2 : return this.sides[4];
					case 3 : return this.sides[5];
					case 4 : return this.sides[1];
					case 5 : return this.sides[0];
				}
			case 5 :
				switch(side) {
					case 0 : return this.sides[3];
					case 1 : return this.sides[2];
					case 2 : return this.sides[5];
					case 3 : return this.sides[4];
					case 4 : return this.sides[0];
					case 5 : return this.sides[1];
				}
		}
		System.err.println("int side: \"" + side + "\"; int meta: \"" + meta + "\" was not registered for the block \"" + this.getUnlocalizedName() + "\"!");
		return blockIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < 6; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
		int l = determineOrientation(par1World, par2, par3, par4, par5EntityLivingBase);
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
		//System.out.println("\"l\" var: \"" + l + "\"; metadata for block: " + par1World.getBlockMetadata(par2, par3, par4));
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

}
