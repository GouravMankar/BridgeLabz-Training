package com.day12;

//Q1. Library Book Tracker [Medium]
//Design a Book class with instance variables title, author, and isBn (a unique ID). Add a static variable
//totalBooksInLibrary that increases by 1 every time a new Book is created, and a static variable
//totalBooksCheckedOut that increases when a method checkOut() is called on any book instance and
//decreases when returnBook() is called. Write a Main class that creates 5 Book objects, checks out 3 of
//them, returns 1, and prints both static counters at the end. Verify that the counters are shared correctly
//across all 5 objects, not duplicated per object.
//Tests: correct final values of totalBooksInLibrary (5) and totalBooksCheckedOut (2) after the described
//sequence of operations

class Book{
	private String title;
	private String author;
	private String isBookNumber;
	static int totalBooksInLibtrary=0;
	public Book(String title, String author, String isBookNumber) {
		totalBooksInLibtrary++;
		System.out.println("increse "+totalBooksInLibtrary);
		this.title = title;
		this.author = author;
		this.isBookNumber = isBookNumber;
	}
	public Book() {
	   totalBooksInLibtrary++;
		System.out.println("increse "+totalBooksInLibtrary+" non para");
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
	public String getIsBookNumber() {
		return isBookNumber;
	}
	public void setIsBookNumber(String isBookNumber) {
		this.isBookNumber = isBookNumber;
	}

	
}
public class LibraryManagement extends Book {
	public void checkIn() {
		totalBooksInLibtrary++;
		System.out.println("increse "+totalBooksInLibtrary);
		
	}
	public void checkOut() {
		totalBooksInLibtrary--;
		System.out.println("decrese "+totalBooksInLibtrary);
	}
	public int totalBooks() {
		return totalBooksInLibtrary;
	}
	
public static void main(String[] args) {
	Book b1=new Book("The art of being alone","Gourav Mankar","3456yuhjbvcdrt6");
	Book b2=new Book("IKIGAI","Gourav ","otyfbhjiuytfg098765");
	Book b3=new Book("The art of not overthingking ","Gourav Kumar","oitfygvhiouoitu987");
	Book b4=new Book("The art of not overthingking ","Gourav Kumar","oitfygvhiouoitu987");
	Book b5=new Book("The art of not overthingking ","Gourav Kumar","oitfygvhiouoitu987");
	LibraryManagement lbLibraryManagement=new LibraryManagement();
	lbLibraryManagement.checkIn();
	lbLibraryManagement.checkOut();
	lbLibraryManagement.checkOut();
	lbLibraryManagement.checkOut();
	lbLibraryManagement.checkOut();
	lbLibraryManagement.checkIn();
	lbLibraryManagement.checkIn();
	System.out.println(lbLibraryManagement.totalBooks());
	
}
}
