package net.ssgssp.createfarming.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeTabs {
    public static final CreativeModeTab ITEM_CREATE_FARMING_TAB = new CreativeModeTab("itemcreatefarmingtab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.REDSTONEMIXFLUORITE.get());
        }
    };
}
