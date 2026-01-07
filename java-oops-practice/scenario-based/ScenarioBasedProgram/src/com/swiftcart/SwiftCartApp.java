package com.swiftcart;
import java.util.*;

public class SwiftCartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        int ch;
        do {
            System.out.println("\n--- SwiftCart Menu ---");
            System.out.println("1. Add Perishable Item");
            System.out.println("2. Add Non-Perishable Item");
            System.out.println("3. Apply Discount");
            System.out.println("4. Generate Bill");
            System.out.println("0. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cart.addProduct(new PerishableProduct("Milk", 40));
                    break;
                case 2:
                    cart.addProduct(new NonPerishableProduct("Rice", 60));
                    break;
                case 3:
                    System.out.print("Enter discount: ");
                    double d = sc.nextDouble();
                    cart.applyDiscount(d);
                    break;
                case 4:
                    cart.generateBill();
                    break;
            }
        } while (ch != 0);
    }
}
