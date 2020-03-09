package com.threading;

public class DemonThread implements Runnable{
	Thread t1, t2, t3;

	public DemonThread() {
		t1= new Thread(this);
		t2= new Thread(this);
		t3= new Thread(this);
		t3.setDaemon(true);
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		t1.start();
		t2.start();
		t3.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemonThread();
	}
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
					System.out.println("\t\tPONG");
				try {
					Thread.sleep(300);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
		}
		else if(currentThread.getName().equals("TONG")) {
			for(;;) {
					System.out.println("\tTONG");
				try {
					Thread.sleep(200);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
		}
	}

}
