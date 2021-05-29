package com.algorithms.linkedlist.hashtable.chaining;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AppleBookHashTable {

	private LinkedList<AppleBookStorage>[] bookNode;
	private int capacity;

	public AppleBookHashTable(int capacity) {

		bookNode = new LinkedList[capacity];
		for (int i = 0; i < bookNode.length; i++) {
			bookNode[i] = new LinkedList<AppleBookStorage>();
		}
	}

	public void put(String key, AppleBook book) {
		int mapKey = hashKey(key);

		ListIterator<AppleBookStorage> iterator = bookNode[mapKey].listIterator();
		iterator.add(new AppleBookStorage(book, key));

	}

	public AppleBook remove(String key) {
		AppleBook book = null;
		int mapKey = hashKey(key);

		ListIterator<AppleBookStorage> it = bookNode[mapKey].listIterator();

		while (it.hasNext()) {
			AppleBookStorage appleBookStorage = (AppleBookStorage) it.next();
			if (appleBookStorage.getKey().equals(key)) {
				System.out.println("Removing book with key = [" + key + "]");
				it.remove();
			}
		}
		return book;
	}

	public AppleBook get(String key) {
		AppleBook book = null;
		int mapKey = hashKey(key);

		ListIterator<AppleBookStorage> it = bookNode[mapKey].listIterator();

		while (it.hasNext()) {
			AppleBookStorage appleBookStorage = (AppleBookStorage) it.next();
			if (appleBookStorage.getKey().equals(key)) {
				System.out.println("Getting book with key = [" + key + "]");
				book = appleBookStorage.getBook();
			}
		}
		return book;
	}

	public void displayBooks() {
		System.out.println("Display all the books in storage -->");
		for (int i = 0; i < bookNode.length; i++) {
			LinkedList<AppleBookStorage> linkedList = bookNode[i];
			System.out.println("Position = [" + i + "]");
			for (AppleBookStorage appleBookStorage : linkedList) {
				System.out.println(
						"Key = " + appleBookStorage.getKey() + " :  Book = [" + appleBookStorage.getBook() + "]");
			}
		}
	}

	private int hashKey(String key) {
		return key.length() % bookNode.length;
	}

}
