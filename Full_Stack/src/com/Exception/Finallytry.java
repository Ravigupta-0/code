package com.Exception;
import java.util.*;
public class Finallytry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int z=x/y;
			System.out.println("result :"+z);
		}
	
		finally {
			System.out.println("done");
		}
	}

}
