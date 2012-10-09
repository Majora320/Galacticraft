package micdoodle8.mods.galacticraft;

import net.minecraft.src.Block;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Copyright 2012, micdoodle8
 * 
 *  All rights reserved.
 *
 */
public class GCItems 
{
	public static Item lightOxygenTankFull;
	public static Item medOxygenTankFull;
	public static Item heavyOxygenTankFull;
	public static Item lightOxygenTankEmpty;
	public static Item medOxygenTankEmpty;
	public static Item heavyOxygenTankEmpty;
	public static Item oxygenMask;
	public static Item spaceship;
	public static Item sensorGlasses;
	public static Item sensorGlassesWithOxygenMask;
	public static Item reinforcedBucketEmpty;
	public static Item reinforcedBucketMilk;
	public static Item reinforcedBucketWater;
	public static Item reinforcedBucketLava;
	public static Item reinforcedBucketBacteria;
	public static Item quandriumHelmet;
	public static Item quandriumChestplate;
	public static Item quandriumLeggings;
	public static Item quandriumBoots;
	public static Item quandriumHelmetBreathable;
	
	public static Item rawDesh;
	public static Item deshPickaxe;
	public static Item deshAxe;
	public static Item deshHoe;
	public static Item deshSpade;
	public static Item deshSword;
	public static Item planetStonePickaxe;
	public static Item planetStoneAxe;
	public static Item planetStoneHoe;
	public static Item planetStoneSpade;
	public static Item planetStoneSword;
	public static Item quandriumPickaxe;
	public static Item quandriumAxe;
	public static Item quandriumHoe;
	public static Item quandriumSpade;
	public static Item quandriumSword;
	public static Item titaniumPickaxe;
	public static Item titaniumAxe;
	public static Item titaniumHoe;
	public static Item titaniumSpade;
	public static Item titaniumSword;
	public static Item deshHelmet;
	public static Item deshChestplate;
	public static Item deshLeggings;
	public static Item deshBoots;
	public static Item deshHelmetBreathable;
	public static Item titaniumHelmet;
	public static Item titaniumChestplate;
	public static Item titaniumLeggings;
	public static Item titaniumBoots;
	public static Item titaniumHelmetBreathable;
	public static Item deshStick;
	public static Item heavyBoots;
	public static Item ingotQuandrium;
	public static Item ingotDesh;
	public static Item ingotTitanium;
	public static Item ingotCopper;
	public static Item ingotAluminum;
	public static Item jetpack;
	
	public static EnumArmorMaterial OXYGENMASK = EnumHelper.addArmorMaterial("OXYGENMASK", 200, new int[] {0, 0, 0, 0}, 0);
	public static EnumArmorMaterial SENSORGLASSES = EnumHelper.addArmorMaterial("SENSORGLASSES", 200, new int[] {0, 0, 0, 0}, 0);
	public static EnumArmorMaterial TITANIUMARMOR = EnumHelper.addArmorMaterial("TITANIUM", 42, new int[] {4, 9, 7, 4}, 12);
	public static EnumArmorMaterial QUANDRIUMARMOR = EnumHelper.addArmorMaterial("QUANDRIUM", 42, new int[] {4, 9, 7, 4}, 12);
	public static EnumArmorMaterial ARMORDESH = EnumHelper.addArmorMaterial("DESH", 42, new int[] {4, 9, 7, 4}, 12);
	public static EnumArmorMaterial ARMORHEAVY = EnumHelper.addArmorMaterial("HEAVY", 200, new int[] {1, 1, 1, 1}, 0);
	public static EnumArmorMaterial ARMORJETPACK = EnumHelper.addArmorMaterial("JETPACK", 200, new int[] {0, 0, 0, 0}, 0);
	public static EnumToolMaterial TOOLPLANETSTONE = EnumHelper.addToolMaterial("PLANETSTONE", 0, 0, 0F, 0, 0);
	public static EnumToolMaterial TOOLDESH = EnumHelper.addToolMaterial("DESH", 0, 0, 0F, 0, 0);
	public static EnumToolMaterial TOOLTITANIUM = EnumHelper.addToolMaterial("TITANIUM", 0, 0, 0F, 0, 0);
	public static EnumToolMaterial TOOLQUANDRIUM = EnumHelper.addToolMaterial("QUANDRIUM", 0, 0, 0F, 0, 0);
	
