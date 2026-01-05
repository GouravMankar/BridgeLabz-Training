package com.linkedlist.circularlinkedlist.taskschedular;
import java.time.format.DateTimeFormatter;

public class TaskCircularList {

    private Node head;

    // add at end (simple use-case)
    public void addTask(int id, String name, int priority, java.time.LocalDate dueDate) {
        Node node = new Node(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = node;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // remove by id
    public boolean removeTask(int id) {
        if (head == null) return false;

        if (head.id == id) {
            if (head.next == head) {
                head = null;
                return true;
            }
            Node tail = head;
            while (tail.next != head)
                tail = tail.next;

            head = head.next;
            tail.next = head;
            return true;
        }

        Node cur = head;
        while (cur.next != head && cur.next.id != id)
            cur = cur.next;

        if (cur.next == head) return false;

        cur.next = cur.next.next;
        return true;
    }

    // move to next task
    public void nextTask() {
        if (head != null)
            head = head.next;
    }

    // show current task
    public void showCurrent() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task → " + head.name);
    }

    // display all
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Node temp = head;

        do {
            System.out.println(
                "ID: " + temp.id +
                ", Name: " + temp.name +
                ", Priority: " + temp.priority +
                ", Due: " + temp.dueDate.format(fmt)
            );
            temp = temp.next;
        } while (temp != head);
    }
}
