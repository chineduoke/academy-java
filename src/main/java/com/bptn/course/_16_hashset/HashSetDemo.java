package com.bptn.course._16_hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<>();

		mySet.add("Toronto");
		mySet.add("Vancover");
		mySet.add("Hamilton");

		System.out.println(mySet);
		System.out.println(mySet.contains("toronto"));
		mySet.remove("Hamilton");
		System.out.println(mySet);
	}

}
