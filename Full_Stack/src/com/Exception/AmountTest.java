package com.Exception;
import java.util.*;

class Amount extends Exception{
	private int amount;
	private int bal;
	public  Amount() {
		this.amount = amount;
		this.bal= bal;
	}
	public int withDraw(int amount , int bal)throws InsufficientBalanceException
	{
		if(bal<amount)
		{
		throw new InsufficientBalanceException(""+bal);
		}
		int d=bal-amount;
		return this.bal=d;
		}
		public String toString()
		{
		return "Amount: "+bal;
		}
}
class InsufficientBalanceException extends Exception
{
private String msg;
public InsufficientBalanceException()
{
this.msg="";
}
public InsufficientBalanceException(String msg)
{
this.msg=msg;
}
@Override
public String toString()
{
return "Insufficient Balance : "+this.msg;
}
}

class AmountTest{
	public static void main(String args[]) {
		Amount a=new Amount();;
		try {
		//a.withDraw(100, 3000);
		System.out.println(a.withDraw(10000, 3000));
		}
		catch(InsufficientBalanceException e)
		{
		e.printStackTrace();
		}
	}
}