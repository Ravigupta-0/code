
package com.filehandling;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		File file=new File("F:\\IBM FULL STACK\\java/abc.txt");
		
		RandomAccessFile raf=new RandomAccessFile(file,"rws");
		for(int i=0;i<2;i++) {
			System.out.println("enter the acc no");
			
			if(i==0) {
				int a=sc.nextInt();
				System.out.println("enter the balance: ");
				double b=sc.nextDouble();
				raf.writeInt(a);
				raf.writeUTF("Ravi kant");
				
				raf.writeDouble(b);
				raf.seek(0);
				int id =raf.readInt();
				System.out.println("Enter the acc_no: "+id);

				String name =raf.readUTF();
				System.out.println("\n ENter the name :"+name);

				double bal = raf.readDouble();
				System.out.println( "\n Enter the bal in the account: "+bal);
			}
			else  {
				int c=sc.nextInt();
				System.out.println("enter the balance: ");
				double d=sc.nextDouble();
				System.out.println("Updated values: ");
				raf.writeInt(c);
				raf.writeUTF("Ravi kant");
				
				raf.writeDouble(d);
				raf.seek(0);
				int id =raf.readInt();
				System.out.println("Enter the acc_no: "+id);

				String name =raf.readUTF();
				System.out.println("\n ENter the name :"+name);

				double bal = raf.readDouble();
				System.out.println( "\n Enter the bal in the account: "+bal);
				if(bal>10000) {
					System.out.println("balance is greater than 10000");
				}
			}
		
		}
		raf.close();
	}

}
