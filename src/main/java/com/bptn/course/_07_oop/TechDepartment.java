package com.bptn.course._07_oop;

class TechDepartment extends Department{
	private double totalPurchaseAmt;
	
	public TechDepartment(String name, int nosOfEmployees, double totalPurchaseAmt) {
		super(name, nosOfEmployees);
		this.totalPurchaseAmt = totalPurchaseAmt;
	}
	

}
