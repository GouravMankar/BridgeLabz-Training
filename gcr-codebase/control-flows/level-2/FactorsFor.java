import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Evaluating factors with for loop
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Not a positive integer!");
        }

        
        sc.close();
    }
}
