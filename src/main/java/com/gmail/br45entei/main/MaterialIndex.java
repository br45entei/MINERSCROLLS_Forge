package com.gmail.br45entei.main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * @author Brian_Entei
 *
 */
public class MaterialIndex {

	public MaterialIndex() {}

	public ToolMaterials toolMaterials;

	public final void initialize() {
		this.toolMaterials = new ToolMaterials();
		this.toolMaterials.initialize();
		
	}

	public final class ToolMaterials {

		public ToolMaterials() {}

		public ToolMaterial IRON;
		public ToolMaterial GOLD;
		public ToolMaterial EBONY;
		

		public final void initialize() {
			IRON = EnumHelper.addToolMaterial("IRON", 2, 250, 6.0F, 2.0F, 14);
			GOLD = EnumHelper.addToolMaterial("GOLD", 0, 32, 12.0F, 0.0F, 22);
			EBONY = EnumHelper.addToolMaterial("EBONY", 5, 2000, 13.0F, 5.0F, 30);
		}
	}

}
