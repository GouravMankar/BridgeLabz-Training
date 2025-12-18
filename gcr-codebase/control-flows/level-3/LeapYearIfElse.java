import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Evaluating leap year conditions with multiple if-else
        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582 (Gregorian calendar)");
        }

        sc.close();
    }
}
