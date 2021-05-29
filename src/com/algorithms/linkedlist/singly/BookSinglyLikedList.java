package com.algorithms.linkedlist.singly;

public class BookSinglyLikedList {

	BookNode head;
	int size;

	public BookSinglyLikedList() {
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int insertAtFront(BookNode newBook) {
		BookNode current;

		if (head == null) {
			head = newBook;
			size++;
		} else {
			current = head;
			newBook.setNext(current);
			head = newBook;
			size++;
		}

		return size;
	}

	public int insertAtEnd(BookNode newBook) {
		BookNode current;

		if (head == null) {
			head = newBook;
			size++;
		} else {
			current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newBook);
			size++;
		}
		return size;
	}

	public int insertAtPosition(BookNode newBook, int position) {
		BookNode current;
		int length = 1;

		if (position > size) {
			insertAtEnd(newBook);
		} else if (head == null) {
			head = newBook;
			size++;
		} else {
			current = head;
			while (current.getNext() != null && length < position) {
				length++;
				current = current.getNext();
			}
			current.setNext(newBook);
			size++;
		}
		return size;
	}

	public BookNode removeFromFront() {
		BookNode current;

		current = head;

		if (isEmpty()) {
			current = null;
		} else {
			head = current.getNext();
			size--;
		}

		return current;
	}

	public BookNode removeFromPosition(int position) {
		BookNode current;
		BookNode previousNode = null;
		int length = 1;

		current = head;

		if (isEmpty()) {
			System.out.println("Nothing to remove!");
			current = null;
		} else if (position == 1) {
			removeFromFront();
		} else {
			while (current.getNext() != null && (length < position)) {
				length++;
				previousNode = current;
				current = current.getNext();
			}
			previousNode.setNext(current.getNext());
			size--;
		}

		return current;
	}

	public void printListOfBooks() {
		BookNode current;

		if (isEmpty()) {
			System.out.println("This list doesn't contain any books at this moment!");
		} else {
			current = head;
			System.out.println("head-->");
			while (current != null) {
				System.out.println(current);
				current = current.getNext();
			}
			System.out.println("null");
		}
	}

}
