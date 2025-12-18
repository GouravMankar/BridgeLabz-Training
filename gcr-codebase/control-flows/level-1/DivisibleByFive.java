import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        // Taking Input
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        // Check divisibility
        boolean result = (number % 5 == 0);

        // Printing Output
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}