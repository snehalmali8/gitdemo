package com.org;

public class Account {
 protected String accountNumber;
 protected String name;
 protected double amount;

 public Account(String accountNumber, String name, double amount) {
     this.accountNumber = accountNumber;
     this.name = name;
     this.amount = amount;
 }// hello

 public void displayDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder Name: " + name);
     System.out.println("Amount: " + amount);
        System.out.println("Amount: " + amount);
 }

 // Method to be overridden in derived classes
 public void calculateInterest() {
     // Default implementation, can be overridden
     System.out.println("No interest calculation for base Account.");
 }
}
//kaustubh
