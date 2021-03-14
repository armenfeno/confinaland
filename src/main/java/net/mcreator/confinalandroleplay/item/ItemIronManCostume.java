
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
public class ItemIronManCostume extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:ironmancostumehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:ironmancostumebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:ironmancostumelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:ironmancostumeboots")
	public static final Item boots = null;
	public ItemIronManCostume(ElementsConfinalandRoleplay instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("IRONMANCOSTUME", "confinalandroleplay:ironman_", 0, new int[]{0, 0, 0, 0}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ironmancostumehelmet")
				.setRegistryName("ironmancostumehelmet").setCreativeTab(TabConfinalandPolice.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ironmancostumebody")
				.setRegistryName("ironmancostumebody").setCreativeTab(TabConfinalandPolice.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ironmancostumelegs")
				.setRegistryName("ironmancostumelegs").setCreativeTab(TabConfinalandPolice.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ironmancostumeboots")
				.setRegistryName("ironmancostumeboots").setCreativeTab(TabConfinalandPolice.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("confinalandroleplay:ironmancostumehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("confinalandroleplay:ironmancostumebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("confinalandroleplay:ironmancostumelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("confinalandroleplay:ironmancostumeboots", "inventory"));
	}
}
