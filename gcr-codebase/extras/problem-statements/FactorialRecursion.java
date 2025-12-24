import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Display factorial
        System.out.println("Factorial = " + factorial(n));
        scanner.close();
    }
}
