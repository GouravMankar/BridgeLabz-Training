package com.bookshelf;

public class Book {
  String author;
  String name;
  double price;
  String genre;
  Book next;
public Book(String author, String name, double price, String genre) {
	this.author = author;
	this.name = name;
	this.price = price;
	this.genre = genre;
	this.next=null;
}
@Override
public String toString() {
	return "Book Details author : " + author + ", name: " + name + ", price : " + price + ", genre : " + genre ;
}




  
}
