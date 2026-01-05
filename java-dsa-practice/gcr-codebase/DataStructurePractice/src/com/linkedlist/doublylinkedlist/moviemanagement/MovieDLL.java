package com.linkedlist.doublylinkedlist.moviemanagement;

public class MovieDLL {

    private Node head;
    private Node tail;

    // Add at beginning
    public void addFirst(String title, String director, int year, double rating) {
        Node node = new Node(title, director, year, rating);
        node.next = head;

        if (head != null)
            head.prev = node;

        head = node;

        if (tail == null)
            tail = node;
    }

    // Add at end
    public void addLast(String title, String director, int year, double rating) {
        Node node = new Node(title, director, year, rating);

        if (tail == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Add at specific position (1-based)
    public boolean addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 0) return false;

        if (pos == 1) {
            addFirst(title, director, year, rating);
            return true;
        }

        Node cur = head;
        int idx = 1;

        while (cur != null && idx < pos - 1) {
            cur = cur.next;
            idx++;
        }

        if (cur == null) return false;

        Node node = new Node(title, director, year, rating);
        node.next = cur.next;
        node.prev = cur;

        if (cur.next != null)
            cur.next.prev = node;
        else
            tail = node;

        cur.next = node;
        return true;
    }

    // Remove by title
    public boolean removeByTitle(String title) {
        Node cur = head;

        while (cur != null && !cur.title.equalsIgnoreCase(title)) {
            cur = cur.next;
        }

        if (cur == null) return false;

        if (cur.prev != null)
            cur.prev.next = cur.next;
        else
            head = cur.next;

        if (cur.next != null)
            cur.next.prev = cur.prev;
        else
            tail = cur.prev;

        return true;
    }

    // Search by director or rating
    public void search(String director, Double rating) {
        Node cur = head;
        System.out.println("Search Results:");

        while (cur != null) {
            boolean match =
                    (director != null && cur.director.equalsIgnoreCase(director)) ||
                    (rating != null && cur.rating == rating);

            if (match) {
                System.out.println(cur.title + " | " + cur.director +
                        " | " + cur.year + " | Rating: " + cur.rating);
            }
            cur = cur.next;
        }
    }

    // Display forward
    public void displayForward() {
        System.out.println("Movies (Forward):");
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.title + " | " + cur.director +
                    " | " + cur.year + " | " + cur.rating);
            cur = cur.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        System.out.println("Movies (Reverse):");
        Node cur = tail;

        while (cur != null) {
            System.out.println(cur.title + " | " + cur.director +
                    " | " + cur.year + " | " + cur.rating);
            cur = cur.prev;
        }
    }
}
