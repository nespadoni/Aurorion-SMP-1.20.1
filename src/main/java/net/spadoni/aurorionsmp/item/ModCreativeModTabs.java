package net.spadoni.aurorionsmp.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.spadoni.aurorionsmp.AurorionSMP;

public class ModCreativeModTabs {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AurorionSMP.MOD_ID);

	public static final RegistryObject<CreativeModeTab> AURORION_SMP_TAB = CREATIVE_MODE_TABS.register("aurorion_smp_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AEONITA.get()))
					.title(Component.translatable("creativetab.aurorionsmp_tab"))
					.displayItems((pParameters, pOutput) -> {
						pOutput.accept(ModItems.AEONITA.get());
						pOutput.accept(ModItems.RAW_AEONITA.get());

						pOutput.accept(Items.DIAMOND);
					})
					.build());

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}

}
