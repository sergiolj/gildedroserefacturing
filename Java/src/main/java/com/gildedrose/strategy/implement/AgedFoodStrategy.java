package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.UpdateQualitySellin;

public class AgedFoodStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
    	if(item.quality<50) {
    		item.quality++;
    	}
    	if(item.sellIn>0) {
    		item.sellIn--;
    	}	
	}
	
}