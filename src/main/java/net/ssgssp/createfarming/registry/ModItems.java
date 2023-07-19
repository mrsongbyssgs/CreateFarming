package net.ssgssp.createfarming.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ssgssp.createfarming.CreateFarming;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFarming.MODID);

    public static final RegistryObject<Item> REDSTONEMIXFLUORITE = ITEMS.register("redstonemixfluorite", () -> new Item((new Item.Properties().tab(ModCreativeTabs.ITEM_CREATE_FARMING_TAB))));
}
