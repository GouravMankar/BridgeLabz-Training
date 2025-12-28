package com.constructors.levelone;

//Subclass demonstrates protected/public access
class SavingsAccount extends BankAccount {
 SavingsAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

// method to display savings account details
 void displaySavingsAccount() {
     System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: ₹" + getBalance());
 }

 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount(12345, "Ramesh", 20000);
     sa.displaySavingsAccount();
     sa.setBalance(25000);
     sa.displaySavingsAccount();
 }
}
