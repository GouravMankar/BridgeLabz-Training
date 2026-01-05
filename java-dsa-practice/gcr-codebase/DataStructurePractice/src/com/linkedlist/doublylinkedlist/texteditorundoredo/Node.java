package com.linkedlist.doublylinkedlist.texteditorundoredo;

public class Node {
    public String content;
    public Node next;
    public Node prev;

    public Node(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}
