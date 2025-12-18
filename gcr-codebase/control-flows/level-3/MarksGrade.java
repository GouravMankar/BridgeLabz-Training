import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Evaluating average and grade
        double average = (physics + chemistry + maths) / 3.0;
        String grade, remarks;

        if (average >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (average >= 75) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "D";
            remarks = "Needs Improvement";
        }

        // Printing output 
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
