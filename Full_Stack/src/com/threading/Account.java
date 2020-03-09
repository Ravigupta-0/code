package com.threading;
import java.util.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

class Account1		 {
	private long  accountNumber;
	private double balanceAmount;
	
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public Account1(long accountNumber, double balanceAmount) {
		this.accountNumber = accountNumber;
		this.balanceAmount = balanceAmount;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
		System.out.println("Available balance is:" + df.format(this.balanceAmount));
	}
	public void deposit(double depositAmt) {
		this.setBalanceAmount(balanceAmount + depositAmt);
	}
	public boolean withdraw(double withdrawAmt) {
		if (balanceAmount < withdrawAmt) {
			System.out.println("Insufficient balance");
			return false;
		}
		this.setBalanceAmount(balanceAmount - withdrawAmt);
		return true;
	}
	
}
public class Account {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter account number:");
		long accNo = in.nextLong();
		System.out.println("Enter the available amount in the account:");
		double balance = in.nextDouble();
		Account1 account = new Account1(accNo, balance);
		System.out.println("Enter the amount to be deposited:");
		double amount = in.nextDouble();
		account.deposit(amount);
		System.out.println("Enter the amount to be withdrawn:");
		double wAmt = in.nextDouble();
		account.withdraw(wAmt);
	}
}
