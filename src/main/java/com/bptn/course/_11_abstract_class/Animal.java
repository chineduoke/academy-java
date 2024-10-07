package com.bptn.course._11_abstract_class;

abstract class Animal {
	// Abstract Method
	public abstract void sound();

	// Concrete Method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}
