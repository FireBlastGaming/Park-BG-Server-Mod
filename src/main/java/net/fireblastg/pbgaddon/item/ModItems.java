package net.fireblastg.pbgaddon.item;

import net.fireblastg.pbgaddon.PBGaddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, PBGaddon.MOD_ID);

    public static final RegistryObject<Item> LEAGUECOIN = ITEMS.register("leaguecoin",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));

    public static final RegistryObject<Item> MOSSBADGE = ITEMS.register("mossbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> LEAFBADGE = ITEMS.register("leafbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> SHADEBADGE = ITEMS.register("shadebadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> FLYINGBADGE = ITEMS.register("flyingbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> NEUTRALBADGE = ITEMS.register("neutralbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> SNOWBALLBADGE = ITEMS.register("snowballbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> FABLEBADGE = ITEMS.register("fablebadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> MANTLEBADGE = ITEMS.register("mantlebadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> TERRABADGE = ITEMS.register("terrabadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> BRAWLERBADGE = ITEMS.register("brawlerbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> DARKNESSBADGE = ITEMS.register("darknessbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> SPYBADGE = ITEMS.register("spybadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> WATERBADGE = ITEMS.register("waterbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> FIREBADGE = ITEMS.register("firebadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> ELECTRICBADGE = ITEMS.register("electricbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> DUNGEONBADGE = ITEMS.register("dungeonbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> FRIGHTBADGE = ITEMS.register("frightbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> GOLDBADGE = ITEMS.register("goldbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> RESERVOIRBADGE = ITEMS.register("reservoirbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> THORAXBADGE = ITEMS.register("thoraxbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> CHEMICALBADGE = ITEMS.register("chemicalbadge",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> BLANKSTONE = ITEMS.register("blankstone",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> ELITEKEY = ITEMS.register("elitekey",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static final RegistryObject<Item> PLACEHOLDER = ITEMS.register("placeholder",()-> new Item(new Item.Properties().tab(ModCreativeTab.PBG)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
