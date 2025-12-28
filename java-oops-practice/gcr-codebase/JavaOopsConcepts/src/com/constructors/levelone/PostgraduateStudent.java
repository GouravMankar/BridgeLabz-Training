package com.constructors.levelone;

//Subclass demonstrates protected access
class PostgraduateStudent extends Student {
 PostgraduateStudent(int rollNumber, String name, double CGPA) {
     super(rollNumber, name, CGPA);
 }

//method to display PG students
 void displayPGStudent() {
     System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
 }

 public static void main(String[] args) {
     PostgraduateStudent pg = new PostgraduateStudent(102, "Priya", 9.0);
     pg.displayPGStudent();
 }
}
