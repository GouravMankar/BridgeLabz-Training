package com.constructors.levelone;

//Circle class demonstrates constructor chaining
class Circle {
 double radius;

 Circle() {
     this(1.0); // Constructor chaining
 }

 Circle(double radius) {
     this.radius = radius;
 }

// method to calculate area of circle
 double calculateArea() {
     return Math.PI * radius * radius;
 }

 public static void main(String[] args) {
     Circle c1 = new Circle(); // Default radius
     Circle c2 = new Circle(5.0); // Custom radius

     System.out.println("Default Circle Area: " + c1.calculateArea());
     System.out.println("Custom Circle Area: " + c2.calculateArea());
 }
}
