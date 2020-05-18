package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureDBscouterHelmetTickEvent extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureDBscouterHelmetTickEvent(ElementsConfinalandRoleplay instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DBscouterHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 1, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (int) 60, (int) 10, (false), (false)));
	}
}
