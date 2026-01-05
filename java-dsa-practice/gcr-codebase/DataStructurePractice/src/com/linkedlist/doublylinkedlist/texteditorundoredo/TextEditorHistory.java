package com.linkedlist.doublylinkedlist.texteditorundoredo;

public class TextEditorHistory {

    private Node head;
    private Node tail;
    private Node current;

    private int size = 0;
    private final int MAX_SIZE;

    public TextEditorHistory(int maxSize) {
        this.MAX_SIZE = maxSize;
    }

    // Add new text state
    public void addState(String content) {
        Node node = new Node(content);

        // Clear redo history if not at tail
        if (current != null && current != tail) {
            tail = current;
            tail.next = null;
        }

        if (tail == null) {
            head = tail = current = node;
            size = 1;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            current = node;
            size++;

            // Maintain max size
            if (size > MAX_SIZE) {
                head = head.next;
                if (head != null) head.prev = null;
                size--;
            }
        }
    }

    // Undo operation
    public boolean undo() {
        if (current == null || current.prev == null)
            return false;

        current = current.prev;
        return true;
    }

    // Redo operation
    public boolean redo() {
        if (current == null || current.next == null)
            return false;

        current = current.next;
        return true;
    }

    // Get current text
    public String getCurrentState() {
        return (current != null) ? current.content : "";
    }
}
