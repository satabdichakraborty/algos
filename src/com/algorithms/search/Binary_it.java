package com.algorithms.search;

import java.util.Arrays;

public class Binary_it {

	private static int[] list = { 20, 35, -15, 7, 55, 1, -22 };

	public static void main(String[] args) {

		Arrays.sort(list);

		int position = binearSearch(-22);

		System.out.println(position == -1 ? "Item not found" : "Item Found at position = " + position);
	}

	private static int binearSearch(int i) {
		int mid = list.length / 2;

		while (list.length > 1 && mid != 0) {
			int pos = -1;

			if (i < list[mid]) {
				pos = search(0, mid, i);

			} else {
				pos = search(mid + 1, list.length, i);

			}
			if (pos != -1) {
				return pos;
			} else {
				mid = mid / 2;
			}
		}

		return -1;
	}

	private static int search(int start, int end, int i) {

		for (int j = start; j < end; j++) {
			if (list[j] == i) {
				return j;
			}
		}
		return -1;
	}

}