	public static void initItems() 
	{
		lightOxygenTankFull = new GCItemOxygenTank(GCConfigManager.idItemLightOxygenTank).setMaxDamage(90).setIconIndex(0).setItemName("lightFull");
		lightOxygenTankEmpty = new GCItem(GCConfigManager.idItemLightOxygenTankEmpty).setIconIndex(3).setItemName("lightEmpty");
		medOxygenTankFull = new GCItemOxygenTank(GCConfigManager.idItemMedOxygenTank).setMaxDamage(90).setIconIndex(1).setItemName("medFull");
		medOxygenTankEmpty = new GCItem(GCConfigManager.idItemMedOxygenTankEmpty).setIconIndex(4).setItemName("medEmpty");
		heavyOxygenTankFull = new GCItemOxygenTank(GCConfigManager.idItemHeavyOxygenTank).setMaxDamage(90).setIconIndex(2).setItemName("heavyFull");
		heavyOxygenTankEmpty = new GCItem(GCConfigManager.idItemHeavyOxygenTankEmpty).setIconIndex(5).setItemName("heavyEmpty");
		oxygenMask = new GCItemOxygenMask(GCConfigManager.idArmorOxygenMask, OXYGENMASK, 5, 0).setIconIndex(7).setItemName("oxygenMask");
		spaceship = new GCItemSpaceship(GCConfigManager.idItemSpaceship).setIconIndex(8).setItemName("spaceship");
		sensorGlasses = new GCItemSensorGlasses(GCConfigManager.idArmorSensorGlasses, SENSORGLASSES, 6, 0, false).setIconIndex(9).setItemName("sensorGlasses");
		sensorGlassesWithOxygenMask = new GCItemSensorGlasses(GCConfigManager.idArmorSensorGlassesWithOxygenMask, SENSORGLASSES, 7, 0, true).setIconIndex(10).setItemName("sensorGlassesWithOxygenMask");
		reinforcedBucketEmpty = new GCItemReinforcedBucket(GCConfigManager.idItemReinforcedBucket, 0).setIconIndex(11).setItemName("reinfocedBucket");
		reinforcedBucketMilk = new GCItemReinforcedBucket(GCConfigManager.idItemReinforcedBucketMilk, 1).setIconIndex(14).setItemName("reinfocedBucketMilk");
		reinforcedBucketWater = new GCItemReinforcedBucket(GCConfigManager.idItemReinforcedBucketWater, Block.waterMoving.blockID).setIconIndex(12).setItemName("reinfocedBucketWater");
		reinforcedBucketLava = new GCItemReinforcedBucket(GCConfigManager.idItemReinforcedBucketLava, Block.lavaMoving.blockID).setIconIndex(13).setItemName("reinfocedBucketLava");
		reinforcedBucketBacteria = new GCItemReinforcedBucket(GCConfigManager.idItemReinforcedBucketBacteria, GCBlocks.bacterialSludgeMoving.blockID).setIconIndex(15).setItemName("reinfocedBucketSludge");
		rawDesh = new GCItem(GCConfigManager.idItemRawDesh).setIconIndex(16).setItemName("rawDesh");
		deshPickaxe = new GCItemPickaxe(GCConfigManager.idToolDeshPickaxe, TOOLDESH).setIconIndex(17).setItemName("deshPick");
		deshAxe = new GCItemAxe(GCConfigManager.idToolDeshAxe, TOOLDESH).setIconIndex(18).setItemName("deshAxe");
		deshHoe = new GCItemHoe(GCConfigManager.idToolDeshHoe, TOOLDESH).setIconIndex(19).setItemName("deshHoe");
		deshSpade = new GCItemSpade(GCConfigManager.idToolDeshSpade, TOOLDESH).setIconIndex(20).setItemName("deshSpade");
		deshSword = new GCItemSword(GCConfigManager.idToolDeshSword, TOOLDESH).setIconIndex(21).setItemName("deshSword");
		planetStonePickaxe = new GCItemPickaxe(GCConfigManager.idToolPlanetStonePickaxe, TOOLPLANETSTONE).setIconIndex(22).setItemName("planetStonePick");
		planetStoneAxe = new GCItemAxe(GCConfigManager.idToolPlanetStoneAxe, TOOLPLANETSTONE).setIconIndex(23).setItemName("planetStoneAxe");
		planetStoneHoe = new GCItemHoe(GCConfigManager.idToolPlanetStoneHoe, TOOLPLANETSTONE).setIconIndex(24).setItemName("planetStoneHoe");
		planetStoneSpade = new GCItemSpade(GCConfigManager.idToolPlanetStoneSpade, TOOLPLANETSTONE).setIconIndex(25).setItemName("planetStoneSpade");
		planetStoneSword = new GCItemSword(GCConfigManager.idToolPlanetStoneSword, TOOLPLANETSTONE).setIconIndex(26).setItemName("planetStoneSword");
		quandriumPickaxe = new GCItemPickaxe(GCConfigManager.idToolQuandriumPickaxe, TOOLQUANDRIUM).setIconIndex(27).setItemName("quandriumPick");
		quandriumAxe = new GCItemAxe(GCConfigManager.idToolQuandriumAxe, TOOLQUANDRIUM).setIconIndex(28).setItemName("quandriumAxe");
		quandriumHoe = new GCItemHoe(GCConfigManager.idToolQuandriumHoe, TOOLQUANDRIUM).setIconIndex(29).setItemName("quandriumHoe");
		quandriumSpade = new GCItemSpade(GCConfigManager.idToolQuandriumSpade, TOOLQUANDRIUM).setIconIndex(30).setItemName("quandriumSpade");
		quandriumSword = new GCItemSword(GCConfigManager.idToolQuandriumSword, TOOLQUANDRIUM).setIconIndex(31).setItemName("quandriumSword");
		titaniumPickaxe = new GCItemPickaxe(GCConfigManager.idToolTitaniumPickaxe, TOOLTITANIUM).setIconIndex(32).setItemName("titaniumPick");
		titaniumAxe = new GCItemAxe(GCConfigManager.idToolTitaniumAxe, TOOLTITANIUM).setIconIndex(33).setItemName("titaniumAxe");
		titaniumHoe = new GCItemHoe(GCConfigManager.idToolTitaniumHoe, TOOLTITANIUM).setIconIndex(34).setItemName("titaniumHoe");
		titaniumSpade = new GCItemSpade(GCConfigManager.idToolTitaniumSpade, TOOLTITANIUM).setIconIndex(35).setItemName("titaniumSpade");
		titaniumSword = new GCItemSword(GCConfigManager.idToolTitaniumSword, TOOLTITANIUM).setIconIndex(36).setItemName("titaniumSword");
		deshHelmet = new GCItemArmor(GCConfigManager.idArmorDeshHelmet, ARMORDESH, 7, 0, false).setIconIndex(37).setItemName("deshHelmet");
		deshChestplate = new GCItemArmor(GCConfigManager.idArmorDeshChestplate, ARMORDESH, 7, 1, false).setIconIndex(38).setItemName("deshChestplate");
		deshLeggings = new GCItemArmor(GCConfigManager.idArmorDeshLeggings, ARMORDESH, 7, 2, false).setIconIndex(39).setItemName("deshLeggings");
		deshBoots = new GCItemArmor(GCConfigManager.idArmorDeshBoots, ARMORDESH, 7, 3, false).setIconIndex(40).setItemName("deshBoots");
		deshHelmetBreathable = new GCItemArmor(GCConfigManager.idArmorDeshHelmetBreathable, ARMORDESH, 7, 0, true).setIconIndex(41).setItemName("deshHelmetBreathable");
		quandriumHelmet = new GCItemArmor(GCConfigManager.idArmorQuandriumHelmet, QUANDRIUMARMOR, 8, 0, false).setIconIndex(42).setItemName("quandriumHelmet");
		quandriumChestplate = new GCItemArmor(GCConfigManager.idArmorQuandriumChestplate, QUANDRIUMARMOR, 8, 1, false).setIconIndex(43).setItemName("quandriumChestplate");
		quandriumLeggings = new GCItemArmor(GCConfigManager.idArmorQuandriumLeggings, QUANDRIUMARMOR, 8, 2, false).setIconIndex(44).setItemName("quandriumLeggings");
		quandriumBoots = new GCItemArmor(GCConfigManager.idArmorQuandriumBoots, QUANDRIUMARMOR, 8, 3, false).setIconIndex(45).setItemName("quandriumBoots");
		quandriumHelmetBreathable = new GCItemArmor(GCConfigManager.idArmorQuandriumHelmetBreathable, QUANDRIUMARMOR, 8, 0, true).setIconIndex(46).setItemName("quandriumHelmetBreathable");
		titaniumHelmet = new GCItemArmor(GCConfigManager.idArmorTitaniumHelmet, TITANIUMARMOR, 9, 0, false).setIconIndex(47).setItemName("titaniumHelmet");
		titaniumChestplate = new GCItemArmor(GCConfigManager.idArmorTitaniumChestplate, TITANIUMARMOR, 9, 1, false).setIconIndex(48).setItemName("titaniumChestplate");
		titaniumLeggings = new GCItemArmor(GCConfigManager.idArmorTitaniumLeggings, TITANIUMARMOR, 9, 2, false).setIconIndex(49).setItemName("titaniumLeggings");
		titaniumBoots = new GCItemArmor(GCConfigManager.idArmorTitaniumBoots, TITANIUMARMOR, 9, 3, false).setIconIndex(50).setItemName("titaniumBoots");
		titaniumHelmetBreathable = new GCItemArmor(GCConfigManager.idArmorTitaniumHelmetBreathable, TITANIUMARMOR, 9, 0, true).setIconIndex(51).setItemName("titaniumHelmetBreathable");
		deshStick = new GCItem(GCConfigManager.idItemDeshStick).setIconIndex(52).setItemName("deshStick");
		heavyBoots = new GCItemArmor(GCConfigManager.idArmorHeavyBoots, ARMORHEAVY, 10, 3, false).setIconIndex(53).setItemName("heavyBoots");
		ingotQuandrium = new GCItem(GCConfigManager.idItemIngotQuandrium).setIconIndex(54).setItemName("ingotQuandrium");
		ingotDesh = new GCItem(GCConfigManager.idItemIngotDesh).setIconIndex(55).setItemName("ingotDesh");
		ingotTitanium = new GCItem(GCConfigManager.idItemIngotTitanium).setIconIndex(56).setItemName("ingotTitanium");
		ingotCopper = new GCItem(GCConfigManager.idItemIngotCopper).setIconIndex(57).setItemName("ingotCopper");
		ingotAluminum = new GCItem(GCConfigManager.idItemIngotAluminum).setIconIndex(58).setItemName("ingotAluminum");
		jetpack = new GCItemJetpack(GCConfigManager.idArmorJetpack, ARMORJETPACK, 11, 1).setIconIndex(59).setItemName("jetpack");
	}

