package com.algorithms.linkedlist.hashtable.probing.audiobooks;

public class SimpleHashTable {

	private AudioBookStorageTable[] hashTable;

	SimpleHashTable() {
		hashTable = new AudioBookStorageTable[10];
	}

	private int hashKey(String bookKey) {
		return bookKey.length() % hashTable.length;
	}

	public void put(String key, AudioBook book) {

		int keyValue = hashKey(key);
		System.out.println("keyValue = " + keyValue + " for key = " + key);

		if (!isEmpty(keyValue)) {
			// keyValue = getInsertIndex(keyValue);

			System.err.println("Sorry cannot insert [" + book + "] this key position [" + key
					+ "] is already occupied by [" + hashTable[keyValue] + "]");

			int stopIndex = keyValue;

			if (keyValue == hashTable.length - 1) {
				keyValue = 0;
			} else {
				keyValue++;
			}

			while (keyValue != stopIndex && !isEmpty(keyValue)) {
				keyValue = (keyValue + 1) % hashTable.length;
			}

			System.out.println("New Insert Position = " + keyValue);

		}

		if (!isEmpty(keyValue)) {
			System.err.println("Sorry the array is full, there is already a book at position " + key);
		} else {
			hashTable[keyValue] = new AudioBookStorageTable(key, book);
		}

	}

	private int findKey(String key) {
		int keyValue = hashKey(key);

		if (hashTable[keyValue] != null && hashTable[keyValue].getKey().equals(key)) {
			return keyValue;
		}

		int stopIndex = keyValue;

		if (keyValue == hashTable.length - 1) {
			keyValue = 0;
		} else {
			keyValue++;
		}

		while (keyValue != stopIndex && hashTable[keyValue] != null && !hashTable[keyValue].getKey().equals(key)) {
			keyValue = (keyValue + 1) % hashTable.length;
		}

		if (hashTable[keyValue] != null && hashTable[keyValue].getKey().equals(key)) {
			return keyValue;
		} else {
			return -1;
		}
	}

	public AudioBook removeBook(String key) {
		int keyValue = findKey(key);
		AudioBook removedBook = null;

		if (keyValue == -1) {
			System.err.println("Request removal book with key = ["+key+"] not found");
			return removedBook;
		}

		removedBook = hashTable[keyValue].getBook();
		System.out.println("Book with key = ["+key+"] removed");
		hashTable[keyValue] = null;

		AudioBookStorageTable[] oldHashTable = hashTable;
		
		hashTable = new AudioBookStorageTable[hashTable.length];
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] != null) {
				put(hashTable[i].getKey(), hashTable[i].getBook());
			}
		}

		return removedBook;
	}

	private boolean isEmpty(int keyValue) {
		return hashTable[keyValue] == null;
	}

	public AudioBook get(String bookKey) {
		AudioBook returnBook = null;

		int key = findKey(bookKey);

		if (key == -1) {
			return returnBook;
		} else {

			return hashTable[key].getBook();
		}

	}

	public void printAllBooks() {
		System.out.println("Here are all the books in the hashtable: ");
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] != null) {
				AudioBook audioBook = hashTable[i].getBook();
				System.out.println("Position ="+i+" : "+audioBook);
			}
		}
	}

}
