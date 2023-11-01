package org.geyser.extension.vane;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.item.custom.CustomItemData;
import org.geysermc.geyser.api.item.custom.CustomItemOptions;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomSkullsEvent;

public class VaneGeyser implements Extension {

    @Subscribe
    public void onPreInitialize(GeyserPreInitializeEvent event) {
        this.logger().info("");
        this.logger().info("##############################################");
        this.logger().info("VANE GEYSER EXTENSION");
        this.logger().info("Made by: 0xSoul");
        this.logger().info("##############################################");
        this.logger().info("");
    }

    @Subscribe
    public void onGeyserPreInitializeEvent(GeyserDefineCustomItemsEvent event) {
        //
		// BOOK
		//
        CustomItemData ancient_tome = CustomItemData.builder()
            .name("ancient_tome")
            .customItemOptions(CustomItemOptions.builder().customModelData(7798784).build())
            .textureSize(16)
            .build();
        event.register("minecraft:book", ancient_tome);

        CustomItemData ancient_tome_of_knowledge = CustomItemData.builder()
            .name("ancient_tome_of_knowledge")
            .customItemOptions(CustomItemOptions.builder().customModelData(7798786).build())
            .textureSize(16)
            .build();
        event.register("minecraft:book", ancient_tome_of_knowledge);

        CustomItemData ancient_tome_of_the_gods = CustomItemData.builder()
            .name("ancient_tome_of_the_gods")
            .customItemOptions(CustomItemOptions.builder().customModelData(7798788).build())
            .textureSize(16)
            .build();
        event.register("minecraft:book", ancient_tome_of_the_gods);

        //
		// COMPASS
		//
        CustomItemData north_compass = CustomItemData.builder()
            .name("north_compass")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733267).build())
            .textureSize(16)
            .build();
        event.register("minecraft:compass", north_compass);

        //
		// DIAMOND HOE
		//
        CustomItemData diamond_sickle = CustomItemData.builder()
            .name("diamond_sickle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733256).build())
            .textureSize(16)
            .build();
        event.register("minecraft:diamond_hoe", diamond_sickle);

        //
		// DROPPER
		//
        CustomItemData pouch = CustomItemData.builder()
            .name("pouch")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733270).build())
            .textureSize(16)
            .build();
        event.register("minecraft:dropper", pouch);

        //
		// ELYTRA
		//
        CustomItemData reinforced_elytra = CustomItemData.builder()
            .name("reinforced_elytra")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733250).build())
            .textureSize(16)
            .build();
        event.register("minecraft:elytra", reinforced_elytra);

        //
		// ENCHANTED BOOK
		//
        CustomItemData enchanted_ancient_tome = CustomItemData.builder()
            .name("enchanted_ancient_tome")
            .customItemOptions(CustomItemOptions.builder().customModelData(7798785).build())
            .textureSize(16)
            .build();
        event.register("minecraft:enchanted_book", enchanted_ancient_tome);

        CustomItemData enchanted_ancient_tome_of_knowledge = CustomItemData.builder()
            .name("enchanted_ancient_tome_of_knowledge")
            .customItemOptions(CustomItemOptions.builder().customModelData(7798787).build())
            .textureSize(16)
            .build();
        event.register("minecraft:enchanted_book", enchanted_ancient_tome_of_knowledge);
        
        CustomItemData enchanted_ancient_tome_of_the_gods = CustomItemData.builder()
            .name("enchanted_ancient_tome_of_the_gods")
            .customItemOptions(CustomItemOptions.builder().customModelData(7798789).build())
            .textureSize(16)
            .build();
        event.register("minecraft:enchanted_book", enchanted_ancient_tome_of_the_gods);

        //
		// GLASS BOTTLE
		//
        CustomItemData empty_xp_bottle = CustomItemData.builder()
            .name("empty_xp_bottle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733258).build())
            .textureSize(16)
            .build();
        event.register("minecraft:glass_bottle", empty_xp_bottle);

        //
		// GOLDEN HOE
		//
        CustomItemData golden_sickle = CustomItemData.builder()
            .name("golden_sickle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733255).build())
            .textureSize(16)
            .build();
        event.register("minecraft:diamond_hoe", golden_sickle);

        //
		// HONEY BOTTLE
		//
        CustomItemData small_xp_bottle = CustomItemData.builder()
            .name("small_xp_bottle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733259).build())
            .textureSize(16)
            .build();
        event.register("minecraft:glass_bottle", small_xp_bottle);

        CustomItemData medium_xp_bottle = CustomItemData.builder()
            .name("medium_xp_bottle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733260).build())
            .textureSize(16)
            .build();
        event.register("minecraft:glass_bottle", medium_xp_bottle);

        CustomItemData large_xp_bottle = CustomItemData.builder()
            .name("large_xp_bottle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733261).build())
            .textureSize(16)
            .build();
        event.register("minecraft:glass_bottle", large_xp_bottle);

        //
		// IRON HOE
		//
        CustomItemData iron_sickle = CustomItemData.builder()
            .name("iron_sickle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733254).build())
            .textureSize(16)
            .build();
        event.register("minecraft:diamond_hoe", iron_sickle);

        //
		// NETHERITE HOE
		//
        CustomItemData netherite_sickle = CustomItemData.builder()
            .name("netherite_sickle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733257).build())
            .textureSize(16)
            .build();
        event.register("minecraft:diamond_hoe", netherite_sickle);

        //
		// PAPER
		//
        CustomItemData papyrus_scroll = CustomItemData.builder()
            .name("papyrus_scroll")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733263).build())
            .textureSize(16)
            .build();
        event.register("minecraft:paper", papyrus_scroll);

        //
		// SHULKER BOX
		//
        CustomItemData backpack = CustomItemData.builder()
            .name("backpack")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733271).build())
            .textureSize(16)
            .build();
        event.register("minecraft:shulker_box", backpack);

        //
		// SLIME BALL
		//
        CustomItemData slime_bucket = CustomItemData.builder()
            .name("slime_bucket")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733268).build())
            .textureSize(16)
            .build();
        event.register("minecraft:slime_ball", slime_bucket);

        CustomItemData slime_bucket_excited = CustomItemData.builder()
            .name("slime_bucket_excited")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733269).build())
            .textureSize(16)
            .build();
        event.register("minecraft:slime_ball", slime_bucket_excited);

        //
		// STONE HOE
		//
        CustomItemData stone_sickle = CustomItemData.builder()
            .name("stone_sickle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733253).build())
            .textureSize(16)
            .build();
        event.register("minecraft:stone_hoe", stone_sickle);

        //
		// WARPED FUNGUS ON A STICK
		//
        CustomItemData home_scroll = CustomItemData.builder()
            .name("home_scroll")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733248).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", home_scroll);

        CustomItemData unstable_scroll = CustomItemData.builder()
            .name("unstable_scroll")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733249).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", unstable_scroll);

        CustomItemData file = CustomItemData.builder()
            .name("file")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733251).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", file);

        CustomItemData trowel = CustomItemData.builder()
            .name("trowel")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733262).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", trowel);

        CustomItemData spawn_scroll = CustomItemData.builder()
            .name("spawn_scroll")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733264).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", spawn_scroll);

        CustomItemData lodestone_scroll = CustomItemData.builder()
            .name("lodestone_scroll")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733265).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", lodestone_scroll);

        CustomItemData death_scroll = CustomItemData.builder()
            .name("death_scroll")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733266).build())
            .textureSize(16)
            .build();
        event.register("minecraft:warped_fungus_on_a_stick", death_scroll);

        //
		// WOODEN HOE
		//
        CustomItemData wooden_sickle = CustomItemData.builder()
            .name("wooden_sickle")
            .customItemOptions(CustomItemOptions.builder().customModelData(7733252).build())
            .textureSize(16)
            .build();
        event.register("minecraft:wooden_hoe", wooden_sickle);
    }

    @Subscribe
    public void onDefineCustomSkulls(GeyserDefineCustomSkullsEvent event) {
        String profile = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTI5YzcxMTU1YjNmYjQ5ZDNlNDhkNTI0MGMxZDY3MzY2NzU0ODhiMzg0OWU5NmFlZWNlNDIzYzhlMzM5YTMwYiJ9fX0="
        event.registerCustomSkull(profile, SkullTextureType.PROFILE);
    }
}
