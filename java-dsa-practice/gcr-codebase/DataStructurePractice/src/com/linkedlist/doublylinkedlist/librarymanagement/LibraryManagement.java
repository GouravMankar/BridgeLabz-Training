package com.linkedlist.doublylinkedlist.librarymanagement;

public class LibraryManagement {

    public static void main(String[] args) {

        LibraryDLL lib = new LibraryDLL();

        lib.addFirst("Gitanjali", "Rabindranath Tagore", "Poetry", 1001, true);
        lib.addLast("Train to Pakistan", "Khushwant Singh", "Historical", 1002, false);
        lib.addAtPosition(2, "The White Tiger", "Aravind Adiga", "Fiction", 1003, true);

        lib.displayForward();
        lib.displayReverse();

        lib.search("Gitanjali", null);

        System.out.println("Update availability of 1002: " +
                lib.updateAvailability(1002, true));

        System.out.println("Remove book 1003: " +
                lib.removeById(1003));

        lib.displayForward();

        System.out.println("Total books: " + lib.countBooks());
    }
}

