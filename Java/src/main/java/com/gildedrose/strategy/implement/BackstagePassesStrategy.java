package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.DecreaseRates;
import com.gildedrose.strategy.IncreaseRates;
import com.gildedrose.strategy.UpdateQualitySellin;

public class BackstagePassesStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		int decrease = DecreaseRates.REGULAR.getValue();
		int increase = IncreaseRates.REGULAR.getValue();
		
		if(item.sellIn > 10 && item.quality < 50) {
			increase = IncreaseRates.REGULAR.getValue();
			} else if (item.sellIn <= 10 && item.sellIn > 5) {
				increase = IncreaseRates.DOUBLE.getValue();
			}else if(item.sellIn >= decrease)  {
				increase = IncreaseRates.TRIPPLE.getValue();
			}else if(item.sellIn == 0){
				decrease=0;
				increase=-item.quality;
		}
		item.quality += increase;
		item.sellIn -= decrease;
	}
}
