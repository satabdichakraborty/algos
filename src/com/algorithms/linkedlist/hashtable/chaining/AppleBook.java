package com.algorithms.linkedlist.hashtable.chaining;

public class AppleBook {

	private String title;
	private String author;

	public AppleBook(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "AppleBook [title=" + title + ", author=" + author + "]";
	}

}
