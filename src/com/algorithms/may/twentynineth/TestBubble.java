package com.algorithms.may.twentynineth;

public class TestBubble {

	public static void main(String[] args) {
		int[] array = { 5, 7, 1, 8, 3, 9, 2, 4, 6, 6 };

		bubbleSort(array);

		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();

	}

	private static void bubbleSort(int[] array) {
		int sortedPosition = array.length;
		boolean swap = false;

		while (sortedPosition > 0 && !swap) {
			swap = true;
			for (int i = 0; i < sortedPosition - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i);
					swap = false;
				}
			}
			sortedPosition--;
		}
	}

	private static void swap(int[] array, int i) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}

}
