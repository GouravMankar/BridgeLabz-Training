package com.linkedlist.circularlinkedlist.roundrobinscheduling;
import java.util.Scanner;

public class RoundRobinApp {



	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Process scheduler = new Process();

	        int choice;
	        do {
	            System.out.println("\n===== ROUND ROBIN SCHEDULER =====");
	            System.out.println("1. Add Process");
	            System.out.println("2. Display Process Queue");
	            System.out.println("3. Execute Round Robin");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Process ID: ");
	                    int pid = sc.nextInt();

	                    System.out.print("Enter Burst Time: ");
	                    int bt = sc.nextInt();

	                    System.out.print("Enter Priority: ");
	                    int pr = sc.nextInt();

	                    scheduler.addProcess(pid, bt, pr);
	                    System.out.println("Process added successfully");
	                    break;

	                case 2:
	                    scheduler.displayQueue();
	                    break;

	                case 3:
	                    System.out.print("Enter Time Quantum: ");
	                    int tq = sc.nextInt();
	                    scheduler.roundRobin(tq);
	                    break;

	                case 0:
	                    System.out.println("Exiting Scheduler...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 0);

	        sc.close();
	    }
	}

