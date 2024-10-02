package com.bptn.course._08_oop2;

class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private int productQty;
	
	public Product(String productId, String productName, double productPrice, int productQty) {
		this.productId = productId; 
		this.productName = productName; 
		this.productPrice = productPrice; 
		this.productQty=productQty;
	}
	
	public String getId() {
		return this.productId;
	}
	
	public String getProdName() {
		return this.productName;
	}
	
	public double getProdPrice() {
		return this.productPrice;
	}
	
	public int getProdQty() {
		return this.productQty;
	}
	
	public void reduceStock(int qty) {
		if(qty<=productQty) {
			productQty-=qty;
		} else {
			throw new IllegalArgumentException("Insufficient Stock");
		}
	}
}
