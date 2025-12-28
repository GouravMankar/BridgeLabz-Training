package com.constructors.levelone;

//Employee class demonstrates access modifiers
class Employee {
 public int employeeID;
 protected String department;
 private double salary;

 Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }

 // Getter and Setter for private salary
 public void setSalary(double salary) {
     this.salary = salary;
 }

 public double getSalary() {
     return salary;
 }
}
