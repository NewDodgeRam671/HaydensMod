package net.newdodgeram.haydensmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.newdodgeram.haydensmod.block.ModBlocks;
import net.newdodgeram.haydensmod.entity.ModEntities;
import net.newdodgeram.haydensmod.entity.custom.MountainGolemEntity;

public class ModRegistries {

    public static void registerAdditionals() {

        registerAttributes();
        registerFlammableBlock();
        registerStrippables();

    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MOUNTAIN_GOLEM, MountainGolemEntity.setAttributes());
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.WYRMWOOD_LOG, ModBlocks.STRIPPED_WYRMWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.WYRMWOOD_WOOD, ModBlocks.STRIPPED_WYRMWOOD_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.WYRMWOOD_LOG, 5, 5);
        instance.add(ModBlocks.WYRMWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_WYRMWOOD_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_WYRMWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.WYRMWOOD_PLANKS, 5, 20);

    }
}
