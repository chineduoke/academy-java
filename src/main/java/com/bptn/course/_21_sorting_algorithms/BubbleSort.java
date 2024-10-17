package com.bptn.course._21_sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		int size = array.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sample array to be sorted
		int[] data = { 5, 3, -1, 7, 10, 2 };

		// Print the array before sorting using Arrays.toString()
		System.out.println("Before sort: " + Arrays.toString(data));

		// Call bubbleSort method to sort the array
		BubbleSort.bubbleSort(data);

		// Print the array after sorting
		System.out.println("After sort: " + Arrays.toString(data));

	}

}
