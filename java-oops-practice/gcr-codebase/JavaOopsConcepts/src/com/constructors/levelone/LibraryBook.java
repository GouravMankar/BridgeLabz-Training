package com.constructors.levelone;

//LibraryBook class demonstrates borrow method
class LibraryBook {
 String title;
 String author;
 double price;
 boolean available;

 LibraryBook(String title, String author, double price, boolean available) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.available = available;
 }

// method to check availability of book
 void borrowBook() {
     if (available) {
         available = false;
         System.out.println(title + " has been borrowed.");
     } else {
         System.out.println(title + " is not available.");
     }
 }

 public static void main(String[] args) {
     LibraryBook lb = new LibraryBook("Effective Java", "Joshua Bloch", 600.0, true);
     lb.borrowBook();
     lb.borrowBook();
 }
}
