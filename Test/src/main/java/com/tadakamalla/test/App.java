package com.tadakamalla.test;

public class App {

	public static void main(String[] args){
		
		System.out.println ("Hello world");
		//Iterative style for fibonacci
		
		int count = 10;
		
	   int[] numbers = Fibonacci(count);
	   System.out.println ("Fibonacci Iterative");
	   for (int i = 0; i<count; i++)
	   {
		   System.out.println (numbers[i]);
	   }
		
	   System.out.println ("Fibonacci Recursive");
	   int recursiveNumbers[] = new int[count+1];
		//Recursive style for fibonacci.
		for (int i = 1; i<=count; i++){
			recursiveNumbers[i] = FibonacciRecursive(i);
			}
		for (int i = 0; i<count; i++)
		   {
			   System.out.println (recursiveNumbers[i]);
		   }
		
	}
	
	public static int[] Fibonacci (int number) {
		if (number <= 0) {
			return null;
		}
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		int[] fibNumbers = new int[number];
		
		fibNumbers[0] = num1;
		fibNumbers[1] = num2;
		
		//Iterative
		for(int index = 2; index<=number-1; index++){
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			fibNumbers[index] = sum;
		}
		
		return fibNumbers;
	}
	

	
	public static int FibonacciRecursive(int number){
		if(number <= 0){
			return 0;
		}
		if (number==1 || number ==2){
			return 1;
		}
		return FibonacciRecursive (number-1)+FibonacciRecursive(number-2);
						
	}
	
}
