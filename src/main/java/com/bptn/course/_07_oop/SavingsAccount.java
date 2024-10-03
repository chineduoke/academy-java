package com.bptn.course._07_oop;

class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
	}
	
	public void applyInterest() {
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	}
	
	@Override
	public boolean equals(Object other) {
		// Type cast other to your Classname
		SavingsAccount acc = (SavingsAccount) other;
		// Check if attributes are equal
		return super.equals(acc) && (this.interestRate == acc.interestRate);

	}
	
	@Override
    public String toString() {
        return super.toString() + ", " + interestRate;
    }

}
