
package net.mcreator.confinalandroleplay.item;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ItemDNI extends ElementsConfinalandRoleplay.ModElement {

	@GameRegistry.ObjectHolder("confinalandroleplay:dni")
	public static final Item block = null;

	public ItemDNI(ElementsConfinalandRoleplay instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("confinalandroleplay:dni", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("dni");
			setRegistryName("dni");
			setCreativeTab(CreativeTabs.MISC);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("DNI Confinaliense");
		}

	}

}
