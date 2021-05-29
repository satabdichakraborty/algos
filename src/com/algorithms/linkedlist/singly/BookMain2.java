package com.algorithms.linkedlist.singly;

public class BookMain2 {
	
	public static void main(String[] args) {
		
		Book harryPotter = new Book("Harry Potter I", 12, "J.K. Rowling", 4.8);
		Book hobbit = new Book("Hobbit", 34, "J.R Martin", 4.0);
		Book whyBook = new Book("Find Your Why?", 56, "Simon Sinek", 3.0);
		Book millionaireBook = new Book("Next Door Millionaire", 78, "J Stanley", 4.9);
		Book awsBook = new Book("AWS SA PRO", 90, "Amazon", 3.5);
		Book dockerBook = new Book("Docker", 11, "Docker Pro", 3.0);
		
		
		BookSinglyLikedList list = new BookSinglyLikedList();
		System.out.println("Is the BookSinglyLikedList empty at this moment? "+ list.isEmpty());
		
		list.insertAtFront(new BookNode(harryPotter));
		list.insertAtFront(new BookNode(hobbit));
		list.insertAtPosition(new BookNode(whyBook), 6);
		list.insertAtEnd(new BookNode(dockerBook));		
		list.printListOfBooks();
		
		//list.removeFromFront();		
		//list.printListOfBooks();
		
		list.removeFromPosition(2);		
		list.printListOfBooks();
		
	}

}
