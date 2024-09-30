package com.bptn.course._07_oop;

public class ChequingAccount extends BankAccount {
	private double overdraftLimit;

	public ChequingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
		super(accountNumber, initialBalance);
		this.overdraftLimit = overdraftLimit;
		
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=(getBalance()+overdraftLimit)) {
			super.withdraw(amount);
		}
	}
	
}
