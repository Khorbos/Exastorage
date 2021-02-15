package com.khorbos.exastorage.data.client;

import com.khorbos.exastorage.ExastorageMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExastorageMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("copper_block", modLoc("block/copper_block"));
        withExistingParent("copper_ore", modLoc("block/copper_ore"));

        
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "item/copper_ingot");
        builder(itemGenerated, "item/usb_key");
        builder(itemGenerated, "item/1k_usb_key");
        builder(itemGenerated, "item/2k_usb_key");
        builder(itemGenerated, "item/4k_usb_key");
        builder(itemGenerated, "item/8k_usb_key");
        builder(itemGenerated, "item/16k_usb_key");
        builder(itemGenerated, "item/crafting_usb_key");
        builder(itemGenerated, "item/furnace_usb_key");
        builder(itemGenerated, "item/brewing_usb_key");
        builder(itemGenerated, "item/enchanting_usb_key");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", name);
    }
}
