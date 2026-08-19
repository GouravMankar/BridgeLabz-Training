package com.day13;

class Employee {
	String name;
	double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void printDetails() {
		System.out.println("Name is : " + this.name + " and salary is " + this.salary);
	}
}

class Manager extends Employee {
	String position;

	public Manager() {
		super();

	}

	public Manager(String name, double salary, String position) {
		super(name, salary);
		this.position = position;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("and Position is " + position);
	}
}

public class EmployeeVSManager {

	public static void main(String[] args) {
		Employee employee=new Employee("Gourav mankar",834343);
		
		Manager manager=new Manager("Gourav",20000,"Manager");
		employee.printDetails();
		manager.printDetails();

	}

}
