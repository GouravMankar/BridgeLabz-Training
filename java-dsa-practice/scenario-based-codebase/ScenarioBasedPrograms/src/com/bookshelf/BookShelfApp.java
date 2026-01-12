package com.bookshelf;

import java.util.ArrayList;
import java.util.List;

public class BookShelfApp {

    public static void main(String[] args) {

        BookManage bookManage = new BookManage();
        List<Book> borrowBooks = new ArrayList<>();

        Book b1 = new Book("Yashwant Kanetkar", "Let us C", 2000.0, "Educational");
        Book b2 = new Book("R.R Martin", "GOT", 85723, "Fantasy");
        Book b3 = new Book("Chetan Bhagat", "Revolution 2020", 1500, "Romance");
        Book b4 = new Book("Devanshi Prabhakar", "Peices Of Her", 111, "Romance");

        
        bookManage.add(b1);
        bookManage.add(b2);
        bookManage.add(b3);
        bookManage.add(b4);

        System.out.println(" All Books in Library \n");
        bookManage.display();

        
        if (bookManage.borrowBook(b2)) {
            borrowBooks.add(b2);
        }

        System.out.println(" After Borrow \n");
        bookManage.display();

       
        if (borrowBooks.contains(b2)) {
            bookManage.returnBook(b2);
            borrowBooks.remove(b2);
            System.out.println("Book returned: " + b2.name);
        } else {
            System.out.println("Wrong book return attempt: " + b2.name);
        }

        System.out.println(" After Return \n");
        bookManage.display();
        
        
        
        System.out.println("All Books in Library \n");
        bookManage.display();

        
        if (bookManage.borrowBook(b4)) {
            borrowBooks.add(b4);
        }

        System.out.println("After Borrow \n");
        bookManage.display();

       
        if (borrowBooks.contains(b3)) {
            bookManage.returnBook(b4);
            borrowBooks.remove(b4);
            System.out.println("Book returned: " + b4.name);
        } else {
            System.out.println("Wrong book return attempt: " + b2.name);
        }

        System.out.println(" After Return \n");
        bookManage.display();
    }
}
