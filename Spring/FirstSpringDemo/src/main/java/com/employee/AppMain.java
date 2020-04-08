package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AppSpring.xml");
		Employee e=(Employee)ctx.getBean("employee");
		System.out.println(e);
	}

}