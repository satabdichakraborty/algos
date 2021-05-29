package com.algorithms.sort;

public class ShellSort {

	static int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

	public static void main(String[] args) {
		shellSort(arr);
		printArr(arr);
	}

	private static void shellSort(int[] arr) {
		
		int gap = arr.length/2;
		
		for (; gap > 0; gap/=2) {
			
			int index = gap;
			for (; index < arr.length; index++) {
				int newElementToCompare = arr[index];
				int i = index;
				for (; i-gap >= 0 && arr[i-gap]> newElementToCompare; i--) {
					swap(i, i-gap);
				}
			}
		}
	}
	
	
	
	private static void swap(int i, int j) {		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArr(int[] numberArray) {
		for (int i : numberArray) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}
}
