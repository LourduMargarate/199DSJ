package com.mph.testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestClass {
	@Test
	public void testAllAssertMethods() {
		String str1 = new String("caro");
		String str2 = new String("caro");
		String str3 = null;
		String str4 = "deeps";
		String str5 = "deeps";

		int val1 = 5;
		int val2 = 6;

		 assertEquals(str4, str5);
		 //assertSame(str4, str5);
		// assertNotSame(str1, str2);
		// assertTrue(val1<val2);
		// assertFalse(val1<val2);
		// assertNotNull(str3);

	}

	@Test
	public void testAllAraayMethods() {

		String[] arr1 = { "one", "two", "three" };
		String[] arr2 = { "one", "twoo", "three" };

		assertArrayEquals(arr1, arr2);

	}
	
	@Test
	public void testAllNumberMethods() {
		
		int val1 = 5;
		int val2 = 6;

		
		 assertTrue(val1>val2);
		 
		 //assertFalse(val1<val2);
		

	}
}
