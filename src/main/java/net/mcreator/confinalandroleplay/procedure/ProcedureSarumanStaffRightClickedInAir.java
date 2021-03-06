package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureSarumanStaffRightClickedInAir extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureSarumanStaffRightClickedInAir(ElementsConfinalandRoleplay instance) {
		super(instance, 34);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SarumanStaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SarumanStaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SarumanStaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SarumanStaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SarumanStaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SarumanStaffRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		double espera = 0;
		if ((!(world.isThundering()))) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("confinalandroleplay:saruman")), SoundCategory.NEUTRAL, (float) 5000, (float) 1);
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) x, (int) y, (int) z);
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(x, y, z);
					}
				}, "weather thunder");
			}
		} else {
			if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) >= 1)) {
				world.addWeatherEffect(new EntityLightningBolt(world,
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world
								.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100),
										false, false, true)
								.getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f), entity.getPositionEyes(1f)
								.addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100, entity.getLook(1f).z * 100), false, false, true)
								.getBlockPos().getZ()),
						false));
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).getFoodStats()
							.setFoodLevel((int) (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) - 5));
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 100);
			}
		}
	}
}
