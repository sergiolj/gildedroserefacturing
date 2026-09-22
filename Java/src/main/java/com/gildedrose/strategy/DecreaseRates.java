package com.gildedrose.strategy;

public enum DecreaseRates {
	REGULAR(1), DOUBLE(2);
	
	private final int value;
	
	private DecreaseRates(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
