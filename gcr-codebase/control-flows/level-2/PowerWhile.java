import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        // Evaluating power with while loop
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Printing output 
        System.out.println("Result: " + result);


        sc.close();
    }
}
