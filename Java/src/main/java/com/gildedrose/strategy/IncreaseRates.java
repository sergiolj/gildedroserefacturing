package com.gildedrose.strategy;

public enum IncreaseRates {
	REGULAR(1), DOUBLE(2), TRIPPLE(3);
	
	private final int value;
	
	private  IncreaseRates(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
