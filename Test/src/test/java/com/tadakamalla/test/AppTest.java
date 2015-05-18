package com.tadakamalla.test;

import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest {
	
	@Test
	public void testmain(){
	    App.main(null);
	}
	
	@Test
	public void FibonacciTest(){
		int number = 5;
		int[] result = App.Fibonacci(number);
		
		int[] expected = {0, 1, 1, 2, 3};
		
		assertNotNull(result);
		assertEquals(expected.length,  result.length);
		// assertEquals(expected, result);
		assertEquals(expected[number-1],result[number-1]);
	}

}
