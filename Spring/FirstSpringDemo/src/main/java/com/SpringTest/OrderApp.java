package com.SpringTest;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

import com.SpringTest.OrderBeans;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0;
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("OrderSpring.xml");
		
		 
		Map<String,OrderBeans> map = ctx.getBeansOfType(OrderBeans.class);
		for(String str : map.keySet())
		{
			OrderBeans o = map.get(str);
			sum=sum+ o.getPrice();
		}
		
		System.out.println(sum);
		
	}

}