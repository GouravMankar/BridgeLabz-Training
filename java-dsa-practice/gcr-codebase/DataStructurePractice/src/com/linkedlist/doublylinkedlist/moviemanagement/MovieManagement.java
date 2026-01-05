package com.linkedlist.doublylinkedlist.moviemanagement;

public class MovieManagement {

    public static void main(String[] args) {

        MovieDLL dll = new MovieDLL();

        dll.addFirst("Pathaan", "Siddharth Anand", 2023, 7.1);
        dll.addLast("Dangal", "Nitesh Tiwari", 2016, 8.4);
        dll.addAtPosition(2, "KGF", "Prashanth Neel", 2018, 8.2);

        dll.displayForward();
        dll.displayReverse();

        dll.search("Nitesh Tiwari", null);
        dll.search(null, 8.2);

        System.out.println("Removed KGF: " + dll.removeByTitle("KGF"));
        dll.displayForward();
    }
}
