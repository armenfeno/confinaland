package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureBastoMagicMobIsHitWithItem extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureBastoMagicMobIsHitWithItem(ElementsConfinalandRoleplay instance) {
		super(instance, 69);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BastoMagicMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BastoMagicMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BastoMagicMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BastoMagicMobIsHitWithItem!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() > 0.66)) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("confinalandroleplay:dbpunch1")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else if ((Math.random() < 0.33)) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("confinalandroleplay:dbpunch2")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("confinalandroleplay:dbpunch3")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		}
	}
}
