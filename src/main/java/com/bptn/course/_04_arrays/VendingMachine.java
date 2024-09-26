package com.bptn.course._04_arrays;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the menu");
		System.out.println("Please choose an item from the list: ");
		System.out.println("1. coke - $2.99");
		System.out.println("2. pepsi - $8.99");
		System.out.println("3. juice - $9.99");
		System.out.println("4. water - $6.99");
		System.out.println("5. Exit");
		
		Scanner scan = new Scanner(System.in);
		int choice;
		choice = scan.nextInt();
		
		System.out.println("Enter amt");
		double amt;
		amt = scan.nextDouble();
		
		switch(choice) {
			case 1: if(amt>2.99) {
				System.out.println("change is: "+ (amt - 2.99));
			} else if(amt==2.99){
				System.out.println("Take your coke");
			} else {System.out.println("Try again");}
					break;
			case 2: if(amt>8.99) {
				System.out.println("change is: "+ (amt - 8.99));
			} else if(amt==2.99){
				System.out.println("Take your pepsi");
			} else {System.out.println("Try again");}
					break;
			
			case 5: System.out.println("Thank you for stopping by");
					break;
			default:System.out.println("Invalid Choice!");
		}
		scan.close();

	}

}
