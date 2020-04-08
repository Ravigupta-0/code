package com.SpringTest;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("Student.xml");
		AccountBean account=(AccountBean)iocContainer.getBean("accountOne");	
		System.out.println(account);
		iocContainer.registerShutdownHook();
	}
	
}
