package com.linkedlist.circularlinkedlist.onlineticketreservation;

import java.util.Scanner;

public class TicketReservationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ticket system = new Ticket();
        int choice;

        do {
            System.out.println("\n===== MOVIE TICKET SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket");
            System.out.println("5. Count Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();

                    System.out.print("Seat No: ");
                    String seat = sc.nextLine();

                    system.bookTicket(id, name, movie, seat);
                    System.out.println("Ticket booked successfully!");
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int cancelId = sc.nextInt();

                    System.out.println(
                            system.cancelTicket(cancelId)
                                    ? "Ticket cancelled."
                                    : "Ticket not found."
                    );
                    break;

                case 3:
                    system.displayTickets();
                    break;

                case 4:
                    System.out.print("Search by Customer (press enter to skip): ");
                    String cname = sc.nextLine();

                    System.out.print("Search by Movie (press enter to skip): ");
                    String mname = sc.nextLine();

                    system.search(
                            cname.isEmpty() ? null : cname,
                            mname.isEmpty() ? null : mname
                    );
                    break;

                case 5:
                    System.out.println("Total Tickets: " +
                            system.countTickets());
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
