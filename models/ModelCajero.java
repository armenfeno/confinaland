
public static class ModelCajero extends ModelBase {
	private final ModelRenderer bone;

	public ModelCajero() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -3.0F, -8.0F, 16, 3, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 42, 42, -8.0F, -4.0F, -8.0F, 16, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 45, 19, -8.0F, -5.0F, -8.0F, 16, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 42, 33, -8.0F, -6.0F, -8.0F, 16, 1, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 46, -8.0F, -14.0F, -8.0F, 16, 8, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 33, -8.0F, -15.0F, -8.0F, 16, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 19, -8.0F, -16.0F, -8.0F, 16, 1, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}