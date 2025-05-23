package com.encapsulation;

public class FixedDepositAccount {
	 private String customerName;
	 private double principalAmount;
	 private double interestRate;
	 private int duration;
	 private double maturityAmount;

	public FixedDepositAccount(String customerName,double principalAmount,  double interestRate, int duration, double maturityAmount) {
		 this.customerName = customerName;
		 this.principalAmount = principalAmount;
		 this.interestRate = interestRate;
		 this.duration = duration;
		 this.maturityAmount = maturityAmount;
		 System.out.println("Fixed Deposit Created Successfully");
	 }
	 
	 public void setCustomerName(String customerName) {
		 this.customerName = customerName;
	 }
	 public void setPrincipalAmount(double principalAmount) {
		 this.principalAmount = principalAmount;
	 }
	 public void setInterestRate(double interestRate) {
		 this.interestRate = interestRate;
	 }
	 public void setDuration(int duration) {
		 this.duration = duration;
	 }
	 public void setMaturityAmount(double maturityAmount) {
		 this.maturityAmount = maturityAmount;
	 }
	 
	 public String getCustomerName() {
		 return customerName;
	 }
	 public double getPrincipalAmount() {
		 return principalAmount;
	 }
	 public double getInterestRate() {
		 return interestRate;
	 }
	 public int getDuration() {
		 return duration;
	 }
	 public double getMaturityAmount() {
		 return maturityAmount;
	 }
	 
	 public void calculateMaturityAmount() {
		 maturityAmount = principalAmount * Math.pow((1 + interestRate / 100), duration);
	        System.out.println("Maturity Amount after " + duration + " years: " +  maturityAmount);
	    }
	 public void withdrawBeforeMaturity() {
		 if (duration < 1) {
			 System.out.println("Cannot withdraw before one year");
		 }
		 else {
			 double penalty = 0.02 * principalAmount;
	            double amountAfterPenalty = principalAmount - penalty;
	            System.out.println("Early Withdrawal: Penalty = " + penalty);
	            System.out.println("Amount after penalty = " + amountAfterPenalty);
		 }
	 }
	 
	 public static void main(String [] args) {
		 FixedDepositAccount fd = new FixedDepositAccount("Ranganayakulu", 10000.0, 7.5, 3,5.0);
	        fd.calculateMaturityAmount();
	        fd.withdrawBeforeMaturity();

	 }
	 
}
