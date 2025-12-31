import java.util.*;

public class PhoneRechargeSystem {

    // Transaction class to store recharge history
    static class Transaction {
        String operator;
        int amount;
        String offer;

        Transaction(String operator, int amount, String offer) {
            this.operator = operator;
            this.amount = amount;
            this.offer = offer;
        }

        @Override
        public String toString() {
            return "Operator: " + operator + ", Amount: Rs." + amount + ", Offer: " + offer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        List<Transaction> history = new ArrayList<>();

        while (true) {
            // Operator menu
            System.out.println("\n Welcome to Phone Recharge System");
            System.out.println("Choose your operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. BSNL");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Thank you for using Phone Recharge System!");
                break;
            }

            if (choice == 5) {
                System.out.println("\n Transaction History:");
                if (history.isEmpty()) {
                    System.out.println("No recharges yet.");
                } else {
                    for (Transaction t : history) {
                        System.out.println(" - " + t);
                    }
                }
                continue;
            }

            String operator = "";
            String offer = "";
            int[] validAmounts = {149, 299, 599}; 

            switch (choice) {
                case 1 -> {
                    operator = "Jio";
                    System.out.println("Jio Offers: Rs.149 (1GB/day), Rs.299 (2GB/day), Rs.599 (3GB/day + Disney+ Hotstar)");
                }
                case 2 -> {
                    operator = "Airtel";
                    System.out.println("Airtel Offers: Rs.149 (Unlimited Calls), Rs.299 (2GB/day + Wynk Music), Rs.599 (OTT + 3GB/day)");
                }
                case 3 -> {
                    operator = "VI";
                    System.out.println("VI Offers: Rs.149 (Weekend Data Rollover), Rs.299 (2GB/day + Night Unlimited), Rs.599 (OTT + 3GB/day)");
                }
                case 4 -> {
                    operator = "BSNL";
                    System.out.println("BSNL Offers: Rs.149 (Unlimited Calls), Rs.299 (2GB/day), Rs.599 (Family Plan 4 connections)");
                }
                default -> {
                    System.out.println("Invalid operator selection.");
                    continue;
                }
            }

            System.out.print("Enter recharge amount: Rs.");
            int amount = sc.nextInt();

            // Validate recharge amount
            boolean valid = false;
            for (int pack : validAmounts) {
                if (amount == pack) {
                    valid = true;
                    break;
                }
            }

            if (!valid) {
                System.out.println(" Invalid recharge amount! Please choose a valid pack.");
                continue;
            }

            // Assign offer based on amount
            if (amount == 149) offer = "Basic Plan";
            else if (amount == 299) offer = "Standard Plan";
            else if (amount == 599) offer = "Premium Plan";

            // Update balance and history
            balance += amount;
            history.add(new Transaction(operator, amount, offer));

            System.out.println(" Recharge successful with " + operator);
            System.out.println("Current Balance: Rs." + balance);
        }

        sc.close();
    }
}
