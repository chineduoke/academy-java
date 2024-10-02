package com.bptn.course._02_scanner;
import com.bptn.course._09_access_modifier.Modifier;

class Dog extends Modifier {
	public void setType(String type) {
		this.type=type;
	}
	
	public static void main(String args[]) {
		Dog dog = new Dog();
	      dog.display();
	   } 
}
