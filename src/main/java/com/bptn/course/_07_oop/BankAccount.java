package com.bptn.course._07_oop;

class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	public void deposit (double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("current bal: "+balance);
	}
	
	@Override
	public boolean equals(Object other) {
		// Type cast other to your Classname
		BankAccount acc = (BankAccount) other;
		// Check if attributes are equal
		return (this.balance == acc.balance);
		// && this.name.equals(acc.name);
	}

}
