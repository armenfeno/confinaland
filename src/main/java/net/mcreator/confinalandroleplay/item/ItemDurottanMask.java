
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
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.confinalandroleplay.creativetab.TabConfinalandPolice;
import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ItemDurottanMask extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:durottanmaskhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:durottanmaskbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:durottanmasklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:durottanmaskboots")
	public static final Item boots = null;
	public ItemDurottanMask(ElementsConfinalandRoleplay instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DUROTTANMASK", "confinalandroleplay:durottan_mask_", 0, new int[]{0, 0, 0, 0}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("durottanmaskhelmet")
				.setRegistryName("durottanmaskhelmet").setCreativeTab(TabConfinalandPolice.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("confinalandroleplay:durottanmaskhelmet", "inventory"));
	}
}
