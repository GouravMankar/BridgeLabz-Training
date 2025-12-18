import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Evaluating greatest factor with for loop
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Printing output 
        System.out.println("Greatest factor (besides itself): " + greatestFactor);
        

        sc.close();
    }
}
