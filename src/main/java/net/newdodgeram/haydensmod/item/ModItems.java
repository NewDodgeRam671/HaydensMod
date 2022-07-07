package net.newdodgeram.haydensmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.newdodgeram.haydensmod.HaydensMod;

public class ModItems {

    public static final Item GOLEM_HEART = registerItem("golem_heart",
            new Item(new FabricItemSettings().group(ModItemGroup.GOLEMS)));
    public static final Item GOLEMS_BLOOM = registerItem("golems_bloom",
            new Item(new FabricItemSettings().group(ModItemGroup.GOLEMS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HaydensMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HaydensMod.LOGGER.debug("Registering Mod Items for " + HaydensMod.MOD_ID);
    }
}
