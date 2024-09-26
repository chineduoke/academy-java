package com.bptn.course._06_switch;

import java.util.Scanner;

public class Switch_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice;
		double billAmount = 0.0;
			System.out.println("welcome to the mobile data");
			System.out.println("Please select plan: ");
			System.out.println("1. 1G - $10");
			System.out.println("2. 5G - $30");
			System.out.println("3. 10G - $50");
			System.out.println("4. unlimited - $70");
			System.out.println("5. Exit");
			
			choice = scan.nextInt();
			
			switch(choice) {
				case 1: System.out.println("You have selected 1G, the total cost is $10");
						break;
				case 2: System.out.println("You have selected 5G, the total cost is $30");
						break;
				case 3: System.out.println("You have selected 10G, the total cost is $50");
						break;
				case 4: System.out.println("You have selected unlimited, the total cost is $70"); 
						break;
				case 5: System.out.println("Thank you for stopping by!");
						break;
				default:System.out.println("Invalid Choice!");
			}

	}

}
