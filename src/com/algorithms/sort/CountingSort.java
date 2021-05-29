package com.algorithms.sort;

public class CountingSort {
	
	public static void main(String[] args) {
		int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		int[] sortedArr = new int[intArray.length+1];
		
		sortedArr = countingArr(intArray, 1, 10);
		
		//printArray(sortedArr);
		
	}

	private static void printArray(int[] sortedArr) {
		for (int i : sortedArr) {
			System.out.print(i+" ");
		}
	}

	private static int[] countingArr(int[] intArray, int min, int max) {
		int[] sortedArr = new int[(max-min) + 1];
		int[] countingArr = new int[(max-min) + 1];
		int index=0;
		
		for (int i = 0; i < intArray.length; i++) {
			//System.out.println("intArray[i]-min="+intArray[i]);
			countingArr[intArray[i]-min]++;
		}
	//  printArray(countingArr);
	//	System.out.println("");
		
		for (int i = min; i <= max; i++) {
			while (countingArr[i-min] > 0) {
				sortedArr[index++] = i;
				countingArr[i-min]--;
			}
		}
		
		printArray(sortedArr);
		
		return sortedArr;
	}

}
