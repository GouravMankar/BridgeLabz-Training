package com.linkedlist.singlylinkedlist.Inventorymanagementsystem;

public class Node {
	 String name;
	    int id;
	    int qty;
	    double price;
	    Node next;

	    Node(String name, int id, int qty, double price) {
	        this.name = name;
	        this.id = id;
	        this.qty = qty;
	        this.price = price;
	        this.next = null;
	    }
}
