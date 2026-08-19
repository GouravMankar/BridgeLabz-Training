package com.day12;

class Address {
	String street, city, zipCode;

	Address(String s, String c, String z) {
		street = s;
		city = c;
		zipCode = z;
	}

	Address(Address other) {
		this(other.street, other.city, other.zipCode);
	}
}

class Student {
	String name;
	Address address;

	Student(String n, Address a) {
		name = n;
		address = a;
	}

	Student(Student other) {
		this.name = other.name;
		this.address = other.address;
	}

	Student(Student other, boolean deep) {
		this.name = other.name;
		this.address = new Address(other.address);
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		Student s1 = new Student("Ravi", new Address("Street1", "CityA", "12345"));
		Student s2 = new Student(s1);
		s2.address.city = "CityB";
		System.out.println("Original after shallow copy: " + s1.address.city);

		Student s3 = new Student(s1, true);
		s3.address.city = "CityC";
		System.out.println("Original after deep copy: " + s1.address.city);
		System.out.println("Copy deep: " + s3.address.city);
	}
}
