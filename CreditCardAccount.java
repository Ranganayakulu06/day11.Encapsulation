package com.encapsulation;

public class CreditCardAccount {
	    private String customerName;
	    private double creditLimit;
	    private double currentDebt;
	    private double interestRate;
	   
	    public CreditCardAccount(String customerName, double creditLimit, double currentDebt, double interestRate) {
	        this.customerName = customerName;
	        this.creditLimit = creditLimit;
	        this.interestRate = interestRate;
	        this.currentDebt = currentDebt;
	        System.out.println("Credit Card Account Created Successfully");
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public double getCreditLimit() {
	        return creditLimit;
	    }

	    public void setCreditLimit(double creditLimit) {
	        this.creditLimit = creditLimit;
	    }

	    public double getCurrentDebt() {
	        return currentDebt;
	    }

	    public void setCurrentDebt(double currentDebt) {
	        this.currentDebt = currentDebt;
	    }

	    public double getInterestRate() {
	        return interestRate;
	    }

	    public void setInterestRate(double interestRate) {
	        this.interestRate = interestRate;
	    }

	    
	    public void swipeCard(double amount) {
	        if ( amount > creditLimit) {
	            System.out.println("Transaction declined: Limit exceeded");
	        } else {
	            currentDebt += amount;
	            System.out.println("Transaction approved: " + amount);
	            System.out.println("New debt: " + currentDebt);
	        }
	    }

	    // Method to make a payment
	    public void makePayment(double amount) {
	        if (amount > currentDebt) {
	            System.out.println("Excess payment not allowed");
	        } else {
	            currentDebt -= amount;
	            System.out.println("Payment of " + amount + " successful.");
	            System.out.println("Remaining debt: " + currentDebt);
	        }
	    }

	    // Method to apply interest to current debt
	    public void applyInterest() {
	        double interest = currentDebt * (interestRate / 100);
	        currentDebt += interest;
	        System.out.println("Interest of " + interest + " applied.");
	        System.out.println("Total debt after interest: " + currentDebt);
	    }

	    // Test method
	    public static void main(String[] args) {
	        CreditCardAccount card = new CreditCardAccount("Vikram Singh", 50000, 3.5, 500);
	        
	        card.swipeCard(20000); // success
	        card.swipeCard(40000); // exceeds limit

	        card.makePayment(5000); // valid
	        card.makePayment(50000); // excess payment

	        card.applyInterest(); // apply interest on remaining debt
	    }
}
