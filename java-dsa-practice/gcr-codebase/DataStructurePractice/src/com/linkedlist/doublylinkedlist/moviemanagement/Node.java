package com.linkedlist.doublylinkedlist.moviemanagement;

public class Node {
    public String title;
    public String director;
    public int year;
    public double rating;
    public Node next;
    public Node prev;

    public Node(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
