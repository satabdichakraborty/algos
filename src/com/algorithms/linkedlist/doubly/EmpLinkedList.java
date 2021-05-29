package com.algorithms.linkedlist.doubly;

public class EmpLinkedList {

	EmployeeNode head;
	EmployeeNode tail;
	int size;

	public EmpLinkedList() {
		head = null;
		tail = null;
		size = 0;

	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int getSize() {
		return size;
	}

	public void insertAtFront(Employee emp) {
		if (head != null) {
			System.out.println("Entering insertAtFront with head = " + head.getPrevious() + "<--P [" + head + "] N-->"
					+ head.getNext());
		} else {
			System.out.println("Entering insertAtFront with head = null [empty list]");
		}

		EmployeeNode node = new EmployeeNode(emp);

		node.setNext(head);

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
		}
		head = node;
		size++;
	}

	public void removeAtEnd() {
		if (tail != null) {
			System.out.println("Entering removeAtEnd with tail = " + tail.getPrevious() + "<--P [" + tail + "] N -->"
					+ tail.getNext());
		}
		EmployeeNode nodeToBeRemoved = tail;
		if (tail == null) {
			System.out.println("Nothing to remove");
		} else {
			// nodeToBeRemoved = tail;
			tail = tail.getPrevious();
			tail.setNext(null);
			// cleanup
			// nodeToBeRemoved.setPrevious(null);
			// nodeToBeRemoved.setNext(null);
			size--;
		}

	}

	/*
	 * public void addToEnd(EmployeeNode newNode) {}
	 * 
	 * public void insertAtPosition(EmployeeNode newNode, int position) {}
	 * 
	 * public void removeFromPosition(int position) {}
	 * 
	 * public void removeFromFront() {}
	 * 
	 * public void removeFromEnd() {}
	 */

	public void printEmployeeDoublyLinkedList() {
		System.out.println("Here comes the list of employees--");
		EmployeeNode current;

		if (isEmpty()) {
			System.out.println("EmployeeDoublyLinkedList is empty");
		} else {
			current = head;
			System.out.println("head-->");
			while (current != null) {
				System.out.println("<--" + current + " -->");
				current = current.getNext();
			}
			System.out.println("tail-->null");
		}

	}

}
