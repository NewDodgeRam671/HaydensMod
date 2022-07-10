package net.newdodgeram.haydensmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.newdodgeram.haydensmod.entity.ModEntities;
import net.newdodgeram.haydensmod.entity.custom.MountainGolemEntity;

public class ModRegistries {

    public static void registerAdditionals() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MOUNTAIN_GOLEM, MountainGolemEntity.setAttributes());
    }
}
