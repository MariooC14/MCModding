package net.marioc14.learningmod.item;

import net.marioc14.learningmod.LearningMod;
import net.marioc14.learningmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // This is the items list that forge uses to load these items to minecraft
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MOD_ID);

    // Implement your items here.
    // RegistryObject should be of only type Item in this file.
    // Once you registered your item to the game, you need to implement its texture, name, and add it into the creative mode tab.
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties()
                    .durability(100)));


    // This is the function used by the main mod manager to load the items to minecraft.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
