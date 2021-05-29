package com.algorithms.linkedlist.singly;

public class Book {

	private String title;
	private int ISBN;
	private String author;
	private double rating;

	public Book(String title, int iSBN, String author, double rating) {
		this.title = title;
		ISBN = iSBN;
		this.author = author;
		this.rating = rating;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", ISBN=" + ISBN + ", author=" + author + ", rating=" + rating + "]";
	}
}
