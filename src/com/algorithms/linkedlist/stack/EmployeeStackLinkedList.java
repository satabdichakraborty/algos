package com.algorithms.linkedlist.stack;

public class EmployeeStackLinkedList {

	Employee emp;
	EmployeeNode head;
	int size;

	public EmployeeStackLinkedList() {
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

	public void push(Employee emp) {
		EmployeeNode node = new EmployeeNode(emp);

		if (isEmpty()) {
			head = node;
			head.setNext(null);
		} else {
			node.setNext(head);
			head = node;
		}
		size++;

	}

	public EmployeeNode pop() {
		EmployeeNode poppedNode = head;
		if (isEmpty()) {
			System.out.println("Nothing to pop..");
		} else {
			poppedNode = head;
			head = head.getNext();
		}
		size--;
		return poppedNode;
	}

	public EmployeeNode peek() {
		EmployeeNode poppedNode = head;
		return poppedNode;
	}

	public void printStack() {
		EmployeeNode current = head;

		System.out.println("Head-->");

		while (current != null) {
			System.out.println(current + "-->");
			current = current.getNext();
		}
		System.out.println("null");

	}
}
