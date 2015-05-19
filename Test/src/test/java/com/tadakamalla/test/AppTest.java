package src.test.java.com.tadakamalla.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tadakamalla.test.App;


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
	@Test
	public void FibonacciTestWithInvalidInput(){
		int[] result = App.Fibonacci(0-0-0);
		
		assertNull(result);
	}
	
	@Test
	public void FibonacciTestWithvalidInput(){
		int number = 3;
		int[] result = App.Fibonacci(number);
		
		int[] expected = {0, 1, 1};
		
		assertNotNull(result);
		assertEquals(expected.length,  result.length);
		// assertEquals(expected, result);
		assertEquals(expected[number-1],result[number-1]);
	}
	
	@Test
	public void FibonacciTestWithZeroInput(){
		int[] result = App.Fibonacci(0);
			
		assertNull(result);
	}
	
	@Test
	public void FibonacciTestwithNegitiveInput(){
		int[] result = App.Fibonacci(-1);
			
		assertNull(result);
	}
	
	public void FibonacciTestwithOneInput(){
		int[] result = App.Fibonacci(1);
		int[] expected = {0};
		assertNotNull(result);
		assertEquals(expected.length,  result.length);
		assertEquals(expected, result);
	}

	
	

}
