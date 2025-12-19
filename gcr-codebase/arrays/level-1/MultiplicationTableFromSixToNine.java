import java.util.Scanner;

public class MultiplicationTableFromSixToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // calculating multiplication table from 6 to 9
        int[] multiplicationResult = new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // displaying the result
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
