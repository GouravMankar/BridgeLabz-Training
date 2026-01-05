package com.linkedlist.circularlinkedlist.taskschedular;

import java.util.Scanner;
import java.time.LocalDate;

public class TaskScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskCircularList scheduler = new TaskCircularList();

        int choice;
        int idCounter = 1;

        do {
            System.out.println("\n==== TASK SCHEDULER MENU ====");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Show Current Task");
            System.out.println("4. Move To Next Task");
            System.out.println("5. Display All Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Enter task name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter priority (1=High): ");
                    int priority = sc.nextInt();

                    System.out.print("Enter due date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.next());

                    scheduler.addTask(idCounter++, name, priority, date);
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    System.out.print("Enter task ID to remove: ");
                    int id = sc.nextInt();

                    if (scheduler.removeTask(id))
                        System.out.println("Task removed.");
                    else
                        System.out.println("Task not found.");
                    break;

                case 3:
                    scheduler.showCurrent();
                    break;

                case 4:
                    scheduler.nextTask();
                    System.out.println("Moved to next task.");
                    break;

                case 5:
                    scheduler.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
