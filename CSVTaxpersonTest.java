package com.rohini.interview;

import static org.junit.Assert.assertEquals;
//import org.junit.BeforeClass;
import org.junit.Test;
import com.rohini.interview.CSVTaxperson;
import com.rohini.interview.CSVTaxperson.ItemType;

public class CSVTaxpersonTest {
	
	@Test
	public void getTotalPrice(){
		CSVTaxperson csv = new CSVTaxperson();
		long tot = csv.fullPrice(ItemType.NECESSARY, 34l);
		assertEquals(34l, tot);
		
		long total = csv.fullPrice(ItemType.NECESSARY, 106);
		assertEquals(107l, total);
		
		long total1 = csv.fullPrice(ItemType.LUXUARY, 177l);
		assertEquals(193, total1);
		
		long total2 = csv.fullPrice(ItemType.NECESSARY, 9);
		assertEquals(9, total2);
		
		long total3 = csv.fullPrice(ItemType.LUXUARY, 10000000);
		assertEquals(10900000l, total3);
		
		long total4 = csv.fullPrice(ItemType.LUXUARY, 0);
		assertEquals(0, total4);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void validateException(){
		CSVTaxperson csv = new CSVTaxperson();
		csv.fullPrice(null, 0);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void validateException1(){
		CSVTaxperson csv = new CSVTaxperson();
		csv.fullPrice(ItemType.valueOf(""), 0);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void validateException2(){
		CSVTaxperson csv = new CSVTaxperson();
		csv.fullPrice(ItemType.NECESSARY, -123);
	}
}

	
