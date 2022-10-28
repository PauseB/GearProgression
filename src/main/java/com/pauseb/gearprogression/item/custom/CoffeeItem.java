package com.pauseb.gearprogression.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CoffeeItem extends Item {
    public CoffeeItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()){
            components.add(Component.literal(I18n.get("tooltip.gpmod.coffee")).withStyle(ChatFormatting.AQUA));

        }
        else{
            components.add(Component.literal(I18n.get("tooltip.gpmod.hold_shift")).withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(stack, level, components, tooltipFlag);
    }
}
