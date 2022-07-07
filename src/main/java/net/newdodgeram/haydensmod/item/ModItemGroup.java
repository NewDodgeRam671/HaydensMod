package net.newdodgeram.haydensmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.newdodgeram.haydensmod.HaydensMod;

public class ModItemGroup {
    public static final ItemGroup GOLEMS = FabricItemGroupBuilder.build(
            new Identifier(HaydensMod.MOD_ID, "golems"), () -> new ItemStack(ModItems.GOLEM_HEART));
}
