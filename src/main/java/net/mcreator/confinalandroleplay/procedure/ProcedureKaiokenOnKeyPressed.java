package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureKaiokenOnKeyPressed extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureKaiokenOnKeyPressed(ElementsConfinalandRoleplay instance) {
		super(instance, 71);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KaiokenOnKeyPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure KaiokenOnKeyPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure KaiokenOnKeyPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure KaiokenOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure KaiokenOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("confinalandroleplay:kaioken")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 300, (int) 3));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getFoodStats()
					.setFoodLevel((int) (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) - 6));
	}
}
