package com.gmail.br45entei.main;

import net.minecraft.entity.player.EntityPlayer;

import com.gmail.br45entei.block.BlockModBaseBlock;
import com.gmail.br45entei.main.lib.Constants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
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
	public final MaterialIndex materialIndex;
	public final ItemIndex itemIndex;
	public final RecipeIndex recipeIndex;
	public final FurnaceFuel furnaceFuelIndex;
	public final GeneratorIndex generatorIndex;
	@Instance(Constants.MODID)
	private static Main instance;
	public final Main getInstance() {return instance;}

	public Main() {
		this.materialIndex = new MaterialIndex();//Set up custom Item Material types
		this.itemIndex = new ItemIndex(this.materialIndex);//Set up Items
		this.blockIndex = new BlockIndex();//Set up blocks
		this.furnaceFuelIndex = new FurnaceFuel();
		this.recipeIndex = new RecipeIndex(this.blockIndex, this.itemIndex);//Set up custom item/block recipes
		this.generatorIndex = new GeneratorIndex(this.blockIndex);//Set up world generators
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		instance = new Main();
		instance.materialIndex.initialize();
		instance.itemIndex.initialize();
		instance.blockIndex.initialize(instance.itemIndex, instance.materialIndex);
		instance.recipeIndex.initialize();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		instance.furnaceFuelIndex.initialize();
		instance.generatorIndex.initialize();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
