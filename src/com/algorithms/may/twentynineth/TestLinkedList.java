package com.algorithms.may.twentynineth;

import java.util.Random;

public class TestLinkedList {

	public static class LinkedList {
		private int value;
		private LinkedList next;

		public LinkedList(int value) {
			this.value = value;
		}
	}

	private static LinkedList root;

	private static void insert(int value) {
		LinkedList current = null;

		if (root == null) {
			root = new LinkedList(value);
		} else {
			current = root;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new LinkedList(value);
		}
	}

	private static void delete(int value) {
		System.out.println("Trying to delete =" + value);
		LinkedList current = root;
		boolean deleted = true;
		while (current != null) {
			deleted = false;
			if (current.next != null) {
				if (root.value == value) {
					deleted = true;
					System.out.println("[" + value + "] deleted from root");
					root = root.next;
				} else if (current.value == value) {
					deleted = true;
					System.out.println("[" + value + "] deleted");
					LinkedList nodeToBeDeleted = current;
					current.next = nodeToBeDeleted.next;
				} else if (current.next.value == value) {
					deleted = true;
					System.out.println("[" + value + "] deleted");
					LinkedList nodeToBeDeleted = current.next;
					current.next = nodeToBeDeleted.next;
				}
			}
			current = current.next;
		}
	}

	private static void print() {
		LinkedList current = root;
		System.out.println();
		System.out.print("Root-->");
		while (current != null) {
			System.out.print(current.value + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList(1);
		Random random = new Random();
		int i = 1;

		insert(0);

		while (i++ < 10) {
			insert(random.nextInt(10));
		}
		print();
		delete(0);
		print();
		delete(random.nextInt(5));
		print();

	}

}
