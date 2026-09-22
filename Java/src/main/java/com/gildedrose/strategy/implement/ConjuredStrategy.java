package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.UpdateQualitySellin;
import com.gildedrose.strategy.UpdateRates;

public class ConjuredStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		int decrease = UpdateRates.REGULAR.getValue();
		int rate = UpdateRates.DOUBLE.getValue();
		
		if(item.quality < 50 && item.quality >= rate) {
			item.quality -= rate;
		}
		if(item.sellIn >= decrease) {
			item.sellIn -= decrease;
		}
		
	}

}
