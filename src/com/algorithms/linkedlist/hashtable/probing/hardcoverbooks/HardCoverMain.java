package com.algorithms.linkedlist.hashtable.probing.hardcoverbooks;

public class HardCoverMain {

	public static void main(String[] args) {
		HardCoverBook harryPotter = new HardCoverBook("Harry Potter I", 12, "J.K. Rowling");
		HardCoverBook hobbit = new HardCoverBook("Hobbit", 34, "J.R Martin");
		HardCoverBook whyLibraryBook = new HardCoverBook("Find Your Why?", 56, "Simon Sinek");
		HardCoverBook millionaireLibraryBook = new HardCoverBook("Next Door Millionaire", 78, "J Stanley");
		HardCoverBook awsLibraryBook = new HardCoverBook("AWS SA PRO", 90, "Amazon");
		HardCoverBook dockerLibraryBook = new HardCoverBook("Docker", 11, "Docker Pro");
		HardCoverBook dockerLibraryBook2 = new HardCoverBook("Docker2", 11, "Docker Pro");
		HardCoverBook kubeLibraryBook = new HardCoverBook("Kubernettes", 11, "Kube Pro");

		HardCoverHashTable bookTable = new HardCoverHashTable();

		// 7
		bookTable.put("Rowling", harryPotter);
		// 6
		bookTable.put("Martin", hobbit);
		// 5
		bookTable.put("Sinek", whyLibraryBook);
		// 7 conflict with Rowling
		bookTable.put("Stanley", millionaireLibraryBook);
		// 6 conflict with Martin
		bookTable.put("Amazon", awsLibraryBook);

		// Since the size = 5 is full, this book insertion should fail
		bookTable.put("Docker", dockerLibraryBook);

		// Print all books
		bookTable.printBooksInTable();

		/*
		 * // Retrieving books at different duplicate positions
		 * System.out.println("\nRetrieving book by title -Rowling = " +
		 * bookTable.get("Rowling")); // Retrieving books by // key "Stanley" // should
		 * fail System.out.println("Retrieving book by title -Stanley = " +
		 * bookTable.get("Stanley"));
		 * 
		 * System.out.println("\nRetrieving book by title -Martin = " +
		 * bookTable.get("Martin")); // Retrieving books by // key "Martin" should //
		 * fail System.out.println("Retrieving book by title -Amazon = " +
		 * bookTable.get("Amazon"));
		 */

		bookTable.remove("Rowling");
		// Print all books after removing "Rowling"
		bookTable.printBooksInTable();

		// Retrieving books now after removing "Rowling"
		System.out.println("\nRetrieving book by title -Rowling = " + bookTable.get("Rowling"));
		// Retrieving books by key "Stanley" should fail this time
		System.out.println("Retrieving book by title -Stanley = " + bookTable.get("Stanley"));

		// Try to add Docker now, it could not be inserted earlier as hashtable was full
		bookTable.put("Docker2", dockerLibraryBook2);
		// Print all books after adding "Docker"
		bookTable.printBooksInTable();

		// Remove WhyBook
		bookTable.remove("Sinek");
		// Print all books after removing "Sinek"
		bookTable.printBooksInTable();

		// Retrieving book "Docker"
		System.out.println("\nRetrieving book by title -Docker = " + bookTable.get("Docker"));

	}

}
