package com.algorithms.sort;

public class MergeAsc {

	private static int[] inputArray = { 20, 35, -15, 7, 55, 1, -22 };

	public static void main(String[] args) {
		partition(inputArray, 0, inputArray.length);
		int mid = (0 + inputArray.length) / 2;
		printArray(inputArray, 0, mid, inputArray.length);
	}

	private static void partition(int[] inputArray, int start, int end) {
		if ((end - start) < 2)
			return;
		int mid = (start + end) / 2;
		partition(inputArray, start, mid);
		//printArray(inputArray, start, mid, end);
		partition(inputArray, mid, end);
		//printArray(inputArray, start, mid, end);
		merge(inputArray, start, mid, end);
	}

	private static void merge(int[] input, int start, int mid, int end) {
		//System.out.println("At merge start-----");
		//printArray(inputArray, start, mid, end);
		if(input[mid-1] >= input[mid]) {
			return;
		}
		int i=start;
		int j=mid;
		int index=0;
		int[] tempArr = new int[end-start];
		
		while(i < mid && j < end) {
			tempArr[index++]=input[i]>input[j]?input[i++]:input[j++];
		}
		
		System.arraycopy(input, i, input, start+index, mid-i);
		System.arraycopy(tempArr, 0, input, start, index);
		
		//System.out.println("At merge end-----");
		//printArray(inputArray, start, mid, end);
	}

	private static void printArray(int[] inputArray, int start, int mid, int end) {
		//System.out.println("start=[" + start + "] : mid =[" + mid + "] : end [" + end + "]");
		for (int i = start; i < end; i++) {
			//System.out.print("Element at input[" + i + "]=[" + inputArray[i] + "]");
			System.out.println(inputArray[i]+" ");
		}
		//System.out.println("");
	}

}
