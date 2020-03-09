package com.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class First_Char {

	  public static void result(ArrayList<String> at,Function<ArrayList<String>,String> ft,Consumer<String> ch)
	  {
		  String sb=ft.apply(at);
	      System.out.print("First character of every alphabet is: ");
	      ch.accept((new String(sb)));
	  }
	public static void main(String[] args) {
		 ArrayList<String> a=new ArrayList<String>();
		 a.add("Ravi");
		 a.add("Say");
		 a.add("Hello");
		for(String i:a) {
    	  System.out.print(i+"\t"); 
      }
      System.out.println("\n");
     Function<ArrayList<String>,String> chr = (ArrayList<String> at)->
      {
    	  StringBuilder sb=new StringBuilder();
    	  for(int i=0;i<at.size();i++)
    	  {
    		  String m=at.get(i);
    		  char ch=m.charAt(0);
    		  sb.append(ch);
    	  }
    	  return new String(sb);
      };
      Consumer<String> str=(String c)->{
    	   
    	     System.out.print(c);
    	     
      };
      result(a,chr,str);
      
      
	}

}