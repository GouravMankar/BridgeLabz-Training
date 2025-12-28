package com.constructors.levelone;

//Subclass demonstrates protected/public access
class EBook extends BookLibrary {
 EBook(String ISBN, String title, String author) {
     super(ISBN, title, author);
 }

//method to display EBook details
 void displayEBook() {
     System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
 }

 public static void main(String[] args) {
     EBook ebook = new EBook("ISBN123", "Java eBook", "Author A");
     ebook.displayEBook();
     ebook.setAuthor("Updated Author");
     ebook.displayEBook();
 }
}
