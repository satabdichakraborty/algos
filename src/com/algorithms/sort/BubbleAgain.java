package com.algorithms.sort;

public class BubbleAgain {
	
	public static void main(String[] args) {
		//unsorted
		int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
		//sorted
		//-22, -15, 1, 7, 20, 35, 55

		arr = bubbleSort(arr);
		
		for (int i : arr) {
			System.out.print(i+ ", ");
		}

	}

	private static int[] bubbleSort(int[] arr) {
		
		int i=arr.length;
		int counter= 0;
		while (i>0) {
			for (int j = 0; j < i-1; j++) {
				counter++;
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
			i--;			
		}
		System.out.println(counter);
		return arr;
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}

}
