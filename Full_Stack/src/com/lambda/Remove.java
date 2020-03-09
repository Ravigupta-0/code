package com.lambda;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		 
	       students.add("ravi");
	       students.add("Sri");
	       students.add("Deepak");
	       students.add("shiv");
	 
	     
	       students.removeIf(stud -> ((stud.length()%2)==1));
	 
	       System.out.println("Students name whose  length is not odd ");
	     
	       for (String str : students) {
	           System.out.println(str);
	       }

	}

} 
