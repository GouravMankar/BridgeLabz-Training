package com.constructors.levelone;

//Student class demonstrates access modifiers
class Student {
 public int rollNumber;     // Public
 protected String name;     // Protected
 private double CGPA;       // Private

 Student(int rollNumber, String name, double CGPA) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.CGPA = CGPA;
 }

 // Getter and Setter for private CGPA
 public double getCGPA() {
     return CGPA;
 }

 public void setCGPA(double CGPA) {
     this.CGPA = CGPA;
 }
}
