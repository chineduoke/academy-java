package com.bptn.course._10_exception_handling;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double accountBalance = -500.00;
		try {
			checkBalance(accountBalance);
		} catch (IllegalArgumentException e) {
			System.out.println("Not enough money to withdraw!");
		}
	}

	public static void checkBalance(double balance) throws IllegalArgumentException  {
		if (balance < 0) {
			throw new IllegalArgumentException("Account balace cannot be negative");
		} else {
			System.out.println("Withdrawal successful!");
		}
	}
}
