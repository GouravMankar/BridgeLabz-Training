import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // calculating whether number is positive/negative/zero and even/odd
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // calculating comparison between first and last element
        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First is Greater than Last");
        } else {
            System.out.println("First is Less than Last");
        }

        scanner.close();
    }
}
