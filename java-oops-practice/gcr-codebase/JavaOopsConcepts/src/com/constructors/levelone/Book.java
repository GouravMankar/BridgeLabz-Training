package com.constructors.levelone;

//Book class demonstrates default and parameterized constructors
class Book {
 String title;
 String author;
 double price;

 // Default constructor
 Book() {
     this.title = "Unknown";
     this.author = "Unknown";
     this.price = 0.0;
 }

 // Parameterized constructor
 Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 void displayDetails() {
     System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
 }

 // Main method to test constructors and methods
 public static void main(String[] args) {
     Book b1 = new Book(); // Default constructor
     Book b2 = new Book("Java Basics", "James Gosling", 499.0); // Parameterized constructor

     b1.displayDetails();
     b2.displayDetails();
 }
}
