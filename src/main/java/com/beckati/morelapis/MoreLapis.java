package com.beckati.morelapis;

import com.beckati.morelapis.init.ModBlocks;
import com.beckati.morelapis.init.ModItems;
import com.beckati.morelapis.item.ModToolMaterials;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreLapis implements ModInitializer {
    public static final String MOD_ID = "morelapis";

    public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "tab"));
    public static final ItemGroup ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            ITEM_GROUP_KEY,
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.LAPIS_BRICKS))
                    .displayName(Text.translatable("itemGroup.morelapis.tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LAPIS_BRICK);
                        entries.add(ModItems.CRYSTALINE_LAPIS);
                        entries.add(ModItems.LAPIS_COATED_AMETHYST);

                        entries.add(ModItems.CRYSTALINE_LAPIS_SWORD);
                        entries.add(ModItems.CRYSTALINE_LAPIS_SHOVEL);
                        entries.add(ModItems.CRYSTALINE_LAPIS_PICKAXE);
                        entries.add(ModItems.CRYSTALINE_LAPIS_AXE);
                        entries.add(ModItems.CRYSTALINE_LAPIS_HOE);

                        entries.add(ModBlocks.LAPIS_BRICK_LAMP);
                        entries.add(ModBlocks.LAPIS_BRICK_SHROOMLIGHT);
                        entries.add(ModBlocks.LAPIS_BRICKS);
                        entries.add(ModBlocks.LAPIS_BRICK_STAIRS);
                        entries.add(ModBlocks.LAPIS_BRICK_SLAB);
                        entries.add(ModBlocks.SMOOTH_LAPIS_BRICKS);
                        entries.add(ModBlocks.SMOOTH_LAPIS_BRICK_STAIRS);
                        entries.add(ModBlocks.SMOOTH_LAPIS_BRICK_SLAB);
                        entries.add(ModBlocks.LAPIS_LOG);
                        entries.add(ModBlocks.LAPIS_PLANKS);
                        entries.add(ModBlocks.LAPIS_PLANK_STAIRS);
                        entries.add(ModBlocks.LAPIS_PLANK_SLAB);
                        entries.add(ModBlocks.LAPIS_PLANK_BUTTON);
                        entries.add(ModBlocks.LAPIS_PLANK_FENCE);
                        entries.add(ModBlocks.LAPIS_PLANK_FENCE_GATE);
                        entries.add(ModBlocks.LAPIS_PLANK_PRESSURE_PLATE);
                        entries.add(ModBlocks.LAPIS_LEAVES);
                        entries.add(ModBlocks.LAPIS_SAPLING);
                    })
                    .build()
    );

    @Override
    public void onInitialize() {
        ModToolMaterials.init();
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        registerVanillaInteractions();
        registerVanillaItemGroups();
    }

    private void registerVanillaInteractions() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModBlocks.LAPIS_LOG, 300);
            builder.add(ModBlocks.LAPIS_PLANKS, 300);
            builder.add(ModBlocks.LAPIS_PLANK_STAIRS, 300);
            builder.add(ModBlocks.LAPIS_PLANK_SLAB, 150);
            builder.add(ModBlocks.LAPIS_PLANK_FENCE, 300);
            builder.add(ModBlocks.LAPIS_PLANK_FENCE_GATE, 300);
            builder.add(ModBlocks.LAPIS_PLANK_PRESSURE_PLATE, 300);
            builder.add(ModBlocks.LAPIS_PLANK_BUTTON, 100);
            builder.add(ModBlocks.LAPIS_SAPLING, 100);
        });

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LAPIS_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LAPIS_SAPLING, 0.3f);

        FlammableBlockRegistry flammable = FlammableBlockRegistry.getDefaultInstance();
        flammable.add(ModBlocks.LAPIS_LOG, 5, 5);
        flammable.add(ModBlocks.LAPIS_PLANKS, 5, 20);
        flammable.add(ModBlocks.LAPIS_PLANK_STAIRS, 5, 20);
        flammable.add(ModBlocks.LAPIS_PLANK_SLAB, 5, 20);
        flammable.add(ModBlocks.LAPIS_PLANK_FENCE, 5, 20);
        flammable.add(ModBlocks.LAPIS_PLANK_FENCE_GATE, 5, 20);
        flammable.add(ModBlocks.LAPIS_LEAVES, 30, 60);
        flammable.add(ModBlocks.LAPIS_SAPLING, 60, 60);
    }

    private void registerVanillaItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.LAPIS_BRICKS);
            entries.add(ModBlocks.LAPIS_BRICK_STAIRS);
            entries.add(ModBlocks.LAPIS_BRICK_SLAB);
            entries.add(ModBlocks.SMOOTH_LAPIS_BRICKS);
            entries.add(ModBlocks.SMOOTH_LAPIS_BRICK_STAIRS);
            entries.add(ModBlocks.SMOOTH_LAPIS_BRICK_SLAB);
            entries.add(ModBlocks.LAPIS_LOG);
            entries.add(ModBlocks.LAPIS_PLANKS);
            entries.add(ModBlocks.LAPIS_PLANK_STAIRS);
            entries.add(ModBlocks.LAPIS_PLANK_SLAB);
            entries.add(ModBlocks.LAPIS_PLANK_FENCE);
            entries.add(ModBlocks.LAPIS_PLANK_FENCE_GATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.LAPIS_LOG);
            entries.add(ModBlocks.LAPIS_LEAVES);
            entries.add(ModBlocks.LAPIS_SAPLING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.LAPIS_BRICK_LAMP);
            entries.add(ModBlocks.LAPIS_BRICK_SHROOMLIGHT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.LAPIS_PLANK_BUTTON);
            entries.add(ModBlocks.LAPIS_PLANK_PRESSURE_PLATE);
            entries.add(ModBlocks.LAPIS_PLANK_FENCE_GATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ModItems.CRYSTALINE_LAPIS_SHOVEL);
            entries.add(ModItems.CRYSTALINE_LAPIS_PICKAXE);
            entries.add(ModItems.CRYSTALINE_LAPIS_AXE);
            entries.add(ModItems.CRYSTALINE_LAPIS_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModItems.CRYSTALINE_LAPIS_SWORD);
            entries.add(ModItems.CRYSTALINE_LAPIS_AXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.LAPIS_BRICK);
            entries.add(ModItems.CRYSTALINE_LAPIS);
            entries.add(ModItems.LAPIS_COATED_AMETHYST);
        });
    }
}
