package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.UpdateRates;
import com.gildedrose.strategy.UpdateQualitySellin;

public class BackstagePassesStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		int decrease = UpdateRates.REGULAR.getValue();
		int increase = UpdateRates.REGULAR.getValue();
		
		if(item.sellIn > 10 && item.quality < 50) {
			increase = UpdateRates.REGULAR.getValue();
			} else if (item.sellIn <= 10 && item.sellIn > 5) {
				increase = UpdateRates.DOUBLE.getValue();
			}else if(item.sellIn >= decrease)  {
				increase = UpdateRates.TRIPPLE.getValue();
			}else if(item.sellIn == 0){
				decrease=0;
				increase=-item.quality;
		}
		item.quality += increase;
		item.sellIn -= decrease;
	}
}
