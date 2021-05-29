package com.algorithms.search;

public class Linear {

	private static int[] list = { 20, 35, -15, 7, 55, 1, -22 };

	public static void main(String[] args) {
		
		int position = executeLinearSearch(22);

		System.out.println(position==-1?"Item not found":position);
	}

	private static int executeLinearSearch(int i) {

		for (int j = 0; j < list.length; j++) {
			if (i == list[j]) {
				return j;
			}
		}
		return -1;
	}

}
