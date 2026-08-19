package com.day14;

//Write your code here
class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {
}

public class JavaInharitance2 {
	public static void main(String[] args) {

		Adder a = new Adder();

		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}