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
		
		
		int[] numbersToSort = {30, 10, 12, 4, 5, 6, 7, 13};
		
		SortUsingMergeSortAlgorithm(numbersToSort);
		
		System.out.println ("Merge Sort output");
		
		for (int i = 0; i<numbersToSort.length-1; i++)
		   {
			   System.out.println (numbers[i]);
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
	
	private static int[] numbers;
	private static int[] helper;
	private static int numberLength;
	
	public static void SortUsingMergeSortAlgorithm(int[] numbersToSort){
		
		numbers = numbersToSort;
		numberLength = numbers.length;
		
		helper = new int[numberLength];
		MergeSort(0, numberLength-1);
	}
	
	private static void MergeSort(int lowerIndex, int upperIndex)	{
		
		if(lowerIndex < upperIndex)   {
			int middleIndex = lowerIndex + upperIndex / 2;
			MergeSort(lowerIndex, middleIndex);
			MergeSort(middleIndex + 1, upperIndex);
			Merge(lowerIndex, middleIndex, upperIndex);
		}			
	}
	
	private static void Merge(int lowerIndex, int middleIndex, int upperIndex) {
		
		for (int x= lowerIndex; x <= upperIndex; x++){
			helper[x] = numbers[x];
		}
		
		int i = lowerIndex;
		int j = middleIndex +1;
		int k = lowerIndex;
		
		while (i <= middleIndex && j <= upperIndex){
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			}
			else
			{
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i <= middleIndex){
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}
	
	
}
