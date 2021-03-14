
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
public class ItemRbncinhoMask extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:rbncinhomaskhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:rbncinhomaskbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:rbncinhomasklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:rbncinhomaskboots")
	public static final Item boots = null;
	public ItemRbncinhoMask(ElementsConfinalandRoleplay instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RBNCINHOMASK", "confinalandroleplay:rbncinho_mask_", 0, new int[]{0, 0, 0, 0}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rbncinhomaskhelmet")
				.setRegistryName("rbncinhomaskhelmet").setCreativeTab(TabConfinalandPolice.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("confinalandroleplay:rbncinhomaskhelmet", "inventory"));
	}
}
