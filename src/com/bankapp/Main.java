package com.bankapp;

public class Main {

public static void main(String[] args) {
    // Your job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    Bank bank = new Bank("DBS Bank");
    if (bank.addBranch("East")) {
        System.out.println("East branch created");
    }
    bank.addCustomer("East", "Anu", 50.05);
    bank.addCustomer("East", "Anupama", 153.07);
    bank.addCustomer("East", "Anu11", 1769.05);

    bank.addBranch("West");
    bank.addCustomer("West", "Bob", 44.35);
    bank.addCustomerTransaction("East", "Anu", 15.02);
    bank.addCustomerTransaction("East", "Anu", 1.55);
    bank.addCustomerTransaction("East", "Anupama", 150.55);

    bank.listCustomers("East", true);
    bank.listCustomers("West", true);

    bank.addBranch("South");
    if(!bank.addCustomer("South", "Bob", 108.86)){
        System.out.println("South branch does not exist");
    }

    if (!bank.addBranch("East")){
        System.out.println("East branch already exists");
    }

    if (!bank.addCustomerTransaction("East", "Niti", 149)){
        System.out.println("Customer does not exist at branch");
    }

    if (!bank.addCustomer("East", "Anu", 197.06)){
        System.out.println("Customer Anu already exists");
    }
}
}
