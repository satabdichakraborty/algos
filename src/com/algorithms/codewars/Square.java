package com.algorithms.codewars;

public class Square {
	
	public static void main(String[] args) {
		long n = 225472484;
		boolean result = testSquare(n);
		System.out.println(" "+ result);
	}

	//Divide the number into half. 
	//Run a loop until the half 
	//If the number is a perfect square then return true else return false
	//This way we only run through half the numbers
	private static boolean testSquare(long n) {
		long half = n/2;
		boolean result = false;
		for (long i = 0; i <= half; i++) {
			if(i*i==n) {
				System.out.println(i);
				result = true; 
			}
		}
		return result;
	}
}
