package com.algorithms.linkedlist.sumoftwolist;

class Program {
	// This is an input class. Do not edit.
	public static class LinkedList {
		public int value;
		public LinkedList next;

		public LinkedList(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		sumOfLinkedLists(792, 49);
	}

	public static LinkedList sumOfLinkedLists(int num1, int num2) {
		LinkedList linkedListOne = createLinkedList(num1);
		printLinkedList(linkedListOne);
		LinkedList linkedListTwo = createLinkedList(num2);
		printLinkedList(linkedListTwo);

		int firstLinkedListSum = getSum(linkedListOne);
		int secondLinkedListSum = getSum(linkedListTwo);
		int newList = firstLinkedListSum + secondLinkedListSum;
		System.out.println("Total = " + newList);
		LinkedList listToReturn = createLinkedList(newList);
		printLinkedList(listToReturn);
		return listToReturn;
	}

	private static LinkedList createLinkedList(int newList) {
		LinkedList head = new LinkedList(0);
		LinkedList currentNode = head;
		int num = newList;
		int count = 0;
		int digit = 0;
		int i = 10;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		LinkedList rerutnList = new LinkedList(newList % i);
		currentNode.next = rerutnList;
		currentNode = rerutnList;
		count--;
		int temp = newList / i;
		while (temp > 0) {
			digit = temp % 10;
			// System.out.println("Digit at place " + count + " is: " + digit);
			temp = temp / 10;
			LinkedList newNode = new LinkedList(digit);
			currentNode.next = newNode;
			currentNode = newNode;
			count--;
		}

		return head.next;
	}

	private static int getSum(LinkedList linkedListOne) {
		int first = 0;
		int digit = 1;
		while (linkedListOne.next != null) {
			first = first + (digit * linkedListOne.value);
			digit = digit * 10;
			linkedListOne = linkedListOne.next;
		}
		first = first + (digit * linkedListOne.value);
		System.out.println("Returning total = "+first);
		return first;
	}

	private static void printLinkedList(LinkedList rerutnList) {
		System.out.println("New linkedList --> ");
		while (rerutnList.next != null) {
			System.out.print(rerutnList.value + " ");
			rerutnList = rerutnList.next;
		}
		System.out.print(rerutnList.value + " ");
		System.out.println();
	}
}
