package com.constructors.levelone;

//BankAccount class demonstrates access modifiers
class BankAccount {
 public int accountNumber;
 protected String accountHolder;
 private double balance;
   
 BankAccount(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Getter and Setter for private balance
 public double getBalance() {
     return balance;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }
}
