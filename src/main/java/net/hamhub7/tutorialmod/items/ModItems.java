package net.hamhub7.tutorialmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hamhub7.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()),
            ModItemGroup.TANZANITE);
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()),
            ModItemGroup.TANZANITE);


    private static Item registerItem(String name, Item item, ItemGroup group)
    {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
