package com.fdm.group.ShopCheckout;

public class Fruits {
	private String name;
	private double price;
	private int quantity;
	
	public Fruits(String name, double price,int quantity){
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	public void SetPrice(double price) {
		this.price = price;
	}
	public double GetPrice() {
		return price * quantity;
	}
}
