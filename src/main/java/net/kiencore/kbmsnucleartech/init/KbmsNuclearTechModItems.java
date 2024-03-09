
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kiencore.kbmsnucleartech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.kiencore.kbmsnucleartech.item.UraniumIngotItem;
import net.kiencore.kbmsnucleartech.KbmsNuclearTechMod;

public class KbmsNuclearTechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KbmsNuclearTechMod.MODID);
	public static final RegistryObject<Item> URANIUM_INGOT = REGISTRY.register("uranium_ingot", () -> new UraniumIngotItem());
}
