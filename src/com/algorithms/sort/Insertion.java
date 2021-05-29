package com.algorithms.sort;

public class Insertion {

	static int[] arr = { 20, 35, -15, 7 };// , 55, 1, -22 };

	public static void main(String[] args) {
		insertionSort(arr);
		printArr(arr);
	}

	private static void insertionSort(int[] arr) {
		if(arr.length > 0) {
			int sortedArrayLen = 1;
			
			for(;sortedArrayLen < arr.length; sortedArrayLen++)
			{
				int index = sortedArrayLen;
				int newElementToCompare = arr[sortedArrayLen];
			
				for(;index>0 && arr[index-1]> newElementToCompare; index--) {
					arr[index] = arr[index-1];
				}
				arr[index] = newElementToCompare;
			}
		}
		
	}

	private static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
