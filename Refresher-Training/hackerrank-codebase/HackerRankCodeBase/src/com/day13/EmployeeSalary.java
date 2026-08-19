package com.day13;

class SalaryCalculator {
	public double calculateSalary(double salary) {
		return salary;
	}

	public double calculateSalary(double salary, double bonus) {
		return salary + bonus;
	}

	public double calculateSalary(double salary, double bonus, double deduction) {
		return salary + bonus - deduction;
	}
}

public class EmployeeSalary {

	public static void main(String[] args) {
		SalaryCalculator sc = new SalaryCalculator();
		System.out.println(sc.calculateSalary(1000));
		System.out.println(sc.calculateSalary(1000, 300));
		System.out.println(sc.calculateSalary(1000, 300, 150));

	}

}
