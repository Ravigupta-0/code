package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast_Safe {
	public static void main(String[] args) {
		
		List<Integer> a= new CopyOnWriteArrayList<>();
		Runnable r1=new Runnable() {

			@Override
			public void run() {
			
				while(true) {
					a.add(1);
					try {
						Thread.sleep(500);
					}
						catch(Exception e) {
							e.printStackTrace();
						}
					
				}
			}
			
		};
		Runnable r2=new Runnable() {
			@Override
			public void run() {
				while(true) {
					Iterator<Integer> i =a.iterator();
					while(i.hasNext()) {
						int b = i.next();
						System.out.println(b);
					}
					try {
						Thread.sleep(500);
					}
						catch(Exception e) {
							e.printStackTrace();
						}
					
				}
				
			}
			};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
	}

}
