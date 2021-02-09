package com.khorbos.exastorage.data;

import com.khorbos.exastorage.ExastorageMod;
import com.khorbos.exastorage.setup.ModBlocks;
import com.khorbos.exastorage.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ExastorageMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.ORES_COPPER).add(ModBlocks.COPPER_ORE.get());
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COPPER);
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_COPPER).add(ModBlocks.COPPER_BLOCK.get());
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_COPPER);
    }
}
