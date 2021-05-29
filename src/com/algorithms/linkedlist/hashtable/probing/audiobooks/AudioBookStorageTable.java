package com.algorithms.linkedlist.hashtable.probing.audiobooks;

public class AudioBookStorageTable {

	private AudioBook book;
	private String key;

	public AudioBookStorageTable(String key, AudioBook book) {
		this.book = book;
		this.key = key;
	}

	public AudioBook getBook() {
		return book;
	}

	public void setBook(AudioBook book) {
		this.book = book;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
