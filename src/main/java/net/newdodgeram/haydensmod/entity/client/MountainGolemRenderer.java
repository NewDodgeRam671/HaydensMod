package net.newdodgeram.haydensmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.newdodgeram.haydensmod.HaydensMod;
import net.newdodgeram.haydensmod.entity.custom.MountainGolemEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MountainGolemRenderer extends GeoEntityRenderer<MountainGolemEntity> {
    public MountainGolemRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MountainGolemModel());
    }

    @Override
    public Identifier getTextureResource(MountainGolemEntity object) {
        return new Identifier(HaydensMod.MOD_ID, "textures/entity/mountain_golem/mountain_golem.png");
    }
}
