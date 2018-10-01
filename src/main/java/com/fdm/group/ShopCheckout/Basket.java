package com.fdm.group.ShopCheckout;

import java.util.ArrayList;
import java.util.List;


public class Basket {
	private List<Fruits> basket;
	
	public Basket(){
		basket = new ArrayList<Fruits>();
	}
	
	public void AddFruit(String name, double price, int quantity){
		Fruits fruit = new Fruits(name, price, quantity);
		basket.add(fruit);
	}
	
	public double CalculatePrice(){
		double total = 0;
		for (Fruits fruit : basket) {
			total += fruit.GetPrice();
		}
	
		//rounding to two decimal places
		total = roundToTwoDecimal(total);
		return total;
	}

	private double roundToTwoDecimal(double total) {
		double rounded_total = Math.round(total * 100.0) / 100.0;
		return rounded_total;
	}
	
	public List<Fruits> getBasket(){
		return basket;
	}
}
