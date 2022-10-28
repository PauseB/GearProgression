package com.pauseb.gearprogression.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GP_TAB = new CreativeModeTab("gptab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CARNELIAN.get());
        }
    };
}
