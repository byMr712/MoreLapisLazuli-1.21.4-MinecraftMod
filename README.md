> **Language:** Русский · [English](README.en.md)

# More Lapis Lazuli (Minecraft 1.21.4 Fabric Port)

![Java 21](https://img.shields.io/badge/Java-21-blue.svg)
![Minecraft](https://img.shields.io/badge/Minecraft-1.21.4-blue.svg)
![Fabric](https://img.shields.io/badge/Loader-Fabric-blue.svg)
![ModMenu](https://img.shields.io/badge/ModMenu-Supported-blue.svg)
![License](https://img.shields.io/badge/License-GPL_3.0-blue.svg)

Порт и обновление мода **More Lapis Lazuli** для **Minecraft 1.21.4 (Fabric)**.

Оригинальный разработчик: [BeckATI/more-lapis-lazuli](https://modrinth.com/mod/more-lapis-lazuli).

---

## О моде

**More Lapis Lazuli** расширяет применение лазурита в игре, добавляя новые строительные блоки, декорации, источники света, растительность, структуры, а также комплект прочных инструментов и оружия из кристаллического лазурита.

---

## Галерея

| Лазуритовые блоки | Лазуритовый лес |
|:---:|:---:|
| ![Превью 1](preview1.jpg) | ![Превью 2](preview2.jpg) |
| ![Превью 3](preview3.jpg) | ![Превью 4](preview4.jpg) |

---

## Возможности

- **Предметы**: лазуритовый кирпич, кристаллический лазурит, лазуритовый аметист.
- **Инструменты и оружие**: меч, кирка, топор, лопата и мотыга из кристаллического лазурита.
- **Строительные блоки**:
  - Лазуритовые кирпичи (+ ступени и плиты).
  - Гладкие лазуритовые кирпичи (+ ступени и плиты).
  - Лампа из лазуритового кирпича и грибосвет из лазуритового кирпича.
  - Лазуритовая древесина: бревна, доски (+ ступени, плиты, заборы, калитки, кнопки, нажимные плиты).
  - Лазуритовая листва и саженцы лазуритового дерева.
- **Генерация структур**: лазуритовые хижины и лазуритовые деревья в генерации снежных деревень.

---

## Что изменено в порте для 1.21.4 (byMr712)

- Полная переработка архитектуры проекта с устаревшего M3EC-генератора на чистый нативный Fabric Loom 1.10.1 (Java 21 LTS, Yarn mappings).
- Устранена ошибка `ClassNotFoundException: net.minecraft.class_1832` / `NoClassDefFoundError`, вызванная изменениями `ToolMaterial` в 1.21.4.
- Адаптация всех предметов, блоков, рецептов, моделей, лут-таблиц и структур к стандартам Minecraft 1.21.4:
  - Использование новой системы регистрации `RegistryKey` и `Item.Settings().registryKey()`.
  - Сгенерированы Client Item Definitions (`assets/morelapis/items/*.json`).
  - Современная спецификация рецептов 1.21.4.
  - Поддержка вкладок творческого режима через `FabricItemGroup`.
  - Добавлена полная русская (`ru_ru`) и английская (`en_us`) локализации.

---

## Установка

1. Скачайте последнюю версию со страницы [GitHub Releases](https://github.com/byMr712/MoreLapisLazuli-1.21.4-MinecraftMod/releases).
2. Требуются:
   - [Fabric API](https://modrinth.com/mod/fabric-api)
3. Поместите `.jar` файл в папку `mods`.
4. Запустите игру.

---

## Сборка

1. Требуется Java 21 и Fabric Loader для Minecraft 1.21.4.
2. Для сборки выполните:
   ```bash
   ./gradlew build
   ```
3. Собранный файл находится в `build/libs/MoreLapisLazuli-1.21.4-byMr712.jar`.

---

## Авторы и лицензия

- Оригинальный автор: [BeckATI](https://modrinth.com/mod/more-lapis-lazuli).
- Порт и адаптация для 1.21.4: [Mr712](https://github.com/byMr712).
- Распространяется под лицензией [GPL 3.0](LICENSE).
