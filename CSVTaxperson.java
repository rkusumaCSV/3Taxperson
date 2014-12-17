package com.rohini.interview;

public class CSVTaxperson {
	public static enum ItemType {
		NECESSARY,
		LUXUARY
	}

	public CSVTaxperson() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public long fullPrice(ItemType itemType, long priceInPennies) {
		if (priceInPennies < 0) {
			throw new IllegalArgumentException("Price can not be negative");
		}
		if (itemType == null) {
			throw new IllegalArgumentException("ItemType can not be null!");
		}

		double totalPrice = 0;

		switch(itemType) {
		case NECESSARY:
			totalPrice = 1.01 * priceInPennies;
			break;
			
		case LUXUARY:
			totalPrice = 1.09 * priceInPennies;
			break;

		default:
			throw new IllegalArgumentException("Invalid itemType");
		}
		return (Math.round(totalPrice));
	}
}
