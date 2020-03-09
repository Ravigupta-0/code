package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

public class FIleReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String name;
		int date;
		try {
			File file=new File("F:\\IBM FULL STACK\\java\\abc.txt");
				name=file.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("name "+name+"  whose length is: "+file.length()+" and was last modified in : "+sdf.format(file.lastModified()));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
