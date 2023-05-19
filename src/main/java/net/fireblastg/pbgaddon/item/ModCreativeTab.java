package net.fireblastg.pbgaddon.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab PBG = new CreativeModeTab("pbgtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEAGUECOIN.get());
        }
    };
}
