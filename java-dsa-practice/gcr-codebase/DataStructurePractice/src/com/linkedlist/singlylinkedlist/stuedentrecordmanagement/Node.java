package com.linkedlist.singlylinkedlist.stuedentrecordmanagement;

public class Node {
	int roll;
    String name;
    int age;
    String grade;
    Node next;

    Node(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
