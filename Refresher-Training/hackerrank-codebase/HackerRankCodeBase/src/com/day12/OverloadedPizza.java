package com.day12;

class Pizza {
	String size, crustType;
	int toppingsCount;
	double price;

	Pizza(String size) {
		this(size, "Regular", 0);
	}

	Pizza(String size, String crust) {
		this(size, crust, 0);
	}

	Pizza(String size, String crust, int toppings) {
		this(size, crust, toppings, -1);
	}

	Pizza(String size, String crust, int toppings, double overridePrice) {
		this.size = size;
		this.crustType = crust;
		this.toppingsCount = toppings;
		this.price = (overridePrice >= 0) ? overridePrice : basePrice(size) + toppings * 50;
	}

	private double basePrice(String size) {
		switch (size) {
		case "Small":
			return 200;
		case "Medium":
			return 300;
		case "Large":
			return 400;
		default:
			return 250;
		}
	}

	public String toString() {
		return size + " " + crustType + " " + toppingsCount + " toppings, Price=" + price;
	}
}

public class OverloadedPizza {
	public static void main(String[] args) {
		System.out.println(new Pizza("Small"));
		System.out.println(new Pizza("Medium", "Cheese Burst"));
		System.out.println(new Pizza("Large", "Thin Crust", 2));
		System.out.println(new Pizza("Large", "Stuffed", 3, 700));
	}
}
