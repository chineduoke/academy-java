package com.bptn.course._07_oop;

class Department {
	private String name;
	private int nosOfEmployees;
	
	public Department(String name, int nosOfEmployees) {
		this.name = name;
		this.nosOfEmployees = nosOfEmployees;
	}
	
	public void departmentInfo() {
		System.out.println("Department name: "+name);
		System.out.println("Number of Employees: "+nosOfEmployees);
	}

}
