package com.beckati.morelapis.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModToolMaterials {
    public static final TagKey<Item> CRYSTALINE_LAPIS_REPAIR = TagKey.of(RegistryKeys.ITEM, Identifier.of("morelapis", "crystaline_lapis_materials"));

    public static ToolMaterial CRYSTALINE_LAPIS;

    public static void init() {
        CRYSTALINE_LAPIS = new ToolMaterial(
                BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                300,
                64.5f,
                4.0f,
                30,
                CRYSTALINE_LAPIS_REPAIR
        );
    }
}
