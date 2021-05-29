package com.algorithms.linkedlist.singly;

public class BookMain {

	public static void main(String[] args) {

		BookLinkedList list = new BookLinkedList();

		Book harryPotter = new Book("Harry Potter I", 12, "J.K. Rowling", 4.8);
		Book hobbit = new Book("Hobbit", 34, "J.R Martin", 4.0);
		Book whyBook = new Book("Find Your Why?", 56, "Simon Sinek", 3.0);
		Book millionaireBook = new Book("Next Door Millionaire", 78, "J Stanley", 4.9);
		Book awsBook = new Book("AWS SA PRO", 90, "Amazon", 3.5);
		Book dockerBook = new Book("Docker", 11, "Docker Pro", 3.0);

		System.out.print("Is book linkedList Empty? " + list.isEmpty());

		System.out.println("");

		list.insertBookAtEnd(new BookNode(harryPotter));

		System.out.println("Is book linkedList Empty? " + list.getSize());
		list.insertBookAtEnd(new BookNode(hobbit));
		list.insertBookAtEnd(new BookNode(whyBook));
		list.insertBookAtEnd(new BookNode(millionaireBook));
		System.out.println("Is book linkedList Empty? " + list.getSize());
		
		list.insertBookAtFront(new BookNode(awsBook));
		list.insertBookAtPosition(new BookNode(dockerBook), 2);

		System.out.println("");

		list.printBooks();

	}

}
