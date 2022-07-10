package net.newdodgeram.haydensmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.newdodgeram.haydensmod.HaydensMod;
import net.newdodgeram.haydensmod.entity.custom.MountainGolemEntity;

public class ModEntities {

    public static final EntityType<MountainGolemEntity> MOUNTAIN_GOLEM = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(HaydensMod.MOD_ID, "mountain_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MountainGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(2.0f,2.5f)).build());

}
