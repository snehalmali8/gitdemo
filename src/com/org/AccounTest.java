package com.org;

import java.util.Scanner;

public class AccounTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for account type
        System.out.print("Enter the account type (SB for Savings, CA for Current): ");
        String accountType = scanner.nextLine().toUpperCase();

        // Common variables for all account types
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        // Base class reference
        Account account = null;

        // Create appropriate account based on user input
        switch (accountType) {
            case "SB":
                account = new SBAccount(accountNumber, name, amount);
                break;
            case "CA":
                account = new CurrentAccount(accountNumber, name, amount);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }

        // Display account details and calculate interest
        account.displayDetails();
        account.calculateInterest();

        scanner.close();
    }
}

