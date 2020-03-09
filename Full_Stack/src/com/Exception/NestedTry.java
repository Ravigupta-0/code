package com.Exception;
import java.util.*;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z;
		int [] arr=new int[5];
		try {
			System.out.println("1st try");
			z=x/y;
			System.out.println("result: "+z);
			try {
				System.out.println("2st inner try");
				arr[7] = 15 ;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1st inner catch");
				e.printStackTrace();
			}
		}
		catch(ArithmeticException e) {
			System.out.println("2nd actch");
			e.printStackTrace();
		}
	}

}
