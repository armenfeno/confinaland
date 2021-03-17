/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.confinalandroleplay;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsConfinalandRoleplay implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsConfinalandRoleplay() {
		sounds.put(new ResourceLocation("confinalandroleplay", "alto_policia"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "alto_policia")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sirena_policia"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sirena_policia")));
		sounds.put(new ResourceLocation("confinalandroleplay", "super_saiyan"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "super_saiyan")));
		sounds.put(new ResourceLocation("confinalandroleplay", "myers"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "myers")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sauron_speech"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sauron_speech")));
		sounds.put(new ResourceLocation("confinalandroleplay", "legolas"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "legolas")));
		sounds.put(new ResourceLocation("confinalandroleplay", "saruman"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "saruman")));
		sounds.put(new ResourceLocation("confinalandroleplay", "mariobros"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "mariobros")));
		sounds.put(new ResourceLocation("confinalandroleplay", "justicehammer"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "justicehammer")));
		sounds.put(new ResourceLocation("confinalandroleplay", "armengolshop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "armengolshop")));
		sounds.put(new ResourceLocation("confinalandroleplay", "fart1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "fart1")));
		sounds.put(new ResourceLocation("confinalandroleplay", "fart2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "fart2")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablepowerdown"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablepowerdown")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablefail00"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablefail00")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablefail01"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablefail01")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablefail02"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablefail02")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablewaiting"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablewaiting")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablehit00"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablehit00")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablehit01"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablehit01")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sablehit02"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sablehit02")));
		sounds.put(new ResourceLocation("confinalandroleplay", "sableignition"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "sableignition")));
		sounds.put(new ResourceLocation("confinalandroleplay", "canvidelloc"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "canvidelloc")));
		sounds.put(new ResourceLocation("confinalandroleplay", "cellstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "cellstep")));
		sounds.put(new ResourceLocation("confinalandroleplay", "dbjump"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "dbjump")));
		sounds.put(new ResourceLocation("confinalandroleplay", "dragonballsound"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "dragonballsound")));
		sounds.put(new ResourceLocation("confinalandroleplay", "kaioken"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "kaioken")));
		sounds.put(new ResourceLocation("confinalandroleplay", "dbpunch3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "dbpunch3")));
		sounds.put(new ResourceLocation("confinalandroleplay", "dbpunch2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "dbpunch2")));
		sounds.put(new ResourceLocation("confinalandroleplay", "dbpunch1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "dbpunch1")));
		sounds.put(new ResourceLocation("confinalandroleplay", "jurassicpark"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "jurassicpark")));
		sounds.put(new ResourceLocation("confinalandroleplay", "discoteca_exterior"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "discoteca_exterior")));
		sounds.put(new ResourceLocation("confinalandroleplay", "tavernmusic"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "tavernmusic")));
		sounds.put(new ResourceLocation("confinalandroleplay", "doorbell"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "doorbell")));
		sounds.put(new ResourceLocation("confinalandroleplay", "centro_comercial"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "centro_comercial")));
		sounds.put(new ResourceLocation("confinalandroleplay", "pokemon"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "pokemon")));
		sounds.put(new ResourceLocation("confinalandroleplay", "coliseo"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "coliseo")));
		sounds.put(new ResourceLocation("confinalandroleplay", "discoteca_interior"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "discoteca_interior")));
		sounds.put(new ResourceLocation("confinalandroleplay", "the_purge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "the_purge")));
		sounds.put(new ResourceLocation("confinalandroleplay", "protesto"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "protesto")));
		sounds.put(new ResourceLocation("confinalandroleplay", "unmomento"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "unmomento")));
		sounds.put(new ResourceLocation("confinalandroleplay", "tomaya"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "tomaya")));
		sounds.put(new ResourceLocation("confinalandroleplay", "dovahkiin"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("confinalandroleplay", "dovahkiin")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsConfinalandRoleplay.ModElement.class)
					elements.add((ElementsConfinalandRoleplay.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsConfinalandRoleplay.ModElement::initElements);
		this.addNetworkMessage(ConfinalandRoleplayVariables.WorldSavedDataSyncMessageHandler.class,
				ConfinalandRoleplayVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = ConfinalandRoleplayVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = ConfinalandRoleplayVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				ConfinalandRoleplay.PACKET_HANDLER.sendTo(new ConfinalandRoleplayVariables.WorldSavedDataSyncMessage(0, mapdata),
						(EntityPlayerMP) event.player);
			if (worlddata != null)
				ConfinalandRoleplay.PACKET_HANDLER.sendTo(new ConfinalandRoleplayVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = ConfinalandRoleplayVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				ConfinalandRoleplay.PACKET_HANDLER.sendTo(new ConfinalandRoleplayVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			ConfinalandRoleplay.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsConfinalandRoleplay elements;
		protected final int sortid;
		public ModElement(ElementsConfinalandRoleplay elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
