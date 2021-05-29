package com.algorithms.linkedlist.queue;

public class QueueMain {

	public static void main(String[] args) {

		AudioBook harryPotter = new AudioBook("Harry Potter I", 12, "J.K. Rowling");
		AudioBook hobbit = new AudioBook("Hobbit", 34, "J.R Martin");
		AudioBook whyLibraryBook = new AudioBook("Find Your Why?", 56, "Simon Sinek");
		AudioBook millionaireLibraryBook = new AudioBook("Next Door Millionaire", 78, "J Stanley");
		AudioBook awsLibraryBook = new AudioBook("AWS SA PRO", 90, "Amazon");
		AudioBook dockerLibraryBook = new AudioBook("Docker", 11, "Docker Pro");
		AudioBook kubeLibraryBook = new AudioBook("Kubernettes", 11, "Kube Pro");

		/*
		 * BookQueue bQueue = new BookQueue();
		 * 
		 * System.out.println("\nRemoved Book = "+bQueue.removeBooks());
		 * System.out.println("Size of library = "+ bQueue.getSize());
		 * 
		 * bQueue.addBooks(harryPotter); System.out.println("\nSize of library = "+
		 * bQueue.getSize()); bQueue.printBooks();
		 * 
		 * bQueue.addBooks(hobbit); bQueue.addBooks(whyLibraryBook);
		 * bQueue.addBooks(millionaireLibraryBook); bQueue.addBooks(awsLibraryBook);
		 * 
		 * System.out.println("\nRemoved Book = "+bQueue.removeBooks());
		 * System.out.println("Size of library = "+ bQueue.getSize());
		 * 
		 * bQueue.printBooks(); bQueue.addBooks(dockerLibraryBook);
		 * System.out.println("\nSize of library = "+ bQueue.getSize());
		 * bQueue.printBooks();
		 * 
		 * 
		 * 
		 * System.out.println("\nPeek operation "+bQueue.peek());
		 */
		
		CircularQueue cQueue = new CircularQueue(5);
		
		cQueue.addBook(harryPotter);
		cQueue.addBook(hobbit);
		
		System.out.println("Queue size = "+cQueue.getSize());
		cQueue.printBooksInQueue();		
		System.out.println("Peek book  = "+cQueue.peekBook());
		
		cQueue.removeBook();
		
		System.out.println("Queue size = "+cQueue.getSize());
		cQueue.printBooksInQueue();		
		System.out.println("Peek book  = "+cQueue.peekBook());
		
		cQueue.addBook(whyLibraryBook);
		cQueue.addBook(millionaireLibraryBook);
		cQueue.addBook(awsLibraryBook);
		
		System.out.println("Queue size = "+cQueue.getSize());
		cQueue.printBooksInQueue();		
		System.out.println("Peek book  = "+cQueue.peekBook());
		
		cQueue.addBook(dockerLibraryBook);
		System.out.println("Queue size = "+cQueue.getSize());
		cQueue.printBooksInQueue();		
		System.out.println("Peek book  = "+cQueue.peekBook());
		
	}

}
