import java.util.Scanner;

public class BasicCalculator { 

    // Method for addition
    public static double add(double a, double b) { return a + b; }

    // Method for subtraction
    public static double subtract(double a, double b) { return a - b; }

    // Method for multiplication
    public static double multiply(double a, double b) { return a * b; }

    // Method for division
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble();

        // Input operation
        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        // Perform operation
        double result;
        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = subtract(a, b); break;
            case '*': result = multiply(a, b); break;
            case '/': result = divide(a, b); break;
            default: System.out.println("Invalid operation"); return;
        }

        // Display result
        System.out.println("Result = " + result);
        scanner.close();
    }
}
