package com.algorithms.search;

import java.util.Arrays;

public class Binary_re {

	public static void main(String[] args) {
		int[] list = { 20, 35, -15, 7, 55, 1, -22 };

		Arrays.sort(list);
		
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		// int position = binearSearch(list, 1);
		int position = binearSearchRe(list, 1);

		System.out.println(position == -1 ? "Item not found" : "Item Found at position = " + position);
	}

	private static int binearSearchRe(int[] list, int value) {
		return binearSearch_Re(list, 0, list.length, value);

	}

	private static int binearSearch_Re(int[] list, int start, int end, int value) {

		if (start >= end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (list[mid] == value) {
			return mid;
		} else if (value < list[mid]) {
			end = mid;
			return binearSearch_Re(list, 0, end, value);
		} else {
			start = mid + 1;
			return binearSearch_Re(list, start, end, value);
		}
	}

	/*
	 * private static int binearSearch(int[] list, int i) { int start = 0; int end =
	 * list.length; int pos = -1;
	 * 
	 * while (start < end) { int mid = (start + end) / 2; if (list[mid] == i) {
	 * return mid; } else if (i < list[mid]) { end = mid; } else { start = mid + 1;
	 * } } return pos; }
	 */

}
