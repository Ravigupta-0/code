package com.threading;

import java.io.IOException;
import java.util.concurrent.*;

public class ExecutableTest  {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			ExecutorService execut=Executors.newFixedThreadPool(5);
			Callable<Integer> calling= new Callable<Integer>() {
				public Integer call() throws IOException {
					for(int i=0;i<20;i++) {
						
						System.out.println("PING");
						try {
							Thread.sleep(500);
							}
							catch(Exception e)
						{
								System.out.println(e);
							}
				}	
					
				
				return  1;
				}
			
			};
			
			
			Callable<Integer> calling1= new Callable<Integer>() {
				
				public Integer call() {
					for(int i=0;i<20;i++) {
						System.out.println("\tPONG");
						try {
						Thread.sleep(500);
						}
						catch(Exception e) {
							System.out.println(e);
						}
					
					
				}
					
				
				
				return 2;
				}
			};
			Future<Integer> future = execut.submit(calling); 
			
			Future<Integer> future1 = execut.submit(calling1); 
			int result = future.get();
			int result1 = future.get();
			
			
			 
			
			}
}

