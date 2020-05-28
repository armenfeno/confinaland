
package net.mcreator.confinalandroleplay.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ItemDBmuerte extends ElementsConfinalandRoleplay.ModElement {
	@GameRegistry.ObjectHolder("confinalandroleplay:dbmuertehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:dbmuertebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:dbmuertelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("confinalandroleplay:dbmuerteboots")
	public static final Item boots = null;
	public ItemDBmuerte(ElementsConfinalandRoleplay instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DBMUERTE", "confinalandroleplay:dragon_ball_scouter_", 25, new int[]{2, 5, 6, 2},
				9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modeldbhelmet().helmet;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "confinalandroleplay:textures/muerte.png";
			}
		}.setUnlocalizedName("dbmuertehelmet").setRegistryName("dbmuertehelmet").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("confinalandroleplay:dbmuertehelmet", "inventory"));
	}
	public static class Modeldbhelmet extends ModelBase {
		private final ModelRenderer helmet;
		public Modeldbhelmet() {
			textureWidth = 16;
			textureHeight = 16;
			helmet = new ModelRenderer(this);
			helmet.setRotationPoint(-2.0F, -11.5F, -2.0F);
			helmet.cubeList.add(new ModelBox(helmet, 0, 4, -1.5F, -0.5F, 0.5F, 1, 1, 3, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 4, 8, -0.5F, -0.5F, 3.5F, 1, 1, 1, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 5, 0, 0.5F, -0.5F, 4.5F, 3, 1, 1, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 0, 8, 3.5F, -0.5F, 3.5F, 1, 1, 1, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 0, 0, 4.5F, -0.5F, 0.5F, 1, 1, 3, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 7, 3, 3.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 5, 5, 0.5F, -0.5F, -1.5F, 3, 1, 1, 0.0F, false));
			helmet.cubeList.add(new ModelBox(helmet, 7, 7, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			helmet.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.helmet.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.helmet.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
