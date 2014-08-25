package com.gmail.br45entei.main;

import java.util.Map;
import java.util.HashMap;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

/**@author Brian_Entei */
public class FurnaceFuel implements IFuelHandler {

	public FurnaceFuel() {}

	public void initialize() {
		/*Wooden Slabs - 150
		Anything made out of wood - 300
		Wooden Tools - 200
		Sticks - 100
		Coal - 1600
		Lava Bucket - 20000
		Sapling - 100
		Blaze Rod - 2400*/
		addBurnableItem(new ItemStack(Blocks.wooden_slab), 150);
		addBurnableItem(new ItemStack(Blocks.chest), 300);
		addBurnableItem(new ItemStack(Blocks.crafting_table), 300);
		addBurnableItem(new ItemStack(Blocks.dark_oak_stairs), 300);
		addBurnableItem(new ItemStack(Blocks.double_wooden_slab), 300);
		addBurnableItem(new ItemStack(Blocks.fence), 300);
		addBurnableItem(new ItemStack(Blocks.fence_gate), 300);
		addBurnableItem(new ItemStack(Blocks.jungle_stairs), 300);
		addBurnableItem(new ItemStack(Blocks.ladder), 300);
		addBurnableItem(new ItemStack(Blocks.log), 300);
		addBurnableItem(new ItemStack(Blocks.log2), 300);
		addBurnableItem(new ItemStack(Blocks.oak_stairs), 300);
		addBurnableItem(new ItemStack(Blocks.piston_head), 300);
		addBurnableItem(new ItemStack(Blocks.planks), 300);
		addBurnableItem(new ItemStack(Blocks.sapling), 100);
		addBurnableItem(new ItemStack(Blocks.torch), 300);
		addBurnableItem(new ItemStack(Blocks.tnt), 100000);//XD lol it's going to exploooode! XD
		addBurnableItem(new ItemStack(Blocks.trapdoor), 300);
		addBurnableItem(new ItemStack(Blocks.trapped_chest), 300);
		addBurnableItem(new ItemStack(Blocks.wall_sign), 300);
		addBurnableItem(new ItemStack(Blocks.web), 75);
		addBurnableItem(new ItemStack(Blocks.wooden_button), 300);
		addBurnableItem(new ItemStack(Blocks.wooden_door), 300);
		addBurnableItem(new ItemStack(Blocks.wooden_pressure_plate), 300);
		addBurnableItem(new ItemStack(Blocks.wooden_slab), 300);
		addBurnableItem(new ItemStack(Blocks.wool), 300);
		addBurnableItem(new ItemStack(Items.blaze_powder), 1250);
		addBurnableItem(new ItemStack(Items.blaze_rod), 2400);
		addBurnableItem(new ItemStack(Items.bowl), 300);
		addBurnableItem(new ItemStack(Items.coal), 1600);
		addBurnableItem(new ItemStack(Items.filled_map), 100);
		addBurnableItem(new ItemStack(Items.map), 100);
		addBurnableItem(new ItemStack(Items.fishing_rod), 150);
		addBurnableItem(new ItemStack(Items.lava_bucket), 20000);
		addBurnableItem(new ItemStack(Items.lead), 100);
		addBurnableItem(new ItemStack(Items.leather), 300);
		addBurnableItem(new ItemStack(Items.leather_boots), 310);
		addBurnableItem(new ItemStack(Items.leather_chestplate), 450);
		addBurnableItem(new ItemStack(Items.leather_helmet), 320);
		addBurnableItem(new ItemStack(Items.leather_leggings), 360);
		addBurnableItem(new ItemStack(Items.magma_cream), 1200);
		addBurnableItem(new ItemStack(Items.name_tag), 100);
		addBurnableItem(new ItemStack(Items.nether_star), 60000);
		addBurnableItem(new ItemStack(Items.painting), 100);
		addBurnableItem(new ItemStack(Items.saddle), 500);
		addBurnableItem(new ItemStack(Items.sign), 300);
		addBurnableItem(new ItemStack(Items.stick), 100);
		addBurnableItem(new ItemStack(Items.string), 50);
		addBurnableItem(new ItemStack(Items.wheat), 75);
		addBurnableItem(new ItemStack(Items.wheat_seeds), 10);
		addBurnableItem(new ItemStack(Items.wooden_axe), 200);
		addBurnableItem(new ItemStack(Items.wooden_door), 300);
		addBurnableItem(new ItemStack(Items.wooden_hoe), 200);
		addBurnableItem(new ItemStack(Items.wooden_pickaxe), 200);
		addBurnableItem(new ItemStack(Items.wooden_shovel), 200);
		addBurnableItem(new ItemStack(Items.wooden_sword), 200);
		addBurnableItem(new ItemStack(Items.writable_book), 75);
		addBurnableItem(new ItemStack(Items.written_book), 80);
		
		
		
		GameRegistry.registerFuelHandler(this);
	}

	private static Map<ItemStack, Integer> customBurnableItems = new HashMap<ItemStack, Integer>();
	public static void addBurnableItem(ItemStack item, int burnTime) {
		customBurnableItems.put(item, Integer.valueOf(burnTime));
	}

	public static void removeBurnableItem(ItemStack item) {
		customBurnableItems.remove(item);
	}

	@Override
	public int getBurnTime(ItemStack item) {
		Item fuel = item.getItem();
		int fuelID = Item.getIdFromItem(fuel);
		for(Map.Entry<ItemStack, Integer> entry : this.customBurnableItems.entrySet()) {
			Item curItem = entry.getKey().getItem();
			@SuppressWarnings("boxing")
			int burnTime = entry.getValue();
			if(fuelID == Item.getIdFromItem(curItem)) {
				return burnTime;
			}
		}
		return 0;
	}

}
