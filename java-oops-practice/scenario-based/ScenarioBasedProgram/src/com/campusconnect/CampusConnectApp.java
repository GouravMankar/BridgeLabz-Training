package com.campusconnect;
import java.util.*;

public class CampusConnectApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(1, "Gourav", "g@gmail.com");
        Faculty f1 = new Faculty(101, "Dr. Sharma", "s@uni.com");
        Course c1 = new Course("Java", f1);

        int ch;
        do {
            System.out.println("\n--- CampusConnect Menu ---");
            System.out.println("1. Enroll Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Show Details");
            System.out.println("0. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s1.enrollCourse(c1);
                    break;
                case 2:
                    System.out.print("Enter grade: ");
                    int g = sc.nextInt();
                    s1.addGrade(c1, g);
                    break;
                case 3:
                    s1.printDetails();
                    f1.printDetails();
                    c1.printCourse();
                    break;
            }
        } while (ch != 0);
    }
}
