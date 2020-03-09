package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class OrderList {

	private static List<Order> orderList = new ArrayList<Order>();
	static {
		Random random = new Random();
		for(int i=0;i<40;i++) {
			String location = i%2==0 ? "Accepted" : "Completed";
			int price = random.nextInt(100000);
			Order order = new Order(location, price);
			orderList.add(order);
		}
	}
	public static List<Order> getOrders() {
		return orderList;
	}
} 