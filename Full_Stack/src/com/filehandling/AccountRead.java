package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class AccountRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("F:\\IBM FULL STACK\\java/pqr.txt");
		FileInputStream f1 = new FileInputStream("F:\\IBM FULL STACK\\java/abc.txt");
		FileInputStream f2 = new FileInputStream("F:\\IBM FULL STACK\\java/xyz.txt");
		
			SequenceInputStream sis=new SequenceInputStream(f, f1);
			SequenceInputStream sis1=new SequenceInputStream(sis, f2);
		
		int i=0;
		while((i=sis1.read())!=-1){
			System.out.print((char)i);
			}
		sis.close();
		f2.close();
		f1.close();
		f.close();
		
	}

}
