import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Evaluating digit count
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        // Printing output 
        System.out.println("Number of digits: " + count);


        sc.close();
    }
}
