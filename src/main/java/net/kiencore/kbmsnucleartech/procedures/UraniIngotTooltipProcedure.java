package net.kiencore.kbmsnucleartech.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.kiencore.kbmsnucleartech.init.KbmsNuclearTechModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class UraniIngotTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == KbmsNuclearTechModItems.URANIUM_INGOT.get()) {
			tooltip.add(Component.literal("\u00A7a[Radioactive]"));
			tooltip.add(Component.literal("\u00A7e0.35RAD/s"));
			tooltip.add(Component.literal("\u00A76Adds multiplier 1.05 to the custom nuke stage Nuclear"));
		}
	}
}
