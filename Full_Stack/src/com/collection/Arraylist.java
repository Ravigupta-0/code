package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Using ArrayList:\n"); 
		ArrayList<Integer> a=new ArrayList<>(); 
			a.add(5);
			
			a.add(5); 
			a.add(7); 
			a.add(8);
			a.add(458); 
			a.add(2);
			a.add(1);
		  
		 
		  for(int i:a) {
		  System.out.println(i); 
		  }
		  ListIterator<Integer> i = a.listIterator(a.size()); 
		  	System.out.println("\nUsing ListIterator:\n"); 
		  		while(i.hasPrevious()) {
		  			System.out.println(i.previous());
		  		}
	}
	

}
