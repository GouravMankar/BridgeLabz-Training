package com.day13;

class BankAccount {
	String name;
	double initialBanlance;

	public BankAccount() {
		super();
	}

	public BankAccount(String name) {
		super();
		this.name = name;
	}

	public BankAccount(String name, double initialBanlance) {
		this(name);
		this.initialBanlance = initialBanlance;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", initialBanlance=" + initialBanlance + "]";
	}

}

class SavingAccount extends BankAccount {
	double interestRate;

	public SavingAccount(String name, double initialBanlance, double interestRate) {
		super(name, initialBanlance);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", name=" + name + ", initialBanlance=" + initialBanlance
				+ "]";
	}

}

public class BankAccountWithConstructorChaining {

	public static void main(String[] args) {
		BankAccount account = new SavingAccount("Gourav Mankar", 10000, 7.7);
		System.out.println(account);

	}

}
