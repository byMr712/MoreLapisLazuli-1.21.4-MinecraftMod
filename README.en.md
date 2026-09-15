# More Lapis Lazuli (Fabric 1.21.4)
> **Language:** [Русский](README.md) · English

## Fork Description
All rights belong to the original developer — [BeckATI](https://modrinth.com/mod/more-lapis-lazuli).

<p align="center">
  <img src="preview1.jpg" width="48%" alt="Preview 1" />
  <img src="preview2.jpg" width="48%" alt="Preview 2" />
  <img src="preview3.jpg" width="48%" alt="Preview 3" />
  <img src="preview4.jpg" width="48%" alt="Preview 4" />
</p>

Port and update for **Minecraft 1.21.4**:
- Complete rebuild of the mod architecture from the outdated M3EC generator to clean native Fabric Loom 1.10.1 (Java 21).
- Fixed `ClassNotFoundException: net.minecraft.class_1832` / `NoClassDefFoundError` caused by `ToolMaterial` changes in 1.21.4.
- Full adaptation of all items, blocks, recipes, models, loot tables, and structures to Minecraft 1.21.4 standards:
  - New registration system with `RegistryKey` and `Item.Settings().registryKey()`.
  - Generated Client Item Definitions (`assets/morelapis/items/*.json`) conforming to 1.21.4 requirements.
  - Modern recipe JSON specifications for 1.21.4.
  - Creative tab integration with `FabricItemGroup` and `ItemGroupEvents`.
  - Added full English (`en_us`) and Russian (`ru_ru`) localizations.

Supported loader: **Fabric 1.21.4**.

## Features
- **Items**: Lapis Brick, Crystalline Lapis, Lapis Coated Amethyst.
- **Tools & Weapons**: Crystalline Lapis Sword, Pickaxe, Axe, Shovel, and Hoe.
- **Blocks**: Lapis Bricks (+ stairs, slab), Smooth Lapis Bricks (+ stairs, slab), Lapis Brick Lamp, Lapis Brick Shroomlight, Lapis Log, Lapis Planks (+ stairs, slab, button, fence, fence gate, pressure plate), Lapis Leaves, Lapis Tree Sapling.
- **Structures**: Lapis Hut, Lapis Trees generating in snowy village biomes.
