package com.linkedlist.singlylinkedlist.stuedentrecordmanagement;

public class StudentLinkedList {
	private Node head; // first student

    // Add at beginning
    public void addFirst(int roll, String name, int age, String grade) {
        Node node = new Node(roll, name, age, grade);
        node.next = head;
        head = node;
    }

    // Add at end
    public void addLast(int roll, String name, int age, String grade) {
        Node node = new Node(roll, name, age, grade);
        if (head == null) { head = node; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = node;
    }

    // Add at specific position (1-based index)
    public boolean addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos <= 0) return false;
        if (pos == 1) { addFirst(roll, name, age, grade); return true; }
        Node node = new Node(roll, name, age, grade);
        Node cur = head;
        int idx = 1;
        while (cur != null && idx < pos - 1) { cur = cur.next; idx++; }
        if (cur == null) return false;
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    // Delete by roll number
    public boolean deleteByRoll(int roll) {
        if (head == null) return false;
        if (head.roll == roll) { head = head.next; return true; }
        Node cur = head;
        while (cur.next != null && cur.next.roll != roll) cur = cur.next;
        if (cur.next == null) return false;
        cur.next = cur.next.next;
        return true;
    }

    // Search by roll number
    public Node searchByRoll(int roll) {
        Node cur = head;
        while (cur != null) {
            if (cur.roll == roll) return cur;
            cur = cur.next;
        }
        return null;
    }

    // Update grade by roll number
    public boolean updateGrade(int roll, String newGrade) {
        Node s = searchByRoll(roll);
        if (s == null) return false;
        s.grade = newGrade;
        return true;
    }

    // Display all students
    public void display() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }
        Node cur = head;
        System.out.println("Student Records (SLL):");
        while (cur != null) {
            System.out.println("Roll: " + cur.roll + ", Name: " + cur.name + ", Age: " + cur.age + ", Grade: " + cur.grade);
            cur = cur.next;
        }
    }
}
