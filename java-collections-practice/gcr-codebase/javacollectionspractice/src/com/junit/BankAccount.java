package com.junit;

import org.junit.jupiter.api.Test;

public class BankAccount {
    private double balance = 0;

   @Test
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
