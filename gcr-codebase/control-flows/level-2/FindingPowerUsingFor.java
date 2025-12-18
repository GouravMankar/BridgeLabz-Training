import java.util.Scanner;

public class FindingPowerUsingFor {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        // Evaluating power with for loop
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Printing output 
        System.out.println("Result: " + result);


        sc.close();
    }
}
