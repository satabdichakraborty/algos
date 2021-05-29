package com.algorithms.sort;

public class SelectionAgain {
	
	static int[] arr = { 20, 35, -15, 7};//, 55, 1, -22 };

	
	public static void main(String[] args) {
		// unsorted
		
		// sorted
		// -22, -15, 1, 7, 20, 35, 55

		arr = selectionSort(arr);

		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

	private static int[] selectionSort(int[] arr) {
		int unSortedPosition = arr.length-1;
		
		
		while(unSortedPosition > 0) {
			int firstElementToCompare = 1;
			int largest = 0;
			for (; firstElementToCompare <= unSortedPosition; firstElementToCompare++) {
				if(arr[firstElementToCompare]> arr[largest]) {
					largest = firstElementToCompare;
				}//End of If
				
			}//End of For loop
			
			System.out.println("unSortedPosition="+unSortedPosition+ " : largest=" +largest);
			
			swap(largest, unSortedPosition);
			
			unSortedPosition--;
		}//End of While Loop
		return arr;
	}

	private static void swap(int j, int i) {
		
		if(i==j)
			return;
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}

}
