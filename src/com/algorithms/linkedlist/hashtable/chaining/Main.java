package com.algorithms.linkedlist.hashtable.chaining;

public class Main {

	public static void main(String[] args) {
		AppleBook harryPotter = new AppleBook("Harry Potter I", "J.K. Rowling");
		AppleBook hobbit = new AppleBook("Hobbit", "J.R Martin");
		AppleBook whyLibraryBook = new AppleBook("Find Your Why?", "Simon Sinek");
		AppleBook millionaireLibraryBook = new AppleBook("Next Door Millionaire", "J Stanley");
		AppleBook awsLibraryBook = new AppleBook("AWS SA PRO", "Amazon");
		AppleBook dockerLibraryBook = new AppleBook("Docker", "Docker Pro");
		AppleBook dockerLibraryBook2 = new AppleBook("Docker2", "Docker Pro");
		AppleBook kubeLibraryBook = new AppleBook("Kubernettes", "Kube Pro");

		AppleBookHashTable ht = new AppleBookHashTable(10);

		ht.put("Rowling", harryPotter);
		ht.put("Martin", hobbit);
		ht.put("Sinek", whyLibraryBook);
		ht.put("Amazon", awsLibraryBook);

		System.out.println("\n");
		ht.displayBooks();

		// Retuning wrong book as the key value is same as Hobbit
		System.out.println("\nRetuning book with key as Amazon = " + ht.get("Amazon"));
		System.out.println("\nRetuning book with key as Martin = " + ht.get("Martin"));
		
		//This key does not exists
		System.out.println("\nRetuning book with key as Satabdi = " + ht.get("Satabdi"));

		System.out.println("\nRemoving book with key [Sinek]"+ ht.remove("Sinek")==null?"Failed":"Success");

		ht.put("Stanley", millionaireLibraryBook);
		ht.put("Docker", dockerLibraryBook);
		ht.put("Kube", kubeLibraryBook);

		System.out.println("\n");
		ht.displayBooks();
		
		System.out.println("\nRemoving book with key [Amazon]"+ ht.remove("Amazon")==null?"Failed":"Success");
		System.out.println("\n");
		ht.displayBooks();
	}

}
