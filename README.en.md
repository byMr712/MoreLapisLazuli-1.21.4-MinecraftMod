> **Language:** [Русский](README.md) · English

# More Lapis Lazuli (Minecraft 1.21.4 Fabric Port)

![Java 21](https://img.shields.io/badge/Java-21-blue.svg)
![Minecraft](https://img.shields.io/badge/Minecraft-1.21.4-blue.svg)
![Fabric](https://img.shields.io/badge/Loader-Fabric-blue.svg)
![ModMenu](https://img.shields.io/badge/ModMenu-Supported-blue.svg)
![License](https://img.shields.io/badge/License-GPL_3.0-blue.svg)

Port and update of the **More Lapis Lazuli** mod for **Minecraft 1.21.4 (Fabric)**.

Original Developer: [BeckATI/more-lapis-lazuli](https://modrinth.com/mod/more-lapis-lazuli).

---

## About

**More Lapis Lazuli** expands the utility of lapis lazuli in Minecraft, introducing new building blocks, decorations, light sources, foliage, structures, and a complete set of crystalline lapis tools and weapons.

---

## Gallery

| Lapis Blocks | Lapis Forest |
|:---:|:---:|
| ![Preview 1](preview1.jpg) | ![Preview 2](preview2.jpg) |
| ![Preview 3](preview3.jpg) | ![Preview 4](preview4.jpg) |

---

## Features

- **Items**: Lapis Brick, Crystalline Lapis, Lapis Coated Amethyst.
- **Tools & Weapons**: Crystalline Lapis Sword, Pickaxe, Axe, Shovel, and Hoe.
- **Building Blocks**:
  - Lapis Bricks (+ stairs and slabs).
  - Smooth Lapis Bricks (+ stairs and slabs).
  - Lapis Brick Lamp and Lapis Brick Shroomlight.
  - Lapis Wood: logs, planks (+ stairs, slabs, fences, gates, buttons, pressure plates).
  - Lapis Leaves and Lapis Saplings.
- **World Generation**: Lapis Huts and Lapis Trees generating in snowy village biomes.

---

## Changes in 1.21.4 Port (byMr712)

- Rebuilt mod architecture from the outdated M3EC generator to clean native Fabric Loom 1.10.1 (Java 21 LTS, Yarn mappings).
- Fixed `ClassNotFoundException: net.minecraft.class_1832` / `NoClassDefFoundError` caused by `ToolMaterial` changes in 1.21.4.
- Full adaptation of items, blocks, recipes, models, loot tables, and structures to Minecraft 1.21.4:
  - Modern registration with `RegistryKey` and `Item.Settings().registryKey()`.
  - Generated Client Item Definitions (`assets/morelapis/items/*.json`).
  - Modern 1.21.4 recipe JSON format.
  - Creative tab integration via `FabricItemGroup`.
  - Added full English (`en_us`) and Russian (`ru_ru`) localizations.

---

## Installation

1. Download the latest release from [GitHub Releases](https://github.com/byMr712/MoreLapisLazuli-1.21.4-MinecraftMod/releases).
2. Requires:
   - [Fabric API](https://modrinth.com/mod/fabric-api)
3. Place the `.jar` file into your `mods` folder.
4. Launch the game.

---

## Building

1. Requires Java 21 and Fabric Loader for Minecraft 1.21.4.
2. To build the project, run:
   ```bash
   ./gradlew build
   ```
3. The built jar file will be located at `build/libs/MoreLapisLazuli-1.21.4-byMr712.jar`.

---

## Credits & License

- Original Author: [BeckATI](https://modrinth.com/mod/more-lapis-lazuli).
- Ported and adapted for 1.21.4 by: [Mr712](https://github.com/byMr712).
- Distributed under the [GPL 3.0 License](LICENSE).
