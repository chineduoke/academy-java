package com.bptn.course._14_arraylist;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<>();
		
		myBooks.add("kane".toLowerCase());
		myBooks.add("book2");
		myBooks.add("book3");
		
		System.out.println(myBooks);
		System.out.println(myBooks.getFirst());
		System.out.println(myBooks.remove(1));
		
		if(myBooks.contains("kane")) {
			System.out.println("book found");
		}
		System.out.println(myBooks.get(myBooks.size()-1));
		System.out.println(myBooks.size());
	}

}
