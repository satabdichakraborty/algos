package com.algorithms.sort;

public class Factorial {
	
	static int number = 4;
	
	public static void main(String[] args) {
		/*
		 * int value = getFactorialByIteration(number); System.out.println(value);
		 */
		
		int value2 = getFactorialByRecursion(number);
		System.out.println(value2);
	}

	private static int getFactorialByRecursion(int num) {
		
		int fact = num;
		
		if(fact==0)
			return 1;
			
		return fact * getFactorialByRecursion(fact-1);
	}
	
	

	private static int getFactorialByIteration(int num) {
		int i = num-1;
		for (; i > 0 ; i--) {
			num = num * i;
			
		}
		return num;
	}

}
