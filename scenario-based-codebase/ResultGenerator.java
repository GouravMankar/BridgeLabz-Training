import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int[] marks = new int[5]; // Array to store marks of 5 subjects

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average
        double average = totalMarks / 5.0;
        System.out.println("Average Marks: " + average);

        // Assign grade using switch
        char grade;
        switch ((int) average / 10) {
            case 8:
            case 9:
            case 10:
                grade = 'A';
                break;
            case 6:
            case 7:
                grade = 'B';
                break;
            case 5:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
