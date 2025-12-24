import java.util.Scanner;

public class GcdLcmCalculator {

    // Method to calculate GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt();

        // Display GCD and LCM
        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));
        scanner.close();
    }
}
