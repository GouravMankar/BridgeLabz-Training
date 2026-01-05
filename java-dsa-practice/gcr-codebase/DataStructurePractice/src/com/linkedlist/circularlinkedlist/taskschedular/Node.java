package com.linkedlist.circularlinkedlist.taskschedular;

import java.time.LocalDate;

public class Node {
    int id;
    String name;
    int priority;
    LocalDate dueDate;
    Node next;

    public Node(int id, String name, int priority, LocalDate dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
