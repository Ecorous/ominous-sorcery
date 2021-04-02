package com.expora.ominous;

import com.expora.ominous.registry.OSBlocks;
import com.expora.ominous.registry.OSItems;
import net.fabricmc.api.ModInitializer;

import static com.expora.ominous.registry.OSBlocks.registerBlocks;
import static com.expora.ominous.registry.OSItems.registerItems;

public class OS  implements ModInitializer {

    public static  String MODID = "ominoussorcery";

    @Override
    public void onInitialize() {
        registerBlocks();
        registerItems();
    }
}
