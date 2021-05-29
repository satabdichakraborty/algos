package com.algorithms.search;


//Time Complexity O(Log n)

public class Binary_Search {

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Binary_Search bs = new Binary_Search();
		System.out.println(bs.executeBinarySearch(list, 6));
	}

	 int executeBinarySearch(int[] list, int targetValue){
		 
		 int first = 0;
		 int last = list.length-1;
		 		 
		 while(first <= last) {
			 
			 int mid = (first + last) / 2;
			 
			 if(list[mid] == targetValue) {
				 return mid;
			 }
			 else if(list[mid] > targetValue){
				 last = mid - 1 ;
			 }
			 else {
				 first = mid + 1;
			 }
			 
		 }
		
		return -1;
		
	}

}
