package com.algorithms.linkedlist.queue;

public class BookQueue {

	private AudioBook[] books;
	private int front = 0;
	private int back = 0;
	private int capacity = 5;

	public BookQueue() {
		books = new AudioBook[capacity];
	}

	public int getSize() {
		return back;
	}

	public void printBooks() {
		for (int i = front; i < back; i++) {
			System.out.println(books[i]);

		}
	}

	public AudioBook peek() {
		AudioBook book = books[front];
		return book;
	}

	public void addBooks(AudioBook book) {

		if (back == books.length) {
			System.out.println(books.length + "I should not be printed here..");
			AudioBook[] newBooksArray = new AudioBook[2 * capacity];
			System.arraycopy(books, 0, newBooksArray, 0, capacity);
			books = newBooksArray;
		}

		books[back++] = book;

	}

	public AudioBook removeBooks() {
		AudioBook book = null;

		if (back - front <= 0) {
			System.out.println("Book Queue is empty");
		} else {
			book = books[front];
			books[front] = null;
			back--;
			int size = (back - front) - 1;
			for (int i = 1; i < size; i++) {
				books[i - 1] = books[i];
			}
		}

		if (back - front == 0)

		{
			back = 0;
			front = 0;
		}
		return book;
	}

}
