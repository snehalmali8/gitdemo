package com.org;

//Derived class for Current Account
public class CurrentAccount extends Account {

 public CurrentAccount(String accountNumber, String name, double amount) {
     super(accountNumber, name, amount);
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Account Type: Current Account");
 }

 // Current Account does not have an interest calculation
}

