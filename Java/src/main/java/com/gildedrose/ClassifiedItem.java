package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

	enum ItemType{
		LEGENDARY, AGED_FOOD, BACKSTAGE_PASS, CONJURED
	}
	
	public class ClassifiedItem {
		Item item;
		ItemType type;

		private ClassifiedItem(Item item) {
			this.item = item;
			this.type = classify(item);
		}

		private ItemType classify(Item item) {
			if(item.name.equals("Aged Brie")){
				return ItemType.AGED_FOOD;
			}
			if(item.name.equals("Sulfuras, Hand of Ragnaros")){
				return ItemType.LEGENDARY;
			}
			if(item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
				return ItemType.BACKSTAGE_PASS;
			return ItemType.CONJURED;
		}

		public static List<ClassifiedItem> createList(Item[] items){
			List<ClassifiedItem> list = new ArrayList<>();
			for(Item item : items) {
				list.add(new ClassifiedItem(item));
			}
			return list;
		}

		public ItemType getType() {
			return this.type;
		}
	}
