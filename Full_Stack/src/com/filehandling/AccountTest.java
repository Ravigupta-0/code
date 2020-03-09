package com.filehandling;
import java.util.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AccountTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			int account_no;
			double balance;
			String name;
			File file=new File("F:\\IBM FULL STACK\\java/abc.txt");
			
			FileOutputStream fos=new FileOutputStream(file);
			DataOutputStream dos=new DataOutputStream(fos);
			for(int i=0;i<3;i++) {
				account_no=sc.nextInt();
				name=sc.nextLine();
				balance=sc.nextDouble();
				dos.writeInt(account_no);
				dos.writeUTF(name);
				dos.writeDouble(balance);
				System.out.println("name: "+ name+" acc. no: "+account_no+" bal :"+balance+"\n");
			
			}
			
			dos.flush();
			fos.flush();
			dos.close();
			fos.close();
	}

}
