package com.bptn.course._01_variables;

public class Variables {
	// Writing Java code, with a focus on basic print commands for output
	// syntax, naming, class

	public static void main(String[] args) {

	}

	public static int mystery(int[] elements, int target) {
		for (int j = 0; j < elements.length; j++) {
			if (elements[j] == target) {
				return j;
			}
		}
		return -1;
	}

}
