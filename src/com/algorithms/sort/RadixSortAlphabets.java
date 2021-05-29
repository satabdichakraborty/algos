package com.algorithms.sort;

public class RadixSortAlphabets {

	public static void main(String[] args) {

		String[] input = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		// { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
		// "p", "q", "r",
		// "s", "t", "u", "v", "w", "x", "y", "z" };
		int width = 4;

		System.out.println("Input arr before sorting");
		printStrArr(input);
		
		radixSort(input, alphabets, width);
		
		System.out.println("\nInput arr after sorting");
		printStrArr(input);
	}

	private static void radixSort(String[] input, String alphabets, int width) {
		int position = 4;
		int[] countingArr = new int[alphabets.length()];
		String[] temp = new String[input.length];

		// { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
		for (; position >= 0; position--) {
			countingArr = getCountingArr(input, alphabets, position);
	//		System.out.println("\nCounting arr after increment");
	//		printIntArr(countingArr);
			
			
			for (int i = input.length - 1; i >= 0; i--) {
				char a = getCharAtPosition(input[i], position);
				temp[--countingArr[alphabets.indexOf(a)]] = input[i];
			}
			
			System.arraycopy(temp, 0, input, 0, input.length);
			
		//	System.out.println("\nInput arr after sorting");
		//	printStrArr(input);
		}

	}

	private static int[] getCountingArr(String[] input, String alphabets, int position) {
		int[] countingArr = new int[alphabets.length()];
		for (int i = 0; i < input.length; i++) {
			char a = getCharAtPosition(input[i], position);
			countingArr[alphabets.indexOf(a)]++;
		}

	//	System.out.println("Counting arr before increment");
	//	printIntArr(countingArr);

		for (int i = 1; i < countingArr.length; i++) {
			countingArr[i] = countingArr[i] + countingArr[i - 1];
		}

		return countingArr;
	}

	private static void printIntArr(int[] countingArr) {
		for (int i : countingArr) {
			System.out.print(i + " ");
		}
	}
	
	private static void printStrArr(String[] input) {
		for (String i : input) {
			System.out.print(i + " ");
		}
	}

	private static char getCharAtPosition(String inputStr, int position) {
		return inputStr.charAt(position);

	}

}
