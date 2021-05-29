package com.algorithms.sort;

public class StableCountingSort {
	
	static int[] inputArray = {4725, 4586, 1330, 8792, 1594, 5729};
	
	public static void main(String[] args) {
		
		
		int width = inputArray.length;
		int radix = 10;
		int position = 0;
		
		while (position < width-1) {
		inputArray = getTempArray(width, radix, position);	
		position++;
		}
		
		printArray(inputArray);
		
		
	}

	private static int[] getTempArray(int width, int radix, int position) {
		int[] tempArr = new int[width];
		int[] countingArr;
		countingArr = getCountingArr(inputArray, radix, position);
	    
	    for (int i = width-1; i >= 0; i--) {
	    	int n = getElementAtPosition(inputArray[i], position, radix);
	    	//System.out.println("n="+n);
	    	int pos = --countingArr[n];	    	
	    	tempArr[pos] = inputArray[i];
			
		}
		/*
		 * System.out.print("\nTempArr="); printArray(tempArr); System.out.println("");
		 */
	    return tempArr;
	}

	private static int[] getCountingArr(int[] inputArray, int radix, int position) {
		int[] countingArr = new int[radix];
		for (int i = 0; i < inputArray.length; i++) {
			int n = getElementAtPosition(inputArray[i], position, radix);
			while (n<radix) {
				countingArr[n]++;
				n++;
			}
			
		}
	//	printArray(countingArr);
		return countingArr;
	}
	
	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	
	private static int getElementAtPosition(int item, int position, int radix) {
		int number;
		
		//1st position element
		//4725/(10 power 1) is 10 = 4725/10 = 472.5
		//Now convert that into int  = 472
		//Modulo operation % 10 = 2
		number = (item/(int) Math.pow(10, position)) % radix;
		
		//System.out.println("number="+number);
		
		return number;
	}
	
	

}
