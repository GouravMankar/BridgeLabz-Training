package com.constructors.levelone;

//Product class demonstrates instance vs. class variables
class Product {
 String productName;   // Instance variable
 double price;         // Instance variable
 static int totalProducts = 0; // Class variable shared by all products

 // Constructor
 Product(String productName, double price) {
     this.productName = productName;
     this.price = price;
     totalProducts++;
 }

 // Instance method
 void displayProductDetails() {
     System.out.println("Product: " + productName + ", Price: ₹" + price);
 }

 // Class method
 static void displayTotalProducts() {
     System.out.println("Total Products: " + totalProducts);
 }

 // Main method to test
 public static void main(String[] args) {
     Product p1 = new Product("Laptop", 55000);
     Product p2 = new Product("Mouse", 500);

     p1.displayProductDetails();
     p2.displayProductDetails();
     Product.displayTotalProducts();
 }
}
