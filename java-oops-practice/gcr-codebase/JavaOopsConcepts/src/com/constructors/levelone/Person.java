package com.constructors.levelone;

//Person class demonstrates copy constructor
class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 Person(Person other) {
     this.name = other.name;
     this.age = other.age;
 }

//method to display person details
 void displayPerson() {
     System.out.println("Name: " + name + ", Age: " + age);
 }

 public static void main(String[] args) {
     Person p1 = new Person("Ravi", 25);
     Person p2 = new Person(p1); // Copy constructor

     p1.displayPerson();
     p2.displayPerson();
 }
}
