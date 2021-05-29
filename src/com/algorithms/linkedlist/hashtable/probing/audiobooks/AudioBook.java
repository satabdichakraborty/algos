package com.algorithms.linkedlist.hashtable.probing.audiobooks;

public class AudioBook {

	private String title;
	private int ISBN;
	private String author;

	public AudioBook(String title, int iSBN, String author) {
		this.title = title;
		ISBN = iSBN;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", ISBN=" + ISBN + ", author=" + author+ "]";
	}
}
