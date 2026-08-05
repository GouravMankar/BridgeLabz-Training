package com.day03;

import java.util.Scanner;

public class ReverseALinkedList {

	public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
		// Write your code here
		SinglyLinkedListNode prev = null, current = llist, next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;
	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
		if (llist == null) {
			return new SinglyLinkedListNode(data);
		}
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		newNode.next = llist;
		return newNode;

	}

	static void printLinkedList(SinglyLinkedListNode head) {
		SinglyLinkedListNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Number of nodes
		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		SinglyLinkedListNode head = new SinglyLinkedListNode(10);

		// Read the linked list
		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			ReverseALinkedList.insertNodeAtHead(head, sc.nextInt());
		}

		// Reverse the linked list
		SinglyLinkedListNode newHead = reverse(head);

		ReverseALinkedList.printLinkedList(newHead);

		sc.close();
	}

}
