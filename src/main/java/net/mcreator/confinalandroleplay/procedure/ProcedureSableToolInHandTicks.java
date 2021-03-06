package net.mcreator.confinalandroleplay.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.confinalandroleplay.ElementsConfinalandRoleplay;

@ElementsConfinalandRoleplay.ModElement.Tag
public class ProcedureSableToolInHandTicks extends ElementsConfinalandRoleplay.ModElement {
	public ProcedureSableToolInHandTicks(ElementsConfinalandRoleplay instance) {
		super(instance, 52);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SableToolInHandTicks!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SableToolInHandTicks!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SableToolInHandTicks!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SableToolInHandTicks!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SableToolInHandTicks!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("counter1", ((entity.getEntityData().getDouble("counter1")) + 1));
		if ((((entity.getEntityData().getDouble("counter1")) % 40) == 0)) {
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureSableWaiting.executeProcedure($_dependencies);
			}
		}
	}
}
