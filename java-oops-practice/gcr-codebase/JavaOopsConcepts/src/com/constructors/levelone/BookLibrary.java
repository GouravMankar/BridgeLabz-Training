package com.constructors.levelone;

//BookLibrary class demonstrates access modifiers
class BookLibrary {
 public String ISBN;
 protected String title;
 private String author;

 BookLibrary(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Getter and Setter for private author
 public void setAuthor(String author) {
     this.author = author;
 }

 public String getAuthor() {
     return author;
 }
}
