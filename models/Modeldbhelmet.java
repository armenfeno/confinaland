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