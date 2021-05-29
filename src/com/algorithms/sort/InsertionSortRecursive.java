package com.algorithms.sort;

public class InsertionSortRecursive {
	
	private static int[] input = { 20, 35, -15, 7, 55, 1, -22 };

	public static void main(String[] args) {
		

		System.out.println("Before");
		printArr(input);

		//insertionSort(input);
		insertionSort_Recur(input, 1);
		
		System.out.println("\nAfter");
		printArr(input);

	}
	
	private static void insertionSort_Recur(int[] input, int sortedLen) {
		
		int inputLen = input.length;
		int unsortedPosition = sortedLen;
		
		if(unsortedPosition == inputLen || inputLen <= 1) {
			return;
		}
		
		while (unsortedPosition < inputLen) {
				unsortedPosition = sort(input, unsortedPosition);
			}		

	}

	private static int sort(int[] input, int unsortedPosition) {
		int newElement = input[unsortedPosition];
		int index = unsortedPosition;
		for (; index > 0 && input[index-1] >= newElement; index--) {
				input[index] = input[index-1];
		}
		input[index] = newElement;
		unsortedPosition++;
		return unsortedPosition;
	}

	private static void insertionSort(int[] input) {
		int inputLen = input.length;
		if (inputLen > 1) {
			int unsortedPosition = 1;

			while (unsortedPosition < inputLen) {
				unsortedPosition = sort(input, unsortedPosition);
			}
		}

	}

	private static void printArr(int[] input) {

		for (int i : input) {
			System.out.print(i + " ");
		}

	}

}
