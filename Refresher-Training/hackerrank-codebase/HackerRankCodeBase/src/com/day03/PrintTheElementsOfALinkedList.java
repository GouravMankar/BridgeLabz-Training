package com.day03;
class SinglyLinkedListNode{
	SinglyLinkedListNode next;
	int data;
	
	public SinglyLinkedListNode() {
		
	}
	public SinglyLinkedListNode(int data) {
		this.data=data;
		this.next=null;
	}
}

public class PrintTheElementsOfALinkedList {
	
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if(llist==null){
           return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
        newNode.next=llist;
        return newNode;

   }
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp=head;
        while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
        }

   }

	public static void main(String[] args) {
		
		SinglyLinkedListNode head=new SinglyLinkedListNode(5);
		head=insertNodeAtHead(head,10);
		head=insertNodeAtHead(head,30);
		head=insertNodeAtHead(head,50);
		head=insertNodeAtHead(head,80);
		PrintTheElementsOfALinkedList.printLinkedList(head);

	}

}
