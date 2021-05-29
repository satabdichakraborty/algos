package com.algorithms.linkedlist.sumoftwolist;

public class ProgramLinkedList {

	public static class LinkedList {
		public int value;
		public LinkedList next;

		public LinkedList(int value) {
			this.value = value;
			this.next = null;
		}
	}

	private static LinkedList root = null;

	public static void main(String[] args) {
		insert(7);
		insert(9);
		insert(2);
		printLinkedList();
	}

	private static void insert(int num) {
		LinkedList current = null;

		if (root == null) {
			root = new LinkedList(num);
		} else {
			current = root;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new LinkedList(num);
		}
	}

	private static void printLinkedList() {
		LinkedList current = root;
		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}

	}

}
