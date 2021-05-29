package com.algorithms.sort;

public class MergeSort {
	
	static int[] array = {20, 35, -15, 7, 55, 1, -22};
	
	public static void main(String[] args) {
		MergeSort(array, 0, array.length);
		printArray(0,array.length);
		
	}
	
	static void MergeSort(int[] array, int start, int end) {
		
		/*
		 * System.out.println("Start="+start+" : End="+end); printArray(start, end);
		 * System.out.println(" ");
		 */
		
		
		if(end-start < 2) {
			return;
		}		
		int mid = (start + end) / 2;
		
		MergeSort(array, start, mid);
		MergeSort(array, mid, end);
		Merge(array, start, mid, end);
	}
	
	private static void Merge(int[] input, int start, int mid, int end) {
		if(input[mid-1]<= input[mid])
			return;
		
		int i = start;
		int j = mid;
		int index = 0;
		int[] temp = new int[end-start];
		
		while(i < mid && j < end) {
			temp[index++] = input[i] <= input[j]? input[i++]: input[j++];
		}
		
		System.arraycopy(input, i, input, start+index, mid-i);//copying the reamining elements
		System.arraycopy(temp, 0, input, start, index);//copying the temp array to the main array
		
	}

	static void printArray(int start, int end) {
		for (int i=start; i<end; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
