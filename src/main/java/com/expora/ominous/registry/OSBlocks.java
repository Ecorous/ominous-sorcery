package com.expora.ominous.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.expora.ominous.OS.MODID;

public class OSBlocks
{
    public static final Block GRENDELWOOD_LOG = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));
    public static final Block GRENDELWOOD_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f));


    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "grendelwood_log"), GRENDELWOOD_LOG);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "grendelwood_planks"), GRENDELWOOD_PLANKS);
    }
}
