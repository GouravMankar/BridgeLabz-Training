package com.day12;

class Employee {
	private static int counter = 1000;
	private final int employeeId;
	String name;

	Employee(String name) {
		this.name = name;
		this.employeeId = ++counter;
	}

	public int getEmployeeId() {
		return employeeId;
	}
}

public class EmployeeIdGenerator {
	public static void main(String[] args) {
		Employee e1 = new Employee("A");
		Employee e2 = new Employee("B");
		Employee e3 = new Employee("C");
		Employee e4 = new Employee("D");

		System.out.println(e1.getEmployeeId());
		System.out.println(e2.getEmployeeId());
		System.out.println(e3.getEmployeeId());
		System.out.println(e4.getEmployeeId());
	}
}
