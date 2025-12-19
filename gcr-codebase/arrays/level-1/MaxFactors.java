import java.util.Scanner;

public class MaxFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // calculating factors of the number
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // displaying the result
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) {
             System.out.print(factors[i] + " ");
         }

        scanner.close();
    }
}
