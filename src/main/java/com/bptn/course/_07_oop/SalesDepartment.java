package com.bptn.course._07_oop;

class SalesDepartment extends Department {
	private double totalSalesAmt;

	public SalesDepartment(String name, int nosOfEmployees, double totalSalesAmt) {
		super(name, nosOfEmployees);
		this.totalSalesAmt = totalSalesAmt;
	}

}
