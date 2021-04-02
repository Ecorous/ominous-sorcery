package com.expora.ominous.registry;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.expora.ominous.OS.MODID;

public class OSItems
{
    public static final Item GRINDLEBERRIES= new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build()));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(MODID, "grindleberries"), GRINDLEBERRIES);
    }
}
