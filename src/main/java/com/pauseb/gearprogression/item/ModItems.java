package com.pauseb.gearprogression.item;

import com.pauseb.gearprogression.GearProgression;
import com.pauseb.gearprogression.block.ModBlocks;
import com.pauseb.gearprogression.item.custom.CoffeeItem;
import cpw.mods.modlauncher.EnumerationHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GearProgression.MOD_ID);

    public static final RegistryObject<Item> CARNELIAN = ITEMS.register("carnelian",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GP_TAB)));
    public static final RegistryObject<Item> RAW_CARNELIAN = ITEMS.register("raw_carnelian",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GP_TAB)));

    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new ItemNameBlockItem(ModBlocks.COFFEE_CROP.get(),
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build())
                            .tab(ModCreativeModeTab.GP_TAB)));
    public static final RegistryObject<Item> ROASTED_COFFEE_BEANS = ITEMS.register("roasted_coffee_beans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())
                    .tab(ModCreativeModeTab.GP_TAB)));
    public static final RegistryObject<Item> COFFEE_POWDER = ITEMS.register("coffee_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GP_TAB)));
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new CoffeeItem(new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(6)
                            .alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 2), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 3600), 1).build())
                    .tab(ModCreativeModeTab.GP_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
