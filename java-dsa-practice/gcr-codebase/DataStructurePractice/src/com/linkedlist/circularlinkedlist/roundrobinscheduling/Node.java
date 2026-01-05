package com.linkedlist.circularlinkedlist.roundrobinscheduling;

public class Node {

	    int pid;
	    int burst;
	    int priority;
	    int originalBurst;

	    int waitingTime;
	    int turnaroundTime;

	    Node next;

	    Node(int pid, int burst, int priority) {
	        this.pid = pid;
	        this.burst = burst;
	        this.priority = priority;
	        this.originalBurst = burst;
	        this.waitingTime = 0;
	        this.turnaroundTime = 0;
	        this.next = null;
	    }
	

}
