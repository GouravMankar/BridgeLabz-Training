package com.linkedlist.doublylinkedlist.librarymanagement;

public class Node {
    public String title;
    public String author;
    public String genre;
    public int bookId;
    public boolean available;
    public Node next;
    public Node prev;

    public Node(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}
