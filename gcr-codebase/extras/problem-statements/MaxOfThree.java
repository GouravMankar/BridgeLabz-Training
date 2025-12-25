import java.util.Scanner;

public class MaxOfThree {

    // Method to find maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        // Display maximum
        System.out.println("Maximum = " + findMax(a, b, c));
        scanner.close();
    }
}
