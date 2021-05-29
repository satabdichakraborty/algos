package com.algorithms.linkedlist.hashtable.probing.hardcoverbooks;

public class HardCoverHashTable {

	private HardCoverStorage[] bookTable;
	private int capacity = 10;

	public HardCoverHashTable() {
		bookTable = new HardCoverStorage[capacity];
	}

	public void put(String key, HardCoverBook book) {
		int mapKey = hashKey(key);
		if (!occupied(mapKey)) {
			bookTable[mapKey] = new HardCoverStorage(book, key);
		} else {
			System.err.println("Sorry the key position [" + mapKey + "] is already taken. Key = [" + key + "]");
			int newKey = findKey(mapKey);

			if (newKey != -1) {
				System.out.println("Inserting the book in location = " + newKey);
				bookTable[newKey] = new HardCoverStorage(book, key);
			} else {
				System.err.println("bookTable is full..Plz resize");
			}
		}

	}

	public int findKey(int key) {
		int mapKey = key;
		int stopIndex = mapKey;

		if (mapKey < bookTable.length - 1) {
			mapKey++;
		} else {
			mapKey = 0;
		}

		while (occupied(mapKey) && mapKey != stopIndex) {
			if (mapKey == bookTable.length - 1) {
				mapKey = (mapKey + 1) % bookTable.length;
			} else {
				mapKey = (mapKey + 1);
			}

		}

		if (mapKey == stopIndex) {
			mapKey = -1;
		}

		return mapKey;
	}

	public HardCoverBook get(String key) {
		HardCoverBook retrievedBook = null;
		int mapKey = hashKey(key);

		if (occupied(mapKey) && bookTable[mapKey].title.equals(key)) {
			return bookTable[mapKey].book;
		}

		if (occupied(mapKey) && !bookTable[mapKey].title.equals(key)) {
			mapKey = findBook(key);
			if (mapKey != -1 && bookTable[mapKey] != null) {
				retrievedBook = bookTable[mapKey].book;
			}
		}
		return retrievedBook;
	}

	public int findBook(String key) {
		HardCoverBook bookToReturn = null;
		int mapKey = hashKey(key);
		int stopIndex = mapKey;

		if (mapKey < bookTable.length - 1) {
			mapKey++;
		} else {
			mapKey = 0;
		}

		// This loop is ending at position 9 and not going back to 0 since after first
		// removal position 9 will always be null
		while (occupied(mapKey) && mapKey != stopIndex && !bookTable[mapKey].title.equals(key)) {
			if (mapKey == (bookTable.length - 1)) {
				mapKey = (mapKey + 1) % bookTable.length;
			} else {
				mapKey = (mapKey + 1);
			}

		}

		if (mapKey == stopIndex) {
			mapKey = -1;
		}

		return mapKey;
	}

	public HardCoverBook remove(String key) {
		HardCoverBook bookToRemove = null;
		int mapKey = hashKey(key);

		if (occupied(mapKey)) {
			bookToRemove = bookTable[mapKey].book;
			System.out.println("Removing book with key = [" + key + "] from position = [" + mapKey + "]");
			bookTable[mapKey] = null;

			HardCoverStorage[] oldTable = bookTable;
			bookTable = new HardCoverStorage[bookTable.length];
			for (int i = 0; i < bookTable.length; i++) {
				if (oldTable[i] != null) {
					HardCoverBook book = oldTable[i].book;
					String title = oldTable[i].title;
					put(title, book);
				}
			}

		}

		return bookToRemove;
	}

	private void reorderBooks() {
		HardCoverStorage[] oldTable = bookTable;

		for (int i = 0; i < oldTable.length; i++) {
			if (oldTable[i] != null) {
				HardCoverBook book = oldTable[i].book;
				String title = oldTable[i].title;
				put(title, book);
			}
		}

		// newTable = bookTable;
	}

	private boolean occupied(int position) {
		return bookTable[position] != null;
	}

	private int hashKey(String key) {
		return key.length() % capacity;
	}

	public void printBooksInTable() {
		System.out.println("Books in this table-->");
		for (int i = 0; i < bookTable.length; i++) {
			if (bookTable[i] != null) {
				HardCoverBook hardCoverBook = bookTable[i].book;
				System.out.println("[" + i + "] " + hardCoverBook);
			} else {
				System.out.println("empty");
			}

		}
	}

}
