package com.gildedrose.strategy;

import com.gildedrose.strategy.implement.AgedFoodStrategy;
import com.gildedrose.strategy.implement.BackstagePassesStrategy;
import com.gildedrose.strategy.implement.ConjuredStrategy;
import com.gildedrose.strategy.implement.LegendaryStrategy;
import com.gildedrose.strategy.implement.UnclassifiedStrategy;

public class StrategyFactory {
	
 private StrategyFactory() {
   /* This utility class should not be instantiated */
 }

	public static UpdateQualitySellin getStrategy(ItemType type) {
		return switch(type) {
		case AGED_FOOD -> new AgedFoodStrategy();
		case LEGENDARY -> new LegendaryStrategy();
		case BACKSTAGE_PASS -> new BackstagePassesStrategy();
		case CONJURED -> new ConjuredStrategy();
		default -> new UnclassifiedStrategy();
		};
		
	}

}
