package com.constructors.levelone;

//Subclass demonstrates protected/public access
class Manager extends Employee {
 Manager(int employeeID, String department, double salary) {
     super(employeeID, department, salary);
 }

 //method to display the manager
 void displayManager() {
     System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: ₹" + getSalary());
 }

 public static void main(String[] args) {
     Manager mgr = new Manager(201, "IT", 50000);
     mgr.displayManager();
     mgr.setSalary(60000);
     mgr.displayManager();
 }
}
 