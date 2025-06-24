package net.spadoni.aurorionsmp.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spadoni.aurorionsmp.AurorionSMP;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, AurorionSMP.MOD_ID);

	public static final RegistryObject<Item> AEONITA = ITEMS.register("aeonita",
			() -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> RAW_AEONITA = ITEMS.register("raw_aeonita",
			() -> new Item(new Item.Properties()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
