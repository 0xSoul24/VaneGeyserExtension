# Vane Geyser Extension

A Geyser Extension that brings [Vane](https://github.com/oddlama/vane)'s custom items to Bedrock Edition players. This extension enables Bedrock players to see and use custom textures for Vane's immersive items when playing on servers running both Geyser and the Vane plugin suite.

## 🎯 What is this Extension?

This Geyser Extension provides visual compatibility for [Vane](https://github.com/oddlama/vane) custom items in Minecraft Bedrock Edition. Vane is a comprehensive plugin suite that adds many lore-friendly and immersive features to vanilla Minecraft servers, and this extension ensures Bedrock players can see all the custom textures and models properly.

## ✨ Features

This extension provides visual compatibility for all Vane custom items in Bedrock Edition. For a complete overview of all features and items, visit the [official Vane website](https://oddlama.github.io/vane/).

## 🔧 Requirements

- **Server Side**: 
  - PaperMC server (latest version)
  - [Vane Plugin Suite](https://github.com/oddlama/vane) installed on the Paper server (supports latest Minecraft versions only)
  - Geyser plugin (can be installed on Paper server or Velocity proxy if using a proxy setup)
  - **For older version compatibility**: [ViaVersion](https://hangar.papermc.io/ViaVersion/ViaVersion), [ViaBackwards](https://hangar.papermc.io/ViaVersion/ViaBackwards), [ViaRewind](https://hangar.papermc.io/ViaVersion/ViaRewind), and [ViaRewindLegacySupport](https://hangar.papermc.io/ViaVersion/ViaRewindLegacySupport) (if you want to support older Minecraft client versions)
- **Bedrock Players**: 
  - Minecraft Bedrock Edition
  - Resource pack acceptance enabled

## 📥 Installation

### Easy Setup (Recommended for new Linux servers)
For new Linux servers, consider using the [Minecraft Server Installer](https://github.com/oddlama/minecraft-server) by the same developer of Vane. This provides an easy way to set up a Minecraft server with Vane, autostart, 3D online map, and more awesome features pre-configured.

**Note**: This easy setup only works on Linux systems.

**Adding Bedrock Support**: To add Geyser and other plugins to the easy setup, follow the [🔌 Installing and removing plugins](https://github.com/oddlama/minecraft-server#-installing-and-removing-plugins) section in the minecraft-server documentation. 

To add Geyser after installation:
- **For Paper server**: Add this line to `/var/lib/minecraft/deploy/server/update.sh`:
  ```bash
  download_file "https://download.geysermc.org/v2/projects/geyser/versions/latest/builds/latest/downloads/spigot" plugins/Geyser-Spigot.jar
  ```
- **For Velocity proxy**: Add this line to `/var/lib/minecraft/deploy/proxy/update.sh`:
  ```bash
  download_file "https://download.geysermc.org/v2/projects/geyser/versions/latest/builds/latest/downloads/velocity" plugins/GeyserVelocity.jar
  ```

After adding plugins, update your server:
1. Stop the services: `sudo systemctl stop minecraft-server minecraft-proxy`
2. Run the update script: `/var/lib/minecraft/deploy/update.sh`
3. Restart the services: `sudo systemctl start minecraft-server minecraft-proxy`

After adding Geyser, continue with the manual installation steps below to install this extension.

### Manual Installation
1. **Download** the latest release from the [Releases](../../releases) section (both the extension `.jar` and texture pack `.mcpack`)
2. **Place** the `.jar` file in your Geyser `extensions/` folder
3. **Install the texture pack**: Place the Vane texture `.mcpack` file (also found in releases) into Geyser's packs folder:
   - For Paper/Spigot: `/plugins/Geyser-Spigot/packs/`
   - For Velocity: `/plugins/Geyser-Velocity/packs/`
4. **Optional - Language files**: For Vane formatted chat, language files in `json` format (available as a zip file in the [Releases](../../releases) section) can be extracted and installed in the `locales/overrides/` subdirectory inside Geyser's plugin folder. **Note**: If you don't want formatted chat, make sure to disable the feature in the vane-admin config file
5. **Restart** your server
6. **Ensure** Vane plugins are installed on your server
7. **Bedrock players** will automatically see custom item textures

## 🎮 How it Works

This extension registers custom item models for all Vane items using Geyser's Custom Item API. When Bedrock players join a server with both Vane and this extension:

- Custom items will display with their unique textures and models
- All functionality from the Vane plugins remains intact
- No additional configuration required
- Seamless integration with existing Vane setups

## ⚠️ Known Issues

While this extension provides visual compatibility for Vane items in Bedrock Edition, there are some known limitations:

- **Reinforced Elytra**: Bedrock players cannot use reinforced elytras for flight due to Bedrock Edition limitations
- **Animations**: Slime bucket and north compass animations do not work properly in Bedrock Edition
- **Portal Barriers**: When activating Vane portals, an invisible barrier may prevent Bedrock players from passing through. **Workaround**: Bedrock players should activate the portal while standing inside the portal area
- **Custom Skulls**: Vane custom skulls cannot be seen inside menus/inventories for Bedrock players, however they can see the custom texture once the skull is placed on a block

These issues are related to differences between Java and Bedrock Edition mechanics and may be addressed in future updates as Geyser and Bedrock Edition evolve.

## 🛠️ Building from Source

1. Clone this repository
2. Ensure you have Java 17 or higher installed
3. Run: `./gradlew build`
4. Find the compiled extension in `build/libs/`

## 🤝 Contributing

Contributions are welcome! Please feel free to:
- Report bugs or issues
- Suggest new features
- Submit pull requests
- Help with documentation

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Credits

- **[Vane](https://github.com/oddlama/vane)** - The original plugin suite by [oddlama](https://github.com/oddlama)
- **[GeyserMC](https://geysermc.org/)** - For the amazing Bedrock compatibility layer
- **[0xSoul](https://github.com/0xSoul24)** - Extension developer

## 📞 Support

- Join the [GeyserMC Discord](https://discord.gg/geysermc) for Geyser-related questions
- Join the [Vane Discord](https://discord.gg/RueJ6A59x2) for Vane plugin support
- Open an issue on this repository for extension-specific problems

## 📚 Related Links

- [Vane Official Website](https://oddlama.github.io/vane/)
- [Vane Plugin Repository](https://github.com/oddlama/vane)
- [Geyser Extensions Documentation](https://geysermc.org/wiki/geyser/extensions)
- [Custom Items Documentation](https://wiki.geysermc.org/geyser/custom-items/)

