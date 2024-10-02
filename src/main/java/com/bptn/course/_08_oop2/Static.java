package com.bptn.course._08_oop2;

public class Static {
	// static dataType propertyName;
	 static double valueOfPi = 3.14;
	 static int count = 0;
	 
	 public Static() {
		 counter();
	 }
	// static returnType methodName;
	 static int add(int a, int b) {
	  return a + b;
	 }
	 
	 public void displayData() {
	  System.out.print("This is not static");
	 }
	 
	 static int counter() {
			return count++;
	 }
	 
	 public static void main(String[] args) {
	     Static s = new Static();
	     Static y = new Static();
	     System.out.println(Static.count);
	 }
}
