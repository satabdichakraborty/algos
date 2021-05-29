package com.algorithms.search;

import java.util.ArrayList;
import java.util.List;

public class Binary_Search_Recursive {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		Binary_Search_Recursive bs = new Binary_Search_Recursive();
		System.out.println(bs.executeRecursiveBinarySearch(list, 6));
		System.out.println(bs.executeRecursiveBinarySearch(list, 10));
	}

	private boolean executeRecursiveBinarySearch(List<Integer> list, int target) {

		if (list.size() == 0)
			return false;

		//int midPoint = (int) Math.floor(list.size() / 2);
		int midPoint = list.size() / 2;
		int val = list.get(midPoint);

		if (val == target)
			return true;
		else {
			if (val > target)
				return executeRecursiveBinarySearch(list.subList(0, midPoint), target);
			else
				return executeRecursiveBinarySearch(list.subList(midPoint + 1, list.size()), target);
		}
	}

}
