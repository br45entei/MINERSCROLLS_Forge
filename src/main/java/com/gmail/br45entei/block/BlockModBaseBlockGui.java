package com.gmail.br45entei.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**@author Brian_Entei */
public class BlockModBaseBlockGui extends BlockModBaseBlock {

	/**This block class is not yet ready to be used. */
	public BlockModBaseBlockGui(String CodeName) {
		super(CodeName);
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		//player.openGui(mod, modGuiId, world, x, y, z);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		if(world.isRemote) {
			return true;
		}
		player.displayGUIWorkbench(x, y, z);
		return true;
	}

}
