package com.linkedlist.circularlinkedlist.onlineticketreservation;

import java.time.LocalDateTime;

public class Node {
    int ticketId;
    String customerName;
    String movieName;
    String seat;
    LocalDateTime bookingTime;

    Node next;

    public Node(int ticketId, String customerName,
                      String movieName, String seat,
                      LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seat = seat;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
