package com.algorithms.linkedlist.hashtable.chaining;

public class AppleBookStorage {

	private AppleBook book;
	private String key;

	public AppleBookStorage(AppleBook book, String title) {
		this.book = book;
		this.key = title;
	}

	public AppleBook getBook() {
		return book;
	}

	public void setBook(AppleBook book) {
		this.book = book;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String title) {
		this.key = title;
	}

}
