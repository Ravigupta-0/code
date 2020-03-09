package com.threading;

public class AbstractTestPingPong extends Thread {
	Thread t1, t2;

	public AbstractTestPingPong() {
		t1= new Thread(this);
		t2= new Thread(this);
		t1.setName("PING");
		t2.setName("PONG");
		t1.start();
		t2.start();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest();
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

