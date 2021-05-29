package com.algorithms.linkedlist.queue;

import java.util.NoSuchElementException;

public class CircularQueue {

	AudioBook[] books;
	int front;
	int back;

	public CircularQueue(int capacity) {
		books = new AudioBook[capacity];
	}

	public int getSize() {
		if (back > front)
			return back - front;
		else
			return ((back - front) + books.length);

	}

	public void addBook(AudioBook newBook) {
		// If front = 4 and back = 0 (front-back) = 4
		if (getSize() == books.length - 1) {
			System.out.println("Resizing array...");
			int oldArrSize = books.length - 1;
			AudioBook[] newBookArr = new AudioBook[books.length * 2];
			System.arraycopy(books, front, newBookArr, 0, oldArrSize );
			System.arraycopy(books, back, newBookArr, oldArrSize, front - back);
			books = newBookArr;
			front = 0;
			back = oldArrSize;
		}
		books[back] = newBook;
		if (back < books.length - 1) {
			back++;
		} else {
			back = 0;
		}

	}

	public AudioBook removeBook() {
		AudioBook removedBook;
		if (getSize() == 0) {
			throw new NoSuchElementException();
		}

		removedBook = books[front];
		books[front] = null;
		front++;
		if (getSize() == 0) {
			front = 0;
			back = 0;
		}
		return removedBook;
	}

	public AudioBook peekBook() {
		AudioBook peekBook;
		if (getSize() == 0) {
			throw new NoSuchElementException();
		} else {
			peekBook = books[front];
		}
		return peekBook;
	}

	public void printBooksInQueue() {
		System.out.println("front = " + front + " : back = " + back);
		System.out.println("Books in this queue-->");
		if (back > front) {
			for (int i = back - 1; i >= front; i--) {
				AudioBook book = books[i];
				System.out.println(book);

			}
		} else if (back < front) {
			for (int i = front; i <= books.length - 1; i++) {
				AudioBook book = books[i];
				System.out.println(book);

			}
			for (int i = back; i < front-1; i++) {
				AudioBook book = books[i];
				System.out.println(book);

			}
		}

	}

}
