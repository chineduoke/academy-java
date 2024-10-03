package com.bptn.course._09_access_modifier;

public class Modifier {
	protected String type = "fan";
	protected int age;
	
	protected void display() {
		System.out.println("Animal type: "+type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
