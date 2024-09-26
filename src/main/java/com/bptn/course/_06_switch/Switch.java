package com.bptn.course._06_switch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice;
		double billAmount = 0.0;
		do {
			System.out.println("welcome to the menu");
			System.out.println("Please choose an item from the list: ");
			System.out.println("1. Pizza - $12.99");
			System.out.println("2. Burger - $8.99");
			System.out.println("3. Pasta - $9.99");
			System.out.println("4. Salad - $6.99");
			System.out.println("5. Exit");
			
			choice = scan.nextInt();
			
			switch(choice) {
				case 1: System.out.println("You ordered Pizza!");
				        billAmount += 12.99;
						break;
				case 2: System.out.println("You ordered Burger!");
				        billAmount += 8.99;
						break;
				case 3: System.out.println("You ordered Pasta!");
				        billAmount += 9.99;
						break;
				case 4: System.out.println("You ordered Salad!");
				        billAmount += 6.99;
						break;
				case 5: if(billAmount>0) {
					System.out.println("Thank you for stopping by! your bill is: "+billAmount);
				} else {
					System.out.println("No bill");
				}
						break;
				default:System.out.println("Invalid Choice!");
			}
			
		}while(choice!=5);
		
		
		// 1. Allow multiple selections	
		// 2. Calculate total price for the order
		// 3. While exiting, show the total price	
		
	}

}
