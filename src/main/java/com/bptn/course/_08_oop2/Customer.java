package com.bptn.course._08_oop2;

class Customer {
	private String customerName;
	private String customerID;
	private String email;
	private Cart cart;
	
	public Customer(String customerID, String customerName, String email) {
		this.customerID=customerID;
		this.customerName=customerName;
		this.email=email;
		this.cart=new Cart();
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public Cart getCart() {
		return this.cart;
	}
	
	public void checkout() {
		System.out.println("Processing order for "+ customerName +"...");
	}
}
