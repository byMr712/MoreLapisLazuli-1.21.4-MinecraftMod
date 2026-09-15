package com.beckati.morelapis.worldgen;

import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPIS_TREE_KEY =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of("morelapis", "lapis_tree"));

    public static final SaplingGenerator LAPIS_TREE = new SaplingGenerator(
            "lapis_tree",
            Optional.empty(),
            Optional.of(LAPIS_TREE_KEY),
            Optional.empty()
    );
}
