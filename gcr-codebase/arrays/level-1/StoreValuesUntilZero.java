import java.util.Scanner;

public class StoreValuesUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        // calculating storing values until 0 or negative
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double val = scanner.nextDouble();
            if (val <= 0 || index == 10) break;
            arr[index++] = val;
        }

        // displaying the result
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.println("Value[" + i + "] = " + arr[i]);
        }
        System.out.println("Sum = " + total);

        scanner.close();
    }
}
 