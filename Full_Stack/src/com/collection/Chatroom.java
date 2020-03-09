package com.collection;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import sun.reflect.generics.tree.Tree;



public class Chatroom {
	 private static Map<String, TreeSet<User>> hUser = new HashMap<String, TreeSet<User>>();
	 private static Map<String, TreeSet<User>> hMessage = new HashMap<String, TreeSet<User>>();
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the option:\n\n 1)Creating a Chat Room\n\n 2)Add the User\n\n 3)Send a message\n\n"
				+ " 4)Display the messages from a specific chatroom\n\n 5)) List down all users belonging to the specified chat room.\n\n "
				+ "6)log out\n\n 7)Delete an user\n\n8)Delete the chat room.\n");
	
		System.out.println("(Enter any option) :");
		int a=sc.nextInt();
		System.out.println(a);
		switch(a){
			case(1):
					if(true) {
							if(hUser.containsKey("")) {
						
							}
							else {
								hUser.put("Sport",new TreeSet<User>());
								
								System.out.println("chatroom ready");
							}
						}	
			break;
			case(2):
				int op=0;
			do {
				System.out.println("Enter the User name:\n");
				
			}while();
				
				break;
					}
	}

}

abstract class User implements Set<User>{
	private String name;
	private String LoginName;
	private String password;
	public User(String name, String loginName, String password) {
	
		this.name = name;
		LoginName = loginName;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", LoginName=" + LoginName + ", password=" + password + "]";
	}
	
}