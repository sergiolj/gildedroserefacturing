package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.DecreaseRates;
import com.gildedrose.strategy.IncreaseRates;
import com.gildedrose.strategy.UpdateQualitySellin;

public class AgedFoodStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		int enhance = IncreaseRates.REGULAR.getValue();
		int decreace = DecreaseRates.REGULAR.getValue();
		
    	if(item.quality<50) {
    		item.quality += enhance;
    	}
    	if(item.sellIn > 0 && item.sellIn >= decreace) {
    		item.sellIn -= decreace;
    	}	
	}
	
}