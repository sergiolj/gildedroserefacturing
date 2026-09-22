package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

class GildedRoseTest {
	

	private Item[] createMockData() {
		return new Item[] {
        new Item("+5 Dexterity Vest", 10, 20), //
        new Item("Aged Brie", 2, 0), //
        new Item("Elixir of the Mongoose", 5, 7), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        // this conjured item does not work properly yet
        new Item("Conjured Mana Cake", 3, 6) 
        };
	}

    @Test
    void foo() {
    	GildedRose app = new GildedRose(createMockData());
        app.updateQuality();
        assertEquals("+5 Dexterity Vest", app.items[0].name);
    }
    
    @Test
    @DisplayName("Para itens UNCLASSIFIED deve decrementar em um ponto tanto sellin quanto quality")
    void shouldUpdateRegularItemCorrectly() {
    	Item[] items = createMockData();
    	GildedRose app = new GildedRose(items);
    	int sellExpected = 10;	
    	int qualityExpected = 20;
    	
    	for(int i=0; i<10; i++) {
    		assertEquals("+5 Dexterity Vest", app.items[0].name);
    		assertEquals(sellExpected, app.items[0].sellIn);
    		assertEquals(qualityExpected, app.items[0].quality);
    		app.updateQuality();
    		sellExpected--;
    		qualityExpected--;
    	}
    	
    	sellExpected = 5;
    	qualityExpected = 7;
    	
    	for(int i=0; i<5; i++) {
    		assertEquals("Elixir of the Mongoose", app.items[2].name);
    		assertEquals(sellExpected, app.items[2].sellIn);
    		assertEquals(qualityExpected, app.items[2].quality);
    		app.updateQuality();
    		sellExpected--;
    		qualityExpected--;
    	}
    }
    
    @Test
    @DisplayName("")
    void test() {
    	
    }

}