	public static void addNames() 
	{
		LanguageRegistry.instance().addNameForObject(oxygenMask, "en_US", "Oxygen Mask");
		LanguageRegistry.instance().addNameForObject(spaceship, "en_US", "Spaceship");
		LanguageRegistry.instance().addNameForObject(lightOxygenTankFull, "en_US", "Light Oxygen Tank");
		LanguageRegistry.instance().addNameForObject(lightOxygenTankEmpty, "en_US", "Empty Light Oxygen Tank");
		LanguageRegistry.instance().addNameForObject(medOxygenTankFull, "en_US", "Medium Oxygen Tank");
		LanguageRegistry.instance().addNameForObject(medOxygenTankEmpty, "en_US", "Empty Medium Oxygen Tank");
		LanguageRegistry.instance().addNameForObject(heavyOxygenTankFull, "en_US", "Heavy Oxygen Tank");
		LanguageRegistry.instance().addNameForObject(heavyOxygenTankEmpty, "en_US", "Empty Heavy Oxygen Tank");
		LanguageRegistry.instance().addNameForObject(sensorGlasses, "en_US", "Sensor Glasses");
		LanguageRegistry.instance().addNameForObject(sensorGlassesWithOxygenMask, "en_US", "Sensor Glasses with Oxygen Mask");
		LanguageRegistry.instance().addNameForObject(reinforcedBucketEmpty, "en_US", "Reinforced Bucket");
		LanguageRegistry.instance().addNameForObject(reinforcedBucketMilk, "en_US", "Reinforced Milk Bucket");
		LanguageRegistry.instance().addNameForObject(reinforcedBucketWater, "en_US", "Reinforced Water Bucket");
		LanguageRegistry.instance().addNameForObject(reinforcedBucketLava, "en_US", "Reinforced Lava Bucket");
		LanguageRegistry.instance().addNameForObject(reinforcedBucketBacteria, "en_US", "Reinforced Sludge Bucket");
		LanguageRegistry.instance().addNameForObject(rawDesh, "en_US", "Unrefined Desh");
		LanguageRegistry.instance().addNameForObject(deshPickaxe, "en_US", "Desh Pickaxe");
		LanguageRegistry.instance().addNameForObject(deshAxe, "en_US", "Desh Axe");
		LanguageRegistry.instance().addNameForObject(deshSpade, "en_US", "Desh Spade");
		LanguageRegistry.instance().addNameForObject(deshHoe, "en_US", "Desh Hoe");
		LanguageRegistry.instance().addNameForObject(deshSword, "en_US", "Desh Sword");
		LanguageRegistry.instance().addNameForObject(planetStonePickaxe, "en_US", "Stone Pickaxe");
		LanguageRegistry.instance().addNameForObject(planetStoneAxe, "en_US", "Stone Axe");
		LanguageRegistry.instance().addNameForObject(planetStoneSpade, "en_US", "Stone Spade");
		LanguageRegistry.instance().addNameForObject(planetStoneHoe, "en_US", "Stone Hoe");
		LanguageRegistry.instance().addNameForObject(planetStoneSword, "en_US", "Stone Sword");
		LanguageRegistry.instance().addNameForObject(quandriumPickaxe, "en_US", "Quandrium Pickaxe");
		LanguageRegistry.instance().addNameForObject(quandriumAxe, "en_US", "Quandrium Axe");
		LanguageRegistry.instance().addNameForObject(quandriumSpade, "en_US", "Quandrium Spade");
		LanguageRegistry.instance().addNameForObject(quandriumHoe, "en_US", "Quandrium Hoe");
		LanguageRegistry.instance().addNameForObject(quandriumSword, "en_US", "Quandrium Sword");
		LanguageRegistry.instance().addNameForObject(titaniumPickaxe, "en_US", "Titanium Pickaxe");
		LanguageRegistry.instance().addNameForObject(titaniumAxe, "en_US", "Titanium Axe");
		LanguageRegistry.instance().addNameForObject(titaniumSpade, "en_US", "Titanium Spade");
		LanguageRegistry.instance().addNameForObject(titaniumHoe, "en_US", "Titanium Hoe");
		LanguageRegistry.instance().addNameForObject(titaniumSword, "en_US", "Titanium Sword");
		LanguageRegistry.instance().addNameForObject(deshHelmet, "en_US", "Desh Helmet");
		LanguageRegistry.instance().addNameForObject(deshChestplate, "en_US", "Desh Chestplate");
		LanguageRegistry.instance().addNameForObject(deshLeggings, "en_US", "Desh Leggings");
		LanguageRegistry.instance().addNameForObject(deshBoots, "en_US", "Desh Boots");
		LanguageRegistry.instance().addNameForObject(deshHelmetBreathable, "en_US", "Breathable Desh Helmet");
		LanguageRegistry.instance().addNameForObject(quandriumHelmet, "en_US", "Quandrium Helmet");
		LanguageRegistry.instance().addNameForObject(quandriumChestplate, "en_US", "Quandrium Chestplate");
		LanguageRegistry.instance().addNameForObject(quandriumLeggings, "en_US", "Quandrium Leggings");
		LanguageRegistry.instance().addNameForObject(quandriumBoots, "en_US", "Quandrium Boots");
		LanguageRegistry.instance().addNameForObject(quandriumHelmetBreathable, "en_US", "Breathable Quandrium Helmet");
		LanguageRegistry.instance().addNameForObject(titaniumHelmet, "en_US", "Titanium Helmet");
		LanguageRegistry.instance().addNameForObject(titaniumChestplate, "en_US", "Titanium Chestplate");
		LanguageRegistry.instance().addNameForObject(titaniumLeggings, "en_US", "Titanium Leggings");
		LanguageRegistry.instance().addNameForObject(titaniumBoots, "en_US", "Titanium Boots");
		LanguageRegistry.instance().addNameForObject(titaniumHelmetBreathable, "en_US", "Breathable Titanium Helmet");
		LanguageRegistry.instance().addNameForObject(deshStick, "en_US", "Desh Stick");
		LanguageRegistry.instance().addNameForObject(heavyBoots, "en_US", "Heavy Boots");
		LanguageRegistry.instance().addNameForObject(ingotQuandrium, "en_US", "Quandrium Ingot");
		LanguageRegistry.instance().addNameForObject(ingotDesh, "en_US", "Refined Desh");
		LanguageRegistry.instance().addNameForObject(ingotTitanium, "en_US", "Titanium Ingot");
		LanguageRegistry.instance().addNameForObject(ingotCopper, "en_US", "Copper Ingot");
		LanguageRegistry.instance().addNameForObject(ingotAluminum, "en_US", "Aluminum Ingot");
		LanguageRegistry.instance().addNameForObject(jetpack, "en_US", "Jetpack");
	}
}
