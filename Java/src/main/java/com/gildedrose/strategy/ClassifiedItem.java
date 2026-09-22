package com.gildedrose.strategy;

import com.gildedrose.Item;

public class ClassifiedItem {

	private ClassifiedItem() {
		/* This utility class should not be instantiated */
	}

	public static ItemType classify(Item item) {
		if(item.name.startsWith("Aged Brie")){
			return ItemType.AGED_FOOD;
		}
		if(item.name.startsWith("Sulfuras")){
			return ItemType.LEGENDARY;
		}
		if(item.name.startsWith("Backstage passes"))
			return ItemType.BACKSTAGE_PASS;

		if(item.name.startsWith("Conjured")) {
			return ItemType.CONJURED;
		}
		return ItemType.UNCLASSIFIED;
	}

}
