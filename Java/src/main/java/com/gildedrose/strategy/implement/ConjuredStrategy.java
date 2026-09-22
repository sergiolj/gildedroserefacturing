package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.UpdateQualitySellin;

public class ConjuredStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		if(item.quality < 50 && item.quality >= 2) {
			item.quality = item.quality - 2;
		}
		if(item.sellIn > 0) {
			item.sellIn--;
		}
		
	}

}
