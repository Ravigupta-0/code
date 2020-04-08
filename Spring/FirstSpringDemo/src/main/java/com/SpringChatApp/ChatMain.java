package com.SpringChatApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChatMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("chat.xml");
		ChatRoom ch=(ChatRoom)ctx.getBean("sports");
		System.out.println(ch.getUsers());
	}

}
