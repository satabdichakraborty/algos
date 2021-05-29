package com.algorithms.list;

public class SinglyLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static SinglyLinkedList insert(SinglyLinkedList singlyLinkedList, int data) {

		Node insertNode = new Node(data);
		insertNode.next = null;

		// If singlyLinkedList is empty then insert the newly created node at the head
		if (singlyLinkedList.head == null) {
			singlyLinkedList.head = insertNode;
		} else {
			// find the last node of the singlyLinkedList
			Node last = singlyLinkedList.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = insertNode;
		}

		return singlyLinkedList;
	}

	static void printList(SinglyLinkedList singlyLinkedList) {
		Node last = singlyLinkedList.head;
		while (last.next != null) {
			System.out.print("Val --> " + last.data+ " ");
			last = last.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		list = insert(list, 9);
		list = insert(list, 10);
		list = insert(list, 11);

		printList(list);

	}

}
