package com.algorithms.linkedlist.hashtable.probing.audiobooks;

public class SimpleHashTableMain {

	public static void main(String[] args) {

		AudioBook harryPotter = new AudioBook("Harry Potter I", 12, "J.K. Rowling");
		AudioBook hobbit = new AudioBook("Hobbit", 34, "J.R Martin");
		AudioBook whyLibraryBook = new AudioBook("Find Your Why?", 56, "Simon Sinek");
		AudioBook millionaireLibraryBook = new AudioBook("Next Door Millionaire", 78, "J Stanley");
		AudioBook awsLibraryBook = new AudioBook("AWS SA PRO", 90, "Amazon");
		AudioBook dockerLibraryBook = new AudioBook("Docker", 11, "Docker Pro");
		AudioBook kubeLibraryBook = new AudioBook("Kubernettes", 11, "Kube Pro");

		SimpleHashTable ht = new SimpleHashTable();

		ht.put("Rowling", harryPotter);
		ht.put("Martin", hobbit);
		ht.put("Sinek", whyLibraryBook);
		ht.put("Amazon", awsLibraryBook);

		// Get Book by key example
		// System.out.println(ht.get("Rowling"));

		// Retuning wrong book as the key value is same as Hobbit
		System.out.println("\nRetuning book with key as Amazon = " + ht.get("Amazon"));

		System.out.println("\nRemoving book "+ht.removeBook("Sinek"));
		
		ht.put("Stanley", millionaireLibraryBook);
		ht.put("Docker", dockerLibraryBook);
		ht.put("Kube", kubeLibraryBook);

		System.out.println("\n");
		ht.printAllBooks();

	}

}
