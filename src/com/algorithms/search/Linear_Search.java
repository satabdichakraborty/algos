package com.algorithms.search;

//Time Complexity O(n)

public class Linear_Search {


	public static void main(String[] args) {
		System.out.println("Hello");
		
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    
	    System.out.println(executeLinearSearch(list, 5));
	    
	}
	
	private static int executeLinearSearch(int[] list, int targetValue) {
		
		for (int index=0; index< list.length; index++) {
			if(list[index]== targetValue)
				return index;
		}	
		
		return -1;
	}
	
}


