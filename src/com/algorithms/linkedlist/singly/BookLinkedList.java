package com.algorithms.linkedlist.singly;

public class BookLinkedList {

	BookNode head;
	int size;

	public int insertBookAtEnd(BookNode newBook) {
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

	public void insertBookAtPosition(BookNode newBook, int position) {
		BookNode current;
		int length = 1;
		if ((position > size)) {
			System.out.println("Element cant's be inserted at [" + position + "] list size is only " + size);
			return;
		} else {
			if (head == null) {
				head = newBook;
				size = 1;
			} else {
				current = head;
				while (current.getNext() != null && length < position-1) {
					length++;
					current = current.getNext();
				}
				newBook.setNext(current.getNext());
				current.setNext(newBook);
				size++;
			}
		}
	}

	public void insertBookAtFront(BookNode newBook) {
		BookNode current;
		if (head == null) {
			head = newBook;
			size++;
		} else {
			current = head;
			newBook.setNext(current);
			head = newBook;
		}

	}

	public void printBooks() {
		BookNode current;

		if (head == null) {
			System.out.println("No Books present in the list");
		} else {
			current = head;
			System.out.print("Head -->");
			while (current != null) {
				System.out.println(current.getBook() + "-->");
				current = current.getNext();
			}
			System.out.print("null");
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

}
