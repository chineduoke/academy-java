package com.bptn.course._01_variables;

import java.util.ArrayList;

public class Variables {
	// Writing Java code, with a focus on basic print commands for output
	// syntax, naming, class

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add(0, "c");
		list1.add(1, "d");
		list1.set(2, "e");
		list1.add("f");
		System.out.println(list1);

	}
}
