package com.encapsulation;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;
	
	public LoanApplication(String customerName, double loanAmount, double interestRate, int loanTerm, double outstandingBalance) {
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.outstandingBalance = outstandingBalance;
		System.out.println("Loan Application Submitted");
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public double getOutstandingBalance() {
		return outstandingBalance;
	}
	
	public void makePayment(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Payment");
		}
		else if (amount > outstandingBalance) {
			System.out.println("Payment exceeds loan balance");
		}
		else {
			outstandingBalance -= amount;
			System.out.println("Payment of " + amount + "Suffecessful.Remaining Balance is" + outstandingBalance);
		}
	}
	public double calculateEMI() {
		double monthlyRate = interestRate / (12 * 100); // Monthly interest rate
        int totalMonths = loanTerm * 12;
        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                     (Math.pow(1 + monthlyRate, totalMonths) - 1);
        return emi;
	}
	public void displayLoanDetails() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Interest Rate: " + interestRate);
		System.out.println("Loan Term: " + loanTerm);
		System.out.println("Montly EMI: " + calculateEMI() );
		System.out.println("Outstanding Balance: " + outstandingBalance);
	}
	
	public static void main(String [] args) {
		LoanApplication loanApplication = new LoanApplication("Ranga", 20000.0, 5.5, 5,20000);
		
		loanApplication.displayLoanDetails();
	
	}
	
}
