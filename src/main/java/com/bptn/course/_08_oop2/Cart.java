package com.bptn.course._08_oop2;

class Cart {
	private CartItem[] items;
	private int itemCount;
	
	public Cart() {
		items=new CartItem[5];
		itemCount = 0;
	}
	
	public void addProductToCart(Product prod, int qty) {
		if(itemCount<=4) {
			CartItem newItem = new CartItem(prod, qty);
			items[itemCount] = newItem;
			itemCount++;
			prod.reduceStock(qty);
		} else {
			throw new IllegalArgumentException("Cart full");
		}
		
	}
	
	public CartItem[] getItems() {
		CartItem[] currentItems = new CartItem[itemCount];
		for(int i=0; i<itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}
	
	
	
}
