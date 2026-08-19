package com.day12;

class BankAccount {
	private double balance;
	protected String accountType;
	String branchCode;

	public BankAccount(double balance, String type, String branch) {
		this.balance = Math.max(0, balance);
		this.accountType = type;
		this.branchCode = branch;
	}

	public void deposit(double amt) {
		if (amt > 0)
			balance += amt;
	}

	public void withdraw(double amt) {
		if (amt > balance)
			System.out.println("Withdrawal rejected: insufficient funds");
		else
			balance -= amt;
	}

	public double getBalance() {
		return balance;
	}
}

public class SecureBankAccount {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(5000, "Savings", "BR001");

		acc1.deposit(2000);
		System.out.println("Balance after deposit: " + acc1.getBalance());

		acc1.withdraw(3000);
		System.out.println("Balance after withdrawal: " + acc1.getBalance());

		acc1.withdraw(5000);
		System.out.println("Balance after failed withdrawal: " + acc1.getBalance());

		System.out.println("Account Type: " + acc1.accountType);
		System.out.println("Branch Code: " + acc1.branchCode);
	}
}
