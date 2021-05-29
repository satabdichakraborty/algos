package com.algorithms.linkedlist.doubly;

public class EmployeeDoublyLinkedList {

	EmployeeNode head;
	EmployeeNode tail;
	int size;

	public EmployeeDoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;

	}

	public boolean isEmpty() {
		return (head == null & tail == null);
	}

	public int getSize() {
		return size;
	}

	public void insertAtFront(EmployeeNode newNode) {

		// Only incase of first node insertion when the EmployeeDoublyLinkedList is
		// empty
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.setNext(head);
			head = newNode;
			size++;
		}
	}

	public void addToEnd(EmployeeNode newNode) {

		// Only incase of first node insertion when the EmployeeDoublyLinkedList is
		// empty
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
			size++;
		}
	}

	public void insertAtPosition(EmployeeNode newNode, int position) {
		EmployeeNode previousNode = head;
		EmployeeNode currentNode = head;
		int length = 1;
		// Only incase of first node insertion when the EmployeeDoublyLinkedList is
		// empty
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
			System.out.println("There were no node in the linkedlist, so newNode was inserted at front.");
		} else {
			while (currentNode.getNext() != null && length < position) {
				length++;
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(newNode);
			newNode.setNext(currentNode);
			newNode.setPrevious(previousNode);
			size++;
		}
	}

	public void removeFromPosition(int position) {
		EmployeeNode previousNode = head;
		EmployeeNode currentNode = head;
		int length = 1;
		// Only incase of first node insertion when the EmployeeDoublyLinkedList is
		// empty
		if (head == null) {
			System.out.println("Nothing to remove");
		} else {
			while (currentNode.getNext() != null && length < position) {
				length++;
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(currentNode.getNext());
			size--;
		}
	}

	public void removeFromFront() {
		EmployeeNode removed;

		// Only incase of first node insertion when the EmployeeDoublyLinkedList is
		// empty
		if (head == null) {
			System.out.println("Nothing to remove");
		} else {
			removed = head;
			head = head.getNext();
			removed.setNext(null);
			removed.setPrevious(null);
			size--;
		}
	}

	public void removeFromEnd() {

		// Only incase of first node insertion when the EmployeeDoublyLinkedList is
		// empty
		if (head == null) {
			System.out.println("Nothing to remove");
		} else if (tail.getPrevious() == null) {
			head = null;
		} else {
			// tail.getPrevious().setNext(null);
			System.out.println("tail = "+tail +" head = "+head +" Next to head = "+head.getNext());
			//tail = tail.getPrevious();
			System.out.println("tail = "+tail +" previous = "+tail.getPrevious());
			tail.setNext(null);
			size--;
		}

	}

	public void printEmployeeDoublyLinkedList() {
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
