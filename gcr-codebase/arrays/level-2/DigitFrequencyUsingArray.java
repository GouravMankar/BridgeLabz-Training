import java.util.Scanner;

public class DigitFrequencyUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // calculating frequency of digits
        int[] frequency = new int[10];
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // displaying the result
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}
