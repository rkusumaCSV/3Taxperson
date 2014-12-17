package com.rohini.interview;

public class CSVTaxperson {
	public static enum ItemType {
		NECESSARY,
		LUXUARY
	}

	public long fullPrice(ItemType itemType, long priceInPennies) {
		if (priceInPennies < 0) {
			throw new IllegalArgumentException("Price can not be negative");
		}
		if (itemType == null) {
			throw new IllegalArgumentException("ItemType can not be null!");
		}

		double totalPriceInPennies = 0;

		switch(itemType) {
		case NECESSARY:
			totalPriceInPennies = 1.01 * priceInPennies;
			break;
			
		case LUXUARY:
			totalPriceInPennies = 1.09 * priceInPennies;
			break;

		default:
			throw new IllegalArgumentException("Invalid itemType");
		}
		return (long) (Math.ceil(totalPriceInPennies)); //ceiling always adds tax as opposed to rounding off.
	}
}
