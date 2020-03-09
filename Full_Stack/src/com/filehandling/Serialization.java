package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	
	public static void writeObject(Application dateobj) throws IOException {
		FileOutputStream fos=new FileOutputStream("F:\\IBM FULL STACK\\java/pqr.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(dateobj);
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
	}
	public static  void readObject(Object dateobj) throws Exception {
		FileInputStream fis=new FileInputStream("F:\\IBM FULL STACK\\java/pqr.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Application a1=(Application)ois.readObject();
		System.out.println(a1);
		//return a1;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Application dateobj=new Application(1,"sept", 2020);
		writeObject(dateobj);
		readObject(dateobj);
		
	}

}
class Application implements Serializable{
	
	private static final long serialVersionUID = 2369263184144880975L;
	
	private int date;
	private String month;
	private int year;
	
	public Application(int date, String month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Application [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	
}
