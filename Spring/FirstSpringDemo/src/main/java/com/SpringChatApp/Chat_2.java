package com.SpringChatApp;

public class Chat_2 {
	private String name;
	private int number;
	
	public Chat_2() {
		System.out.println("inside condtructor of chat room 2");
	}
	public static void init()
	{
		System.out.println("Ïnitiated chat 2 ");
	}
	public static void destroy()
	{
		System.out.println("Destroyed chat room 2");
	}
	public Chat_2(String name, int number) {
		super();
		
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Chat_2 [name=" + name + ", number=" + number + "]";
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Inside BeanAware Interface");
		this.name=name;
	}
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("message is printed chatroom 2");
	}
	
}
