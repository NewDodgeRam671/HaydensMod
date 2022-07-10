package net.newdodgeram.haydensmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.newdodgeram.haydensmod.HaydensMod;
import net.newdodgeram.haydensmod.block.ModBlocks;
import net.newdodgeram.haydensmod.item.custom.EightBallItem;

public class ModItems {

    public static final Item GOLEM_HEART = registerItem("golem_heart",
            new Item(new FabricItemSettings().group(ModItemGroup.GOLEMS)));
    public static final Item GOLEMS_BLOOM = registerItem("golems_bloom",
            new Item(new FabricItemSettings().group(ModItemGroup.GOLEMS)));
    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.GOLEMS).maxCount(1)));
    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP, new FabricItemSettings().group(ModItemGroup.GOLEMS)));
    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.GOLEMS)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4).build())));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HaydensMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HaydensMod.LOGGER.debug("Registering Mod Items for " + HaydensMod.MOD_ID);
    }
}
