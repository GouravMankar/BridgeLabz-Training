import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 500.0; // Initial smart card balance

        while (balance > 0) {
            System.out.print("\nEnter distance travelled (or -1 to quit): ");
            int distance = scanner.nextInt();

            // Exit condition
            if (distance == -1) {
                System.out.println("Journey ended. Remaining balance: ₹" + balance);
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 20.0*distance : (distance <= 10) ? 15.0*distance : 10.0*distance;

            // Deduct fare if balance is sufficient
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹ " + fare);
                System.out.println("Remaining balance: ₹ " + balance);
            } else {
                System.out.println("Insufficient balance! Please recharge.");
                break;
            }
        }

        scanner.close();
    }
}
