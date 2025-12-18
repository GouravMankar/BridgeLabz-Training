import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        // Taking Input from the user
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        // Check for natural number
        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
    }
}