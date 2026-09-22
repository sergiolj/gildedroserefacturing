package com.gildedrose;

import com.gildedrose.strategy.ClassifiedItem;
import com.gildedrose.strategy.ItemType;
import com.gildedrose.strategy.StrategyFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	for(Item item : items) {
    		ItemType producType = ClassifiedItem.classify(item);
    		StrategyFactory.getStrategy(producType).update(item);
    	}
    }
}
