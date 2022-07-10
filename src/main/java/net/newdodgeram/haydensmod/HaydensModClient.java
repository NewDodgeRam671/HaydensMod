package net.newdodgeram.haydensmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.newdodgeram.haydensmod.block.ModBlocks;
import net.newdodgeram.haydensmod.entity.ModEntities;
import net.newdodgeram.haydensmod.entity.client.MountainGolemRenderer;

public class HaydensModClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.MOUNTAIN_GOLEM, MountainGolemRenderer::new);
    }
}
