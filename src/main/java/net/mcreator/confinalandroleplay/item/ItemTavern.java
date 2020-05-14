
package net.mcreator.confinalandroleplay.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ItemTavern extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:tavern")
	public static final Item block = null;
	public ItemTavern(ElementsConfinalandRoleplay instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("confinalandroleplay:tavern", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("tavern", ElementsConfinalandRoleplay.sounds.get(new ResourceLocation("confinalandroleplay:musictavern")));
			setUnlocalizedName("tavern");
			setRegistryName("tavern");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
