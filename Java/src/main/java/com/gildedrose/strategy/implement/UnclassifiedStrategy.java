package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.DecreaseRates;
import com.gildedrose.strategy.UpdateQualitySellin;

public class UnclassifiedStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		int degrade = DecreaseRates.REGULAR.getValue();

		if(item.sellIn > 0 && item.sellIn >= degrade){
			item.sellIn -= degrade;
		}
		if(item.quality >= degrade && item.quality < 50) {
			item.quality -= degrade ;
		}
	}
}
