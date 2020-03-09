package com.Exception;
import java.util.*;
public class TestExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z;
		try {
			System.out.println("lets divide");
			z=x/y;
			System.out.println("result : "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("exception occured : ");
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("unchecked exception handled");
	}

}
