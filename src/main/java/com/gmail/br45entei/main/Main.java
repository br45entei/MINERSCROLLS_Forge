package com.gmail.br45entei.main;

import net.minecraft.entity.player.EntityPlayer;

import com.gmail.br45entei.block.BlockModBaseBlock;
import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Brian_Entei
 *
 */
@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class Main {

	public final BlockIndex blockIndex;
	public final ItemIndex itemIndex;
	public final RecipeIndex recipeIndex;
	private static Main instance;
	public final Main getInstance() {return instance;}

	public Main() {
		this.blockIndex = new BlockIndex();//Set up blocks
		this.itemIndex = new ItemIndex();//Set up Items
		this.recipeIndex = new RecipeIndex(this.blockIndex, this.itemIndex);
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		instance = new Main();
		instance.blockIndex.initialize();
		instance.itemIndex.initialize();
		instance.recipeIndex.initialize();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
