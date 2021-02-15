package com.khorbos.exastorage.data.group;

import com.khorbos.exastorage.setup.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ExaGroupItems extends ItemGroup {
    public ExaGroupItems(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return ModItems.USB_KEY.get().getDefaultInstance();
    }
}
