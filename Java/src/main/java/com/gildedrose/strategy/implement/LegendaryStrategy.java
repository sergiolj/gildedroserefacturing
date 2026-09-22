package com.gildedrose.strategy.implement;

import com.gildedrose.Item;
import com.gildedrose.strategy.UpdateQualitySellin;

public class LegendaryStrategy implements UpdateQualitySellin{

	@Override
	public void update(Item item) {
		//Never has to be sold or decreases in quality
	}
	
}
