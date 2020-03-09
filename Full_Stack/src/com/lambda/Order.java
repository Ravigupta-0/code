package com.lambda;

class Order{
	private String location;
	private int price;
	public Order(String location, int price) {
		super();
		this.location = location;
		this.price = price;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [Status=" + location + ", price=" + price + "]";
	}
} 