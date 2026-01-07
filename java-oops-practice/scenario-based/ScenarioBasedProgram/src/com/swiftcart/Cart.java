package com.swiftcart;
import java.util.*;

public class Cart implements ICheckout {
    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public void addProduct(Product p) {
        products.add(p);
        totalPrice += p.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void applyDiscount(double coupon) {
        totalPrice = totalPrice - coupon;
    }

    @Override
    public void generateBill() {
        System.out.println("Items in cart:");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
