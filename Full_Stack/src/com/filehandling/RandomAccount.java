package com.filehandling;

import java.io.File;
import java.io.RandomAccessFile;

class Account{
	private int accc_no;
	private String name;
	double bal;
	
	public Account(int accc_no, String name, double bal) {
		super();
		this.accc_no = accc_no;
		this.name = name;
		this.bal = bal;
	}

	
	public int getAccc_no() {
		return accc_no;
	}

	public void setAccc_no(int accc_no) {
		this.accc_no = accc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	
	@Override
	public String toString() {
		return "Account [accc_no=" + accc_no + ", name=" + name + ", bal=" + bal + "]";
	}
	
}
public class RandomAccount {
	
	public static void accountInfo(Account  account) throws Exception{
		File file=new File("F:\\IBM FULL STACK\\java/abc.txt");
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		raf.write(account);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Account account=new Account(121, "Ravi", 12359987.22);
	}

}
