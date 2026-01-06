package com.eventease;

import java.util.Scanner;

public class EventEaseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Event event = null;
        int choice;

        do {
            System.out.println("\n--- EventEase Menu ---");
            System.out.println("1. Create Birthday Event");
            System.out.println("2. Create Conference Event");
            System.out.println("3. Schedule Event");
            System.out.println("4. Reschedule Event");
            System.out.println("5. Cancel Event");
            System.out.println("6. Calculate Cost");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String bname = sc.nextLine();
                    System.out.print("Enter location: ");
                    String bloc = sc.nextLine();
                    System.out.print("Enter date: ");
                    String bdate = sc.nextLine();
                    event = new BirthdayEvent(bname, bloc, bdate, 50);
                    System.out.println("Birthday Event Created. ID: " + event.getEventId());
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter location: ");
                    String cloc = sc.nextLine();
                    System.out.print("Enter date: ");
                    String cdate = sc.nextLine();
                    event = new ConferenceEvent(cname, cloc, cdate, 100);
                    System.out.println("Conference Event Created. ID: " + event.getEventId());
                    break;
                case 3:
                    if (event != null) event.schedule();
                    else System.out.println("Create event first!");
                    break;
                case 4:
                    if (event != null) {
                        System.out.print("Enter new date: ");
                        event.reschedule(sc.nextLine());
                    } else System.out.println("Create event first!");
                    break;
                case 5:
                    if (event != null) event.cancel();
                    else System.out.println("Create event first!");
                    break;
                case 6:
                    if (event != null) {
                        System.out.print("Enter services cost: ");
                        double scost = sc.nextDouble();
                        System.out.print("Enter discount: ");
                        double disc = sc.nextDouble();
                        System.out.println("Total Cost: " + event.calculateCost(scost, disc));
                    } else System.out.println("Create event first!");
                    break;
                case 0:
                    System.out.println("Exiting EventEase...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
