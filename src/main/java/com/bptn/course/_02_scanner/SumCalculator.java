package com.bptn.course._02_scanner;

public class SumCalculator extends Thread {

//	    // The start point of the range 
	private int start;

	// The end point of the range
	private int end;

	// The sum of the numbers in the range
	private int sum;

	// Constructor to set the start and end points of the range
	public SumCalculator(int start, int end) {
		// Initialize the instance variables start and end
		this.start = start;
		this.end = end;

		// Initialize the sum to 0
		sum = 0;
	}

	// Override the run method to calculate the sum of the numbers in the range
	public void run() {
		// Iterate through the numbers in the range and add them to the sum
		for (int i = start; i <= end; i++) {
			sum += i;
		}
	}

	// Method to get the sum of the numbers in the range
	public int getSum() {
		return sum;
	}

	public static void main(String[] args) {

		// Create two SumCalculator threads to calculate the sum of two different ranges
		SumCalculator sumCalculator1 = new SumCalculator(1, 50000);
		SumCalculator sumCalculator2 = new SumCalculator(50000, 100000);

		// Start both threads
		long start2 = System.currentTimeMillis();
		sumCalculator1.start();

		sumCalculator2.start();

		try {
			// Wait for both threads to finish using join() method of each thread.
			sumCalculator1.join();
			sumCalculator2.join();
		} catch (InterruptedException e) {
			// Print the stack trace if an interruption occurs
			e.printStackTrace();
		}

		long end2 = System.currentTimeMillis();
		System.out.println("Elapsed Time in milli seconds: " + (end2 - start2));
		// Calculate the total sum by adding the sum of both ranges
		int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();

		// Print the total sum
		System.out.println("Total sum: " + totalSum);
	}
}