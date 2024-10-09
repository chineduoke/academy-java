package com.bptn.course._14_arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// default storage is for 10 items
		// ArrayList<String> myList = new ArrayList<>();
		LinkedList<String> myList = new LinkedList<>();
		List numbers = new ArrayList();
		// ArrayList numbers = new ArrayList<>();
		// HashMap<> map = new HashMap<>();

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(2, 4);
		list1.add(5);
		System.out.println(list1);

		myList.add("hello");
		myList.add("hi");
		myList.remove("hi");
		System.out.println(myList);
	}
}
