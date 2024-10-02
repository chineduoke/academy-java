package com.bptn.course._08_oop2;

class CartItem {
	private Product product;
	private int cartQty;
	
	public CartItem(Product product, int cartQty) {
		if(cartQty>product.getProdQty()) {
			throw new IllegalArgumentException("Insufficient stock");
		}
		this.product = product;
		this.cartQty = cartQty;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getCartQty() {
		return cartQty;
	}
	
	public double getTotalPrice() {
		return product.getProdPrice() * cartQty;
	}
}
