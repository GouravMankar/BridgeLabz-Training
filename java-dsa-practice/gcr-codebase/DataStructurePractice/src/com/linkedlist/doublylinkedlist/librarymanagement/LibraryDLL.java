package com.linkedlist.doublylinkedlist.librarymanagement;

public class LibraryDLL {

    private Node head;
    private Node tail;

    public void addFirst(String title, String author, String genre, int bookId, boolean available) {
        Node node = new Node(title, author, genre, bookId, available);
        node.next = head;

        if (head != null)
            head.prev = node;

        head = node;

        if (tail == null)
            tail = node;
    }

    public void addLast(String title, String author, String genre, int bookId, boolean available) {
        Node node = new Node(title, author, genre, bookId, available);

        if (tail == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public boolean addAtPosition(int pos, String title, String author, String genre, int bookId, boolean available) {
        if (pos <= 0) return false;

        if (pos == 1) {
            addFirst(title, author, genre, bookId, available);
            return true;
        }

        Node cur = head;
        int idx = 1;

        while (cur != null && idx < pos - 1) {
            cur = cur.next;
            idx++;
        }

        if (cur == null) return false;

        Node node = new Node(title, author, genre, bookId, available);
        node.next = cur.next;
        node.prev = cur;

        if (cur.next != null)
            cur.next.prev = node;
        else
            tail = node;

        cur.next = node;
        return true;
    }

    public boolean removeById(int bookId) {
        Node cur = head;

        while (cur != null && cur.bookId != bookId) {
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

    public void search(String title, String author) {
        System.out.println("Search Results:");
        Node cur = head;

        while (cur != null) {
            boolean match =
                    (title != null && cur.title.equalsIgnoreCase(title)) ||
                    (author != null && cur.author.equalsIgnoreCase(author));

            if (match) {
                System.out.println(cur.bookId + " | " + cur.title + " | " +
                        cur.author + " | " + cur.genre +
                        " | Available: " + (cur.available ? "Yes" : "No"));
            }
            cur = cur.next;
        }
    }

    public boolean updateAvailability(int bookId, boolean available) {
        Node cur = head;

        while (cur != null) {
            if (cur.bookId == bookId) {
                cur.available = available;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void displayForward() {
        System.out.println("Books (Forward):");
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.bookId + " | " + cur.title + " | " +
                    cur.author + " | " + cur.genre +
                    " | Available: " + (cur.available ? "Yes" : "No"));
            cur = cur.next;
        }
    }

    public void displayReverse() {
        System.out.println("Books (Reverse):");
        Node cur = tail;

        while (cur != null) {
            System.out.println(cur.bookId + " | " + cur.title + " | " +
                    cur.author + " | " + cur.genre +
                    " | Available: " + (cur.available ? "Yes" : "No"));
            cur = cur.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Node cur = head;

        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}

