package com.fdm.group.ShopCheckout;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckOutTest {

	
	Basket basket;
	
	@Before
	public void setup() throws Exception{
		basket = new Basket();
	}
	
	@Test
	public void testAddOneFruit() {
		basket.AddFruit("Apple", 0.5, 1);
		double result = basket.CalculatePrice();
		assertEquals(0.5,result,0);
	}
	@Test
	public void testAddThreeSameFruits() {
		basket.AddFruit("Apple", 0.5, 3);
		double result = basket.CalculatePrice();
		assertEquals(1.5,result,0);
	}

	@Test
	public void testAddOneOfEachFruit(){
		basket.AddFruit("Pear", 0.4, 1);
		basket.AddFruit("Apple", 0.5, 1);
		basket.AddFruit("Banana", 0.7, 1);
		basket.AddFruit("Lemons", 0.3, 1);
		basket.AddFruit("Orange", 0.6, 1);
		double result = basket.CalculatePrice();
		assertEquals(2.5,result,0);
		
	}

}
