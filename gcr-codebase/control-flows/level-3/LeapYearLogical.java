import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Evaluating leap year with single if condition
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year");
        } else {
            System.out.println("Year must be >= 1582 (Gregorian calendar)");
        }

        sc.close();
    }
}
