package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

import java.util.Random;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureBastoMagicRightClickedInAir extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureBastoMagicRightClickedInAir(ElementsConfinalandRoleplay instance) {
		super(instance, 72);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BastoMagicRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BastoMagicRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BastoMagicRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BastoMagicRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BastoMagicRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BastoMagicRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).experienceLevel : 0) >= 1)) {
			if (((itemstack.getItemDamage()) != 9)) {
				if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) >= 0)) {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("confinalandroleplay:canvidelloc")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
					entity.setPositionAndUpdate(
							(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 500, entity.getLook(1f).y * 500,
											entity.getLook(1f).z * 500),
									false, false, true).getBlockPos().getX()),
							((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 500, entity.getLook(1f).y * 500,
											entity.getLook(1f).z * 500),
									false, false, true).getBlockPos().getY()) + 1),
							(entity.world.rayTraceBlocks(entity.getPositionEyes(1f), entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 500,
									entity.getLook(1f).y * 500, entity.getLook(1f).z * 500), false, false, true).getBlockPos().getZ()));
					world.playSound((EntityPlayer) null, (entity.posX), (entity.posY), (entity.posZ),
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation("confinalandroleplay:canvidelloc")),
							SoundCategory.NEUTRAL, (float) 3, (float) 1);
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).addExperienceLevel(-((int) 1));
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getFoodStats().setFoodLevel(
								(int) (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) - 5));
					world.playSound((EntityPlayer) null, (entity.posX), (entity.posY), (entity.posZ),
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation("confinalandroleplay:kaioken")),
							SoundCategory.NEUTRAL, (float) 5, (float) 1);
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 450, (int) 3));
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 1000);
					if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
						itemstack.shrink(1);
						itemstack.setItemDamage(0);
					}
				}
			}
		}
	}
}
