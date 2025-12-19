import java.util.Scanner;

public class FizzBuzzUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        // calculating fizzbuzz values
        if (n <= 0) {
            System.out.println("Not a positive integer!");
            scanner.close();
            return;
        }
        String[] results = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // displaying the result
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}
