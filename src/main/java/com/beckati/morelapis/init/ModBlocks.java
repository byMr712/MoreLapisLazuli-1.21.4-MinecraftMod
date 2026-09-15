package com.beckati.morelapis.init;

import com.beckati.morelapis.worldgen.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final String MOD_ID = "morelapis";

    public static Block LAPIS_BRICK_LAMP;
    public static Block LAPIS_BRICK_SHROOMLIGHT;
    public static Block LAPIS_BRICKS;
    public static Block LAPIS_BRICK_STAIRS;
    public static Block LAPIS_BRICK_SLAB;
    public static Block SMOOTH_LAPIS_BRICKS;
    public static Block SMOOTH_LAPIS_BRICK_STAIRS;
    public static Block SMOOTH_LAPIS_BRICK_SLAB;
    public static Block LAPIS_LOG;
    public static Block LAPIS_PLANKS;
    public static Block LAPIS_PLANK_STAIRS;
    public static Block LAPIS_PLANK_SLAB;
    public static Block LAPIS_PLANK_BUTTON;
    public static Block LAPIS_PLANK_FENCE;
    public static Block LAPIS_PLANK_FENCE_GATE;
    public static Block LAPIS_PLANK_PRESSURE_PLATE;
    public static Block LAPIS_LEAVES;
    public static Block LAPIS_SAPLING;

    public static void registerBlocks() {
        LAPIS_BRICK_LAMP = registerBlock("lapis_brick_lamp",
                new PillarBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_brick_lamp"))
                        .sounds(BlockSoundGroup.GLASS)
                        .strength(3.0f, 3.0f)
                        .luminance(state -> 15)
                        .requiresTool()));

        LAPIS_BRICK_SHROOMLIGHT = registerBlock("lapis_brick_shroomlight",
                new PillarBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_brick_shroomlight"))
                        .sounds(BlockSoundGroup.SHROOMLIGHT)
                        .strength(3.0f, 3.0f)
                        .luminance(state -> 15)
                        .requiresTool()));

        LAPIS_BRICKS = registerBlock("lapis_bricks",
                new Block(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_bricks"))
                        .sounds(BlockSoundGroup.STONE)
                        .strength(3.0f, 3.0f)
                        .requiresTool()));

        LAPIS_BRICK_STAIRS = registerBlock("lapis_brick_stairs",
                new StairsBlock(LAPIS_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_brick_stairs"))
                        .sounds(BlockSoundGroup.STONE)
                        .strength(3.0f, 3.0f)
                        .requiresTool()));

        LAPIS_BRICK_SLAB = registerBlock("lapis_brick_slab",
                new SlabBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_brick_slab"))
                        .sounds(BlockSoundGroup.STONE)
                        .strength(3.0f, 3.0f)
                        .requiresTool()));

        SMOOTH_LAPIS_BRICKS = registerBlock("smooth_lapis_bricks",
                new Block(AbstractBlock.Settings.create()
                        .registryKey(blockKey("smooth_lapis_bricks"))
                        .sounds(BlockSoundGroup.STONE)
                        .strength(3.0f, 3.0f)
                        .requiresTool()));

        SMOOTH_LAPIS_BRICK_STAIRS = registerBlock("smooth_lapis_brick_stairs",
                new StairsBlock(SMOOTH_LAPIS_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                        .registryKey(blockKey("smooth_lapis_brick_stairs"))
                        .sounds(BlockSoundGroup.STONE)
                        .strength(3.0f, 3.0f)
                        .requiresTool()));

        SMOOTH_LAPIS_BRICK_SLAB = registerBlock("smooth_lapis_brick_slab",
                new SlabBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("smooth_lapis_brick_slab"))
                        .sounds(BlockSoundGroup.STONE)
                        .strength(3.0f, 3.0f)
                        .requiresTool()));

        LAPIS_LOG = registerBlock("lapis_log",
                new PillarBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_log"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(2.0f, 2.0f)
                        .requiresTool()));

        LAPIS_PLANKS = registerBlock("lapis_planks",
                new Block(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_planks"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(2.0f, 3.0f)
                        .requiresTool()));

        LAPIS_PLANK_STAIRS = registerBlock("lapis_plank_stairs",
                new StairsBlock(LAPIS_PLANKS.getDefaultState(), AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_plank_stairs"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(2.0f, 3.0f)
                        .requiresTool()));

        LAPIS_PLANK_SLAB = registerBlock("lapis_plank_slab",
                new SlabBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_plank_slab"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(2.0f, 3.0f)
                        .requiresTool()));

        LAPIS_PLANK_BUTTON = registerBlock("lapis_plank_button",
                new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_plank_button"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(0.5f)
                        .noCollision()));

        LAPIS_PLANK_FENCE = registerBlock("lapis_plank_fence",
                new FenceBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_plank_fence"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(2.0f, 3.0f)
                        .requiresTool()));

        LAPIS_PLANK_FENCE_GATE = registerBlock("lapis_plank_fence_gate",
                new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_plank_fence_gate"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(2.0f, 3.0f)
                        .requiresTool()));

        LAPIS_PLANK_PRESSURE_PLATE = registerBlock("lapis_plank_pressure_plate",
                new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_plank_pressure_plate"))
                        .sounds(BlockSoundGroup.WOOD)
                        .strength(0.5f)
                        .noCollision()));

        LAPIS_LEAVES = registerBlock("lapis_leaves",
                new LeavesBlock(AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_leaves"))
                        .sounds(BlockSoundGroup.GRASS)
                        .strength(0.2f)
                        .nonOpaque()
                        .suffocates((state, world, pos) -> false)
                        .blockVision((state, world, pos) -> false)));

        LAPIS_SAPLING = registerBlock("lapis_sapling",
                new SaplingBlock(ModSaplingGenerators.LAPIS_TREE, AbstractBlock.Settings.create()
                        .registryKey(blockKey("lapis_sapling"))
                        .sounds(BlockSoundGroup.GRASS)
                        .noCollision()
                        .breakInstantly()));
    }

    private static RegistryKey<Block> blockKey(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, name));
    }

    private static RegistryKey<Item> itemKey(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
    }

    private static Block registerBlock(String name, Block block) {
        RegistryKey<Block> bKey = blockKey(name);
        RegistryKey<Item> iKey = itemKey(name);
        Registry.register(Registries.BLOCK, bKey, block);
        Registry.register(Registries.ITEM, iKey, new BlockItem(block, new Item.Settings().registryKey(iKey).useBlockPrefixedTranslationKey()));
        return block;
    }
}
