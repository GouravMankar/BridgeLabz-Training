import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Total price Calculation
        double totalPrice = unitPrice * quantity;

        // Printing Output
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice );

        
    }
}