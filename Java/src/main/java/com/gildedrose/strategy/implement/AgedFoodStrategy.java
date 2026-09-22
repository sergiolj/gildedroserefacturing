package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.UpdateRates;
import com.gildedrose.strategy.UpdateQualitySellin;

public class AgedFoodStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		int rate = UpdateRates.REGULAR.getValue();
		
    	if(item.quality<50) {
    		item.quality += rate;
    	}
    	if(item.sellIn > 0 && item.sellIn >= rate) {
    		item.sellIn -= rate;
    	}	
	}
	
}