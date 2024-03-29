
package net.mcreator.confinalandroleplay.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.confinalandroleplay.creativetab.TabConfinalandPolice;
import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ItemTavernLow extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:tavernlow")
	public static final Item block = null;
	public ItemTavernLow(ElementsConfinalandRoleplay instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("confinalandroleplay:tavernlow", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("tavernlow", ElementsConfinalandRoleplay.sounds.get(new ResourceLocation("confinalandroleplay:musictavernlow")));
			setUnlocalizedName("tavernlow");
			setRegistryName("tavernlow");
			setCreativeTab(TabConfinalandPolice.tab);
		}
	}
}
