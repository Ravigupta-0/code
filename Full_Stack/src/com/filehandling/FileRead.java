package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File file=new File("F:\\IBM FULL STACK\\java\\abc.txt");
			File file1=new File("F:\\IBM FULL STACK\\java\\pqr.txt");
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream(file1);
			
			StringBuilder sb=new StringBuilder("");
			int i = 0;
			do {
				i=fis.read();
				if(i!=-1) {
					sb.append((char)i);
				}
			}while(i!=-1);
			fos.write(("Appended text "+(sb)).getBytes());
			fos.flush();
			System.out.println("Input text file contains  : \n"+sb);
			fos.close();
			fis.close();
			
		
	}
}