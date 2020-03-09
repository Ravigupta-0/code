package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Order {

	public static void main(String[] args) {
		
		System.out.println("\nnow hashset\n");
		  HashSet<Integer> h = new HashSet<Integer>();
		  h.add(5); 
		  h.add(7); 
		  h.add(8);
		  h.add(458); 
		  h.add(2); 
		  h.add(1);
		  
		 // Iterator<Integer> i = h.iterator(); while(i.hasNext()) {
		  for(int i:h) {
		  System.out.println(i); 
		  }
		  
		 System.out.println("\nnow linkedhashset\n");
		 
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		l.add(5);
		l.add(6);
		l.add(84);
		l.add(48);
		l.add(256);
		l.add(114);
		 for (int j :l) { 
			 System.out.println(j); 
			 }
		 

	}

}
