
package net.mcreator.confinalandroleplay.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ItemXSylvanitasxMask extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:xsylvanitasxmaskhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:xsylvanitasxmaskbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:xsylvanitasxmasklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:xsylvanitasxmaskboots")
	public static final Item boots = null;
	public ItemXSylvanitasxMask(ElementsConfinalandRoleplay instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("XSYLVANITASXMASK", "confinalandroleplay:xylvanitasx_mask_", 25,
				new int[]{2, 5, 6, 2}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("xsylvanitasxmaskhelmet")
				.setRegistryName("xsylvanitasxmaskhelmet").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("confinalandroleplay:xsylvanitasxmaskhelmet", "inventory"));
	}
}
