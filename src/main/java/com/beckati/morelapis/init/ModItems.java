package com.beckati.morelapis.init;

import com.beckati.morelapis.item.ModToolMaterials;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final String MOD_ID = "morelapis";

    public static Item LAPIS_BRICK;
    public static Item CRYSTALINE_LAPIS;
    public static Item LAPIS_COATED_AMETHYST;

    public static Item CRYSTALINE_LAPIS_SWORD;
    public static Item CRYSTALINE_LAPIS_SHOVEL;
    public static Item CRYSTALINE_LAPIS_PICKAXE;
    public static Item CRYSTALINE_LAPIS_AXE;
    public static Item CRYSTALINE_LAPIS_HOE;

    public static void registerItems() {
        LAPIS_BRICK = registerItem("lapis_brick", new Item(new Item.Settings().registryKey(key("lapis_brick"))));
        CRYSTALINE_LAPIS = registerItem("crystaline_lapis", new Item(new Item.Settings().registryKey(key("crystaline_lapis"))));
        LAPIS_COATED_AMETHYST = registerItem("lapis_coated_amethyst", new Item(new Item.Settings().registryKey(key("lapis_coated_amethyst"))));

        CRYSTALINE_LAPIS_SWORD = registerItem("crystaline_lapis_sword",
                new SwordItem(ModToolMaterials.CRYSTALINE_LAPIS, 3.0f, -2.4f, new Item.Settings().registryKey(key("crystaline_lapis_sword"))));
        CRYSTALINE_LAPIS_SHOVEL = registerItem("crystaline_lapis_shovel",
                new ShovelItem(ModToolMaterials.CRYSTALINE_LAPIS, 1.0f, -3.0f, new Item.Settings().registryKey(key("crystaline_lapis_shovel"))));
        CRYSTALINE_LAPIS_PICKAXE = registerItem("crystaline_lapis_pickaxe",
                new PickaxeItem(ModToolMaterials.CRYSTALINE_LAPIS, 1.0f, -3.0f, new Item.Settings().registryKey(key("crystaline_lapis_pickaxe"))));
        CRYSTALINE_LAPIS_AXE = registerItem("crystaline_lapis_axe",
                new AxeItem(ModToolMaterials.CRYSTALINE_LAPIS, 4.0f, -3.0f, new Item.Settings().registryKey(key("crystaline_lapis_axe"))));
        CRYSTALINE_LAPIS_HOE = registerItem("crystaline_lapis_hoe",
                new HoeItem(ModToolMaterials.CRYSTALINE_LAPIS, 1.0f, -3.0f, new Item.Settings().registryKey(key("crystaline_lapis_hoe"))));
    }

    private static RegistryKey<Item> key(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, key(name), item);
    }
}
