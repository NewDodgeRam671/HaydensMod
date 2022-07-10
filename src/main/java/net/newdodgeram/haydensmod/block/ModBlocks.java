package net.newdodgeram.haydensmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.newdodgeram.haydensmod.HaydensMod;
import net.newdodgeram.haydensmod.block.custom.EggplantCropBlock;
import net.newdodgeram.haydensmod.block.custom.JumpyBlock;
import net.newdodgeram.haydensmod.block.custom.OrnateLampBlock;
import net.newdodgeram.haydensmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block HAYDONIUM_BLOCK = registerBlock("haydonium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.GOLEMS);
    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.GOLEMS);
    public static final Block ORNATE_LAMP = registerBlock("ornate_lamp",
            new OrnateLampBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()
                    .luminance(state -> state.get(OrnateLampBlock.LIT) ? 15 : 0)), ModItemGroup.GOLEMS);
    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop",
            new EggplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(HaydensMod.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(HaydensMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        return Registry.register(Registry.ITEM, new Identifier(HaydensMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        HaydensMod.LOGGER.debug("Registering ModBlocks for " + HaydensMod.MOD_ID);
    }
}
