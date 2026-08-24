package com.day16;

import java.util.*;

interface DataProcessor<T> {
	void add(T data);

	void process();
}

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student: " + name + ", Marks: " + marks;
	}
}

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee: " + name + ", Salary: " + salary;
	}
}

class Processor<T> implements DataProcessor<T> {

	List<T> dataList = new ArrayList<>();

	@Override
	public void add(T data) {
		dataList.add(data);
	}

	@Override
	public void process() {
		for (T data : dataList) {
			System.out.println(data);
		}
	}
}

public class GenaricsInterfaceDemo {

	public static void main(String[] args) {

		DataProcessor<Student> studentProcessor = new Processor<>();

		studentProcessor.add(new Student("Gourav", 90));
		studentProcessor.add(new Student("Rahul", 85));

		System.out.println("Students:");
		studentProcessor.process();

		DataProcessor<Employee> employeeProcessor = new Processor<>();

		employeeProcessor.add(new Employee("Amit", 50000));
		employeeProcessor.add(new Employee("Riya", 60000));

		System.out.println("\nEmployees:");
		employeeProcessor.process();
	}
}
