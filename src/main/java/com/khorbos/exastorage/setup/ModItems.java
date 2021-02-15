package com.khorbos.exastorage.setup;

import com.khorbos.exastorage.ExastorageMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final RegistryObject<Item> COPPER_INGOT = Registration.ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> USB_KEY = Registration.ITEMS.register("usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> ONEK_USB_KEY = Registration.ITEMS.register("1k_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> TWOK_USB_KEY = Registration.ITEMS.register("2k_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> FOURK_USB_KEY = Registration.ITEMS.register("4k_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> EIGHTK_USB_KEY = Registration.ITEMS.register("8k_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> SIXTEENK_USB_KEY = Registration.ITEMS.register("16k_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> CRAFTING_USB_KEY = Registration.ITEMS.register("crafting_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> FURNACE_USB_KEY = Registration.ITEMS.register("furnace_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> BREWING_USB_KEY = Registration.ITEMS.register("brewing_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));
    public static final RegistryObject<Item> ENCHANTING_USB_KEY = Registration.ITEMS.register("enchanting_usb_key", () -> new Item(new Item.Properties().group(ExastorageMod.EXA_ITEMS)));


    static void register() {}
}