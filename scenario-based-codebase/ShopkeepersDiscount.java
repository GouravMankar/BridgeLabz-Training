/* 8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

class ShopKeeperDiscount {
    public static void main(String[] args) {

        // initialzing and declearing variables
        Scanner sc = new Scanner(System.in);
        final double DISCOUNT_5 = 0.05, DISCOUNT_10 = 0.10;
        double totalItemPrice = 0.0, discount;
        int items;

        // taking inpurs from the user
        System.out.println("Enter the number of Items");
        items = sc.nextInt();
        for (int i = 0; i < items; i++) {
            System.out.print("Enter the Item price :");
            totalItemPrice += sc.nextDouble();
        }
        
        // calculating the discounted amount
        if (totalItemPrice >= 10000) {
            discount = totalItemPrice * DISCOUNT_10;
        } else if (totalItemPrice >= 5000) {
            discount = totalItemPrice * DISCOUNT_5;
        } else {
            discount = 0;
        }

        // Displaying the result
        System.out.println("\nTotal Item's Amount is " + totalItemPrice);
        System.out.println("Discounted Amount that user got " + discount);
        System.out.println("Now user have to pay Amount is " + (totalItemPrice - discount));

        sc.close();

    }
}