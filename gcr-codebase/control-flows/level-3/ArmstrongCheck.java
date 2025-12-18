import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Evaluating Armstrong number
        int sum = 0, originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        // Printing output 
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }


        sc.close();
    }
}
