package net.newdodgeram.haydensmod.entity.client;

import net.minecraft.util.Identifier;
import net.newdodgeram.haydensmod.HaydensMod;
import net.newdodgeram.haydensmod.entity.custom.MountainGolemEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class MountainGolemModel extends AnimatedGeoModel<MountainGolemEntity> {
    @Override
    public Identifier getModelResource(MountainGolemEntity object) {
        return new Identifier(HaydensMod.MOD_ID, "geo/mountain_golem.geo.json");
    }

    @Override
    public Identifier getTextureResource(MountainGolemEntity object) {
        return new Identifier(HaydensMod.MOD_ID, "textures/entity/mountain_golem/mountain_golem.png");
    }

    @Override
    public Identifier getAnimationResource(MountainGolemEntity animatable) {
        return new Identifier(HaydensMod.MOD_ID, "animations/mountain_golem.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(MountainGolemEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180f));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180f));
        }
    }
}
