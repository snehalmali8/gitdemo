package com.org;

//Derived class for Savings Account
public class SBAccount extends Account {
 private static final double INTEREST_RATE = 0.04; // 4% interest per month

 public SBAccount(String accountNumber, String name, double amount) {
     super(accountNumber, name, amount);
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Account Type: Savings Account");
 }

 @Override
 public void calculateInterest() {
     double interest = amount * INTEREST_RATE;
     System.out.println("Interest for Savings Account: " + interest);
 }
}

