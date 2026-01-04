package com.linkedlist.singlylinkedlist.stuedentrecordmanagement;

import java.util.Scanner;

public class StudentRecordSLL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        int choice;

        do {
            System.out.println("\n===== Student Record System (SLL) =====");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll");
            System.out.println("5. Search Student by Roll");
            System.out.println("6. Update Student Grade");
            System.out.println("7. Display All Students");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll: ");
                    int r1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n1 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String g1 = sc.nextLine();

                    list.addFirst(r1, n1, a1, g1);
                    System.out.println("Student added at beginning");
                    break;

                case 2:
                    System.out.print("Enter Roll: ");
                    int r2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n2 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String g2 = sc.nextLine();

                    list.addLast(r2, n2, a2, g2);
                    System.out.println("Student added at end");
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();

                    System.out.print("Enter Roll: ");
                    int r3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n3 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String g3 = sc.nextLine();

                    if (list.addAtPosition(pos, r3, n3, a3, g3))
                        System.out.println("Student added at position " + pos);
                    else
                        System.out.println("Invalid position");
                    break;

                case 4:
                    System.out.print("Enter Roll to delete: ");
                    int dr = sc.nextInt();

                    if (list.deleteByRoll(dr))
                        System.out.println("Student deleted");
                    else
                        System.out.println("Student not found");
                    break;

                case 5:
                    System.out.print("Enter Roll to search: ");
                    int sr = sc.nextInt();

                    Node s = list.searchByRoll(sr);
                    if (s != null)
                        System.out.println("Found → Roll: " + s.roll + ", Name: " + s.name +
                                ", Age: " + s.age + ", Grade: " + s.grade);
                    else
                        System.out.println("Student not found");
                    break;

                case 6:
                    System.out.print("Enter Roll: ");
                    int ur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Grade: ");
                    String ng = sc.nextLine();

                    if (list.updateGrade(ur, ng))
                        System.out.println("Grade updated");
                    else
                        System.out.println("Student not found");
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.out.println("Exiting Student Record System 👋");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}