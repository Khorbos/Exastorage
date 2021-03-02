package com.khorbos.exastorage.core.init;

import com.khorbos.exastorage.ExastorageMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExastorageMod.ID);

    public static final RegistryObject<Item> USB_KEY = ITEMS.register("usb_key", () -> new Item(new Item.Properties()));

}
