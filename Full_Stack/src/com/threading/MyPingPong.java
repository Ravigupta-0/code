package com.threading;

public class MyPingPong extends Thread {
	public MyPingPong(String threadName) {
		super.setName(threadName);
		super.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPingPong("PING");
		new MyPingPong("PONG");
	}
	
	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING")) {
			for(int i=0;i<20;i++) {
					System.out.println("PING");
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
		}
		else if(currentThread.getName().equals("PONG")) {
			for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
				try {
					Thread.sleep(300);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
		}
	}
}
