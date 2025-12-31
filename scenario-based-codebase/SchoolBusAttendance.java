import java.util.Scanner;

public class SchoolBusAttendance {

    public static void main(String[] args) {

        // Array of 10 student names
        String[] students = {
            "Ali", "Gourav", "Ayesha", "Neha", "Tarun",
            "Priya", "Harshita", "Rimjhim", "Aman", "Meena"
        };

        int presentCount = 0;
        int absentCount = 0;

        Scanner sc = new Scanner(System.in);

        // For-each loop to check attendance
        for (String name : students) {
            System.out.print("Is " + name + " Present or Absent? (P/A): ");
            char attendance = sc.next().toUpperCase().charAt(0);

            if (attendance == 'P') {
                presentCount++;
            } else if (attendance == 'A') {
                absentCount++;
            } else {
                System.out.println("Invalid input! Marked as Absent.");
                absentCount++;
            }
        }

        // Displaying results
        System.out.println("\n Attendance Summary");
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent : " + absentCount);
        sc.close();
    }
    
}