package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureThePurgeRightClickedInAir extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureThePurgeRightClickedInAir(ElementsConfinalandRoleplay instance) {
		super(instance, 101);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ThePurgeRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ThePurgeRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ThePurgeRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ThePurgeRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ThePurgeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("confinalandroleplay:the_purge")), SoundCategory.NEUTRAL, (float) 5000, (float) 1);
		if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
			entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
					return entity.world;
				}

				@Override
				public MinecraftServer getServer() {
					return entity.world.getMinecraftServer();
				}

				@Override
				public boolean sendCommandFeedback() {
					return false;
				}

				@Override
				public BlockPos getPosition() {
					return entity.getPosition();
				}

				@Override
				public Vec3d getPositionVector() {
					return new Vec3d(entity.posX, entity.posY, entity.posZ);
				}

				@Override
				public Entity getCommandSenderEntity() {
					return entity;
				}
			}, "time set night");
		}
		{
			TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (inv instanceof TileEntityLockableLoot)
				((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
		}
		System.out.println("QUE COMIENCE LA PURGA");
	}
}
