package com.linkedlist.circularlinkedlist.onlineticketreservation;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ticket {

    private Node head;

    // Add ticket (end)
    public void bookTicket(int id, String name, String movie, String seat) {
        Node node = new Node(
                id, name, movie, seat,
                LocalDateTime.now(ZoneId.of("Asia/Kolkata"))
        );

        if (head == null) {
            head = node;
            node.next = node;
            return;
        }

        Node tail = head;
        while (tail.next != head)
            tail = tail.next;

        tail.next = node;
        node.next = head;
    }

    // Cancel ticket
    public boolean cancelTicket(int id) {
        if (head == null) return false;

        if (head.ticketId == id) {
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
        while (cur.next != head && cur.next.ticketId != id)
            cur = cur.next;

        if (cur.next == head) return false;

        cur.next = cur.next.next;
        return true;
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");

        Node cur = head;
        System.out.println("\n--- BOOKED TICKETS ---");
        do {
            System.out.println("ID: " + cur.ticketId +
                    ", Name: " + cur.customerName +
                    ", Movie: " + cur.movieName +
                    ", Seat: " + cur.seat +
                    ", Time: " + cur.bookingTime.format(fmt));
            cur = cur.next;
        } while (cur != head);
    }

    // Search ticket
    public void search(String name, String movie) {
        if (head == null) {
            System.out.println("No tickets.");
            return;
        }

        Node cur = head;
        boolean found = false;

        do {
            if ((name != null && cur.customerName.equalsIgnoreCase(name)) ||
                (movie != null && cur.movieName.equalsIgnoreCase(movie))) {

                System.out.println("Found Ticket -> ID: " +
                        cur.ticketId + ", " +
                        cur.customerName + ", " +
                        cur.movieName + ", Seat: " + cur.seat);
                found = true;
            }
            cur = cur.next;
        } while (cur != head);

        if (!found)
            System.out.println("No matching ticket found.");
    }

    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        Node cur = head;
        do {
            count++;
            cur = cur.next;
        } while (cur != head);

        return count;
    }
}

